import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //Atividade 15.

    //Entrada
    Double dinheiroHora, horaMes, salarioBruto, INSS, sindicato, salarioLiquido, IR, pagoINSS, pagoSindicato;
    Scanner teclado;

    teclado = new Scanner(System.in);
    System.out.println("Quanto você ganha por hora? ");
    dinheiroHora = teclado.nextDouble();

    System.out.println("Qual é o número de horas trabalhadas no mês? ");
    horaMes = teclado.nextDouble();

    teclado.close();

    //Processamento
    salarioBruto = dinheiroHora * horaMes;
    IR = salarioBruto * 0.11;
    INSS = salarioBruto * 0.08;
    sindicato = salarioBruto * 0.05;
    pagoINSS = INSS;
    pagoSindicato = sindicato;
    salarioLiquido = salarioBruto - IR - INSS - sindicato;

    //Saída
    System.out.println("Salário bruto " + salarioBruto + " reais");
    System.out.println(" Pago ao INSS: " + INSS + "reais");
    System.out.println(" Pago ao sindicato: " + pagoSindicato + "reais");
    System.out.println(" Salário liquído " + salarioLiquido + " reais");

    }
}
