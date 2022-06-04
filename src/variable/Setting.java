package variable;

import java.util.HashMap;
import java.util.Map;

public class Setting {
    public static final Map<String, String> var = new HashMap<>();

    public boolean findKey(String key) {
        return var.containsKey(key);
    }


}
