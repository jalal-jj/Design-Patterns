package Behavioral.Observer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DamReservoirWorker implements IObserver {
    private String workerName;

    public DamReservoirWorker(String workerName) {
        this.workerName = workerName;
    }
    @Override
    public void getNotification(AbstractObservable observable) {
        WaterSensor sensor = (WaterSensor) observable;
        System.out.println("The Water instant height for now is : "+  sensor.getInstantHeight());
    }
}
