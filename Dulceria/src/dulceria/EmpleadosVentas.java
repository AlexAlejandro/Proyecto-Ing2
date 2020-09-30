
package dulceria;
import java.sql.*;
import Clases.Conexion;
import static dulceria.Administrador.sesion_usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.DefaultTableModel;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.FontFactory;
//import com.itextpdf.text.Paragraph;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.SpinnerNumberModel;



public class EmpleadosVentas extends javax.swing.JFrame {
 String user, nombre_usuario; 
    int sesion_usuario;
    
   DefaultTableModel modelo = new DefaultTableModel();
    int cod_pro, id_us, id_clie, id_v, V;
    int cantidad, Cli2, n=0;
    double precio=0;
    double tpagar=0;
    int item;
    String dulce="", encontrado="", pago="", encontrado1, encontrado2, ss; 
    int encontrados= 0, encontra=0, encontra1=0;
    String tpagars ="";
   int Cli=0;
    
   
    public EmpleadosVentas() {
        initComponents();
        user = Login.user;
        sesion_usuario = 1; 
        setResizable(false);
        this.setLocationRelativeTo(null);
         setTitle("Ventas - Sesion de "+ user);
         setIconImage (new ImageIcon(getClass().getResource("mentita.jpg")).getImage());
    
         setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
//         SpinnerNumberModel n= new SpinnerNumberModel();
//         n.setMaximum(100);
//         n.setMinimum(1);
//         
//         txtw.setModel(n);

         txtUs.setText(user);
         
         
         try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select id_usuario from usuarios where usuario= '" + user + "'");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                    id_us = rs.getInt("id_usuario");
                    }
            }catch(SQLException e){
               
         }
         
         
         
         try{
             Connection cn = Conexion.conectar();
             PreparedStatement pat = cn.prepareStatement(
                "select max(id_venta) as id_venta from ventas");
             ResultSet rs =pat.executeQuery();
                if(rs.next()){
                    id_v = rs.getInt("id_venta");
                   
                    
                    }
            }catch(SQLException e){
               
         }
         
          //txtTpagar.setText(tpagars);
         
         fecha();
          ss = String.valueOf(id_v+1).toString();
txt.setText(ss);
 

         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtCl1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtCl2 = new javax.swing.JTextField();
        txtPro2 = new javax.swing.JTextField();
        txtS = new javax.swing.JTextField();
        txtUs = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        txtPro1 = new javax.swing.JTextField();
        txtP = new javax.swing.JTextField();
        txtCa = new javax.swing.JSpinner();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtTpagar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ventas");

        txt.setEditable(false);
        txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Venta");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("\" Mi Dulceria \"");

        txtDate.setEditable(false);
        txtDate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Fecha Venta");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(224, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCl1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setText("Buscar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtCl2.setEditable(false);
        txtCl2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtPro2.setEditable(false);
        txtPro2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtS.setEditable(false);
        txtS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtUs.setEditable(false);
        txtUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton5.setText("Buscar");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtPro1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtP.setEditable(false);
        txtP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setText("Agregar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel5.setText("ID Cliente");

        jLabel14.setText("Producto");

        jLabel15.setText("Cantidad");

        jLabel16.setText("Vendedor");

        jLabel17.setText("Stock");

        jLabel18.setText("Producto");

        jLabel19.setText("Cliente");

        jLabel20.setText("Precio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCl1)
                    .addComponent(txtPro1)
                    .addComponent(txtP)
                    .addComponent(txtCa, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCl2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txtPro2)
                    .addComponent(txtUs)
                    .addComponent(txtS))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(txtCl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel20))
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 660, 170));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Venta");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtTpagar.setEditable(false);
        txtTpagar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Total a pagar");

        jButton8.setText("Salir");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 660, 120));

        TablaDetalle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Código_Producto", "Producto", "Cantidad", "Precio Unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablaDetalle);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 660, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
         new Empleado_Ad_Ventas().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int va=0;  
    String f="", c="", z="";
    f=txtCl1.getText().trim();
    c=txtPro1.getText().trim();
//    z=txtCa.getToolTipText().trim();
    if(txtCl1.getText().equals("")){
      va++;
      }
    if(txtPro1.getText().equals("")){
      va++;
      }
