package Observer;

/**
 * Created by rrsui on 2-2-2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}