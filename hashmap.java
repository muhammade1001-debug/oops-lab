import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("England", 1);
        map.put("Germany", 2);
        map.put("Brazil", 3);
        map.put("France", 4);

        System.out.println("Map: " + map);

        System.out.println("Size of map: " + map.size());

        map.put("Germany", 5); 
        System.out.println("After update: " + map);

        map.remove("Brazil");
        System.out.println("After remove: " + map);

        if(map.containsKey("England")){
            int a = map.get("England");
            System.out.println("Value for key England is: " + a);
        }
    }
}
