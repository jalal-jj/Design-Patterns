package Structural.Proxy.SecondImplementation;

public class RealDirector implements SecretInfos{
    @Override
    public String getSomeSecretInfo() throws IllegalAccessException {
        return "There is some secret infos";
    }
}
