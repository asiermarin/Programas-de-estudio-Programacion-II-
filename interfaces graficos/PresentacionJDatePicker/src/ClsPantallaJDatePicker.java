import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

//https://search.maven.org/#search%7Cga%7C1%7Cjdatepicker

public class ClsPantallaJDatePicker extends JFrame implements ActionListener {

	/**
	 * esto no se para que es.
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * instanciamos los objetos
	 */
	private JPanel contentPane;
	JButton boton;
	JDatePickerImpl datePicker;

	/**
	 * inicializamos al apliccacion
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClsPantallaJDatePicker frame = new ClsPantallaJDatePicker();
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
	public ClsPantallaJDatePicker() {
		/**
		 * definimos e incializamos el objeto panel
		 */
		setTitle("JDatePicker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		/**
		 * Insatnciamos y creamos un objeto UtilDateModel
		 */
		UtilDateModel model = new UtilDateModel();

		/**
		 * generamos un objeto properties
		 */
		Properties p = new Properties();
		/**
		 * Asignamos la propieddad
		 */
		p.put("text.today", "TODAY");
		/**
		 * creamos el panel y le asignamos el modelo y las propiedades (calendario)
		 */
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);

		/**
		 * creamos un objeto selector de fechas para poder seleccionar de nuestro panel.
		 * Llamamos a la clase formateador de fechas para que nos formatee las fechas
		 */
		datePicker = new JDatePickerImpl(datePanel, new ClsFormateadorFechas());

		/**
		 * insanciamos y creamos un boton
		 */
		boton = new JButton("Mira la fecha");
		boton.addActionListener(this);

		this.getContentPane().add(datePicker, BorderLayout.PAGE_START);
		this.getContentPane().add(boton, BorderLayout.PAGE_END);
	}

	/**
	 * decimos que hara el boton al ser pulsado
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		DateFormat miFormato;
		String fecha;

		/**
		 * Formateamos la fecha de salida
		 */
		miFormato = DateFormat.getDateInstance(DateFormat.SHORT);
		fecha = miFormato.format(datePicker.getModel().getValue());

		JOptionPane.showMessageDialog(this, "La fecha es " + fecha);

	}
}
