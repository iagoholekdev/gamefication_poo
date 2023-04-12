package controller.gamefication.controller;

public class ControllerJogoFacil {
    public void validateJogoFacil(int index, int RespostaInteger, String RespostaString){
        int pontos = 100;
        ControllerMain controllerPontos = new ControllerMain();
        switch(index) {
            case 1 -> {
                if (RespostaInteger == 2) {
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
                if (RespostaInteger == 25) {
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
                if (RespostaString.equals("D")) {
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
}
