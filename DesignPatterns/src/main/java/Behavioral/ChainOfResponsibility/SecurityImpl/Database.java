package Behavioral.ChainOfResponsibility.SecurityImpl;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private final Map<String,String> users;

    public Database() {
        users=new HashMap<>();
        users.put("admin","admin_pass");
    }
    public boolean isValidUser(String userName){
        return users.containsKey(userName);
    }
    public boolean isPasswordValid(String userName,String password){
        return users.get(userName).equals(password);
    }
}
