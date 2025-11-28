package bankabstract.service;

import static bankabstract.db.Database.*;
import static bankabstract.service.Main.count;

import bankabstract.db.Database;
import bankabstract.entity.Operation;
import bankabstract.entity.User;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Payment1 extends AbstractPaymentService {
    boolean a=true;
    Scanner scanner = new Scanner(System.in);
    User user = new User();

    @Override
    public void showBalance(User y) {
        this.user=y;
        Operation operation = new Operation( count + 1);
        if (tarixceCount==tarixce.length){
            clearTarixce();}
        Database.tarixce[Database.tarixceCount] = operation.getId();
        Database.tarixceCount++;

        System.out.println("Balance=" + user.getBalance()+" "+"ID: "+operation.getId());

    }

    @Override
    public void topUpBalance(User y) {
        this.user=y;
        System.out.println("Elave edilen meblegi daxil edin");
        String input = scanner.nextLine();
        double amount = Double.parseDouble(input);
        Operation operation = new Operation(amount, count + 1);
        if (tarixceCount==tarixce.length){
            clearTarixce();}
        Database.tarixce[Database.tarixceCount] = operation.getId();
        Database.tarixceCount++;

        user.setBalance(user.getBalance() + amount);
        System.out.println(amount + "AZN əlavə olundu." + "Balans:" + user.getBalance()+" "+"ID: "+operation.getId());

    }

    @Override
    public void substractBalance(User y) {
        this.user=y;
        System.out.println("Chixilan meblegi daxil edin");
        String input = scanner.nextLine();
        double amount = Double.parseDouble(input);
        Operation operation = new Operation(amount, count + 1);
        if (tarixceCount==tarixce.length){
            clearTarixce();}
        Database.tarixce[Database.tarixceCount] = operation.getId();
        Database.tarixceCount++;

        if((user.getBalance() - amount)>0){
        user.setBalance(user.getBalance() - amount);
            System.out.println(amount + "AZN çıxıldı." + "Balans:" + user.getBalance()+" "+"ID: "+operation.getId());}
        else{
            System.out.println("Balans kifayet etmir");
        }


    }

}
