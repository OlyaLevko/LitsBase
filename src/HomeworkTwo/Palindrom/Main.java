package HomeworkTwo.Palindrom;

public class Main {

    public static boolean isPalindrom(String word) {
        word = word.toLowerCase();
        int l = word.length();
        char[] array = new char[l];
        for (int i = 0; i < l; i++) {
            array[i] = word.charAt(i);

        }
        boolean x = false;
        for (int j = 0; j < l / 2; ) {
            if (array[j]== array[l - 1 - j]) {
                j++;
                x = true;
            } else {
                x = false;
                j = l;
            }
        }
        return x;
    }


    public static void main(String[] args) {
        if(isPalindrom("Біб"))
            System.out.println("HomeworkTwo");
        else
            System.out.println("Not palindrom");
    }
}
