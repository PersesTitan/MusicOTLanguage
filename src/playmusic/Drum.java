package playmusic;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Drum implements TotalText {

    public void hihat() {
        File file = new File("src/sound/hihat.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            total.append("드럼1 ");
            System.out.println("하이헷");
        } catch (Exception ignored) {}
    }

    public void kick() {
        File file = new File("src/sound/kick.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            total.append("드럼2 ");
            System.out.println("킥");
        } catch (Exception ignored) {}
    }

    public void percu() {
        File file = new File("src/sound/percu.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            total.append("드럼3 ");
            System.out.println("퍼쿠");
        } catch (Exception ignored) {}
    }

    public void snare() {
        File file = new File("src/sound/snare.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            total.append("드럼4 ");
            System.out.println("작은 북");
        } catch (Exception ignored) {}
    }
}
