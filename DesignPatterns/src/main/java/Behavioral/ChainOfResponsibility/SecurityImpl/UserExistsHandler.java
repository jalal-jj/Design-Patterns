package Behavioral.ChainOfResponsibility.SecurityImpl;

import lombok.ToString;

@ToString
public class UserExistsHandler extends Handler{
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String userName, String password) {
        if (!database.isValidUser(userName)){
            System.out.println("Not valid user UserExistsHandler class in handle Method");
            return false;
        }
        System.out.println("User Exists Handler");
        return handleNext(userName,password);
    }

}
