/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

/**
 *
 * @author Acer PC
 */
public class CoffeFactory {

    private static CoffeFactory instance = null;
    Coffe coffe = null;
    private CoffeFactory() {

    }

    public Coffe ProduceCoffe(String Type) {
        if(Type.equals("A")){
            coffe = new CoffeA();
        }
        else if(Type.equals("B")){
            coffe = new CoffeB();
        }
        else if(Type.equals("C")){
            coffe = new CoffeC();
        }

        return coffe;
    }

    public static CoffeFactory getFactory() {
        if (instance== null )
            instance = new CoffeFactory() ;
        return instance;
    }
}
