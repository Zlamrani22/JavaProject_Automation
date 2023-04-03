package session_2ndOctober2022;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int i = 1;
        int j = -2;

        /*
         * int range on java is -2147483648 to +2147483647
         * */
        int k = 2147483647;
        int l = -2147483648;

        int m = 10; // Here the value of m is 10
        m = 11;     // Here it was changed to 11
        m = 12;
        System.out.println(m);
        System.out.println(12);

        /*
        * Long range is -2147483648 to +2147483647
        * */
        long lng = -2147483648;
        long lng2 = 2147483647;

        /*
         * short range is -32768 to +32767
         * */
        short sht = -32768;
        short sht1 = 32767;

        /*
        * a data type will not be accommodating another data type
        * */
        char c = 'a';
        char c1 = ' ';
        char c2 = '#';
        char c3 = '1';

        /*
        * boolean returns true or false
        *
        * */
        boolean b1 = 1<2;   // This statement is true
        System.out.println(b1);
        boolean b2 = 191.123<190.123;
        System.out.println(b2);

        boolean b3 = true;
        boolean b4 = false;
        boolean b5 = (b3 != b4); // True statement
        boolean b6 = (b3 == b4); // false statement
        System.out.println(b5);
        System.out.println(b6);

        /*
        * double stores decimals
        * */
        double d = 1.1;
        System.out.println(d);

    }
}