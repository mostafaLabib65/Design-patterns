package Bridge;

/**
 * Created by Mustafa on 1/2/2018.
 */
public class RedCircle implements DrawAPI{
    @Override
    public void DrawCricle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
