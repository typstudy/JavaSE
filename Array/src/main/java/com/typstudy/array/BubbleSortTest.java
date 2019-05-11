package com.typstudy.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author typ
 * @date 2019/5/9 20:03
 * @Description: com.typstudy.array
 * 冒泡排序
 */
public class BubbleSortTest {
    @Test
    public void testBubble(){
        int[] arr=new int[]{2,-1,8,12,-20,-7,22,50,-80,89,100};
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
