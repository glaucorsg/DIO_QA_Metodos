import java.text.NumberFormat;
import java.util.Locale;

public class Emprestimo {

    public static void calculoEmprestimo(int n, double taxa, double montante){

        double calculo = (montante * (Math.pow(1 + taxa, n)));

        System.out.println(String.format("O valor total do empréstimo será de R$ %.2f", calculo));
    }
}
