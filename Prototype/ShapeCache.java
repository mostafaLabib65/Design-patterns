package Prototype;

import java.util.HashMap;

/**
 * Created by Mustafa on 12/6/2017.
 */
public class ShapeCache {
    private static HashMap< String, Shape> shapeMap = new HashMap< String, Shape>();

    public static Shape getShape(String shape) throws CloneNotSupportedException {
        Shape cachedShape = (Shape) shapeMap.get(shape).clone();
        return cachedShape;
    }

    public static void loadCache(){
        Ellipse ellipse = new Ellipse();
        Rectangle rec = new Rectangle();
        shapeMap.put("Ellipse", (Shape) ellipse);
        shapeMap.put("Rec", rec);

    }
}
