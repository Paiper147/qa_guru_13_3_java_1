package guru.qa;

import org.w3c.dom.ls.LSOutput;

public class Base {

    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;

        //byte - целое число от -128 до 127
        byte a = -128;
        byte b = 127;
        byte aa = Byte.MIN_VALUE;
        byte bb = Byte.MAX_VALUE;

        //short - целое число от -32768 до 32767
        short cc = Short.MIN_VALUE;
        short dd = Short.MAX_VALUE;

        //int - целое число от -2147483648 до 2147483647
        int ee = Integer.MIN_VALUE;
        int ff = Integer.MAX_VALUE;

        //long - целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807
        long gg = Long.MIN_VALUE;
        long hh = Long.MAX_VALUE;

        //float - число с плавающей точкой от -3.4E+38 до 3.4E+38
        float ii = Float.MIN_VALUE;
        float jj = Float.MAX_VALUE;

        //double - число с плавающей точкой от -1.7E+308 до 1.7E+308
        double kk = Double.MIN_VALUE;
        double ll = Double.MAX_VALUE;

        //char - одиночный символ
        char mm = 'q';

        //string - строки, НЕ примитивный тип данных
        String name = "Kate";

        int summ = 5 + 2;
        int difference = 5 - 2;
        int mult = 5 * 2;
        int division = 5 / 2;
        int remainder = 5 % 2;

        //разные типы данных и их приведение
        System.out.println("Typecast:=================");
        //double и int
        double multIntWithDoubleToDouble = 5 * 0.2;
        System.out.println("double => 5 * 0.2 = " + multIntWithDoubleToDouble);
        int multIntWithDoubleToInt = (int)(5 * 0.2);
        System.out.println("int => (int)(5 * 0.2) = " + multIntWithDoubleToInt);
        double divisionIntWithDoubleToDouble = 5 / 2;
        System.out.println("double => 5 / 2 = " + divisionIntWithDoubleToDouble);
        int divisionIntWithDoubleToInt = (int)(5 / 2);
        System.out.println("int => (int)(5 / 2) = " + divisionIntWithDoubleToInt);
        //то же самое, что и ниже:
        int divisionIntWithDoubleToIntWithoutPreposition = 5 / 2;
        System.out.println("int => 5 / 2 = " + divisionIntWithDoubleToIntWithoutPreposition);
        //byte и int
        byte aByte= 5;
        int aInt = 5;
        int summIntWithByteToInt = aByte + aInt;
        byte summIntWithByteToByte = (byte)(aByte + aInt);
        System.out.println("int => aByte + aInt = " + summIntWithByteToInt);
        System.out.println("byte => (byte)(aByte + aInt) = " + summIntWithByteToByte);

        //инкремент
        System.out.println("Increment:=====================");
        int numberIncrementFirst = 1;
        int numberIncrementSecond = 1;
        int numberIncrementThird = 1;
        System.out.println("numberIncrementFirst = 1");
        System.out.println("numberIncrementSecond = 1");
        System.out.println("numberIncrementThird = 1");
        System.out.println("numberIncrementFirst++ = " + (numberIncrementFirst++));
        System.out.println("++numberIncrementSecond = " + (++numberIncrementSecond));
        System.out.println("numberIncrementThird++ = " + (numberIncrementThird++));
        System.out.println("++numberIncrementThird = " + (++numberIncrementThird));
        int m = 0;
        int k = 1;
        m = k++; // m = k; k = k+1;
        System.out.println("m = 0, k = 1, m = k++");
        System.out.println("порядок действий: m = k; k = k + 1");
        System.out.println("m = " + m);
        System.out.println("k = " + k);
        int q = 0;
        int l = 1;
        q = ++l; // l = l + 1; q = l;
        System.out.println("q = 0, l = 1, q = ++l");
        System.out.println("порядок действий: l = l + 1; q = l");
        System.out.println("q = " + q);
        System.out.println("l = " + l);
        //декремент
        System.out.println("Decrement:=====================");
        int numberDecrementFirst = 1;
        int numberDecrementSecond = 1;
        System.out.println("numberDecrementFirst = 1");
        System.out.println("numberDecrementSecond = 1");
        System.out.println("numberDecrementFirst-- = " + (numberDecrementFirst--));
        System.out.println("--numberDecrementSecond = " + (--numberDecrementSecond));

