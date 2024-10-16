
package Restaurante;


public class Total_a_pagar {
    
    static private int precioTotal;
    
    
    public Total_a_pagar (int precioTotal){
        this.precioTotal = precioTotal;
    }
    
    public Total_a_pagar(){
        
    }
    
    public static int getPrecioTotal(){
       return precioTotal;
}
    
    public static void setPrecioTotal(int precioTotal){
        Total_a_pagar.precioTotal = precioTotal;
    }
}

