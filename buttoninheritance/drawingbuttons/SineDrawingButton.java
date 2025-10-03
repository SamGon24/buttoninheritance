package buttoninheritance.drawingbuttons;

import buttoninheritance.trigdrawingfunctions.SineDrawer;
import java.awt.Color;
import javax.swing.JFrame;


public class SineDrawingButton extends ParentDrawingButton {

    public SineDrawingButton(String text) {
        super(text,new Color(0, 128, 128));
    }

    @Override
    protected void plotter(JFrame plotterFrame) {
        plotterFrame.setTitle("Sine Plotter"); 
        plotterFrame.add(new SineDrawer());    
    }    
}