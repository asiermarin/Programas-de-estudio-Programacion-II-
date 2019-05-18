// son elementos muy útiles en las aplicaciones para ordenar categorías y dar sentido a las aplicaciones //

package com.company;

import javax.swing.*;

class TabbedPane {
    JFrame f;

    TabbedPane() {
        //Creamos los JFrame, JTextArea y JPanel
        f = new JFrame();
        JTextArea ta = new JTextArea(425, 425);
        JPanel p1 = new JPanel();
        //Añadimos el text area al JPanel
        p1.add(ta);
        //CREACION DE LAS PESTAÑAS
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        //JPanel p4 = new JPanel();

        //Creamos y editamos el TabbedPane
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(25, 25, 400, 400);
        //Añadimos cada pestaña al TabbedPane y escribimos su contenido
        tp.add("Main", p1);
        tp.add("Visit", p2);
        tp.add("Help", p3);
        //tp.add("Properties", p4);

        f.add(tp);
        f.setSize(500, 500); //TAMAÑO DE VENTANA
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {

        new TabbedPane();
    }
}
