package eyueksel;

/**
 * MAin Class to test the GenericUtlis Class
 * @author Eren Nazim Yüksel
 * @version 2024-02-17
 */
public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c", "d"};
        Double[] intArray = {1.0, 2.4, 3.5, 4.9, 5.2};  // Integer or any type of Number Objects works aswell

        GenericUtils.reverse(stringArray);
        System.out.println(stringArray[0]+", "+stringArray[1]+", "+stringArray[2]+", "+stringArray[3]);

        double sum = GenericUtils.sum(intArray);
        System.out.println(sum);
    }
}