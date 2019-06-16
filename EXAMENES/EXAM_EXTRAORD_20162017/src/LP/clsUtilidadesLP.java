package LP;

import javax.swing.ImageIcon;

public class clsUtilidadesLP 
{
	
	/**
	 *  Returns an ImageIcon, or null if the path was invalid. 
	 *  
	 *  */
    public static ImageIcon createImageIcon(String path,String description) 
    {
//        java.net.URL imgURL = this.getClass().getResource(path);
    	java.net.URL imgURL = clsUtilidadesLP.class.getClassLoader().getResource(path);
        if (imgURL != null) 
        {
            return new ImageIcon(imgURL, description);
        } 
        else 
        {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
	

}
