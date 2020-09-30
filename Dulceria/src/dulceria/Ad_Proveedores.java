
package dulceria;
import java.sql.*;
import Clases.Conexion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Ad_Proveedores extends javax.swing.JFrame {
    
    String user1, nombre_usuarios, Compania;
    int id;
    public static int sesion_usuario;
    
  
    public Ad_Proveedores() {
        initComponents();
        user1 = Login.user;
        
        sesion_usuario = 1;
        setSize(609,449);
        setResizable(false);
         this.setLocationRelativeTo(null);//centrar las ventanas
        setTitle("Agregar Proveedores - Sesion de "+ user1);
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
    
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select id_usuario from usuarios where usuario = '" + user1+ "'");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                  
                    //nombre_usuarios = rs.getString("id_usuario");
                    id= rs.getInt("id_usuario");
                    //jLabel9.setText(id);
                    }
            }catch(Exception e){
                System.err.println("Error de Conexión en la interfaz de Proveedores");
         }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        txtNom = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtComp = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Proveedores");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Correo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teléfono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 70, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Compañia");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adduser_1103.png"))); // NOI18N
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 120, 120));
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 210, 30));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 30));
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 210, 30));
        getContentPane().add(txtComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 210, 30));

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 100, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        new Admin_Proveedores().setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
int validacion=0;

    String  Nombre, Correo, Telefono;
    

Nombre= txtNom.getText().trim();
Correo = txtCorreo.getText().trim();
Telefono = txtTel.getText().trim();
Compania = txtComp.getText().trim();


if(Nombre.equals("")){
    validacion++;
JOptionPane.showMessageDialog(null, "El campo Nombre esta vacio");
    }
if(Correo.equals("")){
  validacion++;
    JOptionPane.showMessageDialog(null, "El campo Correo esta vacio");
    }
if(Telefono.equals("")){
  validacion++;
JOptionPane.showMessageDialog(null, "El campo Télefono esta vacio");
    }
if(Compania.equals("")){
  validacion++;
JOptionPane.showMessageDialog(null, "El campo Compañia esta vacio");
    }

try {
           Connection cn = Conexion.conectar();
        PreparedStatement pat = cn.prepareStatement(
            "select compania from proovedores where compania= '" + Compania+ "'");
             ResultSet rs = pat.executeQuery();
             if(rs.next()){
             txtComp.setBackground(Color.yellow);
             JOptionPane.showMessageDialog(null," El Nombre ingresado pertence a otro Proveedor");
             txtComp.setBackground(Color.WHITE);
             cn.close();
             
             }else{
             
                 if(validacion == 0){
                 
                     try{
                     
                      PreparedStatement pat2 = cn.prepareStatement(
                        "insert into proovedores values(?,?,?,?,?,?)");
                      
                        pat2.setInt(1,0);
                        pat2.setString(2,Nombre);
                        pat2.setString(3,Correo);
                        pat2.setString(4,Telefono);
                        pat2.setString(5,Compania);
                        pat2.setInt(6,id);
                        
                     
//                         
                    pat2.executeUpdate();
                    cn.close();
                    
                    Limpiar();
                   
                    
                    JOptionPane.showMessageDialog(null,"Proveedor almacenado con exito");
                   
                  
                        }catch(SQLException e){
                            
                     System.err.println("Error al registrar Proveedor" + e);
                      JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador ");
                     }
                     
                    }else{
                  JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos ");
                 
                    }
              }
             
            }catch(SQLException e){
        System.err.println("Error al validar Nombre" + e);
          JOptionPane.showMessageDialog(null," ERROR al comparar Proveedor, contacte al administrador ");
            }

       
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(Ad_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

  public void Limpiar(){
    
                    
                    txtNom.setText("");
                    txtCorreo.setText("");
                    txtTel.setText("");
                    txtComp.setText("");
    
        }



}