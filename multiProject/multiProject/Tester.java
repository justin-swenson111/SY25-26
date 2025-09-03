

public class Tester
{
    public static void main( String args[]){
        rectangle rect = new rectangle(1,1);
        System.out.println(rect.toString());
        square squ = new square(1);
        System.out.println(squ.toString());
        circle circ = new circle(1);
        System.out.println(circ.toString());
        triangle tri = new triangle(1,1);
        System.out.println(tri.toString());
        hexagon hex = new hexagon(1);
        System.out.println(hex.toString());
        pentagon pent = new pentagon(1);
        System.out.println(pent.toString());
    }
}
