import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
  public static void main(String[] args) {
    Map<String, String> L = new TreeMap<>();
    L.put("dog", "woof");
    String sound = L.get("dog");
  }
}
