import javax.swing.*;        

public class HelloWorldSwing {
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        
        //Display the window.
        /*frame.pack();*/
        frame.setSize(1000, 100);/*Tama�o en pixel*/
        
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        
    	createAndShowGUI();
        System.out.println("Se acab� ela ejecuci�n");
    }
}
