/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rizky Aiman H. Harijanto
 */
public class Rhombus implements objectInterface {
    // Attribut pada belah ketupat
    private float diagonal_p;
    private float diagonal_q;
    private double sisi;

    // Encapsulation
    public float getDiagonal_p() {
        return diagonal_p;
    }

    public void setDiagonal_p(float diagonal_p) {
        this.diagonal_p = diagonal_p;
    }

    public float getDiagonal_q() {
        return diagonal_q;
    }

    public void setDiagonal_q(float diagonal_q) {
        this.diagonal_q = diagonal_q;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    // Constructor
    public Rhombus() {
        System.out.println("Belah Ketupat");
    }
    
    // Method
    @Override
    public float area() {
        float luas = (diagonal_p * diagonal_q) / 2;
        System.out.println("Luas Belah Ketupat = " +luas);
        return luas;
    }
    @Override
     public double perimeter() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Belah Ketupat = " +keliling);
        return keliling;
    }
}
