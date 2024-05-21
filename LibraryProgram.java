import java.util.Scanner;

public class LibraryProgram{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        Library lib = new Library();
        System.out.println("Enter the name");
        String name = scan.nextLine();

        Member m = new Member(10, name);
        lib.addMember(m);

        Book b = new Book(200,"1984","Oweil");
        lib.addTitle(b);        
        lib.addTitle(b);

        Borrowable bor = new BookCopy(1000, b);
        try{
        m.borrows(bor);
        }
        catch(AvailabilityException e){
            System.out.println(e.getMessage());
            
        }
        catch(LimitExceededException e){
            e.printStockTrace();
        }
    }
}