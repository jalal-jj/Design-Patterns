package Behavioral.Command.Commands;


public class DivideCommand implements Command {

    @Override
    public Double calculate(Double... doubles) {
        Double zero = doubles[0]/doubles[1];
        if (doubles.length>=2){
            for (int i = 2; i<doubles.length;i++) {
                zero = zero/doubles[i];
            }
        }
        return zero;
    }
}
