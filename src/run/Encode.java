package run;

import java.util.Map;
import java.util.StringTokenizer;

public class Encode {

    public void start(String line) throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(line);
        while (tokenizer.hasMoreTokens()) {
            String text = tokenizer.nextToken();
            LineThread lineThread = new LineThread(text);
            lineThread.start();
        }

        Thread.sleep(1000);
    }
}
