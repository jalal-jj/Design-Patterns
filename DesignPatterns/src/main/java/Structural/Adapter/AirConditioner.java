package Structural.Adapter;

import lombok.Data;

@Data
public class AirConditioner implements ElectricalAppliances{
    private int volt;

    public AirConditioner() {
        this.volt = 220;
    }
    @Override
    public int plugInAndUse() {
        return volt;
    }
}
