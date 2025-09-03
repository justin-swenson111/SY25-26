

public class triangle
{
     double base;
     double height;
    public triangle(double _base, double _height)
    {
        base = _base;
        height = _height;
    }
    public double area(){
        return 0.5*height*base;
    }
    public double perimeter(){
        return base + 2*Math.pow(Math.pow(0.5*base,2)+Math.pow(height,2),0.5);
    }
    public String toString(){
        String retval = String.format("Triangle\nbase:%f\nHieght:%f\nArea:%f\nPerimeter:%f",base,height,area(),perimeter());
        return retval;
    }
    
    

}
