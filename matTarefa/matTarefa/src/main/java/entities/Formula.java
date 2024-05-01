/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Davi Erick Lagares de Oliveira <davierick999@gmail.com>
 * @date 01/05/2024
 * @brief Class Program
 */
public class Formula {

    private Double x1, y1, x2, y2, x3, y3;

    public Formula() {
    }

    public Formula(Double x1, Double y1, Double x2, Double y2, Double x3, Double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }

    public Double getY1() {
        return y1;
    }

    public void setY1(Double y1) {
        this.y1 = y1;
    }

    public Double getX2() {
        return x2;
    }

    public void setX2(Double x2) {
        this.x2 = x2;
    }

    public Double getY2() {
        return y2;
    }

    public void setY2(Double y2) {
        this.y2 = y2;
    }

    public Double getX3() {
        return x3;
    }

    public void setX3(Double x3) {
        this.x3 = x3;
    }

    public Double getY3() {
        return y3;
    }

    public void setY3(Double y3) {
        this.y3 = y3;
    }


    public double calcularDet() {
        double s1 = (x1 * y2) + (x3 * y1) + (x2 * y3);
        double s2 = (x3 * y2) + (x1 * y3) + (x2 * y1);
        return s1 - s2;
    }

    public void verificarDistancia() {

        if (calcularDet() == 0) {
            double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            System.out.println("-----------------");
            System.out.println("A distância entre dois pontos: " + String.format("%.3f", distancia));
        } else {
            System.out.println("-----------------");
            System.out.println("Os pontos não são colineares.");
        }

    }

}