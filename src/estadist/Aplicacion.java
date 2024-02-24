package estadist;

import javax.swing.*;

public class Aplicacion {
    private JPanel panPrincipal;
    private JButton btnReiniciar;
    private JButton btnSalir;
    private JTextArea tarArray;
    private JTextField txtNumero;
    private JButton btnGuardar;
    private JButton btnAnterior;
    private JButton btnSiguiente;
    private JLabel datMaximo;
    private JLabel datMinimo;
    private JLabel datMedia;
    private JLabel datMediana;
    private JLabel datDesviacion;
    private JLabel txtIndice;
    private JLabel txtErrores;
    public static int[] numListaX = new int[10];            // Array
    public int iX;                                          // Indice del array (txtIndice - 1)


    public Aplicacion() {
        
        btnSalir.addActionListener(e -> System.exit(0));
        btnReiniciar.addActionListener(e -> numReiniciar());
        btnGuardar.addActionListener(e -> numGuardar());
        btnSiguiente.addActionListener(e -> numSiguiente());
        btnAnterior.addActionListener(e -> numAnterior());
    }

    public void VisualizaArray() {

        int h;
        tarArray.setText("");                       // Visualiza números del Array ----
        for (h = 0; h <= 9; h = h + 1) {
            tarArray.append(" " + (h + 1) + ". Num[" + h + "]  " + numListaX[h] + "\n");
        }
    }

    public void numReiniciar() {

        int n, i;
        for (i = 1; i <= 10; i++) {
            n = 0;
            iX = i - 1;
            numListaX[iX] = n;
        }

        txtNumero.setText("0");
        txtIndice.setText("" + 1);
        txtErrores.setText("");

        VisualizaArray();
        MuestraEstadisticas();
    }

    public void numGuardar(){

        int n, i;
        Comprobar cpb = new Comprobar();
        String is = txtIndice.getText();
        String tn = txtNumero.getText();

        if (cpb.esEntero(tn)) {
            i = Integer.parseInt(is);
            n = Integer.parseInt(tn);

            iX = i - 1;
            numListaX[iX] = n;                          // Guarda número en Array
            txtErrores.setText("");

            VisualizaArray();
            MuestraEstadisticas();

        } else {
            txtErrores.setText("¡¡Error!!");
        }
    }

    public void numSiguiente(){

        int  i;
        Comprobar cpb = new Comprobar();
        String is = txtIndice.getText();
        String tn = txtNumero.getText();

        if (cpb.esEntero(tn)) {
            i = Integer.parseInt(is);
            //n = Integer.parseInt(tn);

            i = i + 1;
            //n = n + 1;

            if (i <= 10) {

                iX = i - 1;
                txtIndice.setText("" + i);
                txtNumero.setText("" + numListaX[iX]);
            }
        }
    }

    public void numAnterior(){

        int  i;
        Comprobar cpb = new Comprobar();
        String is = txtIndice.getText();
        String tn = txtNumero.getText();

        if (cpb.esEntero(tn)) {
            i = Integer.parseInt(is);
            //n = Integer.parseInt(tn);

            i = i - 1;
            //n = n - 1;

            if (i >= 1) {

                iX = i - 1;
                txtIndice.setText("" + i);
                txtNumero.setText("" + numListaX[iX]);
            }
        }
    }

    public void MuestraEstadisticas() {
        // Datos estadísticos ....
        DatosEstad datestd = new DatosEstad();

        datMedia.setText("Media : " + datestd.getMedia());
        datMaximo.setText("Máximo : " + datestd.getMaximo());
        datMinimo.setText("Mínimo : " + datestd.getMinimo());
        datMediana.setText("Mediana : " + datestd.getMediana());
        datDesviacion.setText("Desv: " + datestd.getDesviacion());

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion");
        frame.setContentPane(new Aplicacion().panPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
