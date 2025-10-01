package buttoninheritance.urlbuttons;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;

// Parent class: URL Buttons
public class ParentURLButton extends JButton implements ActionListener {
    protected String url;

    public ParentURLButton(String text, String url) {
        this(text, url, null); // Call the other constructor with a null color to avoid duplication (might change later not sure)
    }

    public ParentURLButton(String text, String url, Color bgColor) {
        super(text);
        this.url = url;

        if (bgColor != null) {           // si pasas un color, lo aplica
            setBackground(bgColor);
        }

        addActionListener(this);
        setPreferredSize(new Dimension(150, 100));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        openBrowser(url);
    }

    protected void reNameButton(String name) {
        this.setText(name);
    }

    private void openBrowser(String url) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace(System.out);
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }

}
