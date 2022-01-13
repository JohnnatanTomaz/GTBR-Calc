package hud;

public class TelaInicial {

    public void menuPrincipal() {
        System.out.println("******************CALCULADORA******************");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Porcentagem");
        System.out.print("Escolha a operação desejada:");
    }

    public void primeirovalor() {
        System.out.print("Insira o primeiro valor:");
    }

    public void segundoValor() {
        System.out.print("Insira o segundo valor:");
    }

    public void encerramento() {
        System.out.println("Deseja fazer uma nova operação:");
        System.out.println("1 - SIM  | 2 - NÃO");
    }

    public void adeus() {
        System.out.println("Obrigado por calcular. Adeus");
    }
}