package Creational.Prototype.SecondImplementation;

public interface Factory {
    Player createDefaultPlayer(String nickName) throws CloneNotSupportedException;
    Player createHealthyPlayer(int health) throws CloneNotSupportedException;
    Player createPowerfulPlayer(int power) throws CloneNotSupportedException;
    Player createPlayerWithWeapon(String weapon) throws CloneNotSupportedException;
}
