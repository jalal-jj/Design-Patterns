package Behavioral.ChainOfResponsibility.SecurityImpl;

import lombok.ToString;

@ToString
public class RoleCheckHandler extends Handler{

    public RoleCheckHandler() {
    }

    @Override
    public boolean handle(String userName, String password) {
        if ("admin".equals(userName)){
            System.out.println("RoleCheckHandler ");
            System.out.println("Loading Admin Page ");
            return true;
        }
        System.out.println("Loading Default Page ");
        return handleNext(userName,password);
    }
}
