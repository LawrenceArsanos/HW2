/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beersong;

/**
 *
 * @author Lawrence
 */
public class BeerSong {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_of_Beer() {
    int count = 99;
        while (count > 2) {
        System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer");
        count--;
        System.out.println("take one down, pass it around, " + count + " bottles of beer on the wall.");
    }   
        System.out.println("2 bottles of beer on the wall, 2 bottles of beer");
        System.out.println("take one down, pass it around, 1 bottle of beer on the wall.");
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
        System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
            
        
}
}
