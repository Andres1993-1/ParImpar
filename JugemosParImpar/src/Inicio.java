
public class Inicio extends javax.swing.JFrame {

    /**
     * Esta Ventana sera para ingresar al juego, lo haremos solo con un boton Inicio
     */
    public Inicio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        InicioJuego = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));
        setMaximumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        InicioJuego.setBackground(new java.awt.Color(255, 255, 255));
        InicioJuego.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        InicioJuego.setText("Juguemos Par Impar");
        InicioJuego.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InicioJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioJuegoMouseClicked(evt);
            }
        });
        jPanel1.add(InicioJuego);
        InicioJuego.setBounds(180, 220, 250, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1-7.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-10, 10, 630, 440);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1698, 1088);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InicioJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioJuegoMouseClicked
        // Codigo para pasar a la Ventana del Juego
        VentanaJuego1 iniciar = new VentanaJuego1();
        iniciar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_InicioJuegoMouseClicked

    
    public static void main(String args[]) {
        //Evento para iniciar la ventana Jframe
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InicioJuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private VentanaJuego1 VentanaJuego1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
