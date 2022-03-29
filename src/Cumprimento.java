import java.sql.Time;


public class Cumprimento {

    public static void cumprimento(int horaDoDia){
        if (horaDoDia <= 12){
            System.out.println("Bom dia");
        } else if (horaDoDia <= 18){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
