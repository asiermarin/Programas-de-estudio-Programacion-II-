package LP;

import LN.GestorLN;
import comun.ViviendaRepetidaException;
import comun.itfProperty;

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
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;


import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

import static comun.clsConstantes.*;


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

    private JButton btnAnadir;
    private JButton btnRefresh;
    private JButton btnAnadirMovil;
    private JCheckBox chckbxOrdenar;
    private DefaultListModel listModel;
    private JList lstCodigos;
    private JButton btnGuardar;
    private JTextField txtCodigo;

    private final String ACTION_COMMAND_REFRESCAR = "ACTION_COMMAND_REFRESCAR";
    private final String ACTION_COMMAND_ANADIR_VIVIENDA = "ACTION_COMMAND_ANADIR_VIVIENDA";
    private final String ACTION_COMMAND_ANADIR_MOVIL = "ACTION_COMMAND_ANADIR_MOVIL";
    private final String ACTION_COMMAND_GUARDAR = "ACTION_COMMAND_GUARDAR";


    private GestorLN gln;
    private ArrayList<itfProperty> viviendas;


    /**
     * Create the frame.
     */
    public frmInmobiliaria(GestorLN gln_) {
        gln = gln_;


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

        JLabel lblElectrodomestico = new JLabel("Codigo vivienda");
        lblElectrodomestico.setBounds(10, 11, 227, 14);
        panelIzdo.add(lblElectrodomestico);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 156, 350, 281);
        panelIzdo.add(scrollPane);

        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane.setViewportView(textArea);

        JLabel lblDescripcion = new JLabel("Descripci?n");
        lblDescripcion.setBounds(10, 129, 201, 14);
        panelIzdo.add(lblDescripcion);

        btnRefresh = new JButton("Refrescar");
        btnRefresh.setActionCommand(ACTION_COMMAND_REFRESCAR);
        btnRefresh.addActionListener(this);
        btnRefresh.setBounds(75, 484, 102, 23);
        panelIzdo.add(btnRefresh);

        btnGuardar = new JButton("Guardar");
        btnGuardar.setBounds(206, 484, 154, 23);
        btnGuardar.setActionCommand(ACTION_COMMAND_GUARDAR);
        btnGuardar.addActionListener(this);

        panelIzdo.add(btnGuardar);


        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(20, 55, 293, 66);
        panelIzdo.add(scrollPane_1);

        lstCodigos = new JList();
        scrollPane_1.setViewportView(lstCodigos);
        lstCodigos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lstCodigos.addListSelectionListener(this);

        chckbxOrdenar = new JCheckBox("Ordenar c?digos alfanum?ricamente");
        chckbxOrdenar.setBounds(55, 25, 258, 23);
        panelIzdo.add(chckbxOrdenar);

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

        JLabel lblCantidadgramos = new JLabel("Descripci?n");
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


        btnAnadir = new JButton("A\u00F1adir Tradicional");
        btnAnadir.setActionCommand(ACTION_COMMAND_ANADIR_VIVIENDA);
        btnAnadir.addActionListener(this);
        btnAnadir.setBounds(38, 580, 150, 23);
        panelDcho.add(btnAnadir);


        JLabel lblEficiencia = new JLabel("Metros terreno");
        lblEficiencia.setBounds(10, 501, 159, 14);
        panelDcho.add(lblEficiencia);

        JLabel lblCodigoElectrodomstico = new JLabel("Codigo Vivienda");
        lblCodigoElectrodomstico.setBounds(10, 303, 159, 14);
        panelDcho.add(lblCodigoElectrodomstico);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(10, 317, 157, 20);
        panelDcho.add(txtCodigo);
        txtCodigo.setColumns(10);

        btnAnadirMovil = new JButton("A\u00F1adir M\u00F3vil");
        btnAnadirMovil.setBounds(198, 580, 152, 23);
        btnAnadirMovil.setActionCommand(ACTION_COMMAND_ANADIR_MOVIL);
        btnAnadirMovil.addActionListener(this);
        panelDcho.add(btnAnadirMovil);


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


    }


    /**
     * M?todo que devuelve true si el checkbox est? marcado y false de lo contrario.
     *
     * @return
     */
    private boolean getEstadoCheck() {
        return chckbxOrdenar.isSelected();
    }

    /**
     * M?todo para cargar la lista de c?digos de viviendas en la pantalla
     */
    private void CargarListaCodigos(String[] codigos) {
        //String[]s={"a","c","v","f","d","d","ss","a","c","v","f","d","d","ss"};

        listModel = new DefaultListModel();
        for (String a : codigos)
            listModel.addElement(a);


        lstCodigos.setModel(listModel);

    }


    /**
     * Conjunto de comandos a realizar al pulsar cada bot?n.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        String codigo;
        int precio;
        String descripcion;
        int habitaciones;
        int metros;
        int metros_terreno;

        switch (e.getActionCommand()) {


            case ACTION_COMMAND_REFRESCAR:
                try{

                    viviendas =gln.dameViviendas(getEstadoCheck());
                    String[] codigos=new String[viviendas.size()];
                    for (int i = 0; i <viviendas.size() ; i++) {
                        codigos[i]=(String) viviendas.get(i).getProperty(VIVIENDA_CODIGO);
                    }
                    CargarListaCodigos(codigos);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
                break;

            case ACTION_COMMAND_ANADIR_VIVIENDA:
                try {
                    codigo = txtCodigo.getText();
                    precio = Integer.parseInt(txtPrecio.getText());
                    descripcion = txtDescripcion.getText();
                    habitaciones = Integer.parseInt(txtHabitaciones.getText());
                    metros = Integer.parseInt(txtMetros.getText());

                    gln.altaVivienda(TIPO_TRADICIONAL, codigo, precio, descripcion, habitaciones, metros, -1);
                    resetForm();
                } catch (NumberFormatException exc) {
                    JOptionPane.showMessageDialog(this, "por favor inserta numeros donde se requiere");
                } catch (ViviendaRepetidaException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;

            case ACTION_COMMAND_GUARDAR:
                try{
                    gln.guardaEnBD();
                    JOptionPane.showMessageDialog(this,"guardado con exito");

                }catch (Exception ex){
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                    ex.printStackTrace();
                }
                break;

            case ACTION_COMMAND_ANADIR_MOVIL:
                try {
                    codigo = txtCodigo.getText();
                    precio = Integer.parseInt(txtPrecio.getText());
                    descripcion = txtDescripcion.getText();
                    habitaciones = Integer.parseInt(txtHabitaciones.getText());
                    metros = Integer.parseInt(txtMetros.getText());
                    metros_terreno=Integer.parseInt(txtMetrosTerreno.getText());
                    gln.altaVivienda(TIPO_MOVIL, codigo, precio, descripcion, habitaciones, metros,metros_terreno );
                    resetForm();
                } catch (NumberFormatException exc) {
                    JOptionPane.showMessageDialog(this, "por favor inserta numeros donde se requiere");
                } catch (ViviendaRepetidaException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                }
                break;

        }
    }
    private void resetForm(){
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtHabitaciones.setText("");
        txtMetros.setText("");
        txtPrecio.setText("");
        txtMetrosTerreno.setText("");
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getValueIsAdjusting() == false) {
            if (lstCodigos.getSelectedIndex() == -1) {
                //No se hace nada

            } else {
                //Se ha seleccionado un c?digo y hay que cargar su informaci?n en la Descripci?n.
                ViviendaSeleccionado((String) lstCodigos.getSelectedValue());

            }
        }
    }


    /**
     * M?todo para cambiar el electrodom?stico mostrado en pantalla.
     *
     * @param cod
     */
    private void ViviendaSeleccionado(String cod) {
        for (int i = 0; i < viviendas.size(); i++) {
            if(viviendas.get(i).getProperty(VIVIENDA_CODIGO).equals(cod)){
                textArea.setText((String) viviendas.get(i).getProperty(VIVIENDA_DESC));
            }
        }
    }
}

	
