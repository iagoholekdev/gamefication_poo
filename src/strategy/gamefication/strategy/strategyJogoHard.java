package strategy.gamefication.strategy;

import controller.gamefication.controller.ControllerPontos;

public class strategyJogoHard {
    public int validateJogoHard(int index, String respostaString, int pontos) {

        ControllerPontos controllerPontos = new ControllerPontos();
        switch (index) {
            case 1 -> { if (respostaString.equalsIgnoreCase("Salvatori Mundi")) {
                System.out.println("Você acertou!");
                return controllerPontos.aumentarPontosNivelHard(pontos);
            } else {
                System.out.println("Errouuuu!");
                System.out.println("A resposta correta é: Salvatori Mundi");
                return controllerPontos.diminuirPontosNivelHard(pontos);
            }

            }

            case 2 -> {
                if (respostaString.equalsIgnoreCase("42")) {
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelHard(pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: 42");
                    return controllerPontos.diminuirPontosNivelHard(pontos);
                }
            }

            case 3 -> {
                if (respostaString.equalsIgnoreCase("Edward Jenner")){
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelHard(pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Edward Jenner");
                    return controllerPontos.diminuirPontosNivelHard(pontos);
                }

            }

        }
        return pontos;
    }
}
