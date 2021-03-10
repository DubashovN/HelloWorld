import java.util.Random;

public class GenerateIntegers {
    private static Random random = new Random();
    private static int[] array;
    public static int[] generateRandomInt(int n){
        int []array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) - 1);
//            array[i] = random.nextInt();
        }
        return array;
    }

    public static void squareRoot(int[] ints){
        int q;
        for (int anInt : ints) {
            if (isNegative(anInt)) {
                throw new ArithmeticException();
            }
            q = (int) Math.sqrt(anInt);
            printNumber(q, anInt);
        }
    }
    public static int mathPow(int i){
        return (int) Math.pow(i, i);
    }

    public static void printNumber(int q, int a){
        if (mathPow(q) == a){
            System.out.println(a);
        } else {
            System.out.println("nothing to show!");
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

        array = generateRandomInt(30);
        squareRoot(array);
//        int [] array = generateRandomInt(20);
//        for (int i = 0; i < array.length - 1; i++) {
//            System.out.println(array[i]);
//        }
    }
}
