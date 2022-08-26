/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rizky Aiman H. Harijanto
 */
public class Prism extends Rhombus{
    // Attribut prisma
    float tinggi;
    
    // Constructor
    public Prism (float tinggi){
        super();
        this.tinggi = tinggi;
    }
    
    // Method
    @Override
    public float area() {
        float luas = (getDiagonal_p() * getDiagonal_q()) / 2;
        return luas;
    }
    double surfaceArea() {
        double luasPermukaan = (getSisi() * tinggi) + (2 * this.area());
        System.out.println("Luas Permukaan Prisma = "+luasPermukaan);
        return luasPermukaan;
    }
}
