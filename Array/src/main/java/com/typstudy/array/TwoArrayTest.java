package com.typstudy.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author typ
 * @date 2019/5/9 11:53
 * @Description: com.typstudy.array
 * 二维数组
 */
public class TwoArrayTest {
    @Test
    public void testTwo() {
        //静态初始化
        int[][] arrs = new int[][]{{2, 9, 8}, {2, 7}};
        //动态初始化
        int[][] arr = new int[3][];
        System.out.println(arr);
        System.out.println(arr[0]);
    }

    /**
     * 求和
     */
    @Test
    public void test1() {
        int[][] arrs = new int[3][];
        arrs[0] = new int[]{3, 5, 8};
        arrs[1] = new int[]{12, 8};
        arrs[2] = new int[]{7, 3, 10, 14};
        int count = 0;
        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs[i].length; j++) {
                count += arrs[i][j];
            }
        }
        System.out.println(count);
    }

    /**
     * 杨辉三角
     * 【提示】
     * 1. 第一行有 1 个元素, 第 n 行有 n 个元素
     * 2. 每一行的第一个元素和最后一个元素都是 1
     * 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
     * yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
     */
    @Test
    public void testYangHui() {
        //声明并初始化数组
        int[][] yangHui = new int[10][];
        //赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //给首末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }
        }
        //遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "  ");
            }
            System.out.println();
        }

    }

    /**
     * 创建一个长度为6的int型数组，要求取值为1-30,且随机赋值，同时元素值各不相同
     */
    @Test
    public void test2() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    /**
     * 回形数格式方阵的实现
     * 从键盘输入一个整数（1~20）
     * 则以该数字为矩阵的大小，把1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。
     * 例如： 输入数字2，则程序输出：
     * 1 2
     * 4 3
     * 输入数字3，则程序输出：
     * 1 2 3
     * 8 9 4
     * 7 6 5
     * 输入数字4， 则程序输出：
     * 1   2   3   4
     * 12  13  14  5
     * 11  16  15  6
     * 10   9  8   7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1~20的正整数：");
        int len = scanner.nextInt();
        int[] [] arr=new int[len][len];
        int s=len*len;
        /*
         * k = 1:向右 k = 2:向下 k = 3:向左 k = 4:向上
         */
        int k = 1;
        int i = 0, j = 0;
        for (int m = 1; m <= s; m++) {
            if (k == 1) {
                if (j < len && arr[i][j] == 0) {
                    arr[i][j++] = m;
                } else {
                    k = 2;
                    i++;
                    j--;
                    m--;
                }
            } else if (k == 2) {
                if (i < len && arr[i][j] == 0) {
                    arr[i++][j] = m;
                } else {
                    k = 3;
                    i--;
                    j--;
                    m--;
                }
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0) {
                    arr[i][j--] = m;
                } else {
                    k = 4;
                    i--;
                    j++;
                    m--;
                }
            } else if (k == 4) {
                if (i >= 0 && arr[i][j] == 0) {
                    arr[i--][j] = m;
                } else {
                    k = 1;
                    i++;
                    j++;
                    m--;
                }
            }
        }

        // 遍历
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }
    }
}

