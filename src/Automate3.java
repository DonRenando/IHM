/**
 * Created by renando on 06/01/16.
 */
public class Automate3 extends Automate {

    private Fenetre2 f;
    private int etat;
    private int cpt;

    public Automate3 (Fenetre2 f){
        this.f = f;
        f.o = this;
        init();
    }

    public void init(){
        cpt = 0;
        etat = 1;

        f.bstart.setEnabled(true);
        f.bstop.setEnabled(false);
        f.bplus.setEnabled(false);
    }

    @Override
    public void gestionClicBouton1() {
        cpt=0;
        f.label.setText(cpt+"");
        f.bstart.setEnabled(false);
        f.bstop.setEnabled(true);
        f.bplus.setEnabled(true);

    }

    @Override
    public void gestionClicBouton2() {
        f.bstart.setEnabled(true);
        f.bstop.setEnabled(false);
        f.bplus.setEnabled(false);

    }

    @Override
    public void gestionClicBouton3() {
        cpt++;
        if(cpt == 3){
            f.bstart.setEnabled(true);
            f.bstop.setEnabled(false);
            f.bplus.setEnabled(false);
        }
            f.label.setText(cpt + "");

    }

    @Override
    public void gestionClicBouton4() {

    }

    public static void main(String[] args) {
        Fenetre2 f = new Fenetre2();
        Automate3 o3 = new Automate3(f);
    }
}
