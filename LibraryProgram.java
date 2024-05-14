public class LibraryProgram{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        Library lib = new Library();
        System.out.println("Enter the name");
        String name = scan.nextLine();
        lib.addMember(new Member(10, name));
    }
}