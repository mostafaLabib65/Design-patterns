package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class vegBurrger implements Burrger{
    @Override
    public String name() {
        return "vegBurrger";
    }

    @Override
    public String price() {
        return "15";
    }
}
