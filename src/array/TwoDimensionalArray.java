package array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TwoDimensionalArray {
    static int[][] number = {{1,2,3,4},{5,6,7,8}};
    public static void main(String[]args){
        System.out.println(number[1][2]);
        /*
        而在二维数组中，直接使用 length 属性获取的是数组的行数，
        在指定的索引后加上 length（如 array[0].length）表示的是该行拥有多少个元素，即列数。
         */
        int[][] matrix = {{1,2,3,4},{5,6,7,8}};
        for (int r = 0;r<matrix.length;r++){
            for (int l = 0;l<matrix[r].length;l++){
                System.out.print(matrix[r][l]+"");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrixTest = new int[10][10];
        for (int i = 0;i<matrixTest.length;i++){
            for (int j = 0;j<matrixTest[i].length;j++){
                matrixTest[i][j] = (int)(Math.random()*10);
            }
        }
        for (int o = 0;o<matrixTest.length;o++){
            for (int k = 0;k<matrixTest[o].length;k++){
                System.out.print(matrixTest[o][k]+"");
            }
            System.out.println();
        }
        System.out.println();
        int[][] matrixMars = new int[10][10];
        for (int row = 0;row<matrixMars.length;row++){
            for (int list = 0;list<matrixMars[row].length;list++){
                matrixMars[row][list] = (int)(Math.random()*10);
            }
        }
        for (int[] array:matrixMars){
            for (int array2:array){
                System.out.print(array2);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(matrixMars)+"\n");

        int[][] array1 = new int[5][5];
        for (int n1 = 0;n1<array1.length;n1++){
            for (int n2 = 0;n2<array1[n1].length;n2++){
                array1[n1][n2] = (int)(Math.random()*10);
            }
        }
        System.out.println("你要输出第几列的值：");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        for (int n3 = 0;n3<array1.length;n3++){

            System.out.println(array1[n3][inputNumber]);
        }
    }
}
