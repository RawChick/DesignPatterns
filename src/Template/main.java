package Template;

/**
 * Created by Renee on 2/13/2017.
 */
public class main {
    public static void main(String[] args){

        Worker worker = new Postman();
        worker.workDay();
        System.out.println();
        worker = new Manager();
        worker.workDay();
        System.out.println();
        worker = new FireFighter();
        worker.workDay();
        System.out.println();

    }
}
