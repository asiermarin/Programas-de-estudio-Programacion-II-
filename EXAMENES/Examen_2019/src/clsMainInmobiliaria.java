
import LN.GestorLN;
import LP.frmInmobiliaria;

/**
 * Clase donde comienza a ejecutarse el programa: Por un lado guarda la lista cada minuto y por otro lanza la ventana.
 * @author ALUMNO
 *
 */
public class clsMainInmobiliaria
{

    public static void main(String[] args)
    {
        GestorLN gln=new GestorLN();

        frmInmobiliaria frame = new frmInmobiliaria(gln);
        frame.setVisible(true);

    }

}
