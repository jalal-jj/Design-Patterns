package Behavioral.ChainOfResponsibility.SecurityImpl;

public class AuthService {
    private Handler handler;
    public AuthService(Handler handler) {
        this.handler = handler;
    }
    public boolean login(String username, String password) {
        if (handler.handle(username, password)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Database database=new Database();

        UserExistsHandler userExistsHandler=new UserExistsHandler(database);
        ValidPasswordHandler validPasswordHandler=new ValidPasswordHandler(database);
        RoleCheckHandler roleCheckHandler=new RoleCheckHandler();

        userExistsHandler.setNextHandler(validPasswordHandler);
        validPasswordHandler.setNextHandler(roleCheckHandler);

        AuthService authService=new AuthService(userExistsHandler);
        authService.login("admin","admin_pass");
    }

}
