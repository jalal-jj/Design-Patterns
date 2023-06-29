package Structural.Adapter;

import lombok.Data;

@Data
public class TelephoneAdapter implements ElectricalAppliances{

    private Telephone telephone;

    public TelephoneAdapter(Telephone telephone) {
        this.telephone = telephone;
    }

    @Override
    public int plugInAndUse() {
        return telephone.chargeIt();
    }
}
