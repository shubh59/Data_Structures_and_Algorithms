import java.util.*;

public class HashTableExp {
    public static void main(String[] args) {

        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(15, "Naruto");
        table.put(1, "Itachi");
        table.put(6, "Minato");
        table.put(2, "Madara Uchiha");
        table.put(20, "Sasuke");
        table.put(10, "Shikamaru");

        // table.remove(20);

        for (Integer key : table.keySet()) {
            // System.out.println(key + "\t" + table.get(key));
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
        }

    }
}
