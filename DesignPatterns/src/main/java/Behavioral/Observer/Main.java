package Behavioral.Observer;

public class Main {
    public static void main(String[] args) {
            WaterSensor sensor=new WaterSensor(Double.valueOf(31.2),Double.valueOf(64.5));
            DamReservoirWorker worker=new DamReservoirWorker("WorkerName");
            sensor.addObserver(worker);

            sensor.setInstantHeight(59);
            sensor.checkInstantHeight();
    }
}
