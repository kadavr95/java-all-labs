/**
 * Created by Yaskovich Dmitry on 27/12/2016.
 */

import java.lang.*;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6.0, 8.0, "orange");
        System.out.println("Length is " + r1.getlength()
                + "; Width is " + r1.getWidth()
                + "; Color is " + r1.getColor()
                + "; Area is " + r1.getArea());
        Rectangle r2 = new Rectangle(4.0, 3.0);
        System.out.println("Length is " + r2.getlength()
                + "; Width is " + r2.getWidth()
                + "; Color is " + r2.getColor()
                + "; Area is " + r2.getArea());
        Rectangle r3= new Rectangle();
        System.out.println("Length is " + r3.getlength()
                + "; Width is " + r3.getWidth()
                + "; Color is " + r3.getColor()
                + "; Area is " + r3.getArea());
    }
}
