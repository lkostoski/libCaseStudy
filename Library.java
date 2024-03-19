import java.util.ArrayList;
import java.util.List;

public class Library{
    List<Member> members;
    List<Title> titles;
    
    Library(){
        members = new ArrayList<Member>();
        titles = new ArrayList<Title>();
    }

    public void addBook(Book book){
        titles.add(book);
    }

    public void addJournal(Journal journal){
        titles.add(journal);
    }
    public void addMember(Member member){
        members.add(member);
    }

    public void removeMember(Member member){
        members.remove(member);
    }
}