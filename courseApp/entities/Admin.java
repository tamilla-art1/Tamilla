package courseApp.entities;

import courseApp.service.Courseservice;
import courseApp.service.Studentservice;


import java.util.Scanner;

public class Admin {
    Courseservice courseservice = new Courseservice();
    Studentservice studentservice = new Studentservice();


    private static String username = "admin";
    private static int password1 = 12345;

    public static String getUsername() {
        return username;
    }

    public static int getPassword1() {
        return password1;
    }

    public void printAdminMenyu() {
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        while (a) {
            System.out.println("=== ADMIN PANEL ===\n" +
                    "1. Yeni tələbə əlavə et\n" +
                    "2. Yeni kurs əlavə et\n" +
                    "3. Tələbəni kursa təyin et\n" +
                    "4. Tələbələrin siyahısını göstər\n" +
                    "5. Kursların siyahısını göstər\n" +
                    "6. Geri qayıt");

            int number1 = Integer.parseInt(sc.nextLine());

            boolean b = true;
            boolean c = true;
            boolean d = true;

            switch (number1) {
                case 1:

                    studentservice.createStudent();
                    while (b) {
                        System.out.println("Daha yeni tələbə əlavə etmək istəyirsiniz?Bəli/Xeyr");
                        String cavab = sc.nextLine();
                        if (cavab.equals("Bəli")) {
                            System.out.println("Daha yeni tələbə əlavə etmək istəyirsiniz?Bəli/Xeyr");
                            studentservice.createStudent();

                        } else if (cavab.equals("Xeyr")) {
                            b = false;
                            break;
                        }
                    }
                    break;
                case 2:
                    while (c) {
                        courseservice.createCourse();
                        System.out.println("Daha yeni kurs əlavə etmək istəyirsiniz?Bəli/Xeyr");
                        String cavab = sc.nextLine();
                        if (cavab.equals("Xeyr")) {
                            c = false;
                            break;
                        }
                    }
                    break;
                case 3:
                    while (b) {
                        studentservice.telebeKursaTeyinEt();
                        System.out.println("Daha yeni tələbə kursa təyin etmək isteyirsiniz?Bəli/Xeyr");
                        String cavab = sc.nextLine();
                        if (cavab.equals("Xeyr")) {
                            b = false;
                        }
                    }
                    break;
                case 4:
                    studentservice.telebelerinSiyahisi();
                    break;

                case 5:
                    courseservice.kurslarinSiyahisi();
                    break;

                case 6:
                    a = false;
                    break;

            }
        }
    }
}

