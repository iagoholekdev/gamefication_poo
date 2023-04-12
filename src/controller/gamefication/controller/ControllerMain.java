package controller.gamefication.controller;

public class ControllerMain {

    public int aumentarPontosNivelEasy(int pontos) {
        final int sumEasy = 10;
        return pontos + sumEasy;

    }

    public int aumentarPontosNivelMedio(int pontos) {
        final int sumMedio = 5;
        return pontos + sumMedio;

    }

    public int aumentarPontosNivelHard(int pontos) {
        final int sumHard = 3;
        return pontos + sumHard;

    }

    public int diminuirPontosNivelEasy(int pontos) {
        final int minusEasy = 10;
        return pontos - minusEasy;

    }

    public int diminuirPontosNivelMedio(int pontos) {
        final int minusMedio = 20;
        return pontos - minusMedio;

    }

    public int diminuirPontosNivelHard(int pontos) {
        final int minusHard = 30;
        return pontos - minusHard;

    }

}

