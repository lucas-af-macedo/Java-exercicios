public class App {
    public static void main(String[] args) throws Exception {
        int number = 8;
        String text = "";
        text = text + number;

        if (number%2 == 0){
            text += " é par";
        }else{
            text += " é ímpar";
        }

        if (number>=0){
            text += " e positivo.";
        }else{
            text += " e negativo.";
        }


        System.out.println(text);
    }
}
