// "Replace with 'replaceAll' method call" "true"

import java.util.HashMap;
import java.util.Map;

class Main {
  public void test() {
    Map<String, String> map = new HashMap<>();
    String defaultValue = "42";
    map.put("foo", "bar");
    for<caret> (Map.Entry<String, String> entry : map.entrySet()) {
      map.put(entry.getKey(), entry.getValue() + entry.getKey() + defaultValue + "baz");
    }
  }
}