public class Main {

    public static void main(String[] args) {
        System.out.println("\n ==== Utilizando a calculadora de operações básicas ====");
        Operacoes.soma(5,8);
        Operacoes.subtracao(7,2);
        Operacoes.multiplicacao(20,4);
        Operacoes.divisao(35,9);

        System.out.println("\n ==== Utilizando o método de cumprimento ====");
        Cumprimento.cumprimento(19);
        Cumprimento.cumprimento(7);
        Cumprimento.cumprimento(17);

        System.out.println("\n ==== Utilizando o método de cálculo do valor de empréstimo ====");
        Emprestimo.calculoEmprestimo(5,0.055,2000);
        Emprestimo.calculoEmprestimo(15,0.025,25000);

        System.out.println("\n ==== Utilizando o método de cálculo da área dos quadriláteros ====");
        Quadrilatero.area(5);
        Quadrilatero.area(5d,4d); // passando dois doubles como parâmetros
        Quadrilatero.area(6,5,4);
        Quadrilatero.area(3f,7f); // passando dois floats como parâmetros


    }
}
