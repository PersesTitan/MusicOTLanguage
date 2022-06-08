import run.Encode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        new Main(args);
    }

    private Main(String[] args) throws Exception {
        if (args.length < 1) throw new Exception("파일이 존재하지 않습니다.");
        else if (!new File(args[0]).canRead()) throw new Exception("파일을 읽을 수 없습니다.");
        else if (!args[0].toLowerCase(Locale.ROOT).endsWith("otlm")) throw new Exception("확장자를 확인해주세요.");

//        args = new String[1];
//        args[0] = "ㅇ도ㅇ ㅇ레ㅇ ㅇ도ㅇ\n" +
//                "ㅇ도ㅇ\n" +
//                "\n" +
//                "ㅇ드ㅇ ㅇ도ㅇ\n" +
//                "ㅇ드드ㅇ";
//
//        Encode encode = new Encode();
//        for (String line : args[0].split("\\n")) {
//            encode.start(line);
//        }

        try (var reader = new BufferedReader(new FileReader(args[0], StandardCharsets.UTF_8))) {
            final Encode encode = new Encode();
            String text;
            while ((text = reader.readLine()) != null) encode.start(text);
        }
        pause();
    }

    private void pause() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


