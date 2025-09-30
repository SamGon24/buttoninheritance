// new file to move the url handlings out of ParentURLButton

// packages needed to implement everything (just adding default stuff)
package buttoninheritance.urlbuttons;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URI;

public class ActionURL implements ActionListener {
    public void actionPerformed(ActionEvent e) { // transferring the logic of OpenBrowser to here, following SRP
        String url = e.getActionCommand(); 
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
}