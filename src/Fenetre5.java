import sun.java2d.loops.DrawLine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

/**
 * Created by renando on 13/01/16.
 */
public class Fenetre5 extends JFrame implements MouseListener, MouseMotionListener {
    Point sPoint = new Point(-1, -1);
    Point ePoint = new Point(-1, -1);
    Vector points = new Vector();
    public Automate5 o;

    public Fenetre5() {
        Dimension d = getSize();

        setPreferredSize(new Dimension(200,200));
        addMouseListener(this);
        addMouseMotionListener(this);


    }

    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        Point p1, p2;
        for (int i = 0; i < points.size() - 1; i += 2) {
            p1 = (Point) points.elementAt(i);
            p2 = (Point) points.elementAt(i + 1);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }
     /* Draw current line.*/
        g.drawLine(sPoint.x, sPoint.y, ePoint.x, ePoint.y);
    }


    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        Point p = mouseEvent.getPoint();
        System.out.println(p);
        for (int i = 0; i < points.size(); i++) {
            Point p1 = (Point) points.elementAt(i);

            if (p1.getX() == p.getX() && p1.getY() == p.getY()) {
                points.remove(i);
                repaint();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        mouseEvent.consume();
        sPoint.x = mouseEvent.getX();
        sPoint.y = mouseEvent.getY();
        points.addElement(new Point(sPoint));
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        mouseEvent.consume();
        ePoint.x = mouseEvent.getX();
        ePoint.y = mouseEvent.getY();
        points.addElement(new Point(ePoint));
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseDragged(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseMoved(MouseEvent mouseEvent) {

    }
}
