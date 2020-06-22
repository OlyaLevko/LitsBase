package HomeworkTwo.ReversArray;

public class Main {
    public static int[] reversal(int[] array) {
        int l = array.length;
        int [] reversArray = new int [l];
        for (int j = l-1, i =0; j < l && i<l; j--,i++) {
            reversArray[i] = array[j];
        }
        return reversArray;
    }


    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        array = reversal(array);
        for(int x: array){
            System.out.println(x);
        }



    }
}
