import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HomeworkArraylist {


    public static void main(String[] args) {

        // task1();
        //task2Task8();
//task7Task4();
        biletHazırlama();
    }

    public static void task1() {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list.get(1));
    }

    public static void task2Task8() {
        //int a[]={1,2,3,4};
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(2);
        System.out.println(b.size());
        for (int i = 0; i < b.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (b.get(i).equals(b.get(j))) {
                    b.remove(i);
                    i--;
                    break;
                }

            }

        }
        System.out.println(b);
        //System.out.println(a.length);

    }

    public static void task7Task4() {
        ArrayList<String> booklist = new ArrayList<String>();
        booklist.add("Book1");
        booklist.add("Book2");
        booklist.add("Book3");
        booklist.add("Book4");
        booklist.add("Book5");

        for (String x : booklist) {
            System.out.println(x + ";");
        }
        for (int i = 0; i < booklist.size(); i++) {
            System.out.print(booklist.get(i) + ";");
        }
    }

    public static void biletHazırlama() {
        Random random = new Random();

        for (int i = 1; i < 11; i++) {
            int nomerVopros1 = random.nextInt(50) + 1;
            int nomerVopros2 = random.nextInt(50) + 1;
            int nomerVopros3 = random.nextInt(50) + 1;
            if ((nomerVopros1 != nomerVopros2) && (nomerVopros2 != nomerVopros3) && (nomerVopros1 != nomerVopros3)) {
                System.out.println("Bilet№" + i + ":" + nomerVopros1 + ";" + nomerVopros2 + ";" + nomerVopros3);
            }
        }
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            int bilet = random.nextInt(10) + 1; // 1..10
            a[i] = bilet;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    i--;
                    break;
                }

            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("Tələbə " + (i + 1) + " bilet №" + a[i]);
        }

    }

}




