package Builder;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class pepsi extends bottle{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
