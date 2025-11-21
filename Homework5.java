import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //taskBir();
        //taskIki();
        //taskUch();
        //taskDord();
        //taskBesh();
        //taskAltı();
        //taskYeddi();
        //taskSekkiz();
        //taskDoqquz();
    }

    public static void taskBir()
    {

        System.out.println("Zəhmət olmasa 1,2 və ya 3 yazın: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            System.out.println("Alma");
        } else if (a == 2) {
            System.out.println("Armud");
        } else if (a == 3) {
            System.out.println("Banan");
        } else {
            System.out.println("Yalnış məlumat");
        }
    }

    public static void taskIki() {
        int[] a = {5, 4, 11, -10, 0};
        int sum = 0;

        for (int i = 0; i < a.length; i++) {

            sum = sum + a[i];

        }
        System.out.println("sum: " + sum);
    }

    public static void taskUch() {
        System.out.println("Ədəd daxil et");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = {3, 5, 7, 9, 12};
        boolean d = false;
        for (int i = 0; i < b.length; i++) {
            if (a == b[i]) {
                System.out.println("Tapildi");
                d = true;
            }

        }
        if (d == false) {
            System.out.println("Tapilmadi");
        }
    }

    public static void taskDord() {
        int sum = 0;
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5};
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("sum= " + sum);
    }

    public static void taskBesh() {
        System.out.println("Edet sayını daxil edin ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        System.out.println("Ededleri daxil edin");
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = a[i] * a[i];
        }
        System.out.print("Ededlerin kvadratı: " + Arrays.toString(b));
    }

    public static void taskAltı() {
        System.out.println("Edet sayını daxil edin ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Ededleri daxil edin");
        a[0] = scanner.nextInt();
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextInt();

            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.print("max= " + max + " " + "min= " + min);
    }

    public static void taskYeddi() {
        System.out.println("Edet sayını daxil edin ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean c = false;
        System.out.println("Ededleri daxil edin");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    c = true;
                    System.out.println(a[i] + " ");
                    break;
                }

            }

        }
        if (!c) {
            System.out.println("Eyni eded tapılmadı");
        }
    }

    public static void taskSekkiz() {
        System.out.println("Edet sayını daxil edin ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int maxCount = 0;
        System.out.println("Ededleri daxil edin");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int countRepeat = 0;

            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    countRepeat++;
                }
            }
            if (countRepeat > maxCount) {
                maxCount = countRepeat;
                System.out.println("maxCount=" + maxCount);
                System.out.println("maxNumber=" + a[i]);
            }
        }
    }

    public static void taskDoqquz() {
        System.out.println("Menyu:\n1 Tələbə əlavə et\n2 Bütün tələbələri göstər\n3 Tələbə axtar\n4 Ən yüksək bal alan tələbəni tap\n5 Orta balı hesabla\n6 Çıxış");
        System.out.println("Seçiminizi daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        String[] massiv1 = new String[3];//adlar
        int[] massiv2 = new int[3];
        String ad = null;
        int bal = 0;
        boolean c = false;
        int maxBal = 0;
        String maxAd = null;
        double ortaBal = 0;


        for (int a = 1; a < 7; a++) {
            a = scanner.nextInt();

            if (a == 1) {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Ad daxil edin");
                    massiv1[i] = scanner.next();
                    System.out.println("Bal daxil edin");
                    massiv2[i] = scanner.nextInt();
                }

                System.out.println("Tələbər əlavə olundu");

                System.out.println("Seçiminizi daxil edin: ");
            }

            if (a == 2) {
                System.out.println("Bütün tələbələrin siyahı:" + Arrays.toString(massiv1));
                System.out.println("Seçiminizi daxil edin: ");
            }
            if (a == 3) {
                System.out.println("Axtardığınız adı daxil edin");
                ad = scanner.next();
                for (int i = 0; i < 3; i++) {
                    if (ad.equals(massiv1[i])) {
                        System.out.println(massiv1[i] + ":" + massiv2[i]);
                        c = true;
                    }
                }
                if (!c) {
                    System.out.println("Bele telebe yoxdur");
                }
                System.out.println("Seçiminizi daxil edin: ");

            }
            if (a == 4) {
                for (int i = 0; i < 3; i++) {
                    if (massiv2[i] > maxBal) {
                        maxBal = massiv2[i];
                        maxAd = massiv1[i];
                    }

                }
                System.out.println(maxAd + ":" + maxBal + " bal");
                System.out.println("Seçiminizi daxil edin: ");

            }
            if (a == 5) {
                for (int i = 0; i < 3; i++) {
                    ortaBal += massiv2[i];

                }
                System.out.println("Orta bal: " + ortaBal / 4);
            }
            if (a == 6) {

                break;
            }
        }
    }
}
























