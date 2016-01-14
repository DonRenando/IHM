import javax.swing.*;
import java.awt.*;

/**
 * Created by renando on 06/01/16.
 */
public class Fenetre4 extends JFrame {

    public JLabel vert;
    public JLabel orange;
    public JLabel rouge;

    public JButton bstart = new JButton("Start");
    public JButton bstop = new JButton("Stop");
    public JButton bPanne = new JButton("Panne");

    public AutomateBis o;


    public Fenetre4 () {
        JPanel panel = new JPanel();
        GridLayout layout = new GridLayout(0,3);
        panel.setLayout(layout);
        panel.add(bstart);
        panel.add(bstop);
        panel.add(bPanne);



        this.setTitle( "feu tricolore" );
        this.setSize( 250, 700 );
        this.setLocationRelativeTo( null );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Font f = new Font("Serif", Font.BOLD, 70);


        vert = new JLabel("O");
        orange = new JLabel("O");
        rouge = new JLabel("O");

        vert.setFont(f);
        orange.setFont(f);
        rouge.setFont(f);

        vert.setHorizontalAlignment(JLabel.CENTER);
        orange.setHorizontalAlignment(JLabel.CENTER);
        rouge.setHorizontalAlignment(JLabel.CENTER);

        this.setLayout(new GridLayout(4, 0));

        this.getContentPane().add(rouge);
        this.getContentPane().add(orange);
        this.getContentPane().add(vert);


        this.getContentPane().add(panel);
        this.setVisible( true );


        bstart.addActionListener(actionEvent -> o.gestionStart());
        bstop.addActionListener(actionEvent -> o.gestionStop());
        bPanne.addActionListener(actionEvent -> o.gestionPanne());
    }



}
