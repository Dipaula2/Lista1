/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

/**
 *
 * @author Gui
 */
public class Peixe extends Animal {
    private String tipoHabitat;
    

    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
     
    @Override
public String toString() {
    return "Peixe [nome=" + getNome() + ", Peso=" + getPeso() + ", Tipo Habitat=" + tipoHabitat + "]";
}
    
    
}
