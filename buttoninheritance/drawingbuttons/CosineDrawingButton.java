package buttoninheritance.drawingbuttons;

import buttoninheritance.trigdrawingfunctions.CosineDrawer;
import javax.swing.JFrame;

public class CosineDrawingButton extends ParentDrawingButton {

    public CosineDrawingButton(String text) {
        super(text);
    }

    @Override
    protected void plotter(JFrame plotterFrame) {
        plotterFrame.setTitle("Cosine Plotter"); // opcional, cambia el título
        plotterFrame.add(new CosineDrawer());    // añade el panel de dibujo
    }

}
