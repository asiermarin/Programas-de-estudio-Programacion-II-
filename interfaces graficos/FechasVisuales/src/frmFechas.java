import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

//http://stackoverflow.com/questions/26794698/how-do-i-implement-jdatepicker
//https://search.maven.org/#search%7Cga%7C1%7Cjdatepicker

public class frmFechas extends JFrame implements ActionListener
{

	private JPanel contentPane;
	JButton btnFecha;
	JDatePickerImpl datePicker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFechas frame = new frmFechas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmFechas() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		UtilDateModel model = new UtilDateModel();
		//model.setDate(20,04,2014);
		// Need this...
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		// Don't know about the formatter, but there it is...
		datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		
		btnFecha = new JButton("Mira la fecha");
		btnFecha.addActionListener(this);
		
		
		this.getContentPane().add(datePicker,BorderLayout.PAGE_START);
		this.getContentPane().add(btnFecha,BorderLayout.PAGE_END);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		
		DateFormat miFormato;
		String fecha;
		
		miFormato=DateFormat.getDateInstance(DateFormat.SHORT);
		fecha=miFormato.format(datePicker.getModel().getValue());
		
		JOptionPane.showMessageDialog(this, "La fecha es " + fecha );
		
	}

}
