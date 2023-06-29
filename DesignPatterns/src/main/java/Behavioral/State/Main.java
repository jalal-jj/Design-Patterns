package Behavioral.State;

public class Main {
    public static void main(String[] args) {
        FootballGame football=new FootballGame(new Attack());

        football.round();
        football.x();
        football.triangle();

        football.changeStateToDefense();

        football.round();
        football.triangle();




    }
}
