package Restaurante;


public class Menu {
    
    static private String comida = "";
    static private String bebida = "";
    static private int precioComida;
    static private int precioBebida;
    
    public Menu(String comida, String bebida, int precioComida, int precioBebida){
        this.comida = comida;
        this.bebida = bebida;
        this.precioComida = precioComida;
        this.precioBebida = precioBebida;   
    }
    
    public Menu (){
    }
    
    public static String getComida (){
        return comida;
    }
    
    public static void setComida (String  comida) {
        Menu.comida = comida;
    }
    
    public static String getbebida (){
        return bebida;
    }
    
    public static void setbebida (String bebida) {
        Menu.bebida = bebida;
    }
    
    public static int getPrecioComida (){
        return precioComida;
    }
    
    public static void setPrecioComida (int precioComida){
        Menu.precioComida = precioComida;
    }
    
    public static int getPrecioBebida (){
        return precioBebida;
    }
    
    public static void setPrecioBebida (int precioBebida){
        Menu.precioBebida = precioBebida;
    }   

    public void setBebida(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
