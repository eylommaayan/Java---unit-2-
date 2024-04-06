// תוכנית שבודקת אם אפשר לקנות לפי כמות

public class IfElse_CanBayOrNot {
    
    public static void main(String[] args) {
    double wallet = 50;
    double toy = 23.67;

    System.out.println("Can I get this car?");
    if (wallet  >= toy) {
        System.out.println("Sure!\n");
        wallet -= toy;   
    } else {
        System.out.println("Sorry, I only have " + wallet + " left"); 
    }
}


