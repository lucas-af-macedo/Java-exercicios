public class App {
    public static void main(String[] args) throws Exception {
        String days[][] = {
            {"01-01-2024", "Confraternização Mundial"},
            {"12-02-2024", "Carnaval"},
            {"13-02-2024", "Carnaval"},
            {"29-03-2024", "Sexta-feira Santa"},
            {"21-04-2024", "Tiradentes"},
            {"01-05-2024", "Dia do Trabalho"},
            {"30-05-2024", "Corpus Christi"},
            {"07-09-2024", "Independência do Brasil"},
            {"12-10-2024", "Nossa Senhora Aparecida"},
            {"02-11-2024", "Finados"},
            {"15-11-2024", "Proclamação da República"},
            {"20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"},
            {"25-12-2024", "Natal"}};

        Hollyday hollydays = new Hollyday();

        for (int i = 0; i < days.length; i++){
            hollydays.set(days[i][0], days[i][1]);
        }
    }
}
