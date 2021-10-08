package Converter;

public class Converter {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("ƒес€тичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("¬осьмеричное число " + octalNumber + " равно дес€тичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if(decimalNumber <= 0) return 0;
        double octalNumber = 0.0;
        int i = 0;
        while(decimalNumber != 0){
            octalNumber = octalNumber + (decimalNumber % 8) * Math.pow(10,i);
            decimalNumber = decimalNumber / 8;
            i = i + 1;
        }
        return (int)octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) return 0;
        double decimalNumber = 0.0;
        int i = 0;
        while (octalNumber != 0){
            decimalNumber = decimalNumber + (octalNumber % 10) * Math.pow(8, i);
            octalNumber = octalNumber / 10;
            i = i + 1;
        }
        return (int)decimalNumber;
    }
}
