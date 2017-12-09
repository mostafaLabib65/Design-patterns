package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class BurrgerFactory extends AbstractFactory{
    @Override
    Burrger getBurrger(String burrger) {
        if(burrger.equals("vegBurrger")){
            return new vegBurrger();
        }
        else if(burrger.equals("checkBurrger")){
            return  new checkBurrger();
        }
        return  null;
    }

    @Override
    bottels getBottel(String bottle) {
        return null;
    }
}
