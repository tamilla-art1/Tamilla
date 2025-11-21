import java.util.Scanner;
import java.util.ArrayList;

public class CoffeeShop {

    static double hesabUmumi = 0;
    static ArrayList<String> newcoffee = new ArrayList<>();//hesabi chixartmaq uchun lazimdir
    static ArrayList<String> coffee = new ArrayList<>();

    static {
        coffee.add("1. Espresso - 3.0 AZN");
        coffee.add("2. Cappuccino - 4.5 AZN");
        coffee.add("3. Latte - 4.0 AZN");
        coffee.add("4. Americano - 3.5 AZN");
    }

    static ArrayList<Double> coffee1 = new ArrayList<>();

    static {
        coffee1.add(3.0);
        coffee1.add(4.5);
        coffee1.add(4.0);
        coffee1.add(3.5);
    }

    static ArrayList<String> sweets = new ArrayList<>();

    static {
        sweets.add("1. Cheesecake - 6.0 AZN");
        sweets.add("2. Brownie - 5.0 AZN");
        sweets.add("3. Croissant - 3.0 AZN");
        sweets.add("4. Donut - 2.5 AZN");
    }

    static ArrayList<Double> sweets1 = new ArrayList<>();

    static {
        sweets1.add(6.0);
        sweets1.add(5.0);
        sweets1.add(3.0);
        sweets1.add(2.5);
    }

    public static void main(String[] args) {
do {
    masa();
    girish();
}
while(true);
    }
    public static void masa(){
        System.out.println("Zehmet olmasa masa nomrenizi daxil edin");
        Scanner scanner = new Scanner(System.in);
        int masaNomresi = scanner.nextInt();

    }

    public static void girish() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> menyu = new ArrayList<>();
        menyu.add("1.Sifarish et");
        menyu.add("2.Umumi hesabi goster");
        menyu.add("3.Hesab iste");
        menyu.add("4.Çıxış");
        System.out.println(menyu.toString());
        int menyuSechimi = scanner.nextInt();
        if (menyuSechimi == 1) {
            sifarishEt();
        } else if (menyuSechimi == 2) {
            umumiHesabiGoster();
             } else if (menyuSechimi == 3) {
              hesabIste();
        } else if (menyuSechimi == 4) {
            chixish();
        }
    }

    public static void sifarishEt() {
        boolean a = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(coffee.toString());
            System.out.println("Ichki sechiminizi daxil edin");
            int ichkiSechimi = scanner.nextInt();

            System.out.println(sweets.toString());
            System.out.println("Shirniyyat sechiminizi daxil edin");
            int shirniyyatSechimi = scanner.nextInt();
            double toplamPrice = coffee1.get(ichkiSechimi - 1) + sweets1.get(shirniyyatSechimi - 1);
            hesabUmumi = toplamPrice;
            newcoffee.add(coffee.get(ichkiSechimi - 1));
            newcoffee.add(sweets.get(shirniyyatSechimi-1));
            System.out.println("Toplam mebleg:" + toplamPrice);
            System.out.println("Chixish etmek uchun 0 daxil edin");
            int chixish = scanner.nextInt();
            if (chixish == 0) {
                a = true;
            }
        }
        while (a != true);
        girish();
    }

    public static void umumiHesabiGoster() {
        System.out.println(newcoffee.toString());
        System.out.println("Toplam:" + hesabUmumi);
        girish();
    }
    public static void hesabIste(){
        System.out.println(newcoffee.toString());
        System.out.println("Toplam:" + hesabUmumi);
        System.out.println("Təşəkkür edirik");
        girish();
    }
    public static void chixish(){
        System.out.println("Çıxış edildi!");
    }
}














