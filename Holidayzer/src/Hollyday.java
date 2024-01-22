import java.util.ArrayList;
import java.util.List;

public class Hollyday {
    List<String[]> hollydays = new ArrayList<>();

    public Hollyday(){
        // Esse é o construtor da classe
    }
    
    public void test(){
        System.out.println(hollydays.size());
    }

    public void print(){
        for (int i = 0; i < hollydays.size(); i++){
            String day = hollydays.get(i)[0] + " => " + hollydays.get(i)[1];
            System.out.println(day);
        }
    }

    public void set(String day, String name){
        String[] hollyday = {day, name};
        hollydays.add(hollyday);
    }

    public void isHollyday(String day){
        for (int i = 0; i < hollydays.size(); i++){
            if (day.equals(hollydays.get(i)[0])){
                String text = "Dia " + hollydays.get(i)[0] + " é " + hollydays.get(i)[1] + "!";
                System.out.println(text);
                return;
            }
        }
        String text = "Dia " + day + " não é feriado";
        System.out.println(text);
    }
}
