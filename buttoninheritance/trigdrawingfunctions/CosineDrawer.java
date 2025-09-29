package buttoninheritance.trigdrawingfunctions;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class CosineDrawer extends JPanel implements ActionListener {
    private final Timer timer;           // Timer to update the "x" coordinate
    private double angle = 0.0;          // Start angle
    private final List<Point> points;    // To store points of the cosine curve

    public CosineDrawer() {
        points = new ArrayList<>();
        // Set up the timer to call actionPerformed method every 10 milliseconds
        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Point point : points) {
            g.fillOval(point.x, point.y, 4, 4); // Draw each point as a small circle
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            // Increment the angle
            angle += 0.01;                   // Increment in 1/100th of a radian
            int x = (int) (angle * getWidth() / (2*Math.PI));   //dependent to width from 0 to 2PI for cosine funct
            int centerY= getHeight() / 2; //centering it vertically to create cosine funct
            int amplitude = (int) (getHeight() * 0.5); //0.5 test point to see how it looks, 0.4 doesnt reach frames
            int y = centerY - (int) (amplitude * Math.cos(angle));


            points.add(new Point(x, y));     // Add the new point
            repaint();

            // Stop after ~1 periodo o al salir del panel
            if (angle >=2 * Math.PI) { //testing if it prints full period (might change)
                timer.stop();
            }
        }
    }
}
