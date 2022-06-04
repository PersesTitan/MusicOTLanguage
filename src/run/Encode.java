package run;

import gui.ShowMusic;
import variable.Setting;

import java.util.StringTokenizer;

public class Encode implements MainRun {

    private final ShowMusic showMusic = new ShowMusic();
    private final StringBuffer buffer = new StringBuffer();
    private final Setting setting = new Setting();

    public void start(String line) throws Exception {
        if (setting.findPut(line)) setting.putVar(line);
        else {
            if (setting.findOut(line)) line = setting.getVar(line);
            StringTokenizer tokenizer = new StringTokenizer(line);
            buffer.setLength(0);
            while (tokenizer.hasMoreTokens()) {
                String text = tokenizer.nextToken();
                new LineThread(text).start();
                this.replace(text);
            }
            showMusic.setTotalText(buffer.toString());
            Thread.sleep(1000);
        }
    }

    private void replace(String text) {
        switch (text) {
            case sound1 -> buffer.append("도 ");
            case sound2 -> buffer.append("레 ");
            case sound3 -> buffer.append("미 ");
            case sound4 -> buffer.append("파 ");
            case sound5 -> buffer.append("솔 ");
            case sound6 -> buffer.append("라 ");
            case sound7 -> buffer.append("시 ");
            case drum1 -> buffer.append("드럼1 ");
            case drum2 -> buffer.append("드럼2 ");
            case drum3 -> buffer.append("드럼3 ");
            case drum4 -> buffer.append("드럼4 ");
        }
    }
}
