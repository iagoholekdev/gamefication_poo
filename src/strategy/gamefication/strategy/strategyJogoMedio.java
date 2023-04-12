package strategy.gamefication.strategy;
import controller.gamefication.controller.ControllerPontos;

public class strategyJogoMedio {
    public int validateJogoMedio(int index,  String respostaString, int pontos) {
        ControllerPontos controllerPontos = new ControllerPontos();

        switch (index) {
            case 1 -> {
                if (respostaString.contains("Curitiba")) {
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelMedio(pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Curitiba");
                    return controllerPontos.diminuirPontosNivelMedio(pontos);
                }

            }

            case 2 -> {
                if (respostaString.contains("Araucaria")) {
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelMedio(pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Araucaria");
                    return controllerPontos.diminuirPontosNivelMedio(pontos);
                }

            }

            case 3 -> {
                if (respostaString.contains("Amazônia")){
                    System.out.println("Você acertou!");
                    return controllerPontos.aumentarPontosNivelMedio(pontos);
                } else {
                    System.out.println("Errouuuu!");
                    System.out.println("A resposta correta é: Amazônia");
                    return controllerPontos.diminuirPontosNivelMedio(pontos);
                }
            }
        }
        return pontos;
    }
}
