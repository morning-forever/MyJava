package com.gcy.interview.question;

/**
 * Created by guochaoyong on 2018/11/21.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import java.util.List;

/**
 * 从文档中读取最后N行
 */
public class ReadLastNLineFromDocument {

    public static void main(String args[]){

      String filePath = ReadLastNLineFromDocument.class.getResource("data.txt").getFile();
      println(filePath);
      println("****************无敌分割线***********************");
      File file = new File(filePath);
      List<String> result = readLastNLineFromFile(8,file);
      println(result.size());
      for(String str : result){
          println(str);
      }




    }

    public static void println(Object obj){
        System.out.println(obj);
    }

    private static void print(Object obj){
        System.out.print(obj);
    }


    private  static List<String> readLastNLineFromFile(int n,File file){

       List<String> result = new ArrayList<>();

        try {
            RandomAccessFile  randomAccessFile = new RandomAccessFile(file,"r") ;
            long length = randomAccessFile.length();

            //先将位置定位到最后一个字节的位置
            long pos = length-1;

            int count = 0;


            while(pos >= 0 && count < n){ //只要没读到第一个字节（第一个字节的位置是0）且读出的行数小于要求的行数n，就一直读

                randomAccessFile.seek(pos);//定位。第一次进来时，pos为最后一个字节的位置。

                if(pos == 0 || randomAccessFile.readByte() == '\n'){ //读到第一个字节时，直接读出当前行；或者读到换行符时，读出该行。
                    String str = randomAccessFile.readLine();
                    str = new String(str.getBytes("ISO-8859-1"),"UTF-8");
                    result.add(str);
                    count++;

                }

                pos--;//每读一个字符，位置往后退1个字节。
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

}
