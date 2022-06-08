package run;

public interface MainRun {
    Drum drum = new Drum();
    Piano piano = new Piano();
    String sound1 = "ㅇ도ㅇ";
    String sound2 = "ㅇ레ㅇ";
    String sound3 = "ㅇ미ㅇ";
    String sound4 = "ㅇ파ㅇ";
    String sound5 = "ㅇ솔ㅇ";
    String sound6 = "ㅇ라ㅇ";
    String sound7 = "ㅇ시ㅇ";

    String drum1 = "ㅇ드ㅇ";
    String drum2 = "ㅇ드드ㅇ";
    String drum3 = "ㅇ드드드ㅇ";
    String drum4 = "ㅇ드드드드ㅇ";

    default void mainStart(String text) throws Exception {
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
