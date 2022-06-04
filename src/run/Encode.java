package run;

import gui.ShowMusic;

import java.util.Map;
import java.util.StringTokenizer;

public class Encode {

//    private final ShowMusic showMusic = new ShowMusic();

    public void start(String line) throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
            String text = tokenizer.nextToken();
//            showMusic.addLayout(text);

            LineThread lineThread = new LineThread(text);
            lineThread.start();
        }

        Thread.sleep(1000);
    }
}
