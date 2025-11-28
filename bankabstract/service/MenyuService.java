package bankabstract.service;

import bankabstract.entity.User;

import static bankabstract.db.Database.tarixce;
import static bankabstract.db.Database.userslist;
import static bankabstract.service.Main.count;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MenyuService {
    Scanner scanner = new Scanner(System.in);
    boolean running = true;

    public void printMenyu() {
        System.out.println("Username qeyd edin");
        String input = scanner.nextLine();
        User user1 = new User("Tamilla", 300);
        User user2 = new User("Aysel", 500);

        userslist.add(user1);
        userslist.add(user2);
        for (User x : userslist) {
            if (input.equalsIgnoreCase(x.getName())){
                Payment1 payment1 = new Payment1();
                System.out.println("Funksiyalar:\n" +
                        "1.Balansı göstər\n" + "2.Mədaxil\n" + "3.Məxaric\n" + "4.Tarixçə göstər\n" + "5.Çıxış\n");
                while (running) {
                    System.out.println("Sechiminizi daxil edin");
                    String input1 = scanner.nextLine();
                    int sechim = Integer.parseInt(input1);

                    switch (sechim) {
                        case 1:
                            payment1.showBalance(x);
                            count++;
                            break;
                        case 2:
                            payment1.topUpBalance(x);
                            count++;
                            break;
                        case 3:
                            payment1.substractBalance(x);
                            count++;
                            break;
                        case 4:
                            System.out.println(Arrays.toString(tarixce));
                            break;
                        case 5:
                            System.out.println("Proqramdan chixish edildi");
                            break;
                    }
                }
            }
        }
    }
}





