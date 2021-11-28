package observables;

import observes.Observe;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private int etat;
    private List<Observe> observes=new ArrayList<>();

    @Override
    public void subscribe(Observe o) {
        observes.add(o);
    }

    @Override
    public void unsubscribe(Observe o) {
        observes.remove(o);
    }

    @Override
    public void notifyObserve() {
        for(Observe o:observes){
            o.update(this);
        }
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        notifyObserve();
    }
}
