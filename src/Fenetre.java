import javax.swing.*;
import java.awt.*;

/**
 * Created by renando on 04/01/16.
 */
public class Fenetre extends JFrame{
    public Automate o;
    public JButton b1 = new JButton("Bouton 1");
    public JButton b2 = new JButton("Bouton 2");
    public JButton b3 = new JButton("Bouton 3");
    public JButton b4 = new JButton("Bouton 4");

    public Fenetre(){
        this.setTitle("Bouton");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(2, 2));


        this.getContentPane().add(b1);
        this.getContentPane().add(b2);
        this.getContentPane().add(b3);
        this.getContentPane().add(b4);

        b1.addActionListener(actionEvent -> o.gestionClicBouton1());
        b2.addActionListener(actionEvent -> o.gestionClicBouton2());
        b3.addActionListener(actionEvent -> o.gestionClicBouton3());
        b4.addActionListener(actionEvent -> o.gestionClicBouton4());

        this.setVisible(true);
    }

}
