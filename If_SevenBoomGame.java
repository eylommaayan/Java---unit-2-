import java.util.*;
/**
 * SevenBoomGame
 */
public class If_SevenBoomGame {

    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args)
    {
       int num;
       System.out.println("Enter number");
       num = reader.nextInt();
       if (num%7==0)
         System.out.println("Boom");;
    }
}