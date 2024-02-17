package eyueksel;
/**
 * Class GenericUtils with two methods
 * @author Eren Nazim Yüksel
 * @version 2024-02-17
 */
public class GenericUtils {
    /**
     * A method that flips the array (so that the first element is at the last and the last element first)
     * The swapping happens in-place, so no new array is created.
     * @param array
     * @param <T>
     */
    public static <T> void reverse (T[] array){
        for(int i = 0; i < array.length/2; i++){
            if(array[i] != null){
                T temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
    }
    /**
     * The same function as the reverse method but only with numbers and returns the sum of the numbers
     * in the array
     * @param array
     * @return sum
     * @param <T>
     */
    public static <T extends Number> double sum (T[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                sum += array[i].doubleValue();  // If you try to cast the value of the index with (double) it does not work so u have to use the method doubleValue() that is excplicitly created for such a case
            }
        }
        GenericUtils.reverse(array);
        return sum;
    }
}
