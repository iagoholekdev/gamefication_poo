package controller.gamefication.controller;
import resources.ResourceString;
import factory.gamefication.factory.jogoFacilFactory;
import factory.gamefication.factory.jogoMedioFactory;

import java.util.Scanner;

public class ControllerGamefication {
     static int pontos = 100;
     ResourceString resourceStringUtil = new ResourceString();


    static void validateJogoHard(int index, String respostaString) {

        ControllerPontos controllerPontos = new ControllerPontos();
        switch (index) {
            case 1 -> { if (respostaString.equalsIgnoreCase("Salvatori Mundi")) {
                System.out.println("Você acertou!");
                pontos = controllerPontos.aumentarPontosNivelHard(pontos);
                System.out.println("Sua quantidade de pontos atual é: " + pontos);
            } else {
                System.out.println("Errouuuu!");
                System.out.println("A resposta correta é: Salvatori Mundi");
                pontos = controllerPontos.diminuirPontosNivelHard(pontos);
                System.out.println("Sua quantidade de pontos atual é: " + pontos);
            }

            }

            case 2 -> {
                if (respostaString.equalsIgnoreCase("42")) {
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelHard(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: 42");
                    pontos = controllerPontos.diminuirPontosNivelHard(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }
            }

            case 3 -> {
                if (respostaString.equalsIgnoreCase("Edward Jenner")){
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelHard(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Edward Jenner");
                    pontos = controllerPontos.diminuirPontosNivelHard(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }

            }

            }
        }



    public void JogoHard(){

        Scanner myScannerHard = new Scanner(System.in);

        System.out.println("Qual é a obra de arte mais cara do mundo");
        String Resposta = myScannerHard.nextLine();
        ControllerGamefication.validateJogoHard(resourceStringUtil.primeiraPergunta, Resposta);

        System.out.println("Quanto tempo durou o regime do apartheid na África do Sul?");
        Resposta = myScannerHard.nextLine();
        ControllerGamefication.validateJogoHard(resourceStringUtil.segundaPergunta, Resposta);

        System.out.println("Quem foi o inventor da vacina?");
        Resposta = myScannerHard.nextLine();
        ControllerGamefication.validateJogoHard(resourceStringUtil.terceiraPergunta, Resposta);

        myScannerHard.close();

    }

    public void Jogar(int dificuldade){

        switch (dificuldade) {
            case 1 -> {
              jogoFacilFactory jogoFacil = new jogoFacilFactory()
                                                                .Jogar();
            }
            case 2 -> {
                jogoMedioFactory jogoMedio = new jogoMedioFactory()
                                                                .Jogar();
            }
            default -> JogoHard();
        }
    }
}
