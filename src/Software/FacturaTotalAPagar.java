
package Software;

import Restaurante.Cliente;
import Restaurante.Total_a_pagar;
import Restaurante.Menu;
import java.awt.event.ActionEvent;


public class FacturaTotalAPagar extends javax.swing.JFrame {
    
    Cliente nuevoCliente = new Cliente();
    String varNombre;
    int varIdentificacion;
    
    public FacturaTotalAPagar(java.awt.Frame parent, boolean modal){
        initComponents();
        this.setSize(542, 430);
        this.setResizable(false);
       
    }
    
    private FacturaTotalAPagar(){
        initComponents();
    }
    
    
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        MenuPrincipal = new javax.swing.JLabel();
        jTextTotales = new javax.swing.JTextField();
        jTextValComida = new javax.swing.JTextField();
        btnImprFact = new javax.swing.JButton();
        Registrar1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGenerarFactura = new javax.swing.JButton();
        jTextValTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextValBebida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MenuPrincipal.setFont(new java.awt.Font("Poppins", 0, 60)); // NOI18N
        MenuPrincipal.setForeground(new java.awt.Color(255, 153, 51));
        MenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuPrincipal.setText("Factura");
        getContentPane().add(MenuPrincipal);
        MenuPrincipal.setBounds(150, 25, 240, 80);

        jTextTotales.setEditable(false);
        jTextTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTotalesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextTotales);
        jTextTotales.setBounds(130, 280, 280, 38);

        jTextValComida.setBackground(new java.awt.Color(240, 240, 240));
        jTextValComida.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1)));
        jTextValComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValComidaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValComida);
        jTextValComida.setBounds(50, 190, 120, 20);

        btnImprFact.setText("Imprimir Factura");
        btnImprFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprFactActionPerformed(evt);
            }
        });
        
        getContentPane().add(btnImprFact);
        btnImprFact.setBounds(200, 250, 130, 23);
      
        

        btnSalir.setBackground(new java.awt.Color(255, 102, 102));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(235, 370, 60, 23);

        btnGenerarFactura.setBackground(new java.awt.Color(153, 255, 153));
        btnGenerarFactura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGenerarFactura.setText("GENERAR");
        btnGenerarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarFacturaActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarFactura);
        btnGenerarFactura.setBounds(210, 140, 110, 23);

        jTextValTotal.setBackground(new java.awt.Color(240, 240, 240));
        jTextValTotal.setBorder(null);
        jTextValTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValPagarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextValTotal);
        jTextValTotal.setBounds(360, 190, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Total a Pagar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 170, 80, 20);
        
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Valor de Comida");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 170, 100, 20);

        jTextValBebida.setBackground(new java.awt.Color(240, 240, 240));
        jTextValBebida.setBorder(null);
        jTextValBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValBebidaaActionPerformed(evt);
            }

            private void jTextValBebidaaActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        getContentPane().add(jTextValBebida);
        jTextValBebida.setBounds(200, 190, 130, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Valor de Bebida");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 170, 100, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gracias por escogernos! Estamos para servirle. ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(125, 320, 390, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 410);

        pack();
    }                       

    private void jTextTotalesActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void jTextValComidaActionPerformed(java.awt.event.ActionEvent evt) {                                               
        
    }                                              

    private void Registrar1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
            
    RegistroPrincipalCliente ventana = new RegistroPrincipalCliente();
    ventana.setVisible(false);
}
    private void jTextBebidaActionPerformed(java.awt.event.ActionEvent evt){
    
}
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt){
        System.exit(0);
    }
    
    private void btnImprFactActionPerformed(java.awt.event.ActionEvent evt){
        
        jTextTotales.setText("Imprimiendo factura....");
        jTextTotales.setText("Factura impresa correctamente");
        
    }
    
    private void jTextValPagarActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    private void btnGenerarFacturaActionPerformed(java.awt.event.ActionEvent evt){
        String texto = "$ " + Menu.getPrecioComida();
        String texto2 = "$ " + Menu.getPrecioBebida();
        String texto3 = "$ " + Total_a_pagar.getPrecioTotal();
        
        
        jTextValComida.setText(texto);
        jTextValBebida.setText(texto2);
        jTextValTotal.setText(texto3);
}

    public static void main(String args []){
        


    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FacturaTotalAPagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel MenuPrincipal;
    private javax.swing.JButton Registrar1;
    private javax.swing.JButton btnGenerarFactura;
    private javax.swing.JButton btnImprFact;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextTotales;
    private javax.swing.JTextField jTextValBebida;
    private javax.swing.JTextField jTextValComida;
    private javax.swing.JTextField jTextValTotal;
}