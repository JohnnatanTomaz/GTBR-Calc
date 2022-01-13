package config;

import funcao.*;
import hud.TelaInicial;

public class ConfigGeral {

    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();
    Multiplicacao multiplicacao = new Multiplicacao();
    Divisao divisao = new Divisao();
    Porcentagem porcentagem = new Porcentagem();
    TelaInicial telaInicial = new TelaInicial();

    Double resultado;

    public String escolheFuncao(String escolha, Double valor1, Double valor2) {
            switch (escolha) {
                case "1":
                    resultado = soma.somaValores(valor1, valor2);
                    System.out.printf("Resultado: %.1f \n", resultado);
                    return String.valueOf(resultado);
                case "2":
                    resultado = subtracao.subValores(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    return String.valueOf(resultado);
                case "3":
                    resultado = multiplicacao.multiplicacaoValores(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    return String.valueOf(resultado);
                case "4":
                    resultado = divisao.divisaoValores(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    return String.valueOf(resultado);
                case "5":
                    resultado = porcentagem.porcentagemValores(valor1, valor2);
                    System.out.println("Resultado: " + resultado);
                    return String.valueOf(resultado);
                default:
                    System.out.println("OPA");
                    return null;
            }
    }

    public Boolean repeteAplicacao(Integer escolha) {
        Boolean decisao;
        if (escolha == 1) {
            decisao = true;
        }else {
            decisao = false;
        }
        return decisao;
    }





}
