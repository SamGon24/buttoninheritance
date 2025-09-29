package buttoninheritance.drawingbuttons;

import buttoninheritance.trigdrawingfunctions.SineDrawer;
import javax.swing.JFrame;

public class SineDrawingButton extends ParentDrawingButton {

    public SineDrawingButton(String text) {
        super(text);
    }

    @Override
    protected void plotter(JFrame plotterFrame) {
        plotterFrame.setTitle("Sine Plotter"); 
        plotterFrame.add(new SineDrawer());    
    }    
}