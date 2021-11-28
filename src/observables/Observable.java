package observables;
import observes.Observe;
public interface Observable {
    void subscribe(Observe o);
    void unsubscribe(Observe o);
    void notifyObserve();


}
