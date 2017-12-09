package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class checkBurrger implements Burrger{
    @Override
    public String name() {
        return "CheckBurrger";
    }

    @Override
    public String price() {
        return "20";
    }
}
