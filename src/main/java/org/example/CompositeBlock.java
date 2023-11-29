package org.example;



public class CompositeBlock implements Block{

    private String color;
    private String material;



    public CompositeBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }




    @Override
    public String toString() {
        return
                "color   " + color + '\'' +
                        ", material='" + material;
    }


}


