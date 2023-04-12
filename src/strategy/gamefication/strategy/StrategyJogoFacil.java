package strategy.gamefication.strategy;

import controller.gamefication.controller.ControllerMain;

public class StrategyJogoFacil {
    public int validateJogoFacil(int index, int RespostaInteger, String RespostaString, int pontos){
        ControllerMain controllerPontos = new ControllerMain();
        switch(index) {
            case 1 -> {
                if (RespostaInteger == 2) {
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelEasy(pontos);
                } else {
                    System.out.println("Errouuuu!");
                    return controllerPontos.diminuirPontosNivelEasy(pontos);
                }
            }
            case 2 -> {
                if (RespostaInteger == 25) {
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelEasy(pontos);

                } else {
                    System.out.println("Errouuuu!");
                   return controllerPontos.diminuirPontosNivelEasy(pontos);
                }
            }
            case 3 -> {
                if (RespostaString.equals("D")) {
                   System.out.println("Você acertou!");
                   return controllerPontos.aumentarPontosNivelEasy(pontos);
                } else {
                    System.out.println("Errouuuu!");
                   return controllerPontos.diminuirPontosNivelEasy(pontos);
                }
            }
        }
        return pontos;
    }
}
