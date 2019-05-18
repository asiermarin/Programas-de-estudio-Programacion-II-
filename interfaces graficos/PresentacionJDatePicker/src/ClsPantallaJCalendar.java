import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;


//https://toedter.com/jcalendar/

public class ClsPantallaJCalendar extends JFrame implements ActionListener {
	
	/**
	 * Esto no se para que sirve
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Instanciamos el objeto dateChooser (el calendario)
	 */
	JDateChooser dateChooser;

	private JPanel contentPane;

	/**
	 * Iniciamos la aplicacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClsPantallaJCalendar frame = new ClsPantallaJCalendar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creamos el frame
	 */
	public ClsPantallaJCalendar() {
		/**
		 * Creamos y definimos el panel
		 */
		setTitle("JCalendar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**
		 * creamos y definimos el boton
		 */
		JButton VerFecha = new JButton("VER FECHA");
		VerFecha.addActionListener(this);
		
		VerFecha.setBounds(10, 227, 414, 23);
		contentPane.add(VerFecha);
		
		/**
		 * creamos un nuevo objeto DateChooser
		 */
		dateChooser = new JDateChooser();
		/**
		 * Aqui definimos el formato de la fecha (de serie viene (dd-MMM-yyyy)
		 */
		dateChooser.setDateFormatString("dd-MM-yyyy");
		/**
		 * definimos el objeto en la pantalla y lo añadimos al panel 
		 */
		dateChooser.setBounds(10, 11, 414, 20);
		contentPane.add(dateChooser);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		DateFormat miFormato;
		String fecha;

		/**
		 * fromateamos la fecha de otro modo diferente al anterior para sacarla por pantalla.
		 */
		miFormato = DateFormat.getDateInstance(DateFormat.SHORT);
		fecha = miFormato.format(dateChooser.getDate());

		/**
		 * cuando le de al boton hara lo siguiente.
		 */
		JOptionPane.showMessageDialog(this, "La fecha es " + fecha);
		
	}


}
