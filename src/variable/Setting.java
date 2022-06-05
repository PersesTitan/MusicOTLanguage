package variable;

import item.KeyValue;

import java.util.*;
import java.util.regex.Pattern;

public class Setting {
    private final String putVar = "^\\s*(ㅇMㅇ|ㅇ음ㅇ)\\s+\\S+:";
    private final String outVar = "(\\s+|^):\\S+(\\s+|$)";

    private final Pattern putPattern = Pattern.compile(putVar);
    private final Pattern outPattern = Pattern.compile(outVar);

    private static final Map<String, String> var = new HashMap<>();

    //생성자
    public Setting() {
        var.clear();
    }

    //존재 찾기
    public boolean findPut(String line) {
        return putPattern.matcher(line).find();
    }

    public boolean findOut(String line) {
        return outPattern.matcher(line).find();
    }

    public void putVar(String line) throws Exception {
        KeyValue keyValue;
        if (line.contains("ㅇMㅇ")) keyValue = getKeyValue("ㅇMㅇ", line);
        else keyValue = getKeyValue("ㅇ음ㅇ", line);
        var.put(keyValue.key(), keyValue.value());
    }

    public String getVar(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line);
        Set<String> set = new HashSet<>();
        while (tokenizer.hasMoreTokens()) {
            String text = tokenizer.nextToken();
            if (text.startsWith(":")) set.add(text.substring(1));
        }

        for (String s : set) line = line.replace(":" + s, var.get(s));
        return line;
    }

    ///////
    private KeyValue getKeyValue(String SPECIFIED, String line) throws Exception {
        int start = line.indexOf(SPECIFIED) + SPECIFIED.length();
        if (line.substring(start).isBlank()) throw new Exception("초기값이 존재 하지 않습니다.");
        int end = line.indexOf(":");
        String key = line.substring(start, end).strip();
        if (var.containsKey(key)) throw new Exception("이미 존재하는 변수 이름 입니다.");
        String value = line.substring(end+1);
        return new KeyValue(key, value);
    }
}
