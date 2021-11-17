package lesson25.HomeworkTask4;

public class NegativeMeaningException extends RuntimeException{
    private String message;

    public NegativeMeaningException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "NegativeMeaningException{" +
                "message='" + message + '\'' +
                '}';
    }
}
