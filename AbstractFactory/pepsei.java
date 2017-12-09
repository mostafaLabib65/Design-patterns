package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class pepsei implements bottels{
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public String price() {
        return "10";
    }
}
