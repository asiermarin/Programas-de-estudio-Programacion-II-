package LP;

import COMUN.ElectrodomesticoRepetidoExcepcion;
import COMUN.itfProperty;
import LN.clsGestor;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;


import javax.swing.JRadioButton;

import static COMUN.clsConstantes.*;


public class frmElectrodomesticos extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JTextField txtDenominacion;
    private JTextArea textArea;
    private JButton btnAtras;
    private JButton btnAdelante;
    private JTextField txtMarca;
    private JTextField txtPrecio;
    private JTextField txtDescCorta;
    private JComboBox cmbTipo;
    private JButton btnAnadir;
    private JButton btnRefresh;
    private JRadioButton rdbtnMarca;
    private JRadioButton rdbtnTipo;

    private final String ACTION_COMMAND_ATRAS = "ACTION_COMMAND_ATRAS";
    private final String ACTION_COMMAND_ADELANTE = "ACTION_COMMAND_ADELANTE";
    private final String ACTION_COMMAND_REFRESCAR = "ACTION_COMMAND_REFRESCAR";
    private final String ACTION_COMMAND_ANADIR_ELECTRODOMESTICO = "ACTION_COMMAND_ANADIR_ELECTRODOMESTICO";
    private final String ACTION_COMMAND_ELIMINAR_ELECTRODOMESTICO = "ACTION_COMMAND_ELIMINAR_ELECTRODOMESTICO";

    private clsGestor objGesto = new clsGestor();
    ArrayList<itfProperty> listaElectrodomesticos;


    /**
     * Create the frame.
     */
    public frmElectrodomesticos() {
        setTitle("TIENDA ELECTRODOMÉSTICOS");
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

        JLabel lblDenominacion = new JLabel("Denominacion");
        lblDenominacion.setBounds(10, 30, 227, 14);
        panelIzdo.add(lblDenominacion);

        txtDenominacion = new JTextField();
        txtDenominacion.setEditable(false);
        txtDenominacion.setBounds(10, 55, 350, 20);
        panelIzdo.add(txtDenominacion);
        txtDenominacion.setColumns(10);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 156, 350, 281);
        panelIzdo.add(scrollPane);

        textArea = new JTextArea();
        textArea.setEditable(false);
        scrollPane.setViewportView(textArea);

        JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
        lblDescripcion.setBounds(10, 129, 201, 14);
        panelIzdo.add(lblDescripcion);

        btnAtras = new JButton("<<");
        btnAtras.setActionCommand(ACTION_COMMAND_ATRAS);
        btnAtras.addActionListener(this);
        btnAtras.setBounds(10, 484, 55, 23);
        panelIzdo.add(btnAtras);

        btnAdelante = new JButton(">>");
        btnAdelante.setActionCommand(ACTION_COMMAND_ADELANTE);
        btnAdelante.addActionListener(this);
        btnAdelante.setBounds(305, 484, 55, 23);
        panelIzdo.add(btnAdelante);

        btnRefresh = new JButton("Refrescar");
        btnRefresh.setActionCommand(ACTION_COMMAND_REFRESCAR);
        btnRefresh.addActionListener(this);
        btnRefresh.setBounds(75, 484, 102, 23);
        panelIzdo.add(btnRefresh);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(206, 484, 89, 23);
        btnEliminar.setActionCommand(ACTION_COMMAND_ELIMINAR_ELECTRODOMESTICO);
        btnEliminar.addActionListener(this);

        panelIzdo.add(btnEliminar);

        rdbtnMarca = new JRadioButton("Orden Marca");
        rdbtnMarca.setBounds(38, 454, 109, 23);
        panelIzdo.add(rdbtnMarca);

        rdbtnTipo = new JRadioButton("Orden Tipo");
        rdbtnTipo.setBounds(206, 454, 109, 23);
        panelIzdo.add(rdbtnTipo);

        ButtonGroup group = new ButtonGroup();
        group.add(rdbtnMarca);
        group.add(rdbtnTipo);

        JPanel panelDcho = new JPanel();
        splitPane.setRightComponent(panelDcho);
        panelDcho.setLayout(null);

        JSeparator separator = new JSeparator();
        separator.setBounds(10, 278, 363, 2);
        panelDcho.add(separator);

        JLabel lblElectro = new JLabel("ELECTRODOMESTICO");
        lblElectro.setBounds(10, 305, 150, 14);
        panelDcho.add(lblElectro);

        JLabel lblMarca = new JLabel("Marca");
        lblMarca.setBounds(10, 348, 46, 14);
        panelDcho.add(lblMarca);

        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(10, 428, 46, 14);
        panelDcho.add(lblPrecio);

        JLabel lblCantidadgramos = new JLabel("Descripción corta");
        lblCantidadgramos.setBounds(10, 508, 157, 14);
        panelDcho.add(lblCantidadgramos);

        JLabel lblTipo = new JLabel("Tipo");
        lblTipo.setBounds(214, 348, 46, 14);
        panelDcho.add(lblTipo);

        txtMarca = new JTextField();
        txtMarca.setBounds(10, 373, 157, 20);
        panelDcho.add(txtMarca);
        txtMarca.setColumns(10);

        txtPrecio = new JTextField();
        txtPrecio.setBounds(9, 450, 158, 20);
        panelDcho.add(txtPrecio);
        txtPrecio.setColumns(10);

        txtDescCorta = new JTextField();
        txtDescCorta.setBounds(10, 533, 157, 20);
        panelDcho.add(txtDescCorta);
        txtDescCorta.setColumns(10);

        cmbTipo = new JComboBox();
        cmbTipo.setBounds(214, 373, 159, 20);
        panelDcho.add(cmbTipo);

        btnAnadir = new JButton("Añadir");
        btnAnadir.setActionCommand(ACTION_COMMAND_ANADIR_ELECTRODOMESTICO);
        btnAnadir.addActionListener(this);
        btnAnadir.setBounds(153, 579, 89, 23);
        panelDcho.add(btnAnadir);


        ImageIcon icon = clsUtilidadesLP.createImageIcon("electrodomesticos.JPG", "algo");
        JLabel lblImagen = new JLabel("", icon, JLabel.CENTER);
        lblImagen.setBounds(10, 11, 373, 256);
        panelDcho.add(lblImagen);


        this.cargarComboTipos();


    }


    private void cargarComboTipos() {
        for (enTipo s : enTipo.values()) {
            cmbTipo.addItem(s.toString());
        }


    }


    private String getTipo() {
        return (String) cmbTipo.getSelectedItem();
    }


    private void MostrarInformacionObjeto(String denominacion, String descripcion) {
        txtDenominacion.setText(denominacion);
        textArea.setText(descripcion);
    }


    private boolean OrdenarPorMarca() {
        return rdbtnMarca.isSelected();
    }

    private boolean OrdenarPorTipo() {
        return rdbtnTipo.isSelected();
    }


    @Override
    public void actionPerformed(ActionEvent e) {




        switch (e.getActionCommand()) {
            case ACTION_COMMAND_ATRAS:
                JOptionPane.showMessageDialog(this, "Pon aquí tu método para recorrer la lista de objetos hacia atrás");
                break;
            case ACTION_COMMAND_ADELANTE:
                JOptionPane.showMessageDialog(this, "Pon aquí tu método para recorrer la lista de objetos hacia adelante");
                break;
            case ACTION_COMMAND_REFRESCAR:
                try {
                    objGesto.cargarElectrodomesticos();

                    if (OrdenarPorMarca() == true) {
                        listaElectrodomesticos = objGesto.leerElectrodomesticos(1);

                        for (itfProperty electrodomestico :listaElectrodomesticos){
                            MostrarInformacionObjeto((String) electrodomestico.getPropertyV(ELEC_MARCA),
                                    (String) electrodomestico.getPropertyV(ELEC_DESCRIPCION));
                        }
                    } else if (OrdenarPorTipo() == true) {
                        listaElectrodomesticos =  objGesto.leerElectrodomesticos(2);
                    } else {
                        listaElectrodomesticos = objGesto.leerElectrodomesticos(0);
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            case ACTION_COMMAND_ANADIR_ELECTRODOMESTICO:

                String marca = txtMarca.getText();
                String tipo = getTipo();
                int precio = Integer.parseInt(txtPrecio.getText());
                String descripcion = txtDescCorta.getText();

                try {
                    objGesto.altaElectrodomestico(marca, tipo, precio, descripcion);
                } catch (ElectrodomesticoRepetidoExcepcion ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                    ex.printStackTrace();
                }
                break;
            case ACTION_COMMAND_ELIMINAR_ELECTRODOMESTICO:
                String denominacion = txtDenominacion.getText();
                int _id = 0;
                for (itfProperty electrodomestico :listaElectrodomesticos){
                    if (denominacion == electrodomestico.getPropertyV(ELEC_MARCA)){
                        _id = (Integer) electrodomestico.getPropertyV(ELEC_ID);
                    }

                }
                objGesto.eleminarElectrodomestico(_id);
                JOptionPane.showMessageDialog(this, "Pon aquí tu método para eliminar electrodomestico");
                break;
        }
    }
}
	
