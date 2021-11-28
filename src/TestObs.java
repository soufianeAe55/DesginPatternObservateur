import observables.Observable;
import observables.ObservableImpl;
import observes.Observe;
import observes.ObserveImpl1;
import observes.ObserveImpl2;

import java.awt.*;



public class TestObs {
    public static void main(String[] args) {


        ObservableImpl observable= new ObservableImpl();
        Observe obs1= new ObserveImpl1();
        Observe obs2= new ObserveImpl2();

        observable.subscribe(obs1);
        observable.subscribe(obs2);

        observable.setEtat(90);
        System.out.println("---------------------");
        observable.setEtat(60);

        observable.subscribe(new Observe() {
            @Override
            public void update(Observable obs) {
                int e= ((ObservableImpl)obs).getEtat();
                System.out.println("obs anony"+ e);
            }
        });
        observable.setEtat(80);


    }
}
