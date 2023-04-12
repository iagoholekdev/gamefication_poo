package jogo.factory;

import controller.gamefication.controller.ControllerDificuldade;

import java.util.Scanner;
import resources.ResourceString;
import controller.gamefication.controller.ControllerJogoFacil;

public class jogoFacilFactory {

    public jogoFacilFactory Jogar() {
        int pontos = 100;
        Scanner myScanner = new Scanner(System.in);
        ResourceString resourceStringUtil = new ResourceString();
        ControllerJogoFacil controllerJogoFacil = new ControllerJogoFacil();
        System.out.println("Quanto é 1+1?");
        int Resposta = myScanner.nextInt();
        pontos = controllerJogoFacil.validateJogoFacil(resourceStringUtil.primeiraPergunta, Resposta, "", pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        System.out.println("Quanto é 5x5?");
        Resposta = myScanner.nextInt();
        pontos = controllerJogoFacil.validateJogoFacil(resourceStringUtil.segundaPergunta, Resposta, "", pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        System.out.println("Qual é a letra do alfabeto que está entre C e E?");
        String RespostaString = myScanner.next();
        pontos = controllerJogoFacil.validateJogoFacil(resourceStringUtil.terceiraPergunta, 0, RespostaString, pontos);
        System.out.println("Sua quantidade de pontos atual é: " + pontos);

        myScanner.close();
        return this;
    }
}
