package Task2;

public class Main {
    public static void main(String[] args) {

        Task2 task2 = (Array) -> {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] % 2 == 0){
                    System.out.print(" " + Array[i]);
                }
            }
        };

        int[] Array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        task2.Numbers(Array);

    }
}