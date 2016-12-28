/**
 * Created by Yaskovich Dmitry on 27/12/2016.
 */
import java.lang.*;

public class Rectangle {
    private double length;
    private double width;
    private String color;
    public Rectangle(){
        length = 2.0;
        width = 2.0;
        color = "black";
    }
    public Rectangle(double l, double w){
        length = l;
        width = w;
        color = "black";
    }
    public Rectangle(double l, double w, String c){
        length = l;
        width = w;
        color = c;
    }
    public double getlength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return length*width;
    }
}
