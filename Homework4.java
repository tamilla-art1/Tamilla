import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");

        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

//function();
    }

    /*public static void function() {
        System.out.println("Write a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String s1 = sentence.substring(0, 2);
        String s2 = sentence.substring(3, 5);
        String s3 = sentence.substring(6, 10);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        switch (s2) {
            case "01":
                System.out.println(s1 +" January "+s3);
                break;
            case "02":
                System.out.println(s1 +" February "+s3);
                break;
            default:
            System.out.println("Unknown month");

        }
        switch (s2) {
            case "01":
                System.out.println("January "+ " "+s1 +" " +s3 );
                break;
            case "02":
                System.out.println("February "+ " " +s1 +" "+ s3 );
                break;
            default:
                System.out.println("Unknown month");

        }
*/
}



        /*System.out.println("Write a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String res1=sentence.toLowerCase();
        String res2 = "";


        for (int j = sentence.length() - 1; j >= 0; j--) {
            char b = sentence.charAt(j);
            res2 = res2 + b;
        }
        if (res1.equals(res2)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}*/


        /*String resultat = "";

        for (int i = 0; i < sentence.length(); i++) {

            char a = sentence.charAt(i);
            if (resultat.indexOf(a) == -1) {
                resultat = resultat + a;
            }
        }
        System.out.print(resultat);
    }
}
*/

//}











        /*System.out.println("Write a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String s1 = sentence.toLowerCase();
        char a;

        // int counterCharacters = 0;
        //int counterJava = 0;

            /*for (int i = 0; i < sentence.length(); i++) {

                 a = s1.charAt(i);
                 if(a=='.'){
                 break;}
                System.out.print(a);
            }
*/
//}
//}


// ++counterCharacters;
//if (s1.charAt(i) == 'j' && s1.charAt(i + 1) == 'a' && s1.charAt(i + 2) == 'v' && s1.charAt(i + 3) == 'a') {
//++counterJava;
// }


// System.out.println(counterCharacters);
// System.out.println(counterJava);

       /* System.out.println("Write a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {

            char a = sentence.toLowerCase().charAt(i);
            if (a == ' ') {
                ++counter;
            }

        }
        System.out.print("Count words: " + counter);
*/
// }
       /* System.out.println("Write a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String s=sentence.trim();
        String s1=sentence.replace(' ','_');

        System.out.println(s);
        System.out.println(s1);
        System.out.println(sentence.contains("example"));

        //reverseString();
        //countVowels();
    }
*/
   /* public static void countVowels() {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {

            char a = sentence.toLowerCase().charAt(i);
            if (a == 'a' || a == 'o' || a == 'e' || a == 'u' || a == 'y' || a == 'i') {
                ++counter;
            }

        }
        System.out.print("Count of vowels: " + counter);

    }*/

//}
    /* public static void reverseString() {
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            for (int i = sentence.length() - 1; i >= 0; i--) {
                System.out.println(sentence.charAt(i));
            }*/
//}
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = scanner.nextLine();
        String s = sentence.toUpperCase();
        String s1 = sentence.replace("Java", "Python");
        boolean s2= sentence.startsWith("Hello");
        int s3=sentence.indexOf("code");
        String s4=sentence.substring(5,16);
        System.out.println("The sentence converted to uppercase:  " + s);
        System.out.println("The word Java replaced with Python: "+s1);
        System.out.println("Check if the sentence starts with Hello: "+s2);
        System.out.println("The position of the first occurrence of the word \"code\":"+s3);
        System.out.println("A substring from the 5th character to the 15th character:"+s4);
    */

