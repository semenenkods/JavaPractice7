package guru.qa;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args){
HashMap<String, Integer> studIds = new HashMap<>();
studIds.put("Student 1", 001);
studIds.put("Student 2", 002);
studIds.put("Student 3", 003);


        for (Map.Entry<String, Integer> entry: studIds.entrySet()) {
           entry.getKey();
           entry.getValue();
           System.out.println(entry);
        }

        for (String key: studIds.keySet()){
            System.out.println(key);

        }

        for (Integer value: studIds.values()){
            System.out.println(value);

        }


}
}
