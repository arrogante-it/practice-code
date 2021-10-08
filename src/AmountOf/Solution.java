package AmountOf;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countOfDigits = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isDigit(chars[i])){
                countOfDigits = countOfDigits + 1;
            }
        }
        return countOfDigits;
    }

    public static int countLetters(String string) {
        int countOfLetters = 0;
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(Character.isLetter(chars[i])){
                countOfLetters = countOfLetters + 1;
            }
        }
        return countOfLetters;
    }

    public static int countSpaces(String string) {
        int countOfSpaces = 0;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isWhitespace(charArray[i])){
                countOfSpaces = countOfSpaces + 1;
            }
        }
        return countOfSpaces;
    }
}
