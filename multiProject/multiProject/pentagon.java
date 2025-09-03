

public class pentagon
{
    double side;

    public pentagon(double _side)
    {
        side = _side;
    }

    public double area(){
        return 0.25* Math.pow(5*(5+2*Math.pow(5,0.5)),0.5)*side*side;
    }
    
    public double perimeter(){
        return side*5;
    }
        public String toString(){
        String retval = String.format("Pentagon\nside:%f\nArea:%f\nPerimeter:%f",side,area(),perimeter());
        return retval;
    }
}
