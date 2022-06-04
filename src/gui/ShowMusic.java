package gui;

import javax.swing.*;
import java.awt.*;

import static javax.swing.BoxLayout.*;

public class ShowMusic extends JFrame {

    private final JPanel panel = new JPanel();

    public ShowMusic() {
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("OTLanguageMusic");

        BoxLayout box = new BoxLayout(panel, Y_AXIS);
        panel.setLayout(box);
        add(panel);
        panel.revalidate();
        setVisible(true);
    }

    public void addLayout(String text) {
        Label label = new Label(text);
        panel.add(label);
        add(panel);
    }
}
