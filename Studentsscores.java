
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Studentsscores {
    static Map<String, ArrayList<Integer>> students = new HashMap<>();

    public static void max() {
        double average = 0;
        double max = 0;
        for (Map.Entry<String, ArrayList<Integer>> entry : students.entrySet()) {
            String name = entry.getKey();
            ArrayList<Integer> l = entry.getValue();
            int sum = 0;
            for (int x : l) {
                sum += x;
            }
            if(l.size()!=0) {
                average = sum / l.size();
            }
            if (average > max) {
                max = average;
            }
        }
        System.out.println("max=" + max);
    }

    public static void main(String[] args) {

        students.put("Tamilla", new ArrayList<>());
        students.get("Tamilla"). add(20);
        students.get("Tamilla"). add(40);
        students.get("Tamilla"). add(60);
        students.put("Rauf", new ArrayList<>());
        students.get("Rauf"). add(10);
        students.get("Rauf"). add(15);
        students.get("Rauf"). add(20);
        students.put("Nigar", new ArrayList<>());
        students.get("Nigar"). add(0);
        students.get("Nigar"). add(3);
        students.get("Nigar"). add(5);
        max();

    }
}