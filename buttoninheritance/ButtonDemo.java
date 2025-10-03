package buttoninheritance;

import buttoninheritance.drawingbuttons.CosineDrawingButton;
import buttoninheritance.drawingbuttons.ParentDrawingButton;
import buttoninheritance.drawingbuttons.SineDrawingButton;
import buttoninheritance.urlbuttons.MyButtonURL;
import buttoninheritance.urlbuttons.OCPButton;
import buttoninheritance.urlbuttons.ActionURL; // new import to use the actionurl class 
import buttoninheritance.urlbuttons.ParentURLButton;
import buttoninheritance.urlbuttons.SRPButton;
import java.awt.*;
import javax.swing.*;



// Main class to demonstrate the UI
public class ButtonDemo extends JFrame {
    public ButtonDemo() {
        setTitle("Project 1: Rodrigo and Samuel");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create buttons
        ParentURLButton txStateURLButton = new ParentURLButton("TxState", "https://www.txst.edu/",new Color(102, 0, 0));
        txStateURLButton.setForeground(Color.WHITE); //change letters to color white for better view
        SRPButton srpButton = new SRPButton("SRP", "https://www.youtube.com/watch?v=MPp4A4F6rQI&t=359s");
        srpButton.setForeground(Color.WHITE); 
        OCPButton ocpButton = new OCPButton("OCP", "https://www.youtube.com/watch?v=j9G-1TF9KkQ");
        MyButtonURL mybuttonurl = new MyButtonURL("YOUTUBE", "https://www.youtube.com/watch?v=l91QeZ7AUag");
        mybuttonurl.setForeground(Color.WHITE);
        ParentDrawingButton drawingButton = new CosineDrawingButton("Cosine Plotter");
        ParentDrawingButton drawingButton1 = new SineDrawingButton("Sine Plotter");

        ActionURL open = new ActionURL(); // Now that we moved things around, boom: instances now correspond to ActionURL.
        txStateURLButton.addActionListener(open);
        srpButton.addActionListener(open);
        ocpButton.addActionListener(open);

        // Add buttons to the frame
        add(txStateURLButton);
        add(srpButton);
        add(ocpButton);
        add(drawingButton);
        add(drawingButton1);
        add(mybuttonurl);

        // Add buttons to the frame
        add(txStateURLButton);
        add(srpButton);
        add(ocpButton);
        add(drawingButton);
        add(drawingButton1);

    }

    public static void main(String[] args) {
        // Create and show the UI
        SwingUtilities.invokeLater(() -> {
            ButtonDemo demo = new ButtonDemo();
            demo.setVisible(true);
        });
    }
}
