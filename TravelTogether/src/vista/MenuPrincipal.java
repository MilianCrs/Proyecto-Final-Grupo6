/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Celi Leandro
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        setTitle("Travel Together");
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        activeLogin();
        desactivarOpcionesAdmin();

    }

    public void activarOpcionesAdmin() {
        jMenuGestionDatos.setVisible(true);
        jMenuConfiguracion.setVisible(true);
        jMenuEstadisticas.setVisible(true);
    }

    public void desactivarOpcionesAdmin() {
        jMenuGestionDatos.setVisible(false);
        jMenuConfiguracion.setVisible(false);
        jMenuEstadisticas.setVisible(false);
    }

    public void disambleLogin() {
        jMenuInicio.setVisible(false);
        jMenuCerrarSesion.setVisible(true);
    }

    public void activeLogin() {
        jMenuInicio.setVisible(true);
        jMenuCerrarSesion.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/imagenes/imagen.jpg"));
        Image miImagen = imagen.getImage();
        jDesktopPanePrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuCerrarSesion = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuCrearPaquete = new javax.swing.JMenuItem();
        jMenuGestionDatos = new javax.swing.JMenu();
        MenuCiudad = new javax.swing.JMenuItem();
        MenuAlojamiento = new javax.swing.JMenuItem();
        jMenuEstadisticas = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuConfiguracion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem10.setText("jMenuItem10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("BY GRUPO 6");

        jDesktopPanePrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPanePrincipalLayout = new javax.swing.GroupLayout(jDesktopPanePrincipal);
        jDesktopPanePrincipal.setLayout(jDesktopPanePrincipalLayout);
        jDesktopPanePrincipalLayout.setHorizontalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePrincipalLayout.createSequentialGroup()
                .addContainerGap(646, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );
        jDesktopPanePrincipalLayout.setVerticalGroup(
            jDesktopPanePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPanePrincipalLayout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jMenuInicio.setText("Inicio");

        jMenuItem9.setText("Iniciar sesión");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItem9);

        jMenuBar1.add(jMenuInicio);

        jMenuCerrarSesion.setText("Inicio");
        jMenuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarSesionActionPerformed(evt);
            }
        });

        jMenuItem12.setText("Cerrar Sesion");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenuCerrarSesion.add(jMenuItem12);

        jMenuBar1.add(jMenuCerrarSesion);

        jMenu3.setText("Paquetes");

        jMenuItem5.setText("Buscar Paquete");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        MenuCrearPaquete.setText("Crear Paquete");
        MenuCrearPaquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCrearPaqueteActionPerformed(evt);
            }
        });
        jMenu3.add(MenuCrearPaquete);

        jMenuBar1.add(jMenu3);

        jMenuGestionDatos.setText("Gestion de Datos");
        jMenuGestionDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGestionDatosActionPerformed(evt);
            }
        });

        MenuCiudad.setText("Ciudad");
        MenuCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCiudadActionPerformed(evt);
            }
        });
        jMenuGestionDatos.add(MenuCiudad);

        MenuAlojamiento.setText("Alojamiento");
        MenuAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAlojamientoActionPerformed(evt);
            }
        });
        jMenuGestionDatos.add(MenuAlojamiento);

        jMenuBar1.add(jMenuGestionDatos);

        jMenuEstadisticas.setText("Estadisticas");

        jMenuItem7.setText("Estadisticas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenuEstadisticas.add(jMenuItem7);

        jMenuItem8.setText("Generar Reportes");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenuEstadisticas.add(jMenuItem8);

        jMenuBar1.add(jMenuEstadisticas);

        jMenuConfiguracion.setText("Configuracion");

        jMenuItem1.setText("Agregar Administrador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuConfiguracion.add(jMenuItem2);

        jMenuBar1.add(jMenuConfiguracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPanePrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCiudadActionPerformed
        repintarEscritorio();
        VistaGCiudad gestionCiudad = new VistaGCiudad();
        jDesktopPanePrincipal.add(gestionCiudad);
        centrarVista(gestionCiudad);   
        gestionCiudad.setVisible(true);     
    }//GEN-LAST:event_MenuCiudadActionPerformed

    private void jMenuGestionDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGestionDatosActionPerformed

    }//GEN-LAST:event_jMenuGestionDatosActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        repintarEscritorio();
        VistaInicioSesion inicioSesion = new VistaInicioSesion(this);
        jDesktopPanePrincipal.add(inicioSesion);
        centrarVista(inicioSesion);
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCerrarSesionActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCerrarSesionActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        desactivarOpcionesAdmin();
        activeLogin();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void MenuAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAlojamientoActionPerformed
        repintarEscritorio();
        VistaAlojamiento vistaAlo = new VistaAlojamiento();
        jDesktopPanePrincipal.add(vistaAlo);
        centrarVista(vistaAlo);
        vistaAlo.setVisible(true);
    }//GEN-LAST:event_MenuAlojamientoActionPerformed

    private void MenuCrearPaqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCrearPaqueteActionPerformed
        repintarEscritorio();
        VistaCrearPaquete vistaCP = new VistaCrearPaquete();
        jDesktopPanePrincipal.add(vistaCP);
        centrarVista(vistaCP);
        vistaCP.setVisible(true);
    }//GEN-LAST:event_MenuCrearPaqueteActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
       repintarEscritorio();
        VistaMasConcurridas vismas = new VistaMasConcurridas();
        jDesktopPanePrincipal.add(vismas);
        centrarVista(vismas);
        vismas.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        repintarEscritorio();
        VistaResumen visres = new VistaResumen();
        jDesktopPanePrincipal.add(visres);
        centrarVista(visres);
        visres.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        int repuesta = JOptionPane.showConfirmDialog(this, "Esta seguro de Salir ?", "Atencion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (repuesta == 0) {
            dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        repintarEscritorio();
        AgregarAdminRegistro agr = new AgregarAdminRegistro();
        jDesktopPanePrincipal.add(agr);
        centrarVista(agr);
        agr.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        repintarEscritorio();
        VistaBuscarPaquete vbp = new VistaBuscarPaquete();
        jDesktopPanePrincipal.add(vbp);
        centrarVista(vbp);
        vbp.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    public void centrarVista(JInternalFrame vista){
        int x = (jDesktopPanePrincipal.getWidth() - vista.getWidth()) / 2;
        int y = (jDesktopPanePrincipal.getHeight() - vista.getHeight()) / 2;
        vista.setLocation(x, y);
    }

    public void repintarEscritorio(){
        jDesktopPanePrincipal.removeAll();
        jDesktopPanePrincipal.revalidate();
        jDesktopPanePrincipal.repaint(); 
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAlojamiento;
    private javax.swing.JMenuItem MenuCiudad;
    private javax.swing.JMenuItem MenuCrearPaquete;
    private javax.swing.JDesktopPane jDesktopPanePrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCerrarSesion;
    private javax.swing.JMenu jMenuConfiguracion;
    private javax.swing.JMenu jMenuEstadisticas;
    private javax.swing.JMenu jMenuGestionDatos;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
