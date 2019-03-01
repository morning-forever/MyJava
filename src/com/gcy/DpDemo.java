package com.gcy;

/**
 * Created by guochaoyong on 2017/6/17.
 *
 *
 * 有一个10级的楼梯，从下往上走，每跨一步只能上1级或2级阶梯，问走完10级阶梯共有多少种走法？写程序实现
 *
 * 此问题可采用动态规划算法（DP算法）
 *
 * DP算法3要素：
 * 【最优子结构】，例如此问题的 F(10)=F(9)+F(8)
 * 【】
 */
public class DpDemo {

    public static void main(String args[]){
        System.out.println(m(10));
    }

    public static int m(int i){
       if(i==1){
           return 1;
       }
       if(i==2){
           return 2;
       }
      return m(i-1)+m(i-2);

    }
}
