package Structural.Adapter;

public class PlugSocket {
    public int giveElectricity(ElectricalAppliances electricalAppliances){
        int volt=electricalAppliances.plugInAndUse();
        System.out.println(" Voltage :"+volt);
        return volt;
    }
}
