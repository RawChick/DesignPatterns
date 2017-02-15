package Command;

/**
 * Created by Renee on 2/13/2017.
 */
public class LightOffCommand implements Command{
    //Concrete command
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.switchOff();
    }

}

