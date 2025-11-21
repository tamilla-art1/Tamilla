package courseApp.service;

import courseApp.db.Database;
import courseApp.entities.Course;
import courseApp.entities.Student;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import static courseApp.db.Database.courselist;
import static courseApp.db.Database.studentlist;

public class Studentservice {
    boolean a = true;

    Scanner sc = new Scanner(System.in);

    public void createStudent() {

        System.out.println("Ad daxil et");
        String ad = sc.nextLine();
        System.out.println("Soyad daxil et");
        String soyad = sc.nextLine();
        System.out.println("Yash daxil et");
        int yash = Integer.parseInt(sc.nextLine());
        System.out.println("ID daxil et");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Username daxil et");
        String username = sc.nextLine();
        System.out.println("Password daxil et");
        int password = Integer.parseInt(sc.nextLine());
        Student student = new Student(id, ad, soyad, yash,username,password);
        studentlist.add(student);
        System.out.println("Tələbə uğurla əlavə edildi!");
    }

    public void telebeKursaTeyinEt() {
        System.out.println(studentlist.toString());
        System.out.println(courselist.toString());

        System.out.println("Tələbə id daxil edin");
        int studentNum = Integer.parseInt(sc.nextLine());
        System.out.println("Kurs id daxil edin");
        int kursNum = Integer.parseInt(sc.nextLine());
        for (Student x : studentlist) {
            for (Course y : courselist) {
                if (studentNum == x.getId() && kursNum == y.getId()) {
                    x.setKurs(y.getName());
                    System.out.println(x.getAd() + " " + "təyin olundu " + y.getName());
                }
            }
        }
    }

    public void telebelerinSiyahisi() {
        System.out.println("=== Kurslarin Siyahısı ===");
        for (Student x : studentlist) {
            System.out.println(x.getAd() + "yash:" + x.getYash() + "kurs" + x.getKurs());
        }
    }
}








