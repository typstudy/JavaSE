package com.typstudy.array;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author typ
 * @date 2019/5/9 10:56
 * @Description: com.typstudy.array
 * 一维数组
 */
public class OneArrayTest {
    /**
     * 数组初始化与默认值
     */
    @Test
    public void test1() {
        //静态初始化
        int[] arr = new int[]{2, 8, 9};
        System.out.println(arr);
        //动态初始化
        //默认初始值0
        int[] arrs = new int[3];
        arrs[0] = 2;
        System.out.println(arrs[1]);
        //默认初始值false
        boolean[] arr1 = new boolean[5];
        System.out.println(arr1[1]);
        //默认初始值字符表中的0或'\u0000'
        char[] chars = new char[3];
        System.out.println("*********" + chars[0] + "*********");
        //默认初始值null
        String[] str = new String[5];
        System.out.println(str[0]);
    }

    /**
     * 数组使用
     * 内存分析
     * 栈（stack）：存放局部变量
     * 堆（heap）：存放new出来的结果：数组，对象
     * 方法区：常量区，静态域
     */
    @Test
    public void test2() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
            System.out.println(arr[i]);
        }
    }

    /**
     * 练习1
     * 求电话号码
     */
    @Test
    public void test3(){
        int[] arr=new int[]{8,2,1,0,3};
        int[] index=new int[]{2,0,3,2,4,0,3,2,3,3};
        String tel="";
        for(int i=0;i<index.length;i++){
            tel+=arr[index[i]];
        }
        System.out.println("电话号码："+tel);
    }
    /**
     * 练习2
     * 从键盘输入学生成绩，并找到最高分，输出学生登记
     *       成绩>=最高分-10   等级为’A’
     * 		成绩>=最高分-20    等级为’B’
     * 		成绩>=最高分-30    等级为’C’
     * 		其余                等级为’D’
     *
     * 		提示：先读入学生人数，根据人数创建int数组，存放学生成绩。
     */
    public static void main(String[] args) {
        //1.使用Scanner，读取学生个数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number = scanner.nextInt();

        //2.创建数组，存储学生成绩：动态初始化
        int[] scores = new int[number];
        //3.给数组中的元素赋值
        System.out.println("请输入" + number + "个学生成绩：");
        int maxScore = 0;
        for(int i = 0;i < scores.length;i++){
            scores[i] = scanner.nextInt();
            //4.获取数组中的元素的最大值:最高分
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }
        System.out.println("最高分为："+maxScore);

        //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for(int i = 0;i < scores.length;i++){
            if(maxScore - scores[i] <= 10){
                level = 'A';
            }else if(maxScore - scores[i] <= 20){
                level = 'B';
            }else if(maxScore - scores[i] <= 30){
                level = 'C';
            }else{
                level = 'D';
            }

            System.out.println("student " + i +
                    " score is " + scores[i] + ",grade is " + level);
        }
    }

}
