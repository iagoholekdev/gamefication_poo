package controller.gamefication.controller;
import factory.gamefication.factory.jogoFacilFactory;
import factory.gamefication.factory.jogoMedioFactory;
import factory.gamefication.factory.jogoHardFactory;

public class ControllerGamefication {

    public void Jogar(int dificuldade){
        switch (dificuldade) {
            case 1 ->
              new jogoFacilFactory()
                            .Jogar();

            case 2 ->
                new jogoMedioFactory()
                            .Jogar();

            default ->
                new jogoHardFactory()
                             .Jogar();

        }
    }
}
