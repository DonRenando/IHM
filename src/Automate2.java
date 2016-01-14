import java.awt.*;

/**
 * Created by renando on 04/01/16.
 */
public class Automate2 extends  Automate{
    private Fenetre f;
    private int etat;

    public Automate2 (Fenetre f){
        this.f = f;
        f.o = this;
        init();
    }

    public void init(){
        etat = 1;
        f.b3.setEnabled(false);
        f.b4.setEnabled(false);
    }
    public void gestionClicBouton1(){
        switch (etat){
            case 1 :
                etat = 2;
                break;

            case 3 :
                f.b1.setEnabled(false);
                f.b2.setEnabled(false);

                f.b3.setEnabled(true);
                f.b4.setEnabled(true);
                etat = 4;
                break;
        }
    }

    public void gestionClicBouton2(){
        switch (etat){
            case 1 :
                etat = 3;
                break;
            case 2 :
                f.b1.setEnabled(false);
                f.b2.setEnabled(false);

                f.b3.setEnabled(true);
                f.b4.setEnabled(true);

                etat = 4;
                break;
        }
    }

    public void gestionClicBouton3(){
        switch (etat){
            case 4 :
                etat = 6;
                break;

            case 5:
                f.b1.setEnabled(true);
                f.b2.setEnabled(true);
                f.b3.setEnabled(false);
                f.b4.setEnabled(false);
                etat = 1;
                break;
        }
    }

    public void gestionClicBouton4(){
        switch (etat){
            case 4 :
                etat = 5;
                break;
            case 6 :
                f.b1.setEnabled(true);
                f.b2.setEnabled(true);
                f.b3.setEnabled(false);
                f.b4.setEnabled(false);
                etat = 1;
                break;
        }
    }

    public static void main(String[] args) {
        Fenetre f = new Fenetre();
        Automate2 o2 = new Automate2(f);
    }
}

