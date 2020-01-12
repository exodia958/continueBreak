/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuebreak;

/**
 *
 * @author Moch Lutfi
 */
public class Continuebreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<7; i++){
            if(i == 5){
                break;
            }else{
            System.out.println(i);
            }
        }
    }
    
}
