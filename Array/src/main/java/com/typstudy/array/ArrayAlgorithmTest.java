package com.typstudy.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author typ
 * @date 2019/5/9 16:22
 * @Description: com.typstudy.array
 * 数组常见算法
 */
public class ArrayAlgorithmTest {
    /**
     * 算法的考查：求数值型数组中元素的最大值、最小值、平均数、总和等
     *
     * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
     * 然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
     * 要求：所有随机数都是两位数。
     *
     * [10,99]
     * 公式：(int)(Math.random() * (99 - 10 + 1) + 10)
     *
     */
    @Test
    public void testAlgorithm(){
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*90+10);
        }
        //最大值
        int maxNumber=0;
        for(int i=0;i<arr.length;i++){
            if(maxNumber<arr[i]){
                maxNumber=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("最大值为："+maxNumber);
        //求和
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=arr[i];
        }
        System.out.println("和为："+count);
        //最小值
        int minNumber=0;
        for(int i=0;i<arr.length;i++){
            if(arr[0]>arr[i]){
                arr[0]=arr[i];
                minNumber=arr[0];
            }
        }
        System.out.println("最小值为："+minNumber);
        //平均值
        double avgValue=count/arr.length;
        System.out.println("平均值为："+avgValue);

    }
}
