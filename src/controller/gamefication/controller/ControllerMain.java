package controller.gamefication.controller;

public class ControllerMain {

    static int aumentarPontosNivelEasy(int pontos) {
        final int sumEasy = 10;
        return pontos + sumEasy;

    }

    static int aumentarPontosNivelMedio(int pontos) {
        final int sumMedio = 5;
        return pontos + sumMedio;

    }

    static int aumentarPontosNivelHard(int pontos) {
        final int sumHard = 3;
        return pontos + sumHard;

    }

    static int diminuirPontosNivelEasy(int pontos) {
        final int minusEasy = 10;
        return pontos - minusEasy;

    }

    static int diminuirPontosNivelMedio(int pontos) {
        final int minusMedio = 20;
        return pontos - minusMedio;

    }

    static int diminuirPontosNivelHard(int pontos) {
        final int minusHard = 30;
        return pontos - minusHard;

    }

}

