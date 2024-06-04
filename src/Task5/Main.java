package Task5;

public class Main {
    public static void main(String[] args) {

        Task5 task5 = (Array) -> {
            for (int i = 0; i < Array.length; i++) {
                String S = Array[i];
                String word = "";
                for (int j = 0; j < S.length(); j++) {
                    word = word + Character.toLowerCase(S.charAt(j));
                }
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                System.out.print(" " + word);
            }
        };

        String[] Array = new String[]{
                "MuSo", "HoMe", "WoRK", "LeSSon", "OmonJon"
        };

        task5.Words(Array);

    }
}
