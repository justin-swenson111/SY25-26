
public class hexagon
{
    double side;

    public hexagon(double _side)
    {
        side = _side;
    }

    public double area(){
        return (3*Math.pow(3,0.5)*side*side)/2;
    }
    
    public double perimeter(){
        return side*6;
    }
        public String toString(){
        String retval = String.format("Hexagon\nside:%f\nArea:%f\nPerimeter:%f",side,area(),perimeter());
        return retval;
    }
}
