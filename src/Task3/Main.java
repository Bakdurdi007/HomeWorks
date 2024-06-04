package Task3;

public class Main {
    public static void main(String[] args) {

        Task3 task3 = (Array) -> {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i].length() < 5){
                    System.out.print(" " + Array[i]);
                }
            }
        };

        String[] Array = new String[]{
          "Muso", "Home", "Work", "Lesson", "Omonjon"
        };

        task3.Words(Array);

    }
}
