/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author nhatm
 */


    /**
     * @param args the command line arguments
     */
    public class circle
    {
    public double radius;
    public String color;

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "circle{" + "radius=" + radius + ", color=" + color + '}';
    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
        public double getArea(){
            return radius*radius*Math.PI;
        }
    
    
public class cylinder extends circle{
    public double height; 
    public double getheight(){
        return height;
    }
    public void setheight(int height)
    {
        this.height=height;
    }
    public  double getvolume(int volume)
    {
        return volume;
    }
    public cylinder(double radius, String color,double height) {
        super(radius, color);
        this.height=height;
        }
    public double getvolume()
    {
        return getArea()*height;
    }
    }
    }
    

    

