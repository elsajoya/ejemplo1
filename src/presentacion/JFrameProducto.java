package presentacion;

import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import logica.ItemsCategoria;
import logica.Producto;

public class JFrameProducto extends javax.swing.JFrame {

    public JFrameProducto() {
        initComponents();
        jComboBoxCategoria.setModel(new DefaultComboBoxModel(ItemsCategoria.values()));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jButtonConsultar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelId = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelCantidad = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox<>();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiarCampos = new javax.swing.JButton();
        jButtonConsultarPorId = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 102, 102));

        jScrollPane1.setViewportView(jTableProductos);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonConsultar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConsultar))
        );

        jTabbedPane1.addTab("Consultar", jPanel1);

        jLabelId.setText("id");

        jLabelNombre.setText("Nombre");

        jLabelCategoria.setText("Categoria");

        jLabelCantidad.setText("Cantidad");

        jLabelPrecio.setText("Precio");

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });

        jComboBoxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoriaActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setText("(Solo para eliminar o actualizar)");

        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiarCampos.setText("Limpiar campos");
        jButtonLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarCamposActionPerformed(evt);
            }
        });

        jButtonConsultarPorId.setText("Consultar por id");
        jButtonConsultarPorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarPorIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPrecio)
                    .addComponent(jLabelCantidad)
                    .addComponent(jLabelCategoria)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombre)
                    .addComponent(jTextFieldCantidad)
                    .addComponent(jTextFieldPrecio)
                    .addComponent(jComboBoxCategoria, 0, 135, Short.MAX_VALUE)
                    .addComponent(jTextFieldId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLimpiarCampos))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonConsultarPorId))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarPorId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoria)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCantidad)
                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrecio)
                    .addComponent(jTextFieldPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonLimpiarCampos))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jLabelNombre.getAccessibleContext().setAccessibleName("jLabelNombre");

        jTabbedPane1.addTab("Actualizar, Registrar, Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        Object[][] filaDatos = new Object[1][5];
        Object[] nombresColumnas = {"Id", "Nombre", "Categoria", "Cantidad", "Precio"};
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(nombresColumnas);
        jTableProductos.setModel(modelo);
        Producto producto = new Producto();
        List<Producto> lista = producto.listarProductos();
        for (Producto p : lista) {
            filaDatos[0][0] = p.getId();
            filaDatos[0][1] = p.getNombre();
            filaDatos[0][2] = p.getCategoria();
            filaDatos[0][3] = p.getCantidad();
            filaDatos[0][4] = p.getPrecio();
            modelo.addRow(filaDatos[0]);
        }

    }//GEN-LAST:event_jButtonConsultarActionPerformed
    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed
    private void jComboBoxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoriaActionPerformed
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        if (validarCampos("TODOSLOSCAMPOS")) {
            int id = Integer.parseInt(jTextFieldId.getText());
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
            String nombre = jTextFieldNombre.getText();
            String categoria = jComboBoxCategoria.getSelectedItem().toString();
            double precio = Double.parseDouble(jTextFieldPrecio.getText());
            Producto p = new Producto();
            p.setId(id);
            p.setNombre(nombre);
            p.setCantidad(cantidad);
            p.setPrecio(precio);
            p.setCategoria(categoria);
            if (p.guardarProducto()) {
                JOptionPane.showMessageDialog(this, "Guardado");
            } else {
                JOptionPane.showMessageDialog(this, "No guardado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Verificar valores");
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:
        if (validarCampos("TODOSLOSCAMPOS")) {
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
            String nombre = jTextFieldNombre.getText();
            String categoria = jComboBoxCategoria.getSelectedItem().toString();
            double precio = Double.parseDouble(jTextFieldPrecio.getText());
            int id = Integer.parseInt(jTextFieldId.getText());
            Producto p = new Producto();
            p.setNombre(nombre);
            p.setCantidad(cantidad);
            p.setPrecio(precio);
            p.setCategoria(categoria);
            p.setId(id);
            if (p.actualizarProducto()) {
                JOptionPane.showMessageDialog(this, "Actualizado");
            } else {
                JOptionPane.showMessageDialog(this, "No actualizado");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Verificar valores");
        }
    }//GEN-LAST:event_jButtonActualizarActionPerformed
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro?", "Eliminar producto", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (opcion == 0) {
            if (validarCampos("SOLOID")) {
                int id = Integer.parseInt(jTextFieldId.getText());
                Producto p = new Producto();
                p.setId(id);
                if (p.eliminarProducto()) {
                    JOptionPane.showMessageDialog(this, "Eliminado");
                } else {
                    JOptionPane.showMessageDialog(this, "No eliminado");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Validar el campo id");
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed
    private void jButtonLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarCamposActionPerformed
        // TODO add your handling code here:
        jTextFieldCantidad.setText("");
        jTextFieldId.setText("");
        jTextFieldPrecio.setText("");
        jTextFieldNombre.setText("");
    }//GEN-LAST:event_jButtonLimpiarCamposActionPerformed
    private void jButtonConsultarPorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarPorIdActionPerformed
        // TODO add your handling code here:
        if (validarCampos("SOLOID")) {
            int id = Integer.parseInt(jTextFieldId.getText());
            Producto p = new Producto();
            p = p.getProducto(id);
            jTextFieldNombre.setText(p.getNombre());
            jTextFieldCantidad.setText(Integer.toString(p.getCantidad()));
            jTextFieldPrecio.setText(Double.toString(p.getPrecio()));
            try {
                jComboBoxCategoria.setSelectedItem(ItemsCategoria.valueOf(p.getCategoria()));
            } catch (NullPointerException e) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Validar el campo id");
        }
    }//GEN-LAST:event_jButtonConsultarPorIdActionPerformed
    public boolean validarCampos(String proceso) {
        String cantidad = jTextFieldCantidad.getText();
        String nombre = jTextFieldNombre.getText();
        String precio = jTextFieldPrecio.getText();
        String id = jTextFieldId.getText();
        boolean respuesta = false;
        switch (proceso) {
            case "SOLOID":
                if (isNumero(id)) {
                    respuesta = true;
                }
                break;
            case "TODOSLOSCAMPOS":
                if (isNumero(id) && isNumero(cantidad) && isNumero(precio) && !nombre.isEmpty()) {
                    respuesta = true;
                }
                break;
            default:
                break;
        }
        return respuesta;
    }
    public boolean isNumero(String cadena) {
        boolean bandera = false;
        try {
            double a = Double.parseDouble(cadena);
            bandera = true;
        } catch (NumberFormatException ex) {
        }
        return bandera;
    }
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
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonConsultarPorId;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiarCampos;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables
}
