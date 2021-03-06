
package dulceria;
import java.sql.*;
import Clases.Conexion;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Admin_Editar extends javax.swing.JFrame {
String user;
int ID;
   
    public Admin_Editar() {
        initComponents();
             
        setSize(586,511);
        setResizable(false);
        this.setLocationRelativeTo(null);//centrar las ventanas
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
        user = Login.user;
        setTitle("Modificar Empleados - Sesion de "+ user);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNom = new javax.swing.JTextField();
        txtApe = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jcbP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcbSex = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelate = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNom1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnBus = new javax.swing.JButton();
        btnEx = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNom.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 230, 30));

        txtApe.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 230, 30));

        txtEdad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 230, 30));

        txtTel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 230, 30));

        txtCorreo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, 30));

        txtPass.setEditable(false);
        txtPass.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 230, 30));

        jcbP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Jefe" }));
        getContentPane().add(jcbP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 230, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Télefono");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puesto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jcbSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        getContentPane().add(jcbSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 60, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sexo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_theinformation_788.png"))); // NOI18N
        btnEdit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 120, 120));

        btnDelate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_eliminate_1102.png"))); // NOI18N
        btnDelate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelateActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 120, 120));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Modificar Empleados");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Modificar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Eliminar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        txtNom1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 230, 30));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Empleado");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        btnBus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBus.setText("Buscar");
        btnBus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        getContentPane().add(btnBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 100, 30));

        btnEx.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEx.setText("Salir");
        btnEx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExActionPerformed(evt);
            }
        });
        getContentPane().add(btnEx, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 100, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoAdmin.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 586, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExActionPerformed
       dispose();
        new Admin_Empleados().setVisible(true);
    }//GEN-LAST:event_btnExActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       int puesto_cmb, sexo , validacion =0;
       String edad ,nombre, apellidos, telefono,correo , contrasena, permisos_string ="", permisos="";
       
       
       correo = txtCorreo.getText().trim();
        contrasena = txtPass.getText().trim();
        nombre = txtNom.getText().trim();
        apellidos = txtApe.getText().trim();
        telefono = txtTel.getText().trim();
        puesto_cmb = jcbP.getSelectedIndex()+1;
        sexo = jcbSex.getSelectedIndex()+1;
        edad = txtEdad.getText();
 
        
        
        if(correo.equals("")){
        
            txtCorreo.setBackground(Color.WHITE);
            validacion++;
            JOptionPane.showMessageDialog(null, "El campo Usuario esta vacio");
        }if(contrasena.equals("")){
        
            txtPass.setBackground(Color.WHITE);
            validacion++;
        }
        if(nombre.equals("")){
        
            txtNom.setBackground(Color.WHITE);
            validacion++;
        }
        if(apellidos.equals("")){
        
            txtApe.setBackground(Color.WHITE);
            validacion++;
        }if(telefono.equals("")){
        
            txtTel.setBackground(Color.WHITE);
            validacion++;
        }if(edad.equals("")){
        
            txtEdad.setBackground(Color.WHITE);
            validacion++;
        }
        if(validacion==0){
        
      if(puesto_cmb == 1){
        permisos_string ="Empleado";
        
        
        }else if(puesto_cmb == 2){
        permisos_string ="Jefe";
        
        }
        if(sexo == 1){
        permisos ="F";
        
        }else if(sexo == 2){
        permisos ="M";
        
        }
        
        try{
        Connection cn = Conexion.conectar();
        
        PreparedStatement pat = cn.prepareStatement(
            "select usuario from usuarios where usuario = '" + correo + "' and not id_usuario = '"+ ID
             + "'");
             ResultSet rs = pat.executeQuery();
            
             if(rs.next()){
             JOptionPane.showMessageDialog(null,"El nombre de usuario no esta disponible");
             cn.close();
                
             }else{
             
           Connection cn2 = Conexion.conectar();
           PreparedStatement pat2 = cn2.prepareStatement(
           "update usuarios set nombre=?, apellidos=?, edad=?, sexo=?, telefono=?, puesto=?, usuario=?, password=?"
                   + " where id_usuario = '"+ ID +"'");
          
            pat2.setString(1,nombre);
            pat2.setString(2,apellidos );
            pat2.setString(3,edad );
            pat2.setString(4,permisos);
            pat2.setString(5,telefono );
            pat2.setString(6,permisos_string);
            pat2.setString(7,correo );
            pat2.setString(8,contrasena );
           
            pat2.executeUpdate();
            cn2.close();
            
            JOptionPane.showMessageDialog(null," Se ha modificado exitosamente ");
            Limpiar();
            btnBus.setEnabled(true);
            txtNom1.setEditable(true);
             }
            
            }catch(SQLException e){
        
        System.err.println("Error al actualizar Empleado" + e);
        }
        
        }else{
        
        JOptionPane.showMessageDialog(null," Debes de llenar todos los campos ");
        }
        
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelateActionPerformed
        
       int puesto_cmb, sexo , validacion =0;
        
        String usuario = "", edad ,nombre1, apellidos, telefono,correo , contrasena, permisos_string ="", permisos="";
        usuario = txtNom1.getText();
        
        correo = txtCorreo.getText().trim();
        contrasena = txtPass.getText().trim();
        nombre1 = txtNom.getText().trim();
        apellidos = txtApe.getText().trim();
        telefono = txtTel.getText().trim();
        puesto_cmb = jcbP.getSelectedIndex()+1;
        sexo = jcbSex.getSelectedIndex()+1;
        edad = txtEdad.getText();


       if(correo.equals("")){
        
            txtCorreo.setBackground(Color.WHITE);
            validacion++;
          
        }if(contrasena.equals("")){
        
            txtPass.setBackground(Color.WHITE);
            validacion++;
        }
        if(nombre1.equals("")){
        
            txtNom.setBackground(Color.WHITE);
            validacion++;
        }
        if(apellidos.equals("")){
        
            txtApe.setBackground(Color.WHITE);
            validacion++;
        }if(telefono.equals("")){
        
            txtTel.setBackground(Color.WHITE);
            validacion++;
        }if(edad.equals("")){
        
            txtEdad.setBackground(Color.WHITE);
            validacion++; }
//        }if(puesto_cmb == 1){
//        permisos_string ="Empleado";
//        
//        
//        }else if(puesto_cmb == 2){
//        permisos_string ="Jefe";
//        
//        }
//        if(sexo == 1){
//        permisos ="F";
//        
//        }else if(sexo == 2){
//        permisos ="M";
//        
//        }
        //ResultSet rs = pat.executeQuery();
        if(validacion== 0){
            txtCorreo.setEditable(false);
            //txtPass.setEditable(false);
            txtEdad.setEditable(false);
            txtNom.setEditable(false);
            txtApe.setEditable(false);
            txtTel.setEditable(false);
            jcbP.setEditable(false);
            jcbSex.setEditable(false);
            btnEdit.setEnabled(false);
            btnBus.setEnabled(false);
            txtNom1.setEditable(false);
    try{
        Connection cn = Conexion.conectar();
        
        PreparedStatement pat = cn.prepareStatement(
            "delete from usuarios where nombre = '" + usuario+ "'");  
         
  
        pat.executeUpdate();
          cn.close();
          
            
            JOptionPane.showMessageDialog(null," Se ha eliminado exitosamente ");
            Limpiar();
             txtCorreo.setEditable(true);
            //txtPass.setEditable(true);
            txtEdad.setEditable(true);
            txtNom.setEditable(true);
            txtApe.setEditable(true);
            txtTel.setEditable(true);
            jcbP.setEditable(true);
            jcbSex.setEditable(true);
            btnEdit.setEnabled(true);
            btnBus.setEnabled(true);
            txtNom1.setEditable(true);
        
    }catch(SQLException e){
         
        System.err.println("Error al eliminar Empleado " + e);
           JOptionPane.showMessageDialog(null," Error al eliminar el Empleado debido a la restrición de la BD ");
     Limpiar();
             txtCorreo.setEditable(true);
            //txtPass.setEditable(true);
            txtEdad.setEditable(true);
            txtNom.setEditable(true);
            txtApe.setEditable(true);
            txtTel.setEditable(true);
            jcbP.setEditable(true);
            jcbSex.setEditable(true);
            btnEdit.setEnabled(true);
            btnBus.setEnabled(true);
            txtNom1.setEditable(true);
    
    }
        } else{
        
        
        JOptionPane.showMessageDialog(null," Deben estar llenos todos los campos ");
        
        }
        
    }//GEN-LAST:event_btnDelateActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        
        int validacion=0;
        String nombre="";
        
        nombre = txtNom1.getText();
        
        if(nombre.equals("")){
        validacion++;
        //JOptionPane.showMessageDialog(null, "El campo esta vacio");
        }
        
        if(validacion==0){
             btnBus.setEnabled(false);
            txtNom1.setEditable(false);
           try{
        Connection cn = Conexion.conectar();
        PreparedStatement pat = cn.prepareStatement(
            "select * from usuarios where nombre = '" + nombre + "'");
             ResultSet rs = pat.executeQuery();
            
             if(rs.next()){
             ID = rs.getInt("id_usuario");
             txtNom.setText(rs.getString("nombre"));
             txtApe.setText(rs.getString("apellidos"));
             txtEdad.setText(rs.getString("edad"));
             txtTel.setText(rs.getString("telefono"));
             txtCorreo.setText(rs.getString("usuario"));
             txtPass.setText(rs.getString("password"));
             jcbP.setSelectedItem(rs.getString("puesto"));
             jcbSex.setSelectedItem(rs.getString("sexo"));
             cn.close();
             }
             //cn.close();
            
             else{
             JOptionPane.showMessageDialog(null,"No existe el empleado "+ nombre +" en la Base de datos" );
             Limpiar();
             }
            }catch(SQLException e){
                System.err.println("Error al cargar la información del empleado" + e);
          JOptionPane.showMessageDialog(null," ERROR al cargar información del empleado, contacte al administrador ");
        }
        }else{
        
         JOptionPane.showMessageDialog(null,"Debes de llenar el campo ");
        
        }
        
    }//GEN-LAST:event_btnBusActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
         char a = evt.getKeyChar();
       
       if(a < '0' || a > '9') evt.consume();
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
      
        
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyTyped
        char z = evt.getKeyChar();
        
        if(z < '0' || z > '9' ) evt.consume();
    }//GEN-LAST:event_txtTelKeyTyped

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
            java.util.logging.Logger.getLogger(Admin_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Editar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Editar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnDelate;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jcbP;
    private javax.swing.JComboBox<String> jcbSex;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNom1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
 public void Limpiar(){
    
                    txtNom.setText("");
                    txtApe.setText("");
                    txtEdad.setText("");
                    txtTel.setText("");
                    txtCorreo.setText("");
                    txtPass.setText("");
                    jcbP.setSelectedIndex(0);
                    jcbSex.setSelectedIndex(0);
                   
    
        }


}
