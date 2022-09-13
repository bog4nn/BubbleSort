import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {6,5,7,8,9,1,2,3};
        print(Arrays.toString(array));
        for(int i =0; i <array.length-1; i++){
            for(int j = 0 ; j < array.length-1; j++){
                if(array[j]>array[j+1]){
                   int tmp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = tmp;
                }
            }
        }
        print(Arrays.toString(array));
    }
    private static void print(String s) {
        System.out.println(s);
    }
}
