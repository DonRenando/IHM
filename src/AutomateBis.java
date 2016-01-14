import javax.swing.*;
import java.awt.*;

/**
 * Created by renando on 06/01/16.
 */
public class AutomateBis {
    private Fenetre4 f;
    private int etat;
    private int cpt;
    private Timer timerRouge;
    private Timer timerOrange;
    private Timer timerVert;
    private Timer timerPanne;

    public AutomateBis (Fenetre4 f){
        this.f = f;
        f.o = this;
        init();
    }

   public void initTimer(){
        initVert();
        initOrange();
        initRouge();
       initPanne();

    }

    public void init(){
        cpt = 0;
        etat = 1;
        initTimer();

    }
    
private void initPanne(){
    timerPanne = new Timer(500, actionEvent -> {
        switch (etat){
            case 4 :
                f.orange.setForeground(Color.orange);
                etat = 5;
                break;
            case 5 :
                f.orange.setForeground(Color.black);
                etat = 4;
                break;
        }

    });

}

    private void initRouge() {
        timerRouge = new Timer(1000, actionEvent -> {
            switch (etat){
                case 3 :
                    timerRouge.stop();
                    f.rouge.setForeground(Color.black);
                    f.vert.setForeground(Color.green);
                    timerVert.start();
                    etat = 1;
                    break;
            }

        });
    }

    private void initOrange() {
        timerOrange = new Timer(2000, actionEvent -> {
            switch (etat){
                case 2 :
                    timerOrange.stop();
                    f.orange.setForeground(Color.black);
                    f.rouge.setForeground(Color.red);
                    timerRouge.start();
                    etat = 3;
                    break;
            }
        });
    } 

    private void initVert() {
        timerVert = new Timer(1000, actionEvent -> {
            switch (etat){
                case 1 :
                    timerVert.stop();
                    f.vert.setForeground(Color.black);
                    f.orange.setForeground(Color.orange);
                    timerOrange.start();
                    etat = 2 ;
                    break;

            }
        });
    }

    public static void main(String[] args) {
        Fenetre4 f = new Fenetre4();
        AutomateBis o = new AutomateBis(f);
    }

    public void gestionStart() {
        switch (etat){
            case 1 :
                f.bstart.setEnabled(false);
                f.bstop.setEnabled(true);
                f.vert.setForeground(Color.green);
                timerVert.start();
                break;


        }
    }

    public void gestionStop() {
        switch (etat){
            case 1 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                f.bstart.setEnabled(true);
                f.bPanne.setEnabled(true);
                f.bstop.setEnabled(false);

                etat = 1;
                break;
            case 2 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                f.bstart.setEnabled(true);
                f.bPanne.setEnabled(true);
                f.bstop.setEnabled(false);

                etat = 1;
                break;
            case 3 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                f.bstart.setEnabled(true);
                f.bPanne.setEnabled(true);
                f.bstop.setEnabled(false);

                etat = 1;
                break;
            case 4 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                f.bstart.setEnabled(true);
                f.bPanne.setEnabled(true);
                f.bstop.setEnabled(false);

                etat = 1;
            case 5:
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                f.bstart.setEnabled(true);
                f.bPanne.setEnabled(true);
                f.bstop.setEnabled(false);

                etat = 1;
                break;
        }
    }

    public void gestionPanne() {

        switch (etat){
            case 1 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                timerPanne.start();
                f.bPanne.setEnabled(false);
                f.bstart.setEnabled(true);
                f.bstop.setEnabled(true);

                etat = 4;
                break;
            case 2 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();

                timerPanne.start();
                f.bstart.setEnabled(true);
                f.bPanne.setEnabled(false);
                f.bstop.setEnabled(true);

                etat = 4;
                break;
            case 3 :
                f.vert.setForeground(Color.black);
                f.orange.setForeground(Color.black);
                f.rouge.setForeground(Color.black);

                timerVert.stop();
                timerOrange.stop();
                timerRouge.stop();
                timerPanne.start();

                f.bstart.setEnabled(true);
                f.bstop.setEnabled(false);
                f.bPanne.setEnabled(true);

                etat = 4;
                break;

        }

    }
}

