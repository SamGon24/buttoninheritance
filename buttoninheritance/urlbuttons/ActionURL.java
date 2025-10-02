// new file to move the url handlings out of ParentURLButton
// handles the action events for the URL buttons, following SRP
// will also have a pop-up message if the URL cannot be opened
// packages needed to implement everything (just adding default stuff)

package buttoninheritance.urlbuttons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane; // import to show pop-up messages

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
            JOptionPane.showMessageDialog(null, "The url opened succesfully!", "Pop-Up", JOptionPane.PLAIN_MESSAGE); // Improved this call, might add colors later
            } catch (Exception ex) {
                ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to open: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); // This is the actual pop-up message from the rubric
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
}

