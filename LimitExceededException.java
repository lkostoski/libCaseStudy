public class LimitExceededException extends Exception{
    public LimitExceededException(){
        super();
    }
    public LimitExceededException(String msg){
        super(msg);
    }
}