package run;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Drum {

    public void hihat() {
        File file = new File("src/sound/hihat.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ignored) {}
    }

    public void kick() {
        File file = new File("src/sound/kick.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ignored) {}
    }

    public void percu() {
        File file = new File("src/sound/percu.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ignored) {}
    }

    public void snare() {
        File file = new File("src/sound/snare.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ignored) {}
    }
}
