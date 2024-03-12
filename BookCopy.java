public class BookCopy extends Book{
    private int id;
    private boolean available;

    BookCopy(int id, String title, String author, boolean available){
        super(id, title, author);
        this.available = available;
    }
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}