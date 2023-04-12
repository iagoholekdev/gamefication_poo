package jogo.factory;

import java.util.Scanner;
import resources.ResourceString;
import strategy.gamefication.strategy.StrategyJogoFacil;

public class jogoFacilFactory {

    public jogoFacilFactory Jogar() {
        int pontos = 100;

        Scanner myScanner = new Scanner(System.in);

        ResourceString resourceStringUtil = new ResourceString();
        StrategyJogoFacil strategyJogoFacil = new StrategyJogoFacil();

        System.out.println("Quanto é 1+1?");
        int Resposta = myScanner.nextInt();
        pontos = strategyJogoFacil.validateJogoFacil(resourceStringUtil.primeiraPergunta, Resposta, "", pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        System.out.println("Quanto é 5x5?");
        Resposta = myScanner.nextInt();
        pontos = strategyJogoFacil.validateJogoFacil(resourceStringUtil.segundaPergunta, Resposta, "", pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        System.out.println("Qual é a letra do alfabeto que está entre C e E?");
        String RespostaString = myScanner.next();
        pontos = strategyJogoFacil.validateJogoFacil(resourceStringUtil.terceiraPergunta, 0, RespostaString, pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        myScanner.close();
        return this;
    }
}
