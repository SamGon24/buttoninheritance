package buttoninheritance.urlbuttons;
import java.awt.Color;

// Child class: RectangleButton

public class SRPButton extends ParentURLButton {
   
    public SRPButton(String text, String url) {
        super(text, url, new Color(128, 128, 0));
    }
}


