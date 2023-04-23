/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author Gui
 */
public class Cachorro extends Animal {
    private String raça;
    

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }
    
    @Override
public String toString() {
    return "Cachorro [nome=" + getNome() + ", Peso=" + getPeso() + ", Raça=" + raça + "]";
}
    
    
}
