import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Employee {
    static Map<String, ArrayList<String>> departmentEmployee = new HashMap<>();

    public static void main(String[] args) {
        metod1();
    }
        public static void metod1 () {
            int max=0;
            String r=null;
            departmentEmployee.put("Marketing", new ArrayList<>());
            departmentEmployee.get("Marketing").add("Fidan");
            departmentEmployee.get("Marketing").add("Orxan");
            departmentEmployee.put("Proqramlashdirma", new ArrayList<>());
            departmentEmployee.get("Proqramlashdirma").add("Rauf");
            departmentEmployee.get("Proqramlashdirma").add("Tamilla");
            departmentEmployee.get("Proqramlashdirma").add("Nicat");
            departmentEmployee.put("Data analitika", new ArrayList<>());
            departmentEmployee.get("Data analitika").add("Rahim");
            for (Map.Entry<String,ArrayList<String>> x : departmentEmployee.entrySet()) {
                System.out.println("departament:"+x.getKey()+x.getValue());
                int a=x.getValue().size();
                if (a>max){
                    max=a;
                    r=x.getKey();
                }
            }
            System.out.println("Maksimal əməkdaşı olan şöbə:"+r+"\nəməkdaş sayı="+max);
        }
    }


