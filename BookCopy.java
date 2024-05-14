public class BookCopy implements Borrowable{
    private int id;
    private boolean available;
    private Book book;

    //no available because if you put it in library its automatically available  
	BookCopy(int id, Book book){
        this.id = id;
        this.book = book;
        available=true;
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

	public void borrowItem(){
		available = false;
	}

	public void returnItem(){
		available = true;
	}

	public Book getBook() {
		return this.book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

    public String toString(){
        return book.toString() + ", available " + available + ", id " + id;
    }
}