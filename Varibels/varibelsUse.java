package Varibels;
public class varibelsUse {
    static final int MIN = 1; // defining the MIN constant with the value 1

    public static void main(String[] args) {
        int x = 10;
        double d = 5.12;
        boolean b = true;

        // Attempting to modify the value of the MIN constant
        MIN = 2; // This will cause a compilation error

        System.out.println("Value of MIN: " + MIN);

        System.out.println("Value of x: " + x);
        System.out.println("Value of d: " + d);
        System.out.println("Value of b: " + b);
    }
}