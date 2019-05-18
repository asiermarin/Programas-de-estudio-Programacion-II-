package COMUN;

import java.io.Serializable;

public class clsAsignacion implements Serializable//,Comparable<clsAsignacion>

{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String matricula;
	private String identificativo;
	
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	public String getMatricula()
	{
		return this.matricula;
	}
	public void setIdentificativo(String identificativo)
	{
		this.identificativo=identificativo;
	}
	public String getIdentificativo()
	{
		return this.identificativo;
	}
	
	public int hashCode()
	{
		
		return(identificativo.hashCode()*matricula.hashCode());
	}
	public boolean equals(Object obj)
	{
		clsAsignacion a=(clsAsignacion)obj;
		return((this.matricula.equals(a.getMatricula()))&&(this.identificativo.equals(a.getIdentificativo())));
	}
	
//	@Override
//	public int compareTo(clsAsignacion arg0) {
//		
//		int compIdt;
//		compIdt= (this.identificativo.compareTo(arg0.getIdentificativo()));
//		if(compIdt!=0) return compIdt;
//		else
//		{
//			return this.matricula.compareTo(arg0.getMatricula());
//		}
//	}
	

}
