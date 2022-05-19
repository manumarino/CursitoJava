import java.util.HashMap;
import java.util.Map;

public class HashesMapes {



    public class Main {
        public static void main(String[] args) {
            Map<String, String> capitalCities = new HashMap<>();
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
            System.out.println(capitalCities);



            for(String key : capitalCities.keySet()){
                System.out.println(key);
            }


            for(Map.Entry<String, String> pair : capitalCities.entrySet()){
                System.out.println(pair.getKey() + " / " + pair.getValue());
            }
        }
    }
}
