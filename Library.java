import java.util.ArrayList;
import java.util.List;

public class Library{
    private List<Member> members;
    private List<Title> titles;
    private List<Borrowable> borrowables;

    public Library(){
        members = new ArrayList<Member>();
        titles = new ArrayList<Title>();
    }

    public void addTitle(Title title){
        titles.add(title);
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

    public void printMembers(){
        for(Member member : members)
            System.out.println(member);
    }

    public void printTitles(){
        for(Title title : titles)
            System.out.println(title);
    }

    public void printBorrowables(){
        for(Borrowable borrowable : borrowables)
            System.out.println(borrowables);
    }
//not wrong but masoc
    public Book findBookById(int id){
        for(int i=0; i<titles.size(); i++){
            Title t = titles.get(i);
            if(t != null && t instanceof Book && t.getId() == id){
                return t;
            }
        }
    }
//better
    public Member findMemberById(int id){
        for(Member m:members){
            if(m.getId() == id){
                return m; 
            }
        }
        return null;
    }
}