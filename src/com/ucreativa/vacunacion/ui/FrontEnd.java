package com.ucreativa.vacunacion.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo) {
        super(titulo);
    }

    public void Build() {
        this.ConstruccionPantalla();
        this.CrearComponentes();
        super.setVisible(true);

    }

    private void ConstruccionPantalla() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5, 2));
    }

    private void AgregarComponente(Component componente) {
        super.getContentPane().add(componente);
    }

    private void CrearComponentes() {

        //Crear labels
        JLabel lblnombre = new JLabel("Nombre");
        JLabel lblcedula = new JLabel("Cedula");
        JLabel lbledad = new JLabel("Edad");
        JLabel lblriesgo = new JLabel("Riesgo");
        JLabel lblisamigo = new JLabel("Es Amigo");
        JLabel lblrelacion = new JLabel("Relacion");
        JLabel lblfacebook = new JLabel("Facebook");
        JLabel lblparentesco = new JLabel("Parentesco");
        JLabel lblmarca = new JLabel("Marca");

        JTextField txtnombre = new JTextField();
        JTextField txtcedula = new JTextField();
        JTextField txtedad = new JTextField();
        JCheckBox txtriesgo = new JCheckBox();
        JCheckBox txtesamigo = new JCheckBox();
        JTextField txtrelacion = new JTextField();
        JTextField txtfacebook = new JTextField();
        JTextField txtparentesco = new JTextField();
        JTextField txtmarca = new JTextField();

        JButton salvar = new JButton("Guardar");
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                try {
                    service.save(txtnombre.getText(),
                            txtcedula.getText(),
                            txtedad.getText(),
                            txtriesgo.isSelected(),
                            txtesamigo.isSelected(),
                            txtrelacion.getText(),
                            txtfacebook.getText(),
                            txtparentesco.getText(),
                            txtmarca.getText());
                            txtnombre.setText("");
                            txtcedula.setText("");
                            txtedad.setText("");
                            txtriesgo.setText("");
                            txtesamigo.setText("");
                            txtrelacion.setText("");
                            txtfacebook.setText("");
                            txtparentesco.setText("");
                            txtmarca.setText("");

                    String reporte = String.join("\n", service.get());
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
                } catch (ErrorEnEdadException error) {
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), error.getMessage());
                }


            }

        });

        this.AgregarComponente(lblnombre);
        this.AgregarComponente(txtnombre);
        this.AgregarComponente(lblcedula);
        this.AgregarComponente(txtcedula);
        this.AgregarComponente(lbledad);
        this.AgregarComponente(txtedad);
        this.AgregarComponente(lblriesgo);
        this.AgregarComponente(txtriesgo);
        this.AgregarComponente(lblisamigo);
        this.AgregarComponente(txtesamigo);
        this.AgregarComponente(lblrelacion);
        this.AgregarComponente(txtrelacion);
        this.AgregarComponente(lblfacebook);
        this.AgregarComponente(txtfacebook);
        this.AgregarComponente(lblparentesco);
        this.AgregarComponente(txtparentesco);
        this.AgregarComponente(lblmarca);
        this.AgregarComponente(txtmarca);
        this.AgregarComponente(salvar);

    }
}
