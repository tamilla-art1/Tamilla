import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        int[] arr = new int[4];
        inputArray(arr);
        printArray(arr);

    }

    private static void inputArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            //System.out.println(arr[i]);
        }

    }

    private static void printArray(int[] arr) {
        System.out.println("Sizin daxil etdiyiniz elementler:");
        for (int x : arr) {
            System.out.print(x);
        }
    }
}
