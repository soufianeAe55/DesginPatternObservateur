package observes;

import observables.Observable;
import observables.ObservableImpl;

public class ObserveImpl1 implements Observe {
    private double somme;

    @Override
    public void update(Observable obs) {
        int e= ((ObservableImpl)obs).getEtat();
        somme+=e;
        System.out.println("observable 1 somme"+somme);
    }
}
