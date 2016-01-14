import javax.swing.*;
import java.awt.*;

/**
 * Created by renando on 06/01/16.
 */
public class Fenetre2 extends JFrame {

    public Automate o;
    public JLabel label = new JLabel("0");
    public JButton bstart = new JButton("Start");
    public JButton bstop = new JButton("Stop");
    public JButton bplus = new JButton("+1");

    public Fenetre2(){
        this.setTitle("Bouton");
        this.setSize(300, 120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(1, 4));


        this.getContentPane().add(label);
        this.getContentPane().add(bstart);
        this.getContentPane().add(bstop);
        this.getContentPane().add(bplus);


        bstart.addActionListener(actionEvent -> o.gestionClicBouton1());
        bstop.addActionListener(actionEvent -> o.gestionClicBouton2());
        bplus.addActionListener(actionEvent -> o.gestionClicBouton3());

        this.setVisible(true);
    }

}
