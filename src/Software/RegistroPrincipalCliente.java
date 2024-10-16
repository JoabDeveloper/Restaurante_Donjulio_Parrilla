
package Software;

import Restaurante.Menu;
import Restaurante.Procedimiento;
import Restaurante.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class RegistroPrincipalCliente extends javax.swing.JFrame {
    private String ruta_txt = "Registro de clientes.txt";
    
    Cliente nuevoCliente = new Cliente();
    Procedimiento nuevoProcedimiento = new Procedimiento();
    
    public RegistroPrincipalCliente(){
        initComponents();
        this.setSize(591, 580);
        this.setResizable(false);
        setTitle("Restaurante Don Julio Parrilla");
        

    try{
         cargar_txt();
         listarRegistro();
    }catch(Exception ex){
     mensaje ("no existe el archivo txt");
    }
}
    
    public void cargar_txt(){
        File ruta = new File(ruta_txt);
        
        try{
            FileReader fi = new FileReader(ruta);
            try (BufferedReader bu = new BufferedReader(fi)){
            String linea = null;
            while ((linea = bu.readLine()) !=null){
                StringTokenizer st = new StringTokenizer(linea, ",");
                nuevoCliente = new Cliente ();
                nuevoCliente.setId(Integer.parseInt(st.nextToken()));
                nuevoCliente.setNombre(st.nextToken());
                nuevoProcedimiento.agregarRegistro(nuevoCliente);
            }
        }
            
        }catch(Exception ex){
            mensaje("Error al cargar archivo :"+ex.getMessage());
            System.out.println(ex.getMessage());
        }
        
    }
    
    public void grabar_txt(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(ruta_txt);
            pw = new PrintWriter(fw);
            
            for(int i = 0; i < nuevoProcedimiento.cantidadRegistro(); i++){
                nuevoCliente = nuevoProcedimiento.obtenerRegistro(i);
                pw.println(String.valueOf(nuevoCliente.getId()+", "+nuevoCliente.getNombre()));
            }
            pw.close();
            
        }catch(Exception ex){
            mensaje("Error al grabar el archivo :"+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    public void ingresarRegistro (File ruta){
        try{
            if(leerCodigo() == -666)mensaje("Ingresar codigo en numero enteros por favor");
            else if(leerNombre() == null)mensaje("Ingresar Nombre");
            else{
                nuevoCliente = new Cliente(leerCodigo(),leerNombre());
                jTextField7.setText("Cliente resgistrado exitosamente");
                
                String varNombre = nuevoCliente.getNombre();
                int varIdentificacion = nuevoCliente.getId();
                
                jTextArea1.setText("Usuario "+varNombre+"."
                +"\nEstamos muy contentos de atenderlo(a) en el dia de hoy"
                +"\n"
                +"\nNumero de identificacion del cliente ingresada :"+varIdentificacion);
                
                if(nuevoProcedimiento.buscaCodigo(nuevoCliente.getId())!= -1)mensaje("Este codigo ya se encuentra registrado");
                else nuevoProcedimiento.agregarRegistro(nuevoCliente);
                
                grabar_txt();
                listarRegistro();
                
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
    public void eliminarRegistro(){
        try{
            if(leerCodigo() == -666)mensaje("Ingrese codigo en numero enteros");
            else{
                int codigo = nuevoProcedimiento.buscaCodigo(leerCodigo());
                if(codigo == -1)mensaje("codigo no existe");
                
                else{
                    int s = JOptionPane.showConfirmDialog(null, "Esta seguro de eliminar este producto", "Si/No", 0);
                    if(s == 0){
                        nuevoProcedimiento.eliminarRegistro(codigo);
                        
                        grabar_txt();
                        listarRegistro();
                    }
                }
            }
        }catch(Exception ex){
            mensaje(ex.getMessage());
        }
    }
    
    public void listarRegistro(){
        DefaultTableModel dt = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int colum){
                return false;
            }
        };
        
        dt.addColumn("Codigo");
        dt.addColumn("Nombre");
        
        Object fila[] = new Object[dt.getColumnCount()];
        for(int i = 0; i < nuevoProcedimiento.cantidadRegistro(); i++){
            nuevoCliente = nuevoProcedimiento.obtenerRegistro(i);
            fila[0]=nuevoCliente.getId();
            fila[1]=nuevoCliente.getNombre();
            dt.addRow(fila);
        }
    }
    
    public int leerCodigo(){
        try{
            int codigo = Integer.parseInt(txtIdentificacion.getText().trim());
            return codigo;
        }catch(Exception ex){
            return -666;
        }
    
}
    
    public String leerNombre(){
        try{
            String nombre = txtNombre.getText().trim().replace(" ", "_");
            return nombre;
        }catch(Exception ex){
            return null;
        }
    }
    
    public void mensaje(String texto){
        JOptionPane.showMessageDialog(null, texto);
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents(){
        panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Bienvenido = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        BotonSeguir = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de Datos con Bloc de Notas .txt");
        getContentPane().setLayout(null);

        panel.setBackground(new java.awt.Color(204, 204, 255));
        panel.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

            
        });
        panel.add(jButton2);
        jButton2.setBounds(320, 290, 85, 25);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }

           
        });
        panel.add(jButton3);
        jButton3.setBounds(220, 290, 79, 25);

        Bienvenido.setFont(new java.awt.Font("Trebuchet MS", 1, 32)); // NOI18N
        Bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        Bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenido.setText("Restaurante Don Julio Parrilla ");
        Bienvenido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel.add(Bienvenido);
        Bienvenido.setBounds(-10, 50, 720, 44);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        panel.add(jTextArea1);
        jTextArea1.setBounds(160, 340, 310, 94);

        BotonSeguir.setBackground(new java.awt.Color(204, 255, 204));
        BotonSeguir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BotonSeguir.setText("Seguir");
        BotonSeguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSeguirActionPerformed(evt);
            }

            
        });
        panel.add(BotonSeguir);
        BotonSeguir.setBounds(430, 290, 100, 25);

        MenuPrincipal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        MenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MenuPrincipal.setText("Registro del Cliente");
        panel.add(MenuPrincipal);
        MenuPrincipal.setBounds(200, 120, 237, 33);

        jTextField7.setEditable(false);
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }

            
        });
        panel.add(jTextField7);
        jTextField7.setBounds(140, 450, 343, 30);

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Almacenar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            
        });
        panel.add(jButton1);
        jButton1.setBounds(80, 290, 110, 25);

        txtNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        panel.add(txtNombre);
        txtNombre.setBounds(210, 210, 227, 25);

        txtIdentificacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }

            
        });
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }

            
        });
        panel.add(txtIdentificacion);
        txtIdentificacion.setBounds(210, 170, 230, 25);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id");
        panel.add(jLabel1);
        jLabel1.setBounds(100, 180, 98, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Completo:");
        panel.add(jLabel2);
        jLabel2.setBounds(70, 210, 140, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        panel.add(jLabel6);
        jLabel6.setBounds(0, 0, 590, 560);

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        panel.add(txtRuta);
        txtRuta.setBounds(450, 310, 70, 25);
        panel.add(jScrollPane1);
        jScrollPane1.setBounds(130, 330, 300, 100);

        getContentPane().add(panel);
        panel.setBounds(0, 0, 590, 560);

        pack();
        setLocationRelativeTo(null);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        File ruta = new File(txtRuta.getText());
        this.ingresarRegistro(ruta);
    }
    
    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt){
        
    }
    
    private void BotonSeguirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //Condicionales para tomar los datos
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }

        if(txtIdentificacion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el número de identificación");
            return;
        }

        ListaMenu vistaCar = new ListaMenu(this,true);
        vistaCar.setVisible(true);
        dispose();
    }                                           

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         if(txtNombre.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }

        if(txtIdentificacion.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Por favor ingrese el número de identificación");
            return;
        }
        
        File ruta = new File(txtRuta.getText());
        this.modificarRegistro(ruta);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
         if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre");
            return;
        }

        if(txtIdentificacion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor ingrese el número de identificación");
            return;
        }
        
        this.eliminarRegistro();
    }                                        

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {                                           
        if  (txtIdentificacion.getText().length()   >=10){ 
           evt.consume();
        }       // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPrincipalCliente().setVisible(true);
            }
        });
    }
    
    

    private javax.swing.JLabel Bienvenido;
    private javax.swing.JButton BotonSeguir;
    private javax.swing.JLabel MenuPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRuta;

    

    private void modificarRegistro(File ruta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
