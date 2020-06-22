package HomeworkTwo.Palindrom;

public class Main {

    public static boolean isPalindrom(String word) {
        word = word.toLowerCase();
        char[] array = word.toCharArray();

        boolean x = false;
        for (int i = 0, j = word.length() -1; i < word.length() && j<word.length(); i++,j--) {
                if (array[i] == array[j]){
                    x = true;
                }
                else {
                    x = false;
                    System.out.println("Isn't palindrom");
                    break;
                }
        }
        if (x == true){
            System.out.println("Palindrom");
        }
        return x;
    }



    public static void main(String[] args) {
        isPalindrom("Каша");

    }
}
