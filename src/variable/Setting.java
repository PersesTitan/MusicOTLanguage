package variable;

import java.util.HashMap;
import java.util.Map;

public class Setting {
    private final String con = "\\n\\s*ㅇMㅇ\\s";
    private static final Map<String, String> var = new HashMap<>();

    public boolean findKey(String key) {
        return var.containsKey(key);
    }

    public void joinValue(String key, String value) {
        var.put(key, value);
    }


}
