package Behavioral.State;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FootballGame {
    private PSConsole console;

    public FootballGame(PSConsole console) {
        this.console = console;
    }
    public void square(){
        console.square();
    }
    public void x(){
        console.X();
    }
    public void triangle(){
        console.triangle();
    }
    public void round(){
        console.round();
    }
    public void changeStateToAttack(){
        console=new Attack();
    }
    public void changeStateToDefense(){
        console=new Defense();
    }


}
