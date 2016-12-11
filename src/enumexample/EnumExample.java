/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumexample;

/**
 *
 * @author Daniel
 */
public class EnumExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testColor();
       // testDaltonEnum();
    }

    public static void testDaltonEnum() {
        Dalton enemy = Dalton.AVERELL;
        if (enemy == Dalton.AVERELL) {
        }

        switch (enemy) {       //glöm ej break;
            case AVERELL: //do something
            case JACK: //do something
            case WILLIAM: //do something
            case JOE: //do something
        }
        for (Dalton dalton : Dalton.values()) {
            System.out.println(dalton);
        }
    }
    
    public static void testColor() {
        Color green1 = Color.LAWNGREEN;
        
        System.out.println(green1.colorCode());
        
        System.out.println("Value of green color: "+green1.getGreen());
    }

}
