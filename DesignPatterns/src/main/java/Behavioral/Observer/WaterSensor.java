package Behavioral.Observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WaterSensor extends AbstractObservable {
    private double instantHeight;
    private double maxHeight;
    private double minHeight;

    public WaterSensor(double maxHeight, double minHeight) {
        this.maxHeight = maxHeight;
        this.minHeight = minHeight;
    }

    public void checkInstantHeight() {
        if (instantHeight < 35.78 || instantHeight >58.2){
            sendNotification();
        }
    }


}
