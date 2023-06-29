package Behavioral.Memento;

public class Main {

    public static void main(String[] args) {
        Memory memory = new Memory();
        User user = new User("");
        user.add("1st message");
        user.add("2nd message");
        UserMemento memento=user.save();
        memory.save(memento);
        user.printMessage();
        user.add("3rd message");
        user.printMessage();
        user.returnLastVersionWithMemento(memory.getLastVersion());
        user.printMessage();




    }
}
