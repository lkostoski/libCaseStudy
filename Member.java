public class Member{
    private int id;
    private String name;
    final private int MAX_ON_LOAN;

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


    Member(int id, String name){
        this.id = id;
        this.name = name;
        MAX_ON_LOAN=6; //all caps means its constant
    }
}