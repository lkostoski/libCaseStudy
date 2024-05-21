public interface Borrowable{
    public void borrowItem() throws LimitExceededException;
    public void returnItem();
    public boolean isAvailable();
    public int getId();
}