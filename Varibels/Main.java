package Varibels;
public class Main {

    public static void main(String[] args) {
        // תופס 32 ביטים ורוחב של 32
        int myMaxIntTest = 2_147_483_647;
        //byte- אנחנו אומרים שלבייט יש רוחב של 8 ביטים  bit הכי קטן הוא תופס 8 ביטים
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        // short- תופס 16 ביטים ורוחב של 16
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        // long- תופס 64 ביטים ורחוב של 64
        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;//Long בשביל להכריח את ג'אווה להתייחס למספר כ  L- צריך להוסיף
        System.out.println(bigLongLiteralValue);
        short bigShortLiteralValue = 32767;

        // Print out the value of bigShortLiteralValue
        System.out.println("Big Short Literal Value = " + bigShortLiteralValue);
    }
}
