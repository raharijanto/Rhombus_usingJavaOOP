/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author Rizky Aiman H. Harijanto
 */
public class mainRhombus {
    public static void main(String[] args) {
        
        // Objek
        Rhombus belahKetupat = new Rhombus();
        belahKetupat.setDiagonal_p(11);
        belahKetupat.setDiagonal_q(9);
        belahKetupat.setSisi(7.106);
        
        //Inheritance
        Prism prismaBelKet = new Prism(10);
        
            // Setter
            prismaBelKet.setDiagonal_p(11);
            prismaBelKet.setDiagonal_q(13);
            prismaBelKet.setSisi(12);
            // Getter
            prismaBelKet.getDiagonal_p();
            prismaBelKet.getDiagonal_q();
            prismaBelKet.getSisi();
        
        Pyramid limasBelKet = new Pyramid(10);
        
            // Setter
            limasBelKet.setDiagonal_p(7);
            limasBelKet.setDiagonal_q(9);
            limasBelKet.setSisi(8);
            // Getter
            limasBelKet.getDiagonal_p();
            limasBelKet.getDiagonal_q();
            limasBelKet.getSisi();
        
        // Method
        belahKetupat.area();
        belahKetupat.perimeter();
        
        prismaBelKet.surfaceArea();
        limasBelKet.surfaceArea();
    }
}
