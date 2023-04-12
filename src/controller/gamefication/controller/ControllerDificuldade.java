package controller.gamefication.controller;
import java.util.Scanner;

public class ControllerDificuldade {
     static int pontos = 100;


    static void validateRespostaEasy(int index, int respostaInteger, String respostaString){

        ControllerMain controllerPontos = new ControllerMain();
        switch(index) {
            case 1 -> {
                if (respostaInteger == 2) {
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelEasy(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    pontos = controllerPontos.diminuirPontosNivelEasy(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }
            }
            case 2 -> {
                if (respostaInteger == 25) {
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelEasy(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    pontos = controllerPontos.diminuirPontosNivelEasy(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }
            }
            case 3 -> {
                if (respostaString.equals("D")) {
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelEasy(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    pontos = controllerPontos.diminuirPontosNivelEasy(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }
            }
        }
    }

    static void validateJogoMedio(int index, int respostaInteger, String respostaString) {
        ControllerMain controllerPontos = new ControllerMain();

        switch (index) {
            case 1 -> {
                if (respostaString.contains("Curitiba")) {
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelMedio(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Curitiba");
                    pontos = controllerPontos.diminuirPontosNivelMedio(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }

            }

            case 2 -> {
                if (respostaString.contains("Araucaria")) {
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelMedio(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Araucaria");
                    pontos = controllerPontos.diminuirPontosNivelMedio(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }

            }

            case 3 -> {
                if (respostaString.contains("Amazônia")){
                    System.out.println("Você acertou!");
                    pontos = controllerPontos.aumentarPontosNivelMedio(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Amazônia");
                    pontos = controllerPontos.diminuirPontosNivelMedio(pontos);
                    System.out.println("Sua quantidade de pontos atual é: " + pontos);
                }
              }
            }
        }



    static void validateJogoHard(int index, int respostaInteger, String respostaString) {

        ControllerMain controllerPontos = new ControllerMain();
        switch (index) {
            case 1 -> { if (respostaString.equalsIgnoreCase("Salvatori Mundi")) {
                System.out.println("Você acertou!");
                pontos = controllerPontos.aumentarPontosNivelHard(pontos);
                System.out.println("Sua quantidade de pontos atual é: " + pontos);
            } else {
                System.out.println("Errouuuu!");
                System.out.println("A resposta correta é: Amazônia");
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


    public void JogoFacil(){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Quanto é 1+1?");
        int Resposta = myScanner.nextInt();
        ControllerDificuldade.validateRespostaEasy(1, Resposta, "");

        System.out.println("Quanto é 5x5?");
        Resposta = myScanner.nextInt();
        ControllerDificuldade.validateRespostaEasy(2, Resposta, "");

        System.out.println("Qual é a letra do alfabeto que está entre C e E?");
        String RespostaString = myScanner.next();
        ControllerDificuldade.validateRespostaEasy(3, 0, RespostaString);

        myScanner.close();
    }
    public void JogoMedio(){

        Scanner myScannerMedio = new Scanner(System.in);

        System.out.println("Qual é capital do Parana?");
        String Resposta = myScannerMedio.next();
        ControllerDificuldade.validateJogoMedio(1, 0, Resposta);

        System.out.println("Qual é árvore simbolo do estado do Paraná?");
        Resposta = myScannerMedio.next();
        ControllerDificuldade.validateJogoMedio(2, 0, Resposta);

        System.out.println("Qual é o maior bioma Brasileiro?");
        Resposta = myScannerMedio.next();
        ControllerDificuldade.validateJogoMedio(3, 0, Resposta);

        myScannerMedio.close();
    }

    public void JogoHard(){

        Scanner myScannerHard = new Scanner(System.in);

        System.out.println("Qual é a obra de arte mais cara do mundo");
        String Resposta = myScannerHard.nextLine();
        ControllerDificuldade.validateJogoHard(1, 0, Resposta);

        System.out.println("Quanto tempo durou o regime do apartheid na África do Sul?");
        Resposta = myScannerHard.nextLine();
        ControllerDificuldade.validateJogoHard(2, 0, Resposta);

        System.out.println("Quem foi o inventor da vacina?");
        Resposta = myScannerHard.nextLine();
        ControllerDificuldade.validateJogoHard(3, 0, Resposta);

        myScannerHard.close();

    }

    public void Jogar(int dificuldade){
       switch (dificuldade) {
           case 1 -> JogoFacil();
           case 2 -> JogoMedio();
           default -> JogoHard();
       }
    }
}
