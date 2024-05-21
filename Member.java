import java.util.ArrayList;
import java.util.List;

public class Member{
	private int id;
	private String name;
	public static final int MAX_ON_LOAN = 6;
	private List <Borrowable> onLoan;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMAX_ON_LOAN() {
		return MAX_ON_LOAN;
	}

	public Member(int id, String name){
		this.id = id; 
		this.name = name;
		onLoan = new ArrayList<Borrowable>();
	}

	public void borrows(Borrowable b) throws LimitExceededException{
		if(onLoan.size() == MAX_ON_LOAN) throw new LimitExceededException("The member cannot borrow more");
		onLoan.add(b);
		b.borrowItem();
	}

	public void returns(Borrowable b){
		onLoan.remove(b);
		b.returnItem();
	}
}