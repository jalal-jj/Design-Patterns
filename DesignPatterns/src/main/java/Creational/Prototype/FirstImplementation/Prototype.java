package Creational.Prototype.FirstImplementation;


public abstract class Prototype implements Cloneable {

    private int id;
    protected String type;

    abstract String getType();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object cloned=null;
        try{
            cloned=super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println(" Exception handled ");
            e.printStackTrace();
        }
        return cloned;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Suv coupe=new Suv("nm");
        Suv cloned= (Suv) coupe.clone();

        System.out.println(coupe);
        System.out.println(cloned);
    }

}
