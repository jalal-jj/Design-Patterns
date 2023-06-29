package Structural.Proxy.SecondImplementation;

public class DirectorProxy implements SecretInfos {
    private RealDirector realDirector;
    private String userName;
    private String password;

    public DirectorProxy(String userName, String password) {
        this.realDirector = new RealDirector();
        this.userName = userName;
        this.password = password;
    }

    public boolean isDirectorPassValid() {
        boolean valid = false;

        valid = WorkerUtil.isPassValid(userName, password);
        if (valid) {
            Worker worker = WorkerUtil.getWorkerByName(userName);
            valid=worker.isDirector();
        }
        return valid;
    }

    @Override
    public String getSomeSecretInfo() throws IllegalAccessException {
        if (isDirectorPassValid()) {
            return realDirector.getSomeSecretInfo();
        } else throw new IllegalAccessException();

    }
}
