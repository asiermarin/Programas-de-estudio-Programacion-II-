package LN;

import LD.clsDatos;
import comun.ViviendaRepetidaException;
import comun.itfProperty;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

import static comun.clsConstantes.BD_VIVIENDA_METROS_TERRENO;
import static comun.clsConstantes.TIPO_MOVIL;

public class GestorLN {
    private clsDatos objDatos;
    private HashSet<Tradicional> viviendas;

    public GestorLN() {
        this.viviendas =new HashSet<>();
        objDatos=new clsDatos();
    }
    public void altaVivienda(int tipo,String codigo, int precio,String descripcion,int habitaciones, int metros,int metros_terreno) throws ViviendaRepetidaException {
        Tradicional vivienda;
       if(tipo==TIPO_MOVIL){
           vivienda=new Movil( codigo,  precio, descripcion, habitaciones,  metros, metros_terreno);
       }else{
           vivienda=new Tradicional( codigo,  precio, descripcion, habitaciones,  metros);
       }
       if(!viviendas.add(vivienda)){
           throw new ViviendaRepetidaException(codigo);
       }

    }

    public void guardaEnBD() throws Exception {


        ArrayList<Tradicional> viviendasTemp= new ArrayList<>(viviendas);
        objDatos.conectarBD();
        for (int i = 0; i <viviendasTemp.size() ; i++) {
            if (!viviendasTemp.get(i).sicncronizada){
                String codigo=viviendasTemp.get(i).getCodigo();
                int precio=viviendasTemp.get(i).getPrecio();
                String descripcion=viviendasTemp.get(i).getDescripcion();
                int habitaciones=viviendasTemp.get(i).getHabitaciones();
                int metros=viviendasTemp.get(i).getHabitaciones();

                int metros_terreno=(viviendasTemp.get(i) instanceof  Movil)?((Movil) viviendasTemp.get(i)).getMetros_terreno():-1;
                objDatos.insertarVivienda(codigo, precio, descripcion, habitaciones, metros,metros_terreno);
            }

        }
        objDatos.desconectarBD();
    }

    public void     cargarViviendas() throws Exception {
        objDatos.conectarBD();
        ResultSet rs=objDatos.selectViviendas();
        Tradicional viv;
        while (rs.next()){
            if(rs.getInt(BD_VIVIENDA_METROS_TERRENO)==-1){
                viv=new Tradicional();
                viv.loadResulstSet(rs);

            }else{
                viv=new Movil();
                viv.loadResulstSet(rs);

            }
            viviendas.add(viv);//descarto la vivienda de base de datos y me quedo con la de memoria pero no se sincronizara hasta que se de a guardar
        }
        objDatos.desconectarBD();
    }

    public ArrayList<itfProperty>   dameViviendas(boolean ordenadas) throws Exception {
        cargarViviendas();
        ArrayList<Tradicional> vivtemp=new ArrayList<>(viviendas);
        if(ordenadas){
            Collections.sort(vivtemp);
        }
        ArrayList<itfProperty>retorno =new ArrayList<>();
        for (Tradicional t:vivtemp) {
            retorno.add(t);
        }
        return retorno;
    }
}
