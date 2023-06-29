package Behavioral.Memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserMemento {
    private String message;

    public UserMemento(String message) {
        this.message = message;
    }
}
