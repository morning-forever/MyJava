package com.gcy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by guochaoyong on 2018/12/4.
 * 常用线程池类型
 */
public class CommonThreadPoolExercise {
    public static void main(String args[]){
       ExecutorService executorService1 = Executors.newCachedThreadPool();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task());


    }

    private static class Task implements Runnable{


        @Override
        public void run() {
            println("Hello ThreadPool");
        }
    }

    private static  void   println( Object obj){
        System.out.println(obj);
    }


}
