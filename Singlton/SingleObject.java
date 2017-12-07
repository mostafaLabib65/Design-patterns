package Singlton;

/**
 * Created by Mustafa on 12/5/2017.
 */
public class SingleObject {
    private static SingleObject instanse = new SingleObject();
    private SingleObject(){

    }
    public SingleObject getSingleObject(){
        return instanse;
    }

}
