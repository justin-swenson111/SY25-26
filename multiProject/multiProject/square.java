

public class square
{
    int side;
    
    public square(int _side){
        side = _side;

        
    }
    public int area(){
        return side*side;
    }
    
    public int perimeter(){
        return 4*(side);
    }
    
    public String toString(){
        String retVal = String.format("Square\nSide:%d\nArea:%d\nPerimeter:%d",side,area(),perimeter());
        return retVal;
    }
}
