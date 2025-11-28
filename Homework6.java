import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    static int[] numbers = {2, 5, 7, 4, 9, 10};
    public static void main(String[] args) {
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }
    public static void task1(){
        StringBuilder s= new StringBuilder("Hello");
        s.append("World");
        s.insert(5,",");
        String s1= s.toString();
        System.out.println(s1);
    }
    public static void task2(){
        StringBuilder k= new StringBuilder("Java");
        String k1="Java";
k.replace(0,0,"Y");
String k2="Yava";
        System.out.println("Stringbuilder object:"+k1+"\nString object:"+k2);
    }
    public static void task3(){
        StringBuilder l= new StringBuilder(20);
        l.append("Programming");
        System.out.println("capacity: "+l.capacity()+"\nlength: "+l.length());
        l.append("is fun");
        System.out.println("capacity: "+l.capacity()+"\nlength: "+l.length());
    }
    public static void task4(){
        System.out.println("Soz daxil edin");
        Scanner scanner=new Scanner(System.in);
        String m  = scanner.next();
        StringBuilder n=new StringBuilder(m);
        n.reverse();
        System.out.println("Reversed version: "+n);
    }
    public static void task5(){
        String h="";
        StringBuilder h1=new StringBuilder();
        for (int i=0;i<=1000;i++){
            h1.append(i);
        }
        for (int i=0;i<=1000;i++){
            h=h+i;
        }
        System.out.println("h1="+h1);
        System.out.println("h="+h);
        System.currentTimeMillis();

        }


}
