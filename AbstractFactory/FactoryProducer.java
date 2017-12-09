package AbstractFactory;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory.equals("Burrger")){
            return new BurrgerFactory();
        }
        else if (factory.equals("bottle")){
            return  new BottleFactory();
        }
        return null;
    }
}
