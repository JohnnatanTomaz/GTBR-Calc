import config.ConfigGeral;
import hud.TelaInicial;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        TelaInicial telaInicial = new TelaInicial();
        ConfigGeral configGeral = new ConfigGeral();
        boolean repete = true;

        while (repete) {
            telaInicial.menuPrincipal();
            String escolha = scanner.next();
            telaInicial.primeirovalor();
            Double valor1 = scanner.nextDouble();
            telaInicial.segundoValor();
            Double valor2 = scanner.nextDouble();
            configGeral.escolheFuncao(escolha, valor1, valor2);
            telaInicial.encerramento();
            Integer decisao = scanner.nextInt();
            configGeral.repeteAplicacao(decisao);
            repete = configGeral.repeteAplicacao(decisao);
            telaInicial.adeus();
        }
    }
}