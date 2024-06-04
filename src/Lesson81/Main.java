package Lesson81;

public class Main {
    public static void main(String[] args) {

        Test test = (Array) ->{
           for (String x : Array){
               System.out.println(" Hi " + x + "!");
           }
        };

        String[] Array = new String[]{
          "Musobek", "Omonjon", "Abdulbosit", "Boburmirzo", "Saidaxror", "Timur", "Asrorbek", "Abdusalim"
        };

        test.Hi(Array);
    }
}
