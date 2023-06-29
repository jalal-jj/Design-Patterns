package Behavioral.Command.Commands;


public class AddCommand implements Command{

    @Override
    public Double calculate(Double... doubles) {
        double zero = doubles[0]*doubles[1];
        if (doubles.length>=2){
            for (int i = 2; i<doubles.length;i++) {
                zero = zero*doubles[i];
            }
        }
        return zero;
    }
}
