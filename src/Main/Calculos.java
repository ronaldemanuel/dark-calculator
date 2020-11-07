package Main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanu
 */
public class Calculos {
    private final double num1, num2;
    
    public Calculos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double soma() {
        return num1 + num2;
    }
    
    public double subtracao() {
        return num1 - num2;
    }
    
    public double mult() {
        return num1 * num2;
    }
    
    public double div() {
        return num1 / num2;
    }
    
    public double pot() {
        double res = Math.pow(num1, num2);
        return res;
    }
}
