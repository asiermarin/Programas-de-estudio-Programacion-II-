package LP;

import COMUN.ViviendaRepetidaException;
import COMUN.itfProperty;
import LN.clsGestor;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JSeparator;


import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

import static COMUN.clsConstantes.*;


/**
 * Ventana del programa
 *
 * @author ALUMNO
 */
public class frmInmobiliaria extends JFrame implements ActionListener, ListSelectionListener {

    private JPanel contentPane;
    private JTextArea textArea;
    private JTextField txtHabitaciones;
    private JTextField txtPrecio;
    private JTextField txtDescripcion;


    private JTextField txtMetros;
    private JTextField txtMetrosTerreno;
    private JButton btnRefresh;
    private JButton btnAnadir;
    private DefaultListModel listModel;
    private JList lstCodigos;
    private JButton btnEliminar;
    private JComboBox cboCodigos;

    private final String ACTION_COMMAND_ORDENAR = "ACTION_COMMAND_ORDENAR";
    private final String ACTION_COMMAND_ANADIR_VIVIENDA = "ACTION_COMMAND_ANADIR_VIVIENDA";
    private final String ACTION_COMMAND_ELIMINAR = "ACTION_COMMAND_ELIMINAR";

    private enum enCodigos {Chalet, Piso, Casa, Adosado, Pareado}

    private int precio;
    private int habitaciones;
    private int metros;
    private int metros_terreno;

    private ArrayList<itfProperty> viviendas;
    private clsGestor objGestor = new clsGestor();


    /**
     * Create the frame.
     */
    public frmInmobiliaria() {


        setTitle("INMOBILIARIA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 818, 682);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JSplitPane splitPane = new JSplitPane();
        splitPane.setDividerLocation(0.50);
        splitPane.setResizeWeight(0.5);
        contentPane.add(splitPane, BorderLayout.CENTER);

        JPanel panelIzdo = new JPanel();
        splitPane.setLeftComponent(panelIzdo);
        panelIzdo.setLayout(null);

        JLabel lblElectrodomestico = new JLabel("ID vivienda");
        lblElectrodomestico.setBounds(10, 11, 227, 14);
        panelIzdo.add(lblElectrodomestico);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 156, 350, 281);
        panelIzdo.add(scrollPane);

        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane.setViewportView(textArea);

        JLabel lblDescripcion = new JLabel("Descripción");
        lblDescripcion.setBounds(10, 129, 201, 14);
        panelIzdo.add(lblDescripcion);

        btnRefresh = new JButton("Ordenar por Metros Terreno");
        btnRefresh.setActionCommand(ACTION_COMMAND_ORDENAR);
        btnRefresh.addActionListener(this);
        btnRefresh.setBounds(20, 484, 217, 23);
        panelIzdo.add(btnRefresh);

        btnEliminar = new JButton("Eliminar Vivienda");
        btnEliminar.setBounds(30, 527, 207, 23);
        btnEliminar.setActionCommand(ACTION_COMMAND_ELIMINAR);
        btnEliminar.addActionListener(this);

        panelIzdo.add(btnEliminar);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(20, 36, 340, 76);
        panelIzdo.add(scrollPane_1);

        lstCodigos = new JList();
        scrollPane_1.setViewportView(lstCodigos);
        lstCodigos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstCodigos.addListSelectionListener(this);

        JPanel panelDcho = new JPanel();
        splitPane.setRightComponent(panelDcho);
        panelDcho.setLayout(null);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 278, 363, 2);
        panelDcho.add(separator);

        JLabel lblElectro = new JLabel("VIVIENDAS");
        lblElectro.setBounds(158, 278, 150, 14);
        panelDcho.add(lblElectro);

        JLabel lblHabitaciones = new JLabel("Habitaciones");
        lblHabitaciones.setBounds(10, 348, 100, 14);
        panelDcho.add(lblHabitaciones);

        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(10, 428, 46, 14);
        panelDcho.add(lblPrecio);

        JLabel lblCantidadgramos = new JLabel("Descripción");
        lblCantidadgramos.setBounds(214, 428, 157, 14);
        panelDcho.add(lblCantidadgramos);

        JLabel lblMetros = new JLabel("Metros");
        lblMetros.setBounds(214, 348, 46, 14);
        panelDcho.add(lblMetros);

        txtHabitaciones = new JTextField();
        txtHabitaciones.setBounds(10, 373, 53, 20);
        panelDcho.add(txtHabitaciones);
        txtHabitaciones.setColumns(10);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(9, 450, 158, 20);
        panelDcho.add(txtPrecio);
        txtPrecio.setColumns(10);

        txtDescripcion = new JTextField();
        txtDescripcion.setBounds(214, 453, 157, 20);
        panelDcho.add(txtDescripcion);
        txtDescripcion.setColumns(10);


        JLabel lblEficiencia = new JLabel("Metros terreno");
        lblEficiencia.setBounds(10, 501, 159, 14);
        panelDcho.add(lblEficiencia);

        JLabel lblCodigoElectrodomstico = new JLabel("Codigo Vivienda");
        lblCodigoElectrodomstico.setBounds(10, 303, 159, 14);
        panelDcho.add(lblCodigoElectrodomstico);

        btnAnadir = new JButton("A\u00F1adir Vivienda");
        btnAnadir.setBounds(198, 580, 152, 23);
        btnAnadir.setActionCommand(ACTION_COMMAND_ANADIR_VIVIENDA);
        btnAnadir.addActionListener(this);
        panelDcho.add(btnAnadir);


