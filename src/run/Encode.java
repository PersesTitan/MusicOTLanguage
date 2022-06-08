package run;

import java.util.Map;
import java.util.StringTokenizer;

public class Encode {
    private final Drum drum = new Drum();
    private final Piano piano = new Piano();

    public void start(String line) throws Exception {
        final String sound1 = "ㅇ도ㅇ";
        final String sound2 = "ㅇ레ㅇ";
        final String sound3 = "ㅇ미ㅇ";
        final String sound4 = "ㅇ파ㅇ";
        final String sound5 = "ㅇ솔ㅇ";
        final String sound6 = "ㅇ라ㅇ";
        final String sound7 = "ㅇ시ㅇ";
        final String drum1 = "ㅇ드ㅇ";
        final String drum2 = "ㅇ드드ㅇ";
        final String drum3 = "ㅇ드드드ㅇ";
        final String drum4 = "ㅇ드드드드ㅇ";

        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
            String text = tokenizer.nextToken();
            switch (text) {
                case sound1 -> piano.sound1();
                case sound2 -> piano.sound2();
                case sound3 -> piano.sound3();
                case sound4 -> piano.sound4();
                case sound5 -> piano.sound5();
                case sound6 -> piano.sound6();
                case sound7 -> piano.sound7();
                case drum1 -> drum.hihat();
                case drum2 -> drum.kick();
                case drum3 -> drum.percu();
                case drum4 -> drum.snare();
                default -> throw new Exception(text + "는 인식할 수 없는 문자 입니다.");
            }
        }
    }
}
