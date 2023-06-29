package Behavioral.Memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class Memory {
    private List<UserMemento> list;

    public Memory() {
        this.list = new ArrayList<>();
    }

    public void save(UserMemento memento) {
        list.add(memento);
    }

    public UserMemento getLastVersion() {
        UserMemento memento;
        if (!list.isEmpty()) {
            memento = list.get(list.size() - 1);
            list.remove(memento);
            return memento;
        } else throw new RuntimeException("Not Found");
    }


}
