public class App {
    public static void main(String[] args) throws Exception {
        int x = 20;
        int last = 0;
        int penultimate = 0;
        int auxiliar = 0;
        String text = "";
        
        for(int i = 0; i < x; i++){
            if (i==0){
                text += "0 ";
            }else if(i == 1){
                text += "1 ";
                last = 1;
            }else{
                auxiliar = last + penultimate;
                penultimate = last;
                last = auxiliar;
                text += auxiliar + " ";
            }
        }

        System.out.println(text);
    }
}
