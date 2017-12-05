package Builder;

import java.util.ArrayList;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class Meal {
    ArrayList<iteam> componnents = new ArrayList<iteam>();
    public void addItem(iteam item){
        this.componnents.add(item);
    }
    public float showCost(){
        float cost = 0.0f;
        for(iteam i : componnents){
            cost += i.price();

        }
        return cost;
    }
}
