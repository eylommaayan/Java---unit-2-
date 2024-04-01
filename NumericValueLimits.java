public class NumericValueLimits {
    public static void main(String[] args) {
        // Maximum and minimum values for byte
        byte minValueByte = Byte.MIN_VALUE;
        byte maxValueByte = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + minValueByte);
        System.out.println("Byte Maximum Value = " + maxValueByte);

        // Maximum and minimum values for short
        short minValueShort = Short.MIN_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + minValueShort);
        System.out.println("Short Maximum Value = " + maxValueShort);

        // Maximum and minimum values for long
        long minValueLong = Long.MIN_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + minValueLong);
        System.out.println("Long Maximum Value = " + maxValueLong);

        // Example of a long literal value
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // Example of a short literal value
        short bigShortLiteralValue = 32767;
        System.out.println("Big Short Literal Value = " + bigShortLiteralValue);
    }
}
