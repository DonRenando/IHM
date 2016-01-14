/**
 * Created by renando on 13/01/16.
 */
public class Automate5 {

    private final Fenetre5 f;

    public Automate5 (Fenetre5 f){
        this.f = f;
        f.o = this;
    }

    public static void main(String[] args) {
        Fenetre5 f = new Fenetre5();
        Automate5 o = new Automate5(f);
    }

}
