package buttoninheritance.drawingbuttons;

import buttoninheritance.trigdrawingfunctions.CosineDrawer;
import java.awt.Color;
import javax.swing.JFrame;

public class CosineDrawingButton extends ParentDrawingButton {

    public CosineDrawingButton(String text) {
        super(text,new Color(255, 215, 0));
    }

    @Override
    protected void plotter(JFrame plotterFrame) {
        plotterFrame.setTitle("Cosine Plotter"); // opcional, cambia el título
        plotterFrame.add(new CosineDrawer());    // añade el panel de dibujo
    }

}
