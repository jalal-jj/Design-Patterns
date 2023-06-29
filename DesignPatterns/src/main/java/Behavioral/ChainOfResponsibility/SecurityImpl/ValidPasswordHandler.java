package Behavioral.ChainOfResponsibility.SecurityImpl;

import lombok.ToString;

@ToString
public class ValidPasswordHandler extends Handler{
    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String userName, String password) {
        if (!database.isPasswordValid(userName,password)){
            System.out.println("Wrong password");
            return false;
        }
        System.out.println("Valid Password");
        return handleNext(userName,password);
    }

}
