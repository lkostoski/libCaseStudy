public class Book extends Title{
	private String author;

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

    Book(int id, String title, String author){
		super(id, title);
        this.author = author;
	}
    
    public String toString(){
		return super.toString() + ", author = " + author;
	}
}