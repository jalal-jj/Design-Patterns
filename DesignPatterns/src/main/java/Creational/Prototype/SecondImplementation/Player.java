package Creational.Prototype.SecondImplementation;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Player implements Cloneable {

    private String name;
    private int health;
    private String weapon;
    private int power;

    @Override
    protected Player clone() throws CloneNotSupportedException {
        Player player=null;
        try{
            player= (Player) super.clone();
        }catch ( CloneNotSupportedException c){
            System.out.println("Exception CloneNotSupported");
            c.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Exception ClassCast");
            e.printStackTrace();
        }return player;
    }
}
