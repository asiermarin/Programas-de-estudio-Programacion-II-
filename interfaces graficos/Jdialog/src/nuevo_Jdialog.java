
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;


// AQU� EMPIEZA LA CLASE
public class nuevo_Jdialog extends JDialog {

    private final JPanel ventana = new JPanel();

    
    public static void main(String[] args) {
        try {
            nuevo_Jdialog dialog = new nuevo_Jdialog();
            //cuando cerremos la ventana el programa termina
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            //hacemos visible la ventana
            dialog.setVisible(true);
        } catch (Exception e) {
        	//Se utiliza para imprimir el registro del stack donde se ha iniciado la excepci�n.
            e.printStackTrace();
        }
    }

    // CONSTRUCTOR DE LA CLASE
    // crea la ventana, con los bordes, botones,
    // y todos los componentes internos para hacer lo que
    // se pretenda con �ste di�logo.
    public nuevo_Jdialog() {
        // evita el cambio de tama�o
        setResizable(false);
        // t�tulo del di�olog
        setTitle("EL PATO");
        // dimensiones que ocupa en la pantalla
        setBounds(100, 100, 450, 230);
        // capa que contendr� todo
        getContentPane().setLayout(new BorderLayout());
        // borde de la ventana
        ventana.setBorder(new EmptyBorder(5, 5, 5, 5));
        // pone el panel centrado
        getContentPane().add(ventana, BorderLayout.CENTER);
        // sin capas para poder posicionar los elementos por coordenadas donde queramos
        ventana.setLayout(null);
        {
            // aqu� se pone el JTextArea dentro de un JScrollPane 
            // para que tenga barras de desplazamiento
            JScrollPane barras = new JScrollPane();
            barras.setBounds(10, 11, 424, 150);
            ventana.add(barras);
            {
                JTextArea texto = new JTextArea();
                texto.setText("DEFINICION:\n Pato es el nombre com�n para ciertas aves de la familia Anatidae,\nprincipalmente de la subfamilia Anatinae y dentro de ella del g�nero Anas.\nNo son un grupo monofil�tico, ya que no se incluyen los cisnes ni los gansos.\n .\n .\n .\n .\n .\n .\n .\n");
               //Para que haga el salto de l�nea buscando espacios entre las palabras
                texto.setWrapStyleWord(true);
                //barras de desplazamiento
                texto.setAutoscrolls(true);
                //fijar las barras en el texto
                barras.setViewportView(texto);
            }
        }
        {
            // a continuaci�n tenemos el boton "vale", que basicamente cierra la ventana
            JPanel botonpanel = new JPanel();
            //colocacion del boton
            botonpanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(botonpanel, BorderLayout.SOUTH);
            {
                JButton botonvale = new JButton("Vale");
                //el escuchador del boton
                botonvale.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // aqu� van las acciones al hacer click en el boton
                        //cierra la ventana
                        dispose();
                    }
                });
                botonvale.setActionCommand("Vale");
                botonpanel.add(botonvale);
                getRootPane().setDefaultButton(botonvale);
            }
            
        }
    }
}