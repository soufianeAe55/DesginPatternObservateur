package observes;

import observables.Observable;
import observables.ObservableImpl;

public class ObserveImpl2 implements Observe {
    private int lastState;

    @Override
    public void update(Observable obs) {

        int e= ((ObservableImpl)obs).getEtat();
        if(e-lastState > 0) System.out.println(" abs 2 => augmentation de la pression");
        else if(e-lastState < 0) System.out.println(" abs 2 => depression");
        else System.out.println("stable");

        lastState=e;

    }
}
