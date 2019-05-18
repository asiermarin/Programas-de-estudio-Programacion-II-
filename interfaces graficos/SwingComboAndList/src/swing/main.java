package swing;

import java.util.Scanner;

import javax.swing.SwingUtilities;



public class main
{
	public static void main(String [] args)
	{
		clsPersona persona1 = new clsPersona();
		persona1.setNombre("Javi");
		persona1.setApellido1("Urbistondo");
		persona1.setApellido2("Sagarribay");
		persona1.setDni("1");
		
		clsPersona persona2 = new clsPersona();
		persona2.setNombre("Paula");
		persona2.setApellido1("Urain");
		persona2.setApellido2("Echart");
		persona2.setDni("2");
		
		clsPersona persona3 = new clsPersona();
		persona3.setNombre("Juan");
		persona3.setApellido1("Garayalde");
		persona3.setApellido2("Aseguinolaza");
		persona3.setDni("3");
		
		System.out.println("Elige una opción");
		System.out.println("1.- JComboBox" + "\n" + "2.- JList");
		Scanner scanner = new Scanner(System.in);
		switch(scanner.nextInt())
		{
			case 1:
			{
				SwingUtilities.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		            	frmCombo window = new frmCombo();
		            	window.setVisible(true);
		            	window.setItem(persona1);
		         		window.setItem(persona2);
		         		window.setItem(persona3);
		         		window.setItem(persona3);
		            }
		        });
				break;
			}
			case 2:
			{
				SwingUtilities.invokeLater(new Runnable() {
		            @Override
		            public void run() {
		            	frmLista window = new frmLista();
		            	window.setItem(persona1);
		         		window.setItem(persona3);
		         		window.setItem(persona2);
		            }
		        });
				break;
			}
		}
	}
}