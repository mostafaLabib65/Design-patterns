package Observer;

/**
 * Created by Mustafa on 12/9/2017.
 */
public class BinaryObserver extends  Observer {
    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Binary String" + Integer.toBinaryString(subject.getState()));
    }
}
