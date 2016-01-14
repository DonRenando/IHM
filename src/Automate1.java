import java.awt.*;

/**
 * Created by renando on 04/01/16.
 */
public class Automate1 extends Automate {
    private Fenetre f;
    private int etat;

    public Automate1 (Fenetre f){
        this.f = f;
        f.o = this;
        init();
    }

    public void init(){
        etat = 1;
        f.b2.setFont(f.b2.getFont().deriveFont(Font.PLAIN));
        f.b3.setFont(f.b3.getFont().deriveFont(Font.PLAIN));
        f.b4.setFont(f.b4.getFont().deriveFont(Font.PLAIN));

        f.b2.setEnabled(false);
        f.b3.setEnabled(false);
        f.b4.setEnabled(false);
    }
    public void gestionClicBouton1(){
        switch (etat){
            case 1 :
                f.b1.setFont(f.b1.getFont().deriveFont(Font.PLAIN));
                f.b1.setEnabled(false);
                f.b2.setFont(f.b2.getFont().deriveFont(Font.BOLD));
                f.b2.setEnabled(true);
                etat = 2;
                break;
        }
    }

    public void gestionClicBouton2(){
        switch (etat){
            case 2 :
                f.b2.setFont(f.b2.getFont().deriveFont(Font.PLAIN));
                f.b2.setEnabled(false);
                f.b3.setFont(f.b3.getFont().deriveFont(Font.BOLD));
                f.b3.setEnabled(true);

                etat = 3;
                break;
        }
    }

    public void gestionClicBouton3(){
        switch (etat){
            case 3 :
                f.b3.setFont(f.b3.getFont().deriveFont(Font.PLAIN));
                f.b3.setEnabled(false);
                f.b4.setFont(f.b4.getFont().deriveFont(Font.BOLD));
                f.b4.setEnabled(true);

                etat = 4;
                break;
        }
    }

    public void gestionClicBouton4(){
        switch (etat){
            case 4 :
                f.b4.setFont(f.b4.getFont().deriveFont(Font.PLAIN));
                f.b4.setEnabled(false);
                f.b1.setFont(f.b1.getFont().deriveFont(Font.BOLD));
                f.b1.setEnabled(true);

                etat = 1;
                break;
        }
    }

    public static void main(String[] args) {
        Fenetre f = new Fenetre();
        Automate o = new Automate1(f);
    }
}

