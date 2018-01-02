package Bridge;

/**
 * Created by Mustafa on 1/2/2018.
 */
public class BlueCircle implements DrawAPI{
    @Override
    public void DrawCricle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
