package Task4;

public class Main {
    public static void main(String[] args) {

        Task4 task4 = (Array) -> {
            int[] Array2 = new int[Array.length];
            for (int i = 0; i < Array.length; i++) {
                Array2[i] = Array[i] * Array[i];
                System.out.print(" " + Array2[i]);
            }
        };

        int[] Array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        task4.Numbers(Array);

    }
}