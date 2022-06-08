package playmusic;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Piano {

    public void sound1() {
        File file = new File("src/sound/sound1.wav").getAbsoluteFile();
        try (var audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("도");
        } catch (Exception ignored) {}
    }

    public void sound2() {
        File file = new File("src/sound/sound2.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("레");
        } catch (Exception ignored) {}
    }

    public void sound3() {
        File file = new File("src/sound/sound3.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("미");
        } catch (Exception ignored) {}
    }

    public void sound4() {
        File file = new File("src/sound/sound4.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("파");
        } catch (Exception ignored) {}
    }

    public void sound5() {
        File file = new File("src/sound/sound5.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("솔");
        } catch (Exception ignored) {}
    }

    public void sound6() {
        File file = new File("src/sound/sound6.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("라");
        } catch (Exception ignored) {}
    }

    public void sound7() {
        File file = new File("src/sound/sound7.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("시");
        } catch (Exception ignored) {}
    }

    public void sound8() {
        File file = new File("src/sound/sound8.wav").getAbsoluteFile();
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ignored) {}
    }
}
