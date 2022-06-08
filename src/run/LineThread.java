package run;

public class LineThread extends Thread implements Runnable, MainRun {

    protected String line;

    public LineThread(String line) {
        this.line = line;
    }

    @Override
    public void run() {
        try {mainStart(line);} catch (Exception ignored) {}
    }
}
