package Behavioral.Command;


import Behavioral.Command.Commands.Command;

public class Calculator {

    public Double calc(Command command,Double...doubles) {
        return command.calculate(doubles);
    }
}
