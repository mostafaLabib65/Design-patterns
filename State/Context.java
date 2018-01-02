package State;

/**
 * Created by Mustafa on 1/2/2018.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return this.state;
    }
}
