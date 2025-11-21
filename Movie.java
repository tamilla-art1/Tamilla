import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Movie {

    static Map<String, ArrayList<String>> movies = new HashMap<>();

    public static void main(String[] args) {
        metod1();
    }

    public static void metod1 () {
        int max=0;
        String a=null;
        boolean c=false;

        movies.put("Documentary",new ArrayList<>());
        movies.get("Documentary").

    add("Fish");
        movies.get("Documentary").

    add("Wolf");
        movies.get("Documentary").

    add("Snakes");
        movies.put("Romantic",new ArrayList<>());
        movies.get("Romantic").

    add("Love");
        movies.get("Romantic").

    add("Sunrise");
        movies.get("Romantic").

    add("Broken hearts");
        movies.get("Romantic").

    add("Unknown feelings");
        System.out.println("Janr adını daxil et:");
        Scanner sc = new Scanner(System.in);
        String janr1 = sc.nextLine();


        for (Map.Entry<String, ArrayList<String>> entry : movies.entrySet()) {
            String janr = entry.getKey();
            ArrayList<String> movie = entry.getValue();
            if(janr.equals(janr1)){
                System.out.println(movie.toString());
                c=true;
            }

            if(movie.size()>max){
                max=movie.size();
                a=janr;

            }
        }
        if (c==false)
        {
            System.out.println("Bele janr mövcud deyil");
        }
        System.out.println("Janr:"+a+" "+max);


}

}
