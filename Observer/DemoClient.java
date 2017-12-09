package Observer;

/**
 * Created by Mustafa on 12/9/2017.
 */
public class DemoClient {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        System.out.println("First state change: 5");
        subject.setState(5);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }

}
