package factory.gamefication.factory;

import resources.ResourceString;

import java.util.Scanner;
import strategy.gamefication.strategy.strategyJogoHard;

public class jogoHardFactory {
    public jogoHardFactory Jogar(){
        int pontos = 100;

        Scanner myScannerHard = new Scanner(System.in);
        strategyJogoHard strategyJogoHard = new strategyJogoHard();
        ResourceString resourceStringUtil = new ResourceString();

        System.out.println("Qual é a obra de arte mais cara do mundo");
        String Resposta = myScannerHard.nextLine();
        pontos = strategyJogoHard.validateJogoHard(resourceStringUtil.primeiraPergunta, Resposta, pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        System.out.println("Quanto tempo durou o regime do apartheid na África do Sul?");
        Resposta = myScannerHard.nextLine();
        pontos = strategyJogoHard.validateJogoHard(resourceStringUtil.segundaPergunta, Resposta, pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        System.out.println("Quem foi o inventor da vacina?");
        Resposta = myScannerHard.nextLine();
        pontos = strategyJogoHard.validateJogoHard(resourceStringUtil.terceiraPergunta, Resposta, pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        myScannerHard.close();

        return this;
    }
}
