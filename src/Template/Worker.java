package Template;

/**
 * Created by Renee on 2/13/2017.
 */
public abstract class Worker {

    public final void workDay(){
        goToWork();
        work();
        goHome();
        relax();
    }

    abstract void goToWork();
    abstract void work();
    abstract void goHome();
    abstract void relax();
}
