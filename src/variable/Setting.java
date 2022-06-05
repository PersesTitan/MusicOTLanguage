package variable;

import item.KeyValue;

import java.util.*;
import java.util.regex.Pattern;

public class Setting {
    private final String newVar = "^\\s*(ㅇMㅇ|ㅇ음ㅇ)\\s+\\S+:";
    private final String outVar = "(\\s+|^):\\S+(\\s+|$)";
    private final String putVar = "^\\s*\\S+:";

    private final Pattern newPattern = Pattern.compile(newVar);
    private final Pattern outPattern = Pattern.compile(outVar);
    private final Pattern putPattern = Pattern.compile(putVar);

    private static final Map<String, String> var = new HashMap<>();

    //생성자
    public Setting() {
        var.clear();
    }

    //존재 찾기
    public boolean findNew(String line) {
        return newPattern.matcher(line).find();
    }

    public boolean findOut(String line) {
        return outPattern.matcher(line).find();
    }

    public boolean findPut(String line) {
        return putPattern.matcher(line).find();
    }

    //값을 넣는 메소드
    public void createVar(String line) throws Exception {
        KeyValue keyValue;
        if (line.contains("ㅇMㅇ")) keyValue = getKeyValue("ㅇMㅇ", line);
        else keyValue = getKeyValue("ㅇ음ㅇ", line);
        var.put(keyValue.key(), keyValue.value());
    }

    //값을 가져오는 메소드
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

    //값을 기본 변수에 값을 넣는 작업
    public void putVar(String line) throws Exception {
        int start = line.indexOf(":");
        String key = line.substring(0, start).strip();
        if (line.substring(start+1).isBlank()) throw new Exception("값이 존재하지 않습니다.");
        else if (!var.containsKey(key)) throw new Exception("존재하지 않는 변수 입니다.");
        String value = line.substring(start+1);
        var.put(key, value);
    }

    //변수 추출하는 코드
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
