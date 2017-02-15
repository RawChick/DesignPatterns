package Command;

/**
 * Created by Renee on 2/13/2017.
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}