        ImageIcon icon = clsUtilidadesLP.createImageIcon("images\\inmobiliaria.jpg", "algo");
        JLabel lblImagen = new JLabel("", icon, JLabel.CENTER);
        lblImagen.setBounds(10, 11, 373, 256);
        panelDcho.add(lblImagen);

        txtMetros = new JTextField();
        txtMetros.setBounds(214, 373, 46, 20);
        panelDcho.add(txtMetros);
        txtMetros.setColumns(10);

        txtMetrosTerreno = new JTextField();
        txtMetrosTerreno.setBounds(10, 526, 46, 20);
        panelDcho.add(txtMetrosTerreno);
        txtMetrosTerreno.setColumns(10);

        cboCodigos = new JComboBox();
        cboCodigos.setBounds(10, 317, 127, 20);
        panelDcho.add(cboCodigos);
        for (enCodigos val : enCodigos.values())
            cboCodigos.addItem(val);

        try {
            objGestor.cargarViviendas();
            CargarListaIDs(anadirId(false));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private Integer[] anadirId(boolean ordenado) {


        if (ordenado == true) {
            viviendas = objGestor.leerViviendasMetros();

        } else if (ordenado == false) {
            viviendas = objGestor.leerViviendas();
        }
        Integer[] iDs = new Integer[viviendas.size()];

        for (int i = 0; i < viviendas.size(); i++) {
            iDs[i] = (Integer) viviendas.get(i).getPropertyV(VIVIENDA_ID);
        }
        return iDs;
    }

    /**
     * Método para cargar la lista de códigos de viviendas en la pantalla
     */
    private void CargarListaIDs(Integer[] iDs) {
        //String[]s={"a","c","v","f","d","d","ss","a","c","v","f","d","d","ss"};

        listModel = new DefaultListModel();
        for (Integer a : iDs)
            listModel.addElement(a.toString());


        lstCodigos.setModel(listModel);
        textArea.setText("asi");

    }

    /**
     * Coge el código seleccionado en ese momento.
     *
     * @return
     */
    private String getCodigo() {
        String retorno = "";

        retorno = cboCodigos.getSelectedItem().toString();

        return retorno;

    }

    public void paseoDatos() {

        try {
            precio = Integer.parseInt(txtPrecio.getText());
            habitaciones = Integer.parseInt(txtHabitaciones.getText());
            metros = Integer.parseInt(txtMetros.getText());
            metros_terreno = Integer.parseInt(txtMetrosTerreno.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void resetForm() {

        txtDescripcion.setText("");
        txtHabitaciones.setText("");
        txtMetros.setText("");
        txtPrecio.setText("");
        txtMetrosTerreno.setText("");
    }


    /**
     * Conjunto de comandos a realizar al pulsar cada botón.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {


            case ACTION_COMMAND_ORDENAR:
                try {
                    objGestor.cargarViviendas();
                    CargarListaIDs(anadirId(true));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Fallo al cargar datos con metodo de ordenacion");
                }

                JOptionPane.showMessageDialog(this, "Cargado con metros de manera descendiente ");


                break;

            case ACTION_COMMAND_ANADIR_VIVIENDA:
                try {
                    paseoDatos();
                    objGestor.altaVivienda(getCodigo(), precio, txtDescripcion.getText(), habitaciones, metros, metros_terreno);
                    resetForm();
                    objGestor.cargarViviendas();
                    CargarListaIDs(anadirId(false));

                } catch (ViviendaRepetidaException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage()); //lanzar mensaje preparado
                }
                JOptionPane.showMessageDialog(this, "Vivienda introduce correctamente, no se repite");

                break;

            case ACTION_COMMAND_ELIMINAR:

                try {

                    for (itfProperty vivienda : viviendas) {
                        if (Integer.parseInt((String) lstCodigos.getSelectedValue()) == (Integer)vivienda.getPropertyV(VIVIENDA_ID)) {
                            objGestor.eliminarVivienda((Integer) vivienda.getPropertyV(VIVIENDA_ID));

                        }
                        objGestor.cargarViviendas();
                        CargarListaIDs(anadirId(false));
                    }

                    JOptionPane.showMessageDialog(this, "Eliminada correctamente");
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }

                break;
        }
    }

    private void setVisible() {
        this.setVisible();
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting() == false) {
            if (lstCodigos.getSelectedIndex() == -1) {
                //No se hace nada

            } else {
                textArea.setText("");
                //Se ha seleccionado un código y hay que cargar su información en la Descripción.
                ViviendaSeleccionado((String) lstCodigos.getSelectedValue());
                viviendas = objGestor.leerViviendas();

                for (itfProperty vivienda : viviendas) {
                    if (Integer.parseInt((String) lstCodigos.getSelectedValue()) == (Integer)vivienda.getPropertyV(VIVIENDA_ID)) {
                        EscribirAreaTexto((String) vivienda.getPropertyV(VIVIENDA_DESCRIPCION));
                    }
                }
            }
        }
    }


    /**
     * Metodo para escribir en el area de textoo.
     *
     * @param texto
     */
    private void EscribirAreaTexto(String texto) {
        textArea.setText(texto);
    }


    /**
     * Método para cambiar la vivienda mostrado en pantalla.
     *
     * @param id
     */
    private void ViviendaSeleccionado(String id) {
        JOptionPane.showMessageDialog(this, " Codigo =" + id);

    }
}

	
