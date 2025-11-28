package bankabstract.service;
import bankabstract.service.AbstractPaymentService;
import bankabstract.service.Payment1;
import bankabstract.entity.Operation;
import bankabstract.entity.User;
import bankabstract.db.Database;
public class Main {

    public static int count = 0;
    public static void main(String[] args) {
        MenyuService menyu=new MenyuService();
        menyu.printMenyu();
    }
}