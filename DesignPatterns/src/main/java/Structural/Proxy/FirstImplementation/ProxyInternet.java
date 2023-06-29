package Structural.Proxy.FirstImplementation;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private static final List<String> bannedSites;
    private final Internet internet = new RealInternet();
    static{
        bannedSites=new ArrayList<>();
        bannedSites.add("bannedsite.com");
    }
    @Override
    public void connectTo(String host) {
        if (bannedSites.contains(host)){
            System.out.println("Access denied");
            return;
        }
        internet.connectTo(host);
    }
}
