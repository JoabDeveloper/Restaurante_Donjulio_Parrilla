package Software;

import Restaurante.Menu;
import Restaurante.Cliente;
import Restaurante.Total_a_pagar;
import static java.lang.Thread.sleep;
import javax.swing.JOptionPane;

final public class ListaMenu extends javax.swing.JFrame {
  
  Menu nCarta = new Menu();
  Total_a_pagar toPagar = new Total_a_pagar(); 
  String varComida;
  String varBebida;
  int varPrecioComida;
  int varPrecioBebida;
  int varPrecioTotal;
  
   public ListaMenu(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setSize(430,470);
        this.setResizable(false);          
    }

    private ListaMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jComboBoxComidas = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxBebidas = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtrMensaje = new javax.swing.JTextPane();
        BotonFactura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jComboBoxComidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escoger", "Panceta", "Res", "Lomo", "Pechuga", "Costilla BBQ", "Sopa de pasta", "Bondiola", "Picada Familiar" }));
        jComboBoxComidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxComidas.setName(""); // NOI18N
        jComboBoxComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxComidasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxComidas);
        jComboBoxComidas.setBounds(140, 150, 181, 33);

        jLabel1.setFont(new java.awt.Font("Blackadder ITC", 0, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Carta");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 199, 78);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Comidas");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deliciosos Platos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 90, 140, 54);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaca.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(330, 200, 80, 100);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Bebidas");
        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saborea lo mejor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 210, 140, 54);

        jComboBoxBebidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Escoger", "Coca Cola 1.5L", "Cola sol 2L", "Cerveza aguila"}));
        jComboBoxBebidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBebidasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBebidas);
        jComboBoxBebidas.setBounds(140, 270, 181, 33);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 110, 140, 120);

        btnAceptar.setBackground(new java.awt.Color(204, 204, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(180, 320, 111, 20);

        jScrollPane1.setBackground(new java.awt.Color(255, 0, 51));

        jtrMensaje.setEditable(false);
        jtrMensaje.setBackground(new java.awt.Color(240, 240, 240));
        jtrMensaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240), 0));
        jtrMensaje.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jScrollPane1.setViewportView(jtrMensaje);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(90, 350, 288, 40);

        BotonFactura.setBackground(new java.awt.Color(153, 153, 153));
        BotonFactura.setText("Ver Factura");
        BotonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(BotonFactura);
        BotonFactura.setBounds(180, 410, 107, 20);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1001, 216, 0, 0);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 728, 455);

        pack();
    }// </editor-fold>                        

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
      //Condición if para comprobar que se haya escogido algún tipo de comida de la carta
      if(jComboBoxComidas.getSelectedItem().equals("Escoger")) if(jComboBoxBebidas.getSelectedItem().equals("-Seleccionar-")){
        
      JOptionPane.showMessageDialog(null, "Por favor escoga algo de nuestros mangares");
      return;
      }  
        
      Menu.setComida((String) jComboBoxComidas.getSelectedItem()); //Se envía la selección del menú como atributo comida a la clase Carta
      Menu.setbebida((String) jComboBoxBebidas.getSelectedItem()); //Se envía la selección del menú como atributo bebida a la clase Carta
      
      varComida = (String) jComboBoxComidas.getSelectedItem(); //Se captura en una variable la selección de comidas
      varBebida = (String) jComboBoxBebidas.getSelectedItem(); //Se captura en una variable la selección de bebidas
      
    if(null == varComida) {} else switch (varComida) {
          case "Escoger":
              Menu.setPrecioComida(0); // Declaraciones
              varPrecioComida=0;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Panceta":
              Menu.setPrecioComida(15000);// Declaraciones
              varPrecioComida=15000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Res":
              Menu.setPrecioComida(15000);// Declaraciones
              varPrecioComida=15000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Lomo":
              Menu.setPrecioComida(15000);// Declaraciones
              varPrecioComida=15000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Pechuga":
              Menu.setPrecioComida(15000);// Declaraciones
              varPrecioComida=15000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Costilla BBQ":
              Menu.setPrecioComida(15000);// Declaraciones
              varPrecioComida=15000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Sopa de pasta":
              Menu.setPrecioComida(8000);// Declaraciones
              varPrecioComida=8000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Bondiola":
              Menu.setPrecioComida(15000);// Declaraciones
              varPrecioComida=15000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          case "Picada Familiar":
              Menu.setPrecioComida(50000);// Declaraciones
              varPrecioComida=50000;
              System.out.print("Comida: "+Menu.getPrecioComida());
              break;
          default:
              break;
      }
   
        
        if(null == varBebida) {} else switch(varBebida) {
        
               case "Escoga" :
                   Menu.setPrecioBebida(0); // Declaraciones
                   varPrecioBebida=0;
                   System.out.print("\n"+ "Bebida : "+Menu.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   Total_a_pagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+Total_a_pagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Coca Cola 1.5L" :
                   Menu.setPrecioBebida(8000);// Declaraciones
                   varPrecioBebida=8000;
                   System.out.print("\n"+ "Bebida: "+Menu.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   Total_a_pagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+Total_a_pagar.getPrecioTotal());
                   break; // break es opcional
                   
               case "Cola sol 2L" :
                   Menu.setPrecioBebida(7000);// Declaraciones
                   varPrecioBebida=7000;
                   System.out.print("\n"+ "Bebida: "+Menu.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   Total_a_pagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+Total_a_pagar.getPrecioTotal());
                   break;// break es opcional
                   
                case "Cerveza aguila" :
                   Menu.setPrecioBebida(4500);// Declaraciones
                   varPrecioBebida=4500;
                   System.out.print("\n"+ "Bebida: "+Menu.getPrecioBebida());
                   varPrecioTotal = varPrecioComida + varPrecioBebida;
                   Total_a_pagar.setPrecioTotal(varPrecioTotal);
                   System.out.print("\n"+ "Total a Pagar: "+Total_a_pagar.getPrecioTotal());
                   break; 
                   
               
           }
      
     
      jtrMensaje.setText("Que disfrute de nuestros serivicios");
    }                                          

    private void jComboBoxComidasActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void jComboBoxBebidasActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void BotonFacturaActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
        //Instrucciones al botón para ir a la siguiente vista
        FacturaTotalAPagar vistaPagar = new FacturaTotalAPagar(this,true);
        vistaPagar.setVisible(true);
        dispose();
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run(){
          new ListaMenu(new java.awt.Frame(), true).setVisible(true);
        }
    });
}

    // Variables declaration - do not modify                     
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> jComboBoxBebidas;
    private javax.swing.JComboBox<String> jComboBoxComidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jtrMensaje;
    // End of variables declaration                   

}
