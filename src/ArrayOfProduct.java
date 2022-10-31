import java.util.Arrays;

public class ArrayOfProduct {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,0};
        int zeroProduct = 1;
        for(int i = 0;i<array.length;i++){
            if(array[i]!= 0) {
                zeroProduct *= array[i];
            }

        }

        int product = 1;
        for(int i = 0;i<array.length;i++)
            product *= array[i];
        for(int i = 0;i<array.length;i++)
            if(array[i] == 0)
                array[i] = zeroProduct;
            else
                array[i] = product/array[i];

        System.out.println(Arrays.toString(array));
    }
}
