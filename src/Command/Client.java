package Command;

/**
 * Created by Renee on 2/13/2017.
 */
public class Client {
    public static void main(String[] args){
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        //switch on
        control.setCommand(lightOn);
        control.pressButton();

        //switch off
        control.setCommand(lightOff);
        control.pressButton();
    }
}
