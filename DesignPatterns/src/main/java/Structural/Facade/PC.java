package Structural.Facade;

public class PC {

    private Ram ram;
    private Cpu cpu;
    private Harddrive harddrive;
    private Display display;

    public PC() {
        this.ram = new Ram();
        this.cpu = new Cpu();
        this.harddrive = new Harddrive();
        this.display = new Display();
    }

    public void start(){
        if ( cpu.start() && harddrive.start()){
            boolean kernel=ram.kernelLoad();
            while (!kernel){
                ram.fixIt();
                kernel=ram.kernelLoad();
            }
            boolean osLoaded=ram.loadOS();
            while (!osLoaded){
                ram.fixIt();
                osLoaded=ram.loadOS();
            }
            ram.loadDrivers();
            ram.startServices();
            display.start();
            System.out.println("Computer started");
        }
    }


}
