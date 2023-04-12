package jogo.factory;

import controller.gamefication.controller.ControllerDificuldade;

import java.util.Scanner;
import resources.ResourceString;
import controller.gamefication.controller.ControllerJogoFacil;

public class jogoFacilFactory {

    public jogoFacilFactory Jogar() {
        Scanner myScanner = new Scanner(System.in);
        ResourceString resourceStringUtil = new ResourceString();
        ControllerJogoFacil controllerJogoFacil = new ControllerJogoFacil();
        System.out.println("Quanto é 1+1?");
        int Resposta = myScanner.nextInt();
        controllerJogoFacil.validateJogoFacil(resourceStringUtil.primeiraPergunta, Resposta, "");

        System.out.println("Quanto é 5x5?");
        Resposta = myScanner.nextInt();
        controllerJogoFacil.validateJogoFacil(resourceStringUtil.segundaPergunta, Resposta, "");

        System.out.println("Qual é a letra do alfabeto que está entre C e E?");
        String RespostaString = myScanner.next();
        controllerJogoFacil.validateJogoFacil(resourceStringUtil.terceiraPergunta, 0, RespostaString);

        myScanner.close();
        return this;
    }
}
