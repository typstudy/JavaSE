package com.typstudy.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author typ
 * @date 2019/5/9 16:52
 * @Description: com.typstudy.array
 * 算法的考查：数组的复制、反转、查找(线性查找、二分法查找)
 */
public class Array2AlgorithmTest {
    /**
     * 数组复制与赋值
     */
    @Test
    public void test1(){
        int[] array1,array2;
        array1=new int[]{2,3,5,7,11,13,17,19};
        //显示array1内容
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" "+"\t");
        }
        System.out.println();
        //赋值
        //array2=array1;
        //复制
        array2=new int[array1.length];
        for (int i=0;i<array2.length;i++){
            array2[i]=array1[i];
        }
        for (int i=0;i<array2.length;i++){
            if(i%2==0){
                array2[i]=2;
            }
        }
        System.out.println(Arrays.toString(array2));
        System.out.println();
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" "+"\t");
        }
    }

    /**
     * 数组反转
     */
    @Test
    public void test2(){
        String[] arr=new String[]{"AA","BB","CC","GG","MM","NN"};
        //方法一：
		for(int i = 0;i < arr.length / 2;i++){
			String temp = arr[i];

			arr[i] = arr[arr.length - i -1];

			arr[arr.length - i -1] = temp;
		}

        //方法二：
//		for(int i = 0,j = arr.length - 1;i < j;i++,j--){
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}

        //遍历
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    /**
     * 数组查找之线性查找
     */
    @Test
    public void test3(){
        String[] arr=new String[]{"AA","BB","CC","GG","MM","NN"};
        String dest="B";
        Boolean isFlag=true;
        for (int i=0;i<arr.length;i++){
            if(dest.equals(arr[i])){
                System.out.println("位置为："+i);
                isFlag=false;
                break;
            }
        }
        if(isFlag){
            System.out.println("没有找到");
        }
    }
    /**
     * 数组查找之二分法查找
     * 数组必须有序
     */
    @Test
    public void test4(){
        int[] arr=new int[]{-50,-24,-8,0,10,50,53,100,180,206};
        Boolean isFalg=true;
        int number=50;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int middle=(start+end)/2;
            if(number==arr[middle]){
                System.out.println("找到了元素,索引位置为："+middle);
                isFalg=false;
                break;
            }else if(arr[middle]>number){
                end=middle-1;
            }else {
                start=middle+1;
            }
        }
        if(isFalg){
            System.out.println("没有找到");
        }
    }

}
