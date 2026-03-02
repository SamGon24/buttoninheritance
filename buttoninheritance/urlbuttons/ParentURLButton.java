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

    public ParentURLButton(String text, String url, Color bgColor) {
        super(text);
        this.url = url;

        if (bgColor != null) {           // si pasas un color, lo aplica
            setBackground(bgColor);
        }

        setActionCommand(this.url);  // setting the action command to the url for the ActionURL class to use
        setPreferredSize(new Dimension(150, 100));

    }
        protected void reNameButton(String name) { 
        this.setText(name);
    }

}
