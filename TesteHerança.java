/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Herança;

/**
 *
 * @author Gui
 */
public class TesteHerança {

    public static void main(String args[]) {
      
        Peixe peixe = new Peixe();
        Cachorro cachorro = new Cachorro();
       
        
        
        peixe.setNome("Piranha");
        peixe.setPeso(1.0);
        peixe.setTipoHabitat("Agua Doce");
        
        cachorro.setNome("Rex");
        cachorro.setPeso(25.0);
        cachorro.setRaça("Labrador");
       
 
        
        System.out.println(peixe.toString());
        System.out.println(cachorro.toString());
        
        
        
        
    }
}
