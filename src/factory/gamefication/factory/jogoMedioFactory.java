package factory.gamefication.factory;

import java.util.Scanner;
import strategy.gamefication.strategy.strategyJogoMedio;
import resources.ResourceString;

public class jogoMedioFactory {

        public jogoMedioFactory Jogar() {
            int pontos = 100;

            Scanner myScannerMedio = new Scanner(System.in);
            strategyJogoMedio strategyJogoMedio = new strategyJogoMedio();
            ResourceString resourceStringUtil = new ResourceString();

            System.out.println("Qual é capital do Parana?");
            String Resposta = myScannerMedio.next();
            pontos = strategyJogoMedio.validateJogoMedio(resourceStringUtil.primeiraPergunta,  Resposta, pontos);
            System.out.println("Sua quantidade de pontos atual é: " + pontos);

            System.out.println("Qual é árvore simbolo do estado do Paraná?");
            Resposta = myScannerMedio.next();
            pontos = strategyJogoMedio.validateJogoMedio(resourceStringUtil.segundaPergunta,  Resposta, pontos);
            System.out.println("Sua quantidade de pontos atual é: " + pontos);

            System.out.println("Qual é o maior bioma Brasileiro?");
            Resposta = myScannerMedio.next();
            pontos = strategyJogoMedio.validateJogoMedio(resourceStringUtil.terceiraPergunta,  Resposta, pontos);
            System.out.println("Sua quantidade de pontos atual é: " + pontos);

            myScannerMedio.close();
            return this;
       }
}
