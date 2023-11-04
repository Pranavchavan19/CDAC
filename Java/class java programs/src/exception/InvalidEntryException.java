package exception;

public class InvalidEntryException extends RuntimeException {

  
//    public InvalidEntryException(String message) {
//        super(message);
//    }

    public InvalidEntryException(String msg) {
       super(msg);
   }

}
