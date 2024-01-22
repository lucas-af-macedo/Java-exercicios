public class App {
    public static void main(String[] args) throws Exception {
        int number = 5;
        
        for (int i = 1; i <= number; i++){
            String text = "";
            for (int j = 0; j < i; j++){
                text += i;
            }
            System.out.println(text);
        }
    }
}
