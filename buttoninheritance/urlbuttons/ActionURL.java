// new file to move the url handlings out of ParentURLButton

// packages needed to implement everything (just adding default stuff)
package buttoninheritance.urlbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URI;

public class ActionURL implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) { // transferring the logic of OpenBrowser to here, following SRP
        String url = e.getActionCommand(); 
        openBrowser(url);
    }

    private void openBrowser(String url) { // finally moved open browser logic to here
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