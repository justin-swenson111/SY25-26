
public class circle
{
    double radius;
    
    public circle(double _radius){
        radius=_radius;
    }
    public double area(){
        return (radius*radius*Math.PI);
    }
    public double circumference(){
        return (Math.PI*2*radius);
    }
    public String toString(){
        String retval = String.format("Circle\nRadius:%f\nArea:%f\nCircumference:%f",radius,area(),circumference());
        return retval;
    }
}
