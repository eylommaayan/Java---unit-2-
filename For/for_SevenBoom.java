package For;
//  7 בום בלולאת  for 
// אין קלט - יש לעבור על כל המספרים מ1-99
// פלט: עבור כל אחד מהמספרים בטווח 1-99 שמתחלקים ב-7 או שמופיע בהם הספרה 7 יודפס


import java.util.*;
public class for_SevenBoom {
    public static void main(String[] args) {
        int tens, units;
        for (int i = 1; i <= 99; i++) {
            units = i % 10;
            tens = i / 10;
            if ((i % 7 == 0) || (tens == 7) || (units == 7)) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }
    }
     }

