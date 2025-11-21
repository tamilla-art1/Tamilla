import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
    static int win = 0;
    static int sum = 0;
    static int sum1 = 0;
    static int[] arr = new int[3];
    static int[] arr1 = new int[3];
    static String[] arr3 = new String[4];
   static boolean b  =false;

    public static void main(String[] args) {
        merhele1();
        merhele2();
        merhele3();
        System.out.println("Your total score:" + win);

    }

    public static void merhele1() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberComp = random.nextInt(5) + 1;
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ədəd daxil edin");
            int numberUser = scanner.nextInt();
            if ((numberUser == numberComp) && (i == 1)) {
                win = 100;
                break;
            } else if ((numberUser == numberComp) && (i == 2)) {
                win = 70;
                break;
            } else if ((numberUser == numberComp) && (i == 3)) {
                win = 50;
                break;
            } else {
                System.out.println("Düz deyil.Yenidən cəhd edin.");

            }
        }
        if (win == 0) {
            System.out.println("Your score is 0");
        } else {
            System.out.println("Your score:" + win);
        }
    }

    public static void merhele2() {
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < 4;) {
            System.out.println("Operatorlardan birini seçin:\n+\n-\n*\n/");
            String numberUser1 = scanner.next();
b=false;
            for (int k = 0; k < j; k++) {
                if (numberUser1.equals(arr3[k])) {
                     b = true;
                }
            }
                if (b ) {
                    System.out.println("Eyni operator daxil etmek olmaz");
                continue;
                }
            arr3[j] = numberUser1;
            j++;

            Random random = new Random();
            switch (numberUser1) {
                case "+":

                    int a = random.nextInt(10);
                    int b = random.nextInt(10);
                    int c = a + b;
                    System.out.println(a + "+" + b);
                    int numberUser2 = scanner.nextInt();
                    if (numberUser2 == c) {
                        win += 25;
                    }

                    break;
                case "-":
                    int a1 = random.nextInt(10);
                    int b1 = random.nextInt(10);
                    int c1 = b1 - a1;
                    System.out.println(b1 + "-" + a1);
                    int numberUser3 = scanner.nextInt();
                    if (numberUser3 == c1) {
                        win += 25;
                    }

                    break;
                case "*":
                    int a2 = random.nextInt(10);
                    int b2 = random.nextInt(10);
                    int c2 = a2 * b2;
                    System.out.println(a2 + "*" + b2);
                    int numberUser4 = scanner.nextInt();
                    if (numberUser4 == c2) {
                        win += 25;
                    }
                    break;
                case "/":
                    int b3 =  random.nextInt(9) + 1;
                    int a3 = b3 * random.nextInt(10);

                    int c3 = a3/ b3;
                    System.out.println(a3 + "/" + b3);
                    int numberUser5 = scanner.nextInt();
                    if (numberUser5 == c3) {
                        win += 25;
                    }
                    break;
            }

        }
        System.out.println("Your score is " + "" + win);
    }

    public static void merhele3() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Zer atmaq uchun 1 yazin");
            int numberUser = scanner.nextInt();
            if (numberUser == 1) {
                int userNumber = random.nextInt(5) + 1;
                arr[i] = userNumber;
                System.out.println("Sizin zeriniz:" + userNumber);
                int compNumber = random.nextInt(5) + 1;
                arr1[i] = compNumber;
                System.out.println("Computer zeri:" + compNumber);
            }

        }
        System.out.println("Sizin zerleriniz:" + Arrays.toString(arr));
        System.out.println("Computer zerleri:" + Arrays.toString(arr1));
        method1();
    }

    public static void method1() {
        for (int i = 0; i < 3; i++) {
            sum += arr[i];
            sum1 += arr1[i];
        }
        System.out.println("Sizin zer toplunuz:" + sum);
        System.out.println("Computer zer toplusu:" + sum1);
        if (sum > sum1) {
            win += 100;
        }
    }

}













