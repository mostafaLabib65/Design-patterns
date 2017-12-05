package Builder;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class Builder {

    public Meal prepareVeg(){
        Meal meal = new Meal();
        meal.addItem(new cola());
        meal.addItem(new vegBurrger());
        return meal;
    }

    public Meal prepareChecken(){
        Meal meal = new Meal();
        meal.addItem(new pepsi());
        meal.addItem(new checkenBurrger());
        return meal;
    }
}
