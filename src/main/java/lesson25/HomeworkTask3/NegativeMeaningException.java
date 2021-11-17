package lesson25.HomeworkTask3;

public class NegativeMeaningException extends Exception{
    private String message;

    public NegativeMeaningException(String message1) {
        this.message = message1;
    }

    @Override
    public String toString() {
        return "NegativeMeaningException{" +
                "message='" + message + '\'' +
                '}';
    }
}
