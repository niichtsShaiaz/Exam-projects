/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JPA2;
import JPA2.*;

/**
 *
 * @author Mathias
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.createBook(1,"Løvernes Konge", "Jonatan", 1000L);
        facade.createEBook(2, "Harrypooter", "Elias", 1000L, "www.piratebay.com",1033L);
        facade.createPaperBook(3, "Nacho cheese master", "Mathias", 6969L, true, 33L);
    }
}
