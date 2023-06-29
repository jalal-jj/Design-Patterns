package Structural.Bridge;

import lombok.Data;

@Data
public abstract class Pizza {

    protected String sauce;
    public abstract void assemble();

}
