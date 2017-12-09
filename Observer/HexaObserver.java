package Observer;

/**
 * Created by Mustafa on 12/9/2017.
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Hexa String:" + Integer.toHexString(subject.getState()));
    }
}
