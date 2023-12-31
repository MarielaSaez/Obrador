package Vista;

import Control.EmpleadoData;
import Modelo.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author mariel
 */
public class EmpleadoView extends javax.swing.JInternalFrame {
    EmpleadoData empleadoData;
    /**
     * Creates new form Empleado
     */
    public EmpleadoView() {
        initComponents();
        empleadoData=new EmpleadoData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtDni = new javax.swing.JTextField();
        bNuevo = new javax.swing.JButton();
        bActualizar = new javax.swing.JButton();
        bEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbAcceso = new javax.swing.JComboBox<>();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        chEstado = new javax.swing.JCheckBox();

        setClosable(true);

        bNuevo.setText("Nuevo");
        bNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNuevoActionPerformed(evt);
            }
        });

        bActualizar.setText("Actualizar");
        bActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActualizarActionPerformed(evt);
            }
        });

        bEliminar.setText("Eliminar");
        bEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarActionPerformed(evt);
            }
        });

        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Gestión de Empleados");

        jLabel1.setText("DNI");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel6.setText("Acceso");

        jLabel7.setText("Estado");

        cbAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        cbAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAccesoActionPerformed(evt);
            }
        });

        chEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bBuscar))
                                    .addComponent(jtNombre)
                                    .addComponent(jtApellido)
                                    .addComponent(cbAcceso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chEstado))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(bActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(bEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(chEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bNuevo)
                    .addComponent(bActualizar)
                    .addComponent(bEliminar)
                    .addComponent(jButton4))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNuevoActionPerformed
       Empleado empleado;
        try{
            int dni=Integer.parseInt(jtDni.getText());

            String descr=jtNombre.getText();
            if(jtNombre.getText().isEmpty()||jtApellido.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe completar los datos");
                return;
            }
        
            empleado=new Empleado(dni,1,jtNombre.getText(),jtApellido.getText(),chEstado.isSelected());
            empleadoData.guardarEmpleado(empleado);
            limpiar();
        }
        catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(this, "Error debe colocar un número");
        }
    }//GEN-LAST:event_bNuevoActionPerformed
    private void limpiar(){
            jtDni.setText("");
            jtNombre.setText("");
            jtApellido.setText("");
            chEstado.setSelected(false);
            cbAcceso.setSelectedIndex(0);
    }
    private void bActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActualizarActionPerformed
      Empleado empleado;
        try{
            int dni=Integer.parseInt(jtDni.getText());

            String descr=jtNombre.getText();
            if(jtNombre.getText().isEmpty()||jtApellido.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe completar los datos");
                return;
            }
        
            empleado=new Empleado(dni,Integer.parseInt(cbAcceso.getSelectedItem().toString()),jtNombre.getText(),jtApellido.getText(),chEstado.isSelected());
            empleadoData.actualizarEmpleado(empleado);
            JOptionPane.showMessageDialog(this, "Datos actualizados correctamente.");
            limpiar();
        }
        catch(NumberFormatException e1){
            JOptionPane.showMessageDialog(this, "Error debe colocar un número");
        }
    }//GEN-LAST:event_bActualizarActionPerformed

    private void bEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarActionPerformed
          int dni=Integer.parseInt(jtDni.getText());
          Empleado empl=empleadoData.buscarEmpleado(dni);
          if(empl!=null){
               if(empleadoData.borrarEmpleado(empl.getId_empleado())==1){
               JOptionPane.showMessageDialog(this, "Empleado eliminado");
               }
               else{
               JOptionPane.showMessageDialog(this, "No se puede eliminar el empleado debido a que existen registros relacionados en Movimiento.");
               }
          }
          else{
               JOptionPane.showMessageDialog(this, "Error, el empleado no existe");
          }
          limpiar();
    }//GEN-LAST:event_bEliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        int id=Integer.parseInt(jtDni.getText());
        Empleado empl=empleadoData.buscarEmpleado(id);
        if(empl!=null){
                limpiar();
        }
        else{
        JOptionPane.showMessageDialog(this, "El empleado no existe");
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void cbAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAccesoActionPerformed

    private void chEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bActualizar;
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bEliminar;
    private javax.swing.JButton bNuevo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbAcceso;
    private javax.swing.JCheckBox chEstado;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
