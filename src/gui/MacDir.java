package gui;

import run.Encode;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class MacDir extends JFrame {

    private MacDir() throws Exception {
        final String[] extensions = {"otl", "otlm"};

        final JFileChooser chooser = new JFileChooser();
        final FileNameExtensionFilter filter = new FileNameExtensionFilter(".otl OR .otlm", extensions);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        chooser.setFileFilter(filter);
        int open = chooser.showOpenDialog(getParent());
        if (open == JFileChooser.OPEN_DIALOG) {
            String path = chooser.getSelectedFile().getPath();
            if (!new File(path).canRead()) throw new Exception("파일을 읽을 수 없습니다.");
            boolean bool = path.toLowerCase(Locale.ROOT).endsWith(".otl");
            bool = bool || path.toLowerCase(Locale.ROOT).endsWith(".otlm");
            if (!bool) throw new Exception("해당 확장자는 읽을 수 없습니다.");

            try (var reader = new BufferedReader(new FileReader(path, StandardCharsets.UTF_8))) {
                final Encode encode = new Encode();
                String text;
                while ((text = reader.readLine()) != null) encode.start(text);
            } catch (Exception ignored) {}
        }
    }

    public static void main(String[] args) throws Exception {
        new MacDir();
    }
}
