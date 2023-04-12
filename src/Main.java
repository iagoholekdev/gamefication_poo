// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import controller.gamefication.controller.ControllerGamefication;
import java.util.Scanner;

public class Main {
    static String printMyBot(){
        return """
                                
                    █    ██  ███▄    █  ██▓ ▄▄▄▄    ▒█████  ▄▄▄█████▓
                    ██  ▓██▒ ██ ▀█   █ ▓██▒▓█████▄ ▒██▒  ██▒▓  ██▒ ▓▒
                   ▓██  ▒██░▓██  ▀█ ██▒▒██▒▒██▒ ▄██▒██░  ██▒▒ ▓██░ ▒░
                   ▓▓█  ░██░▓██▒  ▐▌██▒░██░▒██░█▀  ▒██   ██░░ ▓██▓ ░\s
                   ▒▒█████▓ ▒██░   ▓██░░██░░▓█  ▀█▓░ ████▓▒░  ▒██▒ ░\s
                   ░▒▓▒ ▒ ▒ ░ ▒░   ▒ ▒ ░▓  ░▒▓███▀▒░ ▒░▒░▒░   ▒ ░░  \s
                   ░░▒░ ░ ░ ░ ░░   ░ ▒░ ▒ ░▒░▒   ░   ░ ▒ ▒░     ░   \s
                    ░░░ ░ ░    ░   ░ ░  ▒ ░ ░    ░ ░ ░ ░ ▒    ░     \s
                      ░              ░  ░   ░          ░ ░          \s
                                                
                """;
    }
    public static void main(String[] args) {
        ControllerGamefication controllerGame = new ControllerGamefication();
        System.out.println(Main.printMyBot());
        System.out.println("Sejam bem-vindos ao nosso jogo de perguntas!");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Escolha a dificuldade! 1 - Fàcil / 2 - Médio / 3 - Hard");
        int dificuldade = myScanner.nextInt();
        controllerGame.Jogar(dificuldade);
    }
}