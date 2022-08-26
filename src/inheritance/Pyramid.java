/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rizky Aiman H. Harijanto
 */
public class Pyramid extends Rhombus {
    // Attribut limas
    float tinggiSamping;
    
    // Constructor
    public Pyramid(float tinggiSamping){
        super();
        this.tinggiSamping = tinggiSamping;
    }
    
    // Method
    @Override
    public float area() {
        float luas = (getDiagonal_p() * getDiagonal_q()) / 2;
        return luas;
    }
    
    double surfaceArea() {
        double luasPermukaan = (2 * getSisi() * tinggiSamping) + this.area();
        System.out.println("Luas Permukaan Limas = " +luasPermukaan);
        return luasPermukaan;
    }
}
