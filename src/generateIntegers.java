
public class generateIntegers {
    public static int[] generateRandomInt(int n){
        int []array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) - 1);
        }
        return array;
    }

    public static void squareRoot(int[] ints){
        int a;
        for (int i = 0; i < ints.length; i++) {
            if (isNegative(ints [i])){
                throw new ArithmeticException();
            }
            a = (int) Math.sqrt(ints[i]);

        }
    }

    public static boolean isNegative(int i){
        boolean b = false;
        if (i < 0){
            b = true;
        }
        return b;
    }

    public static void main(String[] args) {
        int [] array = generateRandomInt(20);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
