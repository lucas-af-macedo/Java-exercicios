public class App {
    public static void main(String[] args) throws Exception {
        int x = 7;
        int result = 0;
        String title = "Tabela de multiplicação por " + x;
        System.out.println(title);
        for (int i = 1; i <= 10; i++){
            result = x * i;
            String text = x + " x " + i + " = " + result;
            System.out.println(text);
        }
    }
}
