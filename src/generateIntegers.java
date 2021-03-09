
public class generateIntegers {
    public static int[] generateRandomInt(int n){
        int []array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) - 1);
        }
        return array;
    }

    public static 

    public static void main(String[] args) {
        int [] array = generateRandomInt(20);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
