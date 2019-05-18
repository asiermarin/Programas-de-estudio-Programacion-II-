import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class frmPrincipal extends JFrame implements ActionListener 
{
    JTextArea display;
    JDesktopPane desktop;
    
    
    JInternalFrame listenedToWindow;
    
    static final String SHOW = "show";
    static final String CLEAR = "clear";
    String newline = "\n";
    static final int desktopWidth = 500;
    static final int desktopHeight = 300;

    public frmPrincipal(String title) 
    {
    
    	super(title);

        //Set up the GUI.
        desktop = new JDesktopPane();
        desktop.setPreferredSize(new Dimension(desktopWidth, desktopHeight));
        setContentPane(desktop);

    
        
    }





    //Handle events on the  buttons and menus.
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand())
        {
        
        case SHOW:
			        {
			            //Create the internal frame if necessary.
			            if (listenedToWindow == null) 
			            {
			                listenedToWindow = new JInternalFrame("Event Generator",
			                                                      true,  //resizable
			                                                      true,  //closable
			                                                      true,  //maximizable
			                                                      true); //iconifiable
			                //We want to reuse the internal frame, so we need to
			                //make it hide (instead of being disposed of, which is
			                //the default) when the user closes it.
			                listenedToWindow.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			
			
			                //And we mustn't forget to add it to the desktop pane!
			                desktop.add(listenedToWindow);
			
			                //Set its size and location.  We'd use pack() to set the size
			                //if the window contained anything.
			                listenedToWindow.setSize(300, 100);
			                listenedToWindow.setLocation(
			                    desktopWidth/2 - listenedToWindow.getWidth()/2,
			                    desktopHeight - listenedToWindow.getHeight());
			            }
			
			            //Show the internal frame.
			            listenedToWindow.setVisible(true);
			
			        }
        	
        	break;
        	
        case CLEAR:
            	display.setText("");
        	break;
        	
        case "new":
        	
        	createFrame();
        	break;
        	
        case "quit":
        	
        	quit();
        	break;
        
        }
    	


    }

    private void quit()
    {
    	System.exit(0);
    }
    
    protected void createFrame() 
    {
        frmInternal frame = new frmInternal();
        frame.setVisible(true); //necessary as of 1.3
        desktop.add(frame);
        try {
            frame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {}
    }
    
    protected JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        //Set up the lone menu.
        JMenu menu = new JMenu("Document");
        menu.setMnemonic(KeyEvent.VK_D);
        menuBar.add(menu);

        //Set up the first menu item.
        JMenuItem menuItem = new JMenuItem("New");
        menuItem.setMnemonic(KeyEvent.VK_N);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_N, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("new");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        //Set up the second menu item.
        menuItem = new JMenuItem("Quit");
        menuItem.setMnemonic(KeyEvent.VK_Q);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        menuItem.setActionCommand("quit");
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar;
    }
   
    public void createAndShowGUI() 
    {
       
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setJMenuBar(createMenuBar());
        //Display the window.
        this.pack();
        this.setVisible(true);
    }

    
}