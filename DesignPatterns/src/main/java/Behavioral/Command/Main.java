package Behavioral.Command;


import Behavioral.Command.Commands.AddCommand;
import Behavioral.Command.Commands.DivideCommand;
import Behavioral.Command.Commands.MinusCommand;
import Behavioral.Command.Commands.MultiplyCommand;

public class Main {

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        double minus=calculator.calc(new MinusCommand(),Double.valueOf(2000),Double.valueOf(5),Double.valueOf(3),Double.valueOf(2));
        double add=calculator.calc(new AddCommand(),Double.valueOf(2000),Double.valueOf(5),Double.valueOf(3),Double.valueOf(2));
        double divide=calculator.calc(new DivideCommand(),Double.valueOf(2000),Double.valueOf(5),Double.valueOf(3),Double.valueOf(2));
        double multiply=calculator.calc(new MultiplyCommand(),Double.valueOf(2000),Double.valueOf(5),Double.valueOf(3),Double.valueOf(2));

    }


}
