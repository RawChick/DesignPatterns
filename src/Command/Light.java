package Command;

/**
 * Created by Renee on 2/13/2017.
 */
public class Light {
    private boolean on;

    public void switchOn(){
        on = true;
        System.out.println("Lights on!");
    }

    public void switchOff(){
        on = false;
        System.out.println("Lights off!");
    }
}
