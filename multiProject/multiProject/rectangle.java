

public class rectangle
{
    int length;
    int width;
    
    public rectangle(int _length, int _width){
        this.length = _length;
        this.width = _width;
        
    }
    public int area(){
        return length*width;
    }
    
    public int perimeter(){
        return 2*(length+width);
    }
    
    public String toString(){
        String retVal = String.format("Rectangle\nLength:%d\nWidth:%d\nArea:%d\nPerimeter:%d",length,width,area(),perimeter());
        return retVal;
    }
}
