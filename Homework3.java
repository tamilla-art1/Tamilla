
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        System.out.println("Eded daxil et");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int sum=0;

        do {
            int b = a % 10;
            sum += b;
            a = a / 10;
        }
        while (a>0);
        System.out.println(sum);



       /* System.out.println("Rəqəm daxil edin:")        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a==1){
            System.out.println("MONDAY");
        }
        else if (a==2){
            System.out.println("TUESDAY");
        }
        else if (a==3){
            System.out.println("WEDNESDAY");
        }
        else if (a==4){
            System.out.println("THURSDAY");
        }
        else if (a==5){
            System.out.println("FRIDAY");
        }
        else if (a==6){
            System.out.println("SATURDAY");
        }
        else if (a==7){
            System.out.println("SUNDAY");
        }
        else
        {
            System.out.println("Invalid input");
        }
        /*System.out.println("Iki eded daxil edin:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Operator daxil edin");
        String c = scanner.next();

        if (c.equals("*")) {
            int k = a * b;
            System.out.println("a*b=" + k);
        } else if (c.equals("+")) {
            int k = a + b;
            System.out.println("a+b=" + k);
        } else if (c.equals("/") && b != 0) {
            double k = (double) a / b;
            System.out.println("a/b=" + k);
        } else if (c.equals("-")) {
            int k = a - b;
            System.out.println("a-b=" + k);
        } else {
            System.out.println("Invalid input");
        }*/
    }
}
       /* System.out.println("Input five integers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        int max;
        int min;

        if ((a > b) && (a > c) && (a > d) && (a > f)) {
          max=a;
            System.out.println( "max=" + max );
        }

         else if ((b > a) && (b > c) && (b > d) && (b > f)) {
             max=b;
            System.out.println( "max=" + max );
        }

         else if ((c > a) && (c > b) && (c > d) && (c > f)) {
            max = c;
        System.out.println( "max=" + max );
        } else if ((f > a) && (f > b) && (f > c) && (f > d)) {
            max = d;
            System.out.println( "max=" + max );
        } else if ((d > a) && (d > b) && (d > c) && (d > f)) {
            max = f;
            System.out.println( "max=" + max );
        } else {
            System.out.println("Invalid input");
        }

        if ((a < b) && (a < c) && (a < d) && (a < f)) {
            min = a;
            System.out.println( "min=" + min );
        } else if ((b < a) && (b < c) && (b < d) && (b < f)) {
            min = b;
            System.out.println( "min=" + min );
        } else if ((c < a) && (c < b) && (c < d) && (c < f)) {
            min = c;
            System.out.println( "min=" + min );
        } else if ((d < a) && (d < b) && (d < c) && (d < f)) {
            min = d;
            System.out.println( "min=" + min );
        } else if ((f < a) && (f < b) && (f < c) && (f < d)) {
            min = f;
            System.out.println("min=" + min);
        }
          else
          {
              System.out.println("invalid input");
          }
    }
        }


        /*String admin = "admin";
        String password1 = "admin123";
        String user = "user";
        String password2 = "user123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login və şifrə daxil et");
        String Login = scanner.next();
        String Password = scanner.next();
        if (Login.equals(admin) && Password.equals(password1)){
            System.out.println("Admin daxil oldu");
        }
       else if (Login.equals(user) && Password.equals(password2))
       {
           System.out.println("User daxil oldu");
       }
         else
        {
            System.out.println("Yalnış məlumat");
        }
    }
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age");
        int age = scanner.nextInt();
        if (age >= 19 && age < 60) {
            System.out.println("Price is 5 AZN");
        } else if (age >= 6 && age <= 18) {
            System.out.println("Price is 2 AZN");
        } else if (age < 6 && age >= 0) {
            System.out.println("Ticket is free");
        } else if (age >60) {
            System.out.println("Price is 3 AZN");
        } else {
            System.out.println("İnvalid age");
        }*/

        /*int b = 500; // balansda olan mebleg
        System.out.println("Əməliyyat növünü seçin: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if (a.equals("Balans")) {
            System.out.println("Cari balans:" + b);

        } else if (a.equals("Deposit")) {
            System.out.println("Məbləg daxil edin");
            int c = scanner.nextInt();//deposit meblegi  daxil edin
            System.out.println("Yeni balans: " + (b + c));
        } else if (a.equals("Withdraw")) {
            System.out.println("Məbləg daxil edin");

            int k = scanner.nextInt(); //withdraw meblegi daxil edin

            System.out.println((k<=b)?"Yeni balans:" + (b - k):"Məbləğ kifayət etmir.");

        }

        else
            {
                System.out.println("Yalnış əməliyyat");
            }*/


