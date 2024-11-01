/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

/**
 *
 * @author Diego Giron
 */
public class BMICalculator {
    public double calculator(int Feet, int Inches, int Pounds){
        int feet_converter_inches = Feet * 12;
        int total_height = Inches + feet_converter_inches;
        double bmi = (Pounds * 703)/(total_height*(double)total_height);
        return bmi;
    }
    
}
