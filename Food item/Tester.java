
public class Tester
{
    public static void main(String args[]){
        book hitchHike = new book("The HitchHiker's Guide to the Galaxy","Douglas Adams",1979);
        book b1984 = new book("1984","George Orwell", 1949);
        hitchHike.checkout();
        System.out.println(hitchHike.toString());
        hitchHike.returnBook();
        System.out.println(hitchHike.toString());
        System.out.println(b1984.toString());
    }
}
