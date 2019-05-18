package swing;

import java.util.LinkedList;

import javax.swing.DefaultListModel;



public class ModeloLista extends DefaultListModel<clsPersona>
{
	  protected LinkedList <clsPersona> lista;
	
	  public ModeloLista(LinkedList <clsPersona> lista)
	  {
	    this.lista = lista;
	  }
	
	  public clsPersona getElementAt(int index)
	  {
	    return lista.get(index);
	  }
	
	  public int getSize()
	  {
	    return lista.size();
	  }

	  @Override
	  public void addElement(clsPersona element)
	  {
		  lista.add(element);
		  this.fireContentsChanged(this, lista.size(), lista.size());
	  }
}
