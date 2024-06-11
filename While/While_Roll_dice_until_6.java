package While;
//בשביל התלת כוביה עד המספר 6 רנדומלי while   תוכנית שמתשמת בולאות 

public class While_Roll_dice_until_6 {

    public static void main(String[] args) {
        int diceRoll = -1;
        while (diceRoll !=6) {
           diceRoll = rollDice();
           System.out.println(diceRoll);
        }
    }
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }
}