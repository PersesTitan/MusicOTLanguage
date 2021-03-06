package gui;

import javax.swing.*;

public class ShowMusic extends JFrame {

    private final JTextArea area = new JTextArea();
    private final String newLine = System.getProperty("line.separator");

    public ShowMusic() {
        final JScrollPane scrollBar = new JScrollPane(area);
        add(scrollBar, "Center");
        area.setEnabled(false);
        setTitle("OTLanguageMusic");
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setTotalText(String text) {
        area.append(text);
        area.append(newLine);
    }
}
