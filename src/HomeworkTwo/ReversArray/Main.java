package HomeworkTwo.ReversArray;

public class Main {
    public static int[] reversal(int[] array) {
        int l = array.length;
        int a;
        for (int j = 0; j < l / 2; j++) {
            a = array[j];
            array[j] = array[l-1-j];
            array[l-1-j]= a;
        }
        return array;
    }


    public static void main(String[] args) {
        int [] array = {1,2,4,5};
        reversal(array);
        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
