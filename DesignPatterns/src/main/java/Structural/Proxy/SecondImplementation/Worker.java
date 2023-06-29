package Structural.Proxy.SecondImplementation;

import lombok.Data;

@Data
public class Worker {
    private String userName;
    private String password;
    private boolean isDirector;

    public Worker(String userName, String password, boolean isDirector) {
        this.userName = userName;
        this.password = password;
        this.isDirector = isDirector;
    }
}
