
public class book
{
    String name;
    String author;
    int pubYear;
    boolean available = true;
    public book(String n, String a, int y){
        name = n;
        author = a;
        pubYear = y;
    }
    
    public String getAuthor(){ return author;}
    public void checkout(){available = false;}
    public void returnBook(){available=true;}
    
    public String toString(){
        String retval = String.format("Title: %s \nAuthor: %s \nPublication Year: %d \nAvailable: %b",name,author,pubYear,available);
        return retval;
    }
}
