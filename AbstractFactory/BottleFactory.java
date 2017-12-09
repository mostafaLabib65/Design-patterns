package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class BottleFactory extends AbstractFactory{
    @Override
    Burrger getBurrger(String burrger) {
        return null;
    }

    @Override
    bottels getBottel(String bottle) {
        if(bottle.equals("cola")){
            return  new cola();
        }
        else if(bottle.equals("pepsi")){
            return new pepsei();
        }
        return null;
    }
}
