import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

            // Метод для печати двумерного массива

        /* for (int i = 0; i < matrix.length; i++) {            // matrix.length это количество строк цикл по строкам
                    for (int j = 0; j < matrix[i].length; j++) {     // matrix[i].length количество элементов в массиве цикл по элементам строки
                        System.out.print(matrix[i][j] + " ");        // печать элемента
                    }
                    System.out.println(); // переход на новую строку
                }
            }*/


            for (int[] row : matrix) {            // row = одна строка (массив)
            for (int element : row) {         // element = один элемент из строки
                System.out.print(element + " ");
            }
            System.out.println(); // переход на новую строку
        }
    }
}




       // Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        //String result = (a % 2 == 0) ? "cut" : "tek";
        //System.out.print(result);
        //Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        //if (a%3==0 && a%5==0)
        //{
            //System.out.println("edet bolunur hem 3 hemde 5");
       // }
//else
    //{
    //System.out.println("Qaligsiz bolunmur");
        //}
    //}
//}