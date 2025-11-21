package courseApp.service;

import courseApp.entities.Course;
import courseApp.entities.Student;

import java.util.Scanner;

import static courseApp.db.Database.courselist;
import static courseApp.db.Database.studentlist;

public class Courseservice {
    Scanner sc = new Scanner(System.in);
    public void createCourse() {
        System.out.println("Kursun adını daxil et");
        String name  = sc.nextLine();
        System.out.println("Kursun muellimini daxil et");
        String teacher= sc.nextLine();
        System.out.println("Kursun təsvirini daxil et");
        String decription=sc.nextLine();
        System.out.println("ID daxil et");
        int id = Integer.parseInt(sc.nextLine());
      Course course=new Course (id,name,teacher,decription);
        courselist.add(course);
        System.out.println("Kurs uğurla əlavə edildi!");

    }
    public void kurslarinSiyahisi(){
        System.out.println("=== Kurslarin Siyahısı ===");
        for (Course x : courselist) {
            System.out.println(x.getName() + x.getTeacher());
        }
    }
}
