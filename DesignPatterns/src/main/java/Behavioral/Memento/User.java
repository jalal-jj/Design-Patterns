package Behavioral.Memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String message;


    public User(String message) {
        this.message = message;
    }

    public void returnLastVersionWithMemento(UserMemento memento){
        message=memento.getMessage();
    }
    public UserMemento save(){
        return new UserMemento(message);
    }
    public void add(String newMessage){
        message +=" "+ newMessage;
    }
    public void printMessage(){
        System.out.println(message);
    }

}
