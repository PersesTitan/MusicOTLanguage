import run.Encode;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception {
        new Main(args);
    }

    private Main(String[] args) throws Exception {
        start(args);
//        test();
    }

    private void start(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("otl OR otlm", "otl", "otlm");


        if (args.length < 1) throw new Exception("파일이 존재하지 않습니다.");
        else if (!new File(args[0]).canRead()) throw new Exception("파일을 읽을 수 없습니다.");
        else if (!args[0].toLowerCase(Locale.ROOT).endsWith("otlm")) throw new Exception("확장자를 확인해주세요.");

        try (var reader = new BufferedReader(new FileReader(args[0], StandardCharsets.UTF_8))) {
            final Encode encode = new Encode();
            String text;
            while ((text = reader.readLine()) != null) encode.start(text);
        }
    }

    private void test() throws Exception {
        String args = """
                ㅇ음ㅇ ㅇㅇ:ㅇ미ㅇ ㅇ파ㅇ
                ㅇ도ㅇ ㅇ레ㅇ ㅇ도ㅇ
                :ㅇㅇ :ㅇㅇ
                ㅇ도ㅇ

                ㅇ드ㅇ ㅇ도ㅇ
                ㅇ드드ㅇ""";

        Encode encode = new Encode();
        for (String line : args.split("\\n")) {
            encode.start(line);
        }
    }

    private void pause() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


