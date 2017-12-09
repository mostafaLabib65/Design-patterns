package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class cola implements bottels{
    @Override
    public String name() {
        return "cola";
    }

    @Override
    public String price() {
        return "5";
    }
}
