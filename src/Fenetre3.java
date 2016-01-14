import javax.swing.*;
import java.awt.*;

/**
 * Created by renando on 06/01/16.
 */
public class Fenetre3 extends JFrame {

    public Automate o;
    public JLabel label = new JLabel("0");

    public JButton avant = new JButton("<<");
    public JButton apres = new JButton(">>");

    public JButton bstart = new JButton("Start");
    public JButton bstop = new JButton("Stop");

    public Fenetre3(){
        this.setTitle("Bouton");
        this.setSize(300, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(2, 3));


        this.getContentPane().add(avant);
        this.getContentPane().add(apres);

        this.getContentPane().add(label);
        this.getContentPane().add(bstart);
        this.getContentPane().add(bstop);


        bstart.addActionListener(actionEvent -> o.gestionClicBouton1());
        bstop.addActionListener(actionEvent -> o.gestionClicBouton2());

        avant.addActionListener(actionEvent -> o.gestionClicBouton3());
        apres.addActionListener(actionEvent -> o.gestionClicBouton4());

        this.setVisible(true);
    }

}