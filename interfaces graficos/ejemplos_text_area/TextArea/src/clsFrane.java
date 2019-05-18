import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class clsFrane extends JFrame{
		    
    /**
	 * metodo que nos permite crear el text area
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea mTxtArea = null ;
		    
	    public clsFrane() {
	        try {
	            jbInit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

   private void jbInit() throws Exception {
		        
        this.getContentPane().setLayout( new BorderLayout() );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize( new Dimension(400, 300) );
		        
        //creamos el text area
        mTxtArea = new JTextArea();
		        
        //luego creamos un JScrollPane que contendra el text area
        JScrollPane scroll = new JScrollPane( mTxtArea );
        
        //finalmente se agrega el scroll pane al formulario
        this.add( scroll, BorderLayout.CENTER );
	        
		}
	}
