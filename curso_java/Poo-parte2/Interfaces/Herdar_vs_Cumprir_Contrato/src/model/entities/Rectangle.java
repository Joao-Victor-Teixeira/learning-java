package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape {
    
    private Double width;
    private Double heigth;
    
    public Rectangle(Color color, Double width, Double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return width * heigth;
    }   
}
