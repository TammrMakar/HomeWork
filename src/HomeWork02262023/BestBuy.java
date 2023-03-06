import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        /*1) Create a map of Best Buy store. Place
         item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
          Retrieve all keys and values from a Best Buy map using EntrySet.*/

        LinkedHashMap<String,String> items=new LinkedHashMap<>();
        items.put("7664847","Printer");
        items.put("7879885","TV");
        items.put("7879856","Home theater");
        items.put("7879845","Iphone");

        Set<Entry<String,String>> entryMap=items.entrySet();
        for (Entry<String,String> entry:entryMap){
            String key= entry.getKey();
            String value= entry.getValue();
            System.out.println(entry.getValue()+" :  "+entry.getKey());
        }

    }
}