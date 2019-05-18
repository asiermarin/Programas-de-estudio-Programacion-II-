package LN;


	
	import Comun.itfProperties;
	import static Comun.Constantes.PROPERTY_IDDEPARTAMENTO;
	import static Comun.Constantes.PROPERTY_TIPO_DEPARTAMENTO;

import java.util.Date;

import static Comun.Constantes.PROPERTY_DEPARTAMENTO_JEFE;
	import static Comun.Constantes.PROPERTY_DEPARTAMENTO_NUMEMPLEADOS;


	public class Departamento implements itfProperties{
		
		/**Todos los Atributos de la clase, son privates para que solo se puedan modificar mediante los get y set.
	*/
		private int idDepartamento;
		private String TipoD;
		private String Jefe;
		private int NumEmpleados;
		
		
		
		public Departamento() {
			super();
			this.idDepartamento = idDepartamento;
			TipoD = TipoD;
			Jefe = Jefe;
			NumEmpleados = NumEmpleados;
		}
		
		
		/** Se aplican los metodos de la interfaz itfProperties junto a las variables finales de la clase. */

		
		@Override
		public String getStringProperty(String propiedad) {
			// TODO Auto-generated method stub
			
			switch (propiedad) {
			case PROPERTY_TIPO_DEPARTAMENTO:return this.getTipoD();
			case PROPERTY_DEPARTAMENTO_JEFE : return this.getJefe();
			}
			
			return null;
		}
		
		/** Se aplican los metodos de la interfaz itfProperties junto a las variables finales de la clase. */

		@Override
		public Integer getIntegerProperty(String propiedad) {
			// TODO Auto-generated method stub
			
			switch (propiedad) {
			case PROPERTY_IDDEPARTAMENTO: return this.getidDepartamento();
			case PROPERTY_DEPARTAMENTO_NUMEMPLEADOS: return this.getNumEmpleados();
			}
			return null;
		}
		
		


		/** Creamos los get y set para poder modificar los atributos desde otra clase ya que son atributos private. */


		public int getidDepartamento() {
			return idDepartamento;
		}


		public void setidDepartamento(int idDepartamento) {
			this.idDepartamento = idDepartamento;
		}


		public String getTipoD() {
			return TipoD;
		}


		public void setTipoD(String tipoD) {
			TipoD = tipoD;
		}


		public String getJefe() {
			return Jefe;
		}


		public void setJefe(String jefe) {
			Jefe = jefe;
		}


		


		public int getNumEmpleados() {
			return NumEmpleados;
		}


		public void setNumEmpleados(int numEmpleados) {
			NumEmpleados = numEmpleados;
		}

		/** Creamos el toString por si acaso hace falta visualizar todos sus atributos. */


		@Override
		public String toString() {
			return "Departamento [idDepartamento=" + idDepartamento + ", TipoD=" + TipoD + ", Jefe=" + Jefe
					+ ", NumEmpleados=" + NumEmpleados + "]";
		}

		


		@Override
		public Float getFloatProperty(String propiedad) {
			// TODO Auto-generated method stub
			return null;
		}
		



		@Override
		public Double getDoubleProperty(String propiedad) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public char getCharProperty(String propiedad) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Date getDateProperty(String propiedad) {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idDepartamento;
			return result;
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Departamento other = (Departamento) obj;
			if (idDepartamento != other.idDepartamento)
				return false;
			return true;
		}



}
