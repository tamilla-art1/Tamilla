package bankabstract.db;
import bankabstract.entity.User;
import courseApp.entities.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    public static int tarixceCount=0;
    public static ArrayList<User> userslist=new ArrayList<>();
    public static int[] tarixce = new int[3];
    public static  void clearTarixce() {
        if (tarixceCount >=tarixce.length) {
            Arrays.fill(tarixce, 0);
            tarixceCount = 0;
        }
    }



}
