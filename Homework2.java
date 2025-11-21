
import java.util.Scanner;

public class Homework2 {

    //Task 10
    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your score");
        int score = scanner.nextInt();
        if ((score >=90) && (score <= 100))
        {
            System.out.println("Level is A");
        }
        else if (((score >=80) && (score <= 89)))
        {
            System.out.println("Level is B");
        }
        else if (((score >=70) && (score <= 79)))
        {
            System.out.println("Level is C");
        }
        else if (((score >=60) && (score <= 69)))
        {
            System.out.println("Level is D");
        }
        else if (((score >=0) && (score <= 60)))
            System.out.println("Level is F");
        else
            System.out.println("Invalid score.Please try again.");
    }
   /* Task 9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer");
        int a = scanner.nextInt();
        System.out.println(a>0?a:-a);
    }
*/
}
   /* Task 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your score");
        int score = scanner.nextInt();
        System.out.println(score > 50 ? "Pass" : "Fail");
    }*?
}

/* Task 7
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 5;
        System.out.println(a);
    }*/



    /*Task 6: Compound Assignment in Loops
    Create a Java program that uses compound assignment operators in a loop to update a variable. For example, use the += operator to sum the first 10 natural numbers.


    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

    }


    //Task 1:Logical Conditions
    //Write a Java program that takes three boolean variables as input and evaluates complex logical
    //conditions involving AND, OR, and NOT operators.Print the results.

        /*System.out.println("Please input three boolean variables");
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        System.out.println(("a&&b||!(c&&a=" )+   (a && b || !(c && a)));
        System.out.println(("a^b &(c|a)=" )+   (a^b &(c|a))); /*

}

         // Task 5 Create a Java program that generates the first 10 terms of an arithmetic sequence with a given start value
        //and common difference.Print the sequence using a for loop.
        /*for (int i = 0; i <= 10; i++) {
            int a = 1;
            a = a + 2 * i;
            System.out.println(a);*/

//}

//}


//System.out.println("Please input three integers: ");
//Scanner scanner = new Scanner(System.in);
        /*Task 4
        Create a Java program that simulates a user login system.The program should check if both the username and
        password are correct using logical AND ( &&)and print appropriate messages. */

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Please input Login and Password");
          String Login =scanner.next();
          String Password=scanner.next();
          if(Login.length()==8 && Password.length()==8){
              System.out.println("Logging in. Please wait");}
              else
              System.out.println("Login və ya Password yalnışdır");*/
                /*String Login1 = "Tamilla";
        String Password1 = "London10";
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease input Login and Passsword");
        String Login = scanner.next();
        String Password = scanner.next();
        if (Login.equals(Login1) && Password.equals(Password1)) {
            System.out.println("Please wait.Logging in");
        } else {
            System.out.println("Login or Password is incorrect.Please try again.");
        }
    }


    //int a = scanner.nextInt();
    //int b = scanner.nextInt();
    //int c = scanner.nextInt();
        /*Task 2
        Write a Java program that takes three integers as input and checks if the first number lies between the
        second and third numbers (inclusive).Print the result using if -else statements
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            System.out.println("a lies between b and c ");
            System.out.println("a does not lie between b and c");
        }
    */
        /*Task 1
        Write a Java program that takes three integers as input and performs a combination of arithmetic
        operations(e.g., (a + b) * c, a / (b + c)).Use if -else statements to ensure no division by zero occurs.
        Print the results.
        System.out.println("(a+b)*c= " + ((a + b) * c));
        if (b + c == 0) {
            System.out.println("Division is impossible");
        } else

            System.out.println("a/(b+c)= " + (double) a / (b + c));*/
       /*Task 3
        Create a Java program that takes three integers as input and uses relational operators to determine and print
        the largest of the three numbers using if -else statements.
        if (a > b && a > c) {
            System.out.println("The biggest integer is " + a);
        } else if (b > a && b > c) {
            System.out.println("The biggest integer is " + b);
        } else if (c > a && c > b) {
            System.out.println("The biggest integer is " + c);
        } else {
            System.out.println("There isn’t a unique largest integer; either all three are equal or at least two are equal.");
        }
        */




