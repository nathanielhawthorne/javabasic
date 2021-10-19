package wrapper;

public class Program1 {
    public static void main(String[]args){
        String str1 = System.getProperty("java.version");
        String str2 = System.clearProperty("os.name");
        String str3 = System.clearProperty("user.name");
        String str4 = System.clearProperty("os.version");
        String str5 = System.clearProperty("java.home");
        String str6 = System.clearProperty("user.home");
        String str7 = System.clearProperty("user.dir");
        System.out.print(str1+"\t"+str2+"\t"+str3+"\t"+str4+"\t"+str5+"\t"+str6+"\t"+str7);

        Character character = new Character('q');
        System.out.println(character.toString());
        Boolean bool = Character.isDigit(character);
        Boolean bool1 = Character.isLetter(character);
        Boolean BOOL2 = Character.isLetterOrDigit(character);
        Boolean BOOL3 = Character.isAlphabetic(character);
        Boolean BOOL4 = Character.isBmpCodePoint(character);
        Boolean BOOL5 = Character.isDefined(character);
        Boolean BOOL6 = Character.isLowerCase(character);
        Boolean BOOL7 = Character.isUpperCase(character);
        System.out.println(bool);

        Number number = new Double("7.56");
        System.out.println(number.intValue());
        System.out.println(number.longValue());
        System.out.println(number.byteValue());
        System.out.println(number.floatValue());

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_NORMAL);
        System.out.println(Double.NaN);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.POSITIVE_INFINITY);

        int n = 532435;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toOctalString(n));
    }
}
