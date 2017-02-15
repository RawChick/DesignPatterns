package Command;

/**
 * Created by Renee on 2/13/2017.
 */
public class LightOnCommand implements Command{
    //Concrete command
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.switchOn();
    }

}
