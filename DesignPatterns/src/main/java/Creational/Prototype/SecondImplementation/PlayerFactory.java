package Creational.Prototype.SecondImplementation;

import lombok.Data;

@Data
public class PlayerFactory implements Factory {

    private static Player player = new Player();

    @Override
    public Player createDefaultPlayer(String name) throws CloneNotSupportedException {
        Player playerWithDefaults = player.clone();
        playerWithDefaults.setName(name);
        playerWithDefaults.setWeapon("axe");
        playerWithDefaults.setPower(70);
        playerWithDefaults.setHealth(70);
        return playerWithDefaults;
    }

    @Override
    public Player createHealthyPlayer(int health) throws CloneNotSupportedException {
        Player healthyPlayer = player.clone();
        healthyPlayer.setHealth(health);
        healthyPlayer.setPower(80);
        healthyPlayer.setWeapon("Nuttertools");
        return healthyPlayer;
    }

    @Override
    public Player createPowerfulPlayer(int power) throws CloneNotSupportedException {
        Player powerfulPlayer = player.clone();
        powerfulPlayer.setPower(power);
        powerfulPlayer.setName("PowerFul");
        powerfulPlayer.setHealth(70);
        return powerfulPlayer;
    }

    @Override
    public Player createPlayerWithWeapon(String weapon) throws CloneNotSupportedException {
        Player playerWithWeapon = player.clone();
        playerWithWeapon.setName("With Weapon");
        playerWithWeapon.setHealth(80);
        playerWithWeapon.setPower(80);
        playerWithWeapon.setWeapon(weapon);
        return playerWithWeapon;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PlayerFactory factory = new PlayerFactory();
        Player player1 = factory.createDefaultPlayer("defaultName");
        Player player2 = factory.createPlayerWithWeapon("Guns");

    }
}
