public class CustomExecption {
    public static void main(String[] args) {
        
        try {
            validate(13); 
        }
        catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }

        System.out.println("Rest of the code");
    }

    static void validate(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age Invalid for Voting");
        }
        else {
            System.out.println("Congratulations you can vote");
        }
    }
}

class InvalidAgeException extends Exception{
    InvalidAgeException(String s) {
        super(s);
    }
}
