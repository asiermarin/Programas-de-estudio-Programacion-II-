package swing;



import javax.swing.SwingUtilities;



public class main
{
	public static void main(String [] args)
	{
		clsPersona persona1 = new clsPersona(null, null, null, null);
		persona1.setNombre("Juan");
		persona1.setApellido1("Vargas");
		persona1.setApellido2("Ayala");
		persona1.setDni("1");
		
		clsPersona persona2 = new clsPersona(null, null, null, null);
		persona2.setNombre("Iñaki");
		persona2.setApellido1("Martinez");
		persona2.setApellido2("Haro");
		persona2.setDni("2");
		
		clsPersona persona3 = new clsPersona(null, null, null, null);
		persona3.setNombre("Pedro ");
		persona3.setApellido1("Rodriguez");
		persona3.setApellido2("Sanchez");
		persona3.setDni("3");
		
		clsEstudiantes persona4=new clsEstudiantes(null, null, null, null);
		persona4.setNombre("Asís");
		persona4.setApellido1("Pinedo");
		persona4.setApellido2("De Ángel");
		persona4.setDni("4");
		persona4.setCreditos(12);
	
		clsEstudiantes persona5=new clsEstudiantes(null, null, null, null);
		persona5.setNombre("Miguel");
		persona5.setApellido1("Orti");
		persona5.setApellido2("Compañero");
		persona5.setDni("5");
		persona5.setCreditos(5);
		
		
		            	frmCombo window = new frmCombo();
		            	window.setVisible(true);
		            	window.setItem(persona1);
		         		window.setItem(persona2);
		         		window.setItem(persona3);
		         		window.setItem(persona4);
		         		window.setItem(persona5);

		         	
		            }
		
	}