//     if(txtCa.getToolTipText().equals("")){
//      va++;
//      }
    
        if (txtTpagar.getText().equals("")) {
            //JOptionPane.showMessageDialog(this, "Debe ingresar Datos");
            va++;
        }
        if(va==0){
        
            guardarVenta();
            guardarDetalle();
            actualizarStock();            
            //JOptionPane.showMessageDialog(this, "Se Realizo con Exito");
            nuevo();
            jButton8.setEnabled(true);
            txtCl1.setEditable(true);
            jButton4.setEnabled(true);
            
        }        else {
        JOptionPane.showMessageDialog(this, "Debes de llenar todos los campos");
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       cliente();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Producto();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AgregarPro();
    }//GEN-LAST:event_jButton7ActionPerformed

    void guardarVenta() {
        String dates = "";
        dates=txtDate.getText();
   
    try{
        
             Connection cn = Conexion.conectar();        
             PreparedStatement pat2 = cn.prepareStatement(
                        "insert into ventas values(?,?,?,?,?)");
                      
                        pat2.setInt(1,0);
                        pat2.setInt(2,Cli2);
                        pat2.setInt(3,id_us);
                        pat2.setString(4,dates);
                        pat2.setDouble(5,tpagar);
                        
//                         
                    pat2.executeUpdate();
                    cn.close();
             
                    JOptionPane.showMessageDialog(null,"Venta almacenada con éxito");
                   
                    
                        }catch(SQLException e){
                            
                     System.err.println("Error al registrar Venta" + e);
                      JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador ");
                     }   
        

    }

    void guardarDetalle() {
        ventasid();
         String dates = "";
        dates=txtDate.getText();
    try{
        
             Connection cn = Conexion.conectar();        
             PreparedStatement pat2 = cn.prepareStatement(
                        "insert into venta_productos values(?,?,?,?)");
                      
                        pat2.setInt(1,0);
                      //  pat2.setInt(2,0);
                        pat2.setInt(2,encontrados);
                        pat2.setInt(3,cantidad);
                        pat2.setDouble(4,precio);
                        
//                         
                    pat2.executeUpdate();
                    cn.close();
             
                    //JOptionPane.showMessageDialog(null,"Venta de Productos almacenada con éxito");
                   
                    
                        }catch(SQLException e){
                            
                     System.err.println("Error al registrar Venta de productos" + e);
                      JOptionPane.showMessageDialog(null," ERROR al registrar, contacte al administrador ");
                     }   
      
    }
    
    
      public void fecha() {
        Calendar calendar = new GregorianCalendar();
        txtDate.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
    }
      
      public void AgregarPro(){
    double total;
        modelo = (DefaultTableModel) TablaDetalle.getModel();
        item = item + 1;
        int menor = Integer.parseInt(encontrado2.toString());
        try{
       Connection cn = Conexion.conectar();
        PreparedStatement pat = cn.prepareStatement(
            "select codigo_producto from productos where nombre= '" + dulce+ "'");
             ResultSet rs = pat.executeQuery();
                      if(rs.next()){
           encontrados = rs.getInt("codigo_producto");
                 System.out.println(encontrados);
                    }
               String nomp = txtPro2.getText();
         precio = Double.parseDouble(txtP.getText());
        cantidad = Integer.parseInt(txtCa.getValue().toString());
        int stock = Integer.parseInt(txtS.getText());
        if(cantidad > menor){
        JOptionPane.showMessageDialog(null,"No hay suficientes productos en el Stock ");
        
        }else{
        total = cantidad * precio;
        ArrayList lista = new ArrayList();
        
       if (stock > 0) {
          lista.add(item);
            lista.add(encontrados);
            lista.add(nomp);
            lista.add(cantidad);
            lista.add(precio);
            lista.add(total);
            Object[] ob = new Object[6];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            modelo.addRow(ob);
            TablaDetalle.setModel(modelo);
            calculatTotal();
            actualizarStock();
            
            jButton8.setEnabled(false);
            
       }else {
            JOptionPane.showMessageDialog(this, "Stock PRoducto no Disponible");
        }
        }
      
        }catch(Exception e){
      //JOptionPane.showMessageDialog(null,"se ha encontrado el codigo del producto");
      
        }
    
      }
    
      public void cliente(){
      
      String Cliente="", C="", A=""; 
      int va=0;
    A= txtCl1.getText().trim();

    
      //Cli= Integer.parseInt(txtCl1.getText().trim());
      //n=Cli;

      if(txtCl1.getText().equals("")){
      va++;
      }
    
    if(va == 0){
        Cli = Integer.parseInt(A.toString());
      try{
       Connection cn = Conexion.conectar();
       
       
        PreparedStatement pat = cn.prepareStatement(
            "select id_cliente, nombre from clientes where id_cliente = '" + A+ "'");
             ResultSet rs = pat.executeQuery();
                      if(rs.next()){
                Cliente= rs.getString("nombre");
                 Cli2 = rs.getInt("id_cliente");
                 txtCl2.setText(Cliente);
                 txtCl1.setEditable(false);
                 jButton4.setEnabled(false);
                    }else{
                      
                 JOptionPane.showMessageDialog(null,"No se ha encontrado el ID_Cliente " + Cli + " en la BD");
                      }
      
        }catch(Exception e){
      JOptionPane.showMessageDialog(null,"No se ha encontrado el Cliente " + Cliente + " en la BD");
      
            }
    }else{
    JOptionPane.showMessageDialog(null,"El campo esta vacio");
    
    }
     
     
        
  
      }
      
      public void Producto(){
      String encontrado="";
      int val=0;
      dulce = txtPro1.getText().trim();
      
      if(txtPro1.getText().equals("")){
      val++;
      }
      
      if(val==0){
       try{
       Connection cn = Conexion.conectar();
        PreparedStatement pat = cn.prepareStatement(
            "select nombre, precio, stock from productos where nombre= '" + dulce+ "'");
             ResultSet rs = pat.executeQuery();
                      if(rs.next()){
                 encontrado = rs.getString("nombre");
           encontrado1 = rs.getString("precio");
            encontrado2 = rs.getString("stock");
                 txtPro2.setText(encontrado);
                 txtP.setText(encontrado1);
                 txtS.setText(encontrado2);
      
                    }else{
                      JOptionPane.showMessageDialog(null,"No se ha encontrado el producto " + dulce + " en la BD");
                      }
      
        }catch(Exception e){
      JOptionPane.showMessageDialog(null,"No se ha encontrado el producto " + dulce + " en la BD");
      
            }
      }else{
      
       JOptionPane.showMessageDialog(null,"Campo vacio "); 
      }
      
      }
    
     public void calculatTotal() {
        double e=0;
//        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
//            cantidad = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
//            precio = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
//            tpagar = tpagar + (cantidad * precio);
//           
//        }
      tpagar = tpagar+(cantidad * precio);
     e=tpagar;
        txtTpagar.setText("" + e+ "0");
       // tpagar = tpagar + (cantidad * precio);
       // tpagars= String.valueOf(tpagar).toString();
             
    }
        
     public void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
   public void actualizarStock() {
//          String nombre = "", compania="";
//               String marca = "", descripcion="";}
   for (int i = 0; i < modelo.getRowCount(); i++) {
            
 int enn = 0;
int resultado =0;
 String dos;
//   dos =String.valueOf(enn).toString();
  dos = txtS.getText();
  System.out.println(dos);// total
  cantidad = Integer.parseInt(txtCa.getValue().toString());
  enn = Integer.parseInt(dos);
resultado= enn - cantidad ;
System.out.println("Resultado"+resultado);
System.out.println("Resultado"+encontrados);

           try{
       Connection cn = Conexion.conectar();
        PreparedStatement pat = cn.prepareStatement(
            "update productos set stock=? where codigo_producto= '" +encontrados+ "'");
             
   
        
        pat.setInt(1,resultado);
        
        pat.executeUpdate();
            cn.close();
        }catch(Exception e){
      JOptionPane.showMessageDialog(null,"No se ha podido actualizar el Stock");
      
            }
   }
     
    }
       void nuevo(){
        limpiarTabla();
        txtCl1.setText("");
        txtCl2.setText("");
        txtCa.setValue(1);
        txtPro1.setText("");
        txtP.setText("");
        txtPro2.setText("");
        txtS.setText("");
        txtTpagar.setText("");
        
    } 
       
       
   public void ventasid(){
   String ven = "";
   
   try{
       Connection cn = Conexion.conectar();
       
       
        PreparedStatement pat = cn.prepareStatement(
            "SELECT MAX(id_venta) AS id_venta FROM ventas");
             ResultSet rs = pat.executeQuery();
                      if(rs.next()){
                 V = rs.getInt("id_venta");
//              V = Integer.parseInt(ven);
//                 txt.setText(ven);
System.out.println(V);
                    }
      
        }catch(Exception e){
      JOptionPane.showMessageDialog(null,"No se ha encontrado el id de las ventas " + V + " en la BD");
      
            }
   
   
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
            java.util.logging.Logger.getLogger(EmpleadosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadosVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt;
    private javax.swing.JSpinner txtCa;
    private javax.swing.JTextField txtCl1;
    private javax.swing.JTextField txtCl2;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtPro1;
    private javax.swing.JTextField txtPro2;
    private javax.swing.JTextField txtS;
    private javax.swing.JTextField txtTpagar;
    private javax.swing.JTextField txtUs;
    // End of variables declaration//GEN-END:variables
}