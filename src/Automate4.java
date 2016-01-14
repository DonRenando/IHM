import javax.swing.*;


/**
 * Created by renando on 06/01/16.
 */
public class Automate4 extends Automate {

    private Fenetre3 f;
    private int compteur = 0;
    private Timer t;
    private int etat;

    public Automate4 (Fenetre3 f){
        this.f = f;
        f.o = this;
        etat = 0;
        init();
    }

    @Override
    public void init() {

        etat = 1;
        f.avant.setEnabled(false);
        f.apres.setEnabled(false);

                t = new Timer(1000, actionEvent -> {
                    switch (etat){
                        case 0:
                            break;

                        case 1 :
                            compteur++;
                            if( compteur == 3 ){
                                f.label.setText("plouf!");
                                t.stop();
                                f.bstart.setEnabled(true);
                                f.bstop.setEnabled(false);
                            }
                            else{
                                f.label.setText(compteur+"");
                            }
                            break;

                        case 2 :
                            compteur --;
                            if(compteur == 0  ){
                                f.label.setText("plouf!");
                                t.stop();
                                f.bstart.setEnabled(true);
                                f.bstop.setEnabled(false);
                            }
                            else{
                                f.label.setText(compteur+"");
                            }
                            break;
                    }


                });


    }

    @Override
    public void gestionClicBouton1() {
        switch (etat){
            case 0 :
                break;
            case 1 :
                f.bstart.setEnabled(false);
                f.bstop.setEnabled(true);
                f.avant.setEnabled(true);
                f.apres.setEnabled(false);
                compteur = 0;
                break;

            case 2 :

                f.bstart.setEnabled(false);
                f.bstop.setEnabled(true);
                f.avant.setEnabled(false);
                f.apres.setEnabled(true);
                compteur = 3;
                break;

        }
        t.start();
    }

    @Override
    public void gestionClicBouton2() {
        t.stop();
        f.bstart.setEnabled(true);
        f.bstop.setEnabled(false);

    }

    @Override
    public void gestionClicBouton3() {

        switch (etat){
            case 1 :
                compteur = 3;
                f.apres.setEnabled(true);
                f.avant.setEnabled(false);
                etat = 2;
                break;
        }


    }

    @Override
    public void gestionClicBouton4() {

        switch(etat){
            case 2 :
                f.apres.setEnabled(false);
                f.avant.setEnabled(true);
                etat = 1;
                break;
        }

    }

    public static void main(String[] args) {
        Fenetre3 f = new Fenetre3();
        Automate4 o3 = new Automate4(f);
    }
}
