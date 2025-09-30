package buttoninheritance.urlbuttons;

import java.awt.Color; 
import java.awt.Dimension;
import javax.swing.JButton;

// New objective now: refactor the ParenURLButton class to only handle UI stuff,
// not the URL opening logic. Openbrowser logic should be in another class (SRP)

// Parent class: URL Buttons
public class ParentURLButton extends JButton {
    protected String url;

    public ParentURLButton(String text, String url) {
        this(text, url, null); // Call the other constructor with a null color to avoid duplication (might change later not sure)

    }

    public ParentURLButton(String text, String url, Color colorSomething) {
        super(text);
        this.url = url;
        setActionCommand(this.url);  // setting the action command to the url for the ActionURL class to use
        setPreferredSize(new Dimension(150, 100));

    }
        protected void reNameButton(String name) { 
        this.setText(name);
    }
/* 
    @Override
    public void actionPerformed(ActionEvent e) { // this should be out of here
        openBrowser(url);
    }

    private void openBrowser(String url) { // this should be out of here
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
        */

}
