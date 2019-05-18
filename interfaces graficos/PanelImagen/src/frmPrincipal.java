import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frmPrincipal extends JFrame implements ActionListener
{

	private PanelConImagen contentPane;
	private JButton btnNewButton; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					frmPrincipal frame = new frmPrincipal();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPrincipal()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 220);
		contentPane = new PanelConImagen();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackgroundImage(contentPane.createImage("images/images.jpg").getImage());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(5, 11, 24, 172);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// http://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html
		JOptionPane.showConfirmDialog(null,
	             "Mirad: http://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html", "Título de la ventana", JOptionPane.YES_NO_OPTION);
		
	}

}
