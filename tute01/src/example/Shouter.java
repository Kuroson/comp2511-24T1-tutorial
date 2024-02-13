package example;

/**
 * Write a program that stores a message and has methods for getting the message,
 * updating the message and printing it out in all caps. Write a `main()` method
 * for testing this class.
 *
 * Create a:
 * - Getter
 * - Setter
 * - Constructor
 * - printMe
 * - shout
 * - toString
 */
public class Shouter {
    private String message;

    // Constructor
    public Shouter(String message) {
        this.message = message;
    }

    public void shout() {
        System.out.println(this.message.toUpperCase());
    }

    public void setMessage(String newMessage) {
        this.message = newMessage;
    }

    public static void main(String[] args) {
        Shouter s = new Shouter("Initial Message");
        s.shout();
        s.setMessage("Hello COMP2511");
        s.shout();
    }
}