        //Операторы сравнения
        System.out.println("Comparison Operators:==============");
        boolean boolEquals = (5 == 1);
        System.out.println("5 == 1 => " + boolEquals);
        boolean boolNotEquals = (5 != 1);
        System.out.println("5 != 1 => " + boolNotEquals);
        boolean boolNotMore = (5 > 1);
        System.out.println("5 > 1 => " + boolNotMore);
        boolean boolNotLess = (5 < 1);
        System.out.println("5 < 1 => " + boolNotLess);
        boolean boolNotMoreAndEquals = (5 >= 1);
        System.out.println("5 >= 1 => " + boolNotMoreAndEquals);
        boolean boolNotLessAndEquals = (5 <= 1);
        System.out.println("5 <= 1 => " + boolNotLessAndEquals);

        //Логические операторы
        System.out.println("Logical operators and if/else construct:==========");
        if ((5 > 1) && (4 < 6)) {
            System.out.println("(5 > 1) && (4 < 6)  => " + true);
        } else {
            System.out.println("(5 > 1) && (4 < 6)  => " + false);
        }
        if ((5 < 1) || (4 < 6)) {
            System.out.println("((5 < 1) || (4 < 6)) => " + true);
        } else if (5 > 1) {
            System.out.println("(5 > 1) => " + true);
        }
        if (!(5 > 1)) {
            System.out.println("!(5 > 1) => " + true);
        } else {
            System.out.println("!(5 > 1) => " + false);
        }

        //Конструкция switch/case
        System.out.println("switch/case construct:=============");
        int num = 5;
        switch (num) {
            case 1:
                System.out.println("число = 1");
                break;
            case 5:
                System.out.println("число = 5");
                break;
        }

        int input = 9;
        int output = 0;
        switch (input) {
            case 1:
                output = 1;
                break;
            case 2:
            case 3:
            case 4:
                output = 5;
                break;
            case 5:
                output = 6;
                break;
            default:
                output = 24;
                break;
        }
        System.out.println("output = " + output);

        //переполнение
        long i = 1 + 1L;
        float fff = 1.0f;
        System.out.println("Overflow============");
        System.out.println("byte:");
        System.out.println("(byte) (Byte.MIN_VALUE - 1) => " + ((byte) (Byte.MIN_VALUE - 1)));
        System.out.println("(byte)(Byte.MAX_VALUE + 1) => " + ((byte)(Byte.MAX_VALUE + 1)));

        System.out.println("short:");
        System.out.println("(short)(Short.MIN_VALUE - 1) => " + ((short)(Short.MIN_VALUE - 1)));
        System.out.println("(short)(Short.MAX_VALUE + 1) => " + ((short)(Short.MAX_VALUE + 1)));

        System.out.println("int:");
        System.out.println("Integer.MIN_VALUE => " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE => " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE - 1 => " + (Integer.MIN_VALUE - 1));
        System.out.println("Integer.MAX_VALUE + 1 => " + (Integer.MAX_VALUE + 1));

        System.out.println("long:");
        long overflowIntMinToLong1 = Integer.MIN_VALUE - 1;
        System.out.println("Integer.MIN_VALUE - 1 => " + overflowIntMinToLong1);
        long overflowIntMinToLong2 = (long)(Integer.MIN_VALUE - 1);
        System.out.println("(long)(Integer.MIN_VALUE - 1) => " + overflowIntMinToLong2);
        long overflowIntMinToLong3 = (long)(Integer.MIN_VALUE) - 1;
        System.out.println("(long)(Integer.MIN_VALUE) - 1 => " + overflowIntMinToLong3);

    }
}
