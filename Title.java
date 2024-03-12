public class Title{
    private int id;
    private String title;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	Title(int id, String title){
		this.id = id;
		this.title = title;
	}
	
	public String toString(){
		return "id = " + id + ", title = " + title;
	}
}

