package Builder;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class vegBurrger extends  Burrger{
    @Override
    public String name() {
        return "vegBurrger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
