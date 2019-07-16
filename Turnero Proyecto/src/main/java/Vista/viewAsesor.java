package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controlador.Controller;
import Modelo.Asesor;
import Modelo.Cliente;
import Modelo.Prioridad;
import Modelo.Servicio;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

public class viewAsesor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField textNombre;
	private JButton btnIngresarDatos;
	private JTextField textDocumento;
	private JComboBox<String> cbxServicio1;
	private JComboBox<String> cbxServicio2 = new JComboBox<String>();
	private JComboBox<String> cbxServicio3 = new JComboBox<String>();
	public Controller controlador = new Controller();
	public Asesor asesor = new Asesor();
	JCheckBox chckbxEstado = new JCheckBox("Activo");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewAsesor frame = new viewAsesor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public viewAsesor() {
		super("Ventana Servicios");
		setTitle("Ventana Asesor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// this.setExtendedState(JFrame.NORMAL);

		this.setBounds(500, 200, 490, 437);
		JPanel panelPrincipal = new JPanel();
		// panelPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0,
		// 0)));

		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(null);
		JLabel lblTitulo = new JLabel("INGRESAR DATOS ASESOR");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTitulo.setBackground(Color.WHITE);

		JPanel panelAux = new JPanel();
		panelAux.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux.setBackground(Color.DARK_GRAY);
		panelAux.setBounds(2, 2, 465, 42);
		panelAux.add(lblTitulo);
		panelPrincipal.add(panelAux);

		JPanel panelAux2 = new JPanel();
		panelAux2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux2.setBackground(Color.LIGHT_GRAY);
		panelAux2.setBounds(2, 43, 465, 291);
		panelPrincipal.add(panelAux2);
		panelAux2.setLayout(null);

		JLabel lblServicio = new JLabel("NOMBRE:");
		lblServicio.setBounds(73, 8, 87, 30);
		lblServicio.setBackground(Color.LIGHT_GRAY);
		lblServicio.setForeground(Color.BLACK);
		lblServicio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio.setHorizontalAlignment(SwingConstants.CENTER);
		panelAux2.add(lblServicio);

		textNombre = new JTextField();
		textNombre.setBounds(170, 11, 267, 30);
		panelAux2.add(textNombre);
		textNombre.setColumns(10);

		JLabel lblServicio1 = new JLabel("SERVICIO 1:");
		lblServicio1.setBounds(52, 90, 99, 30);
		lblServicio1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicio1.setForeground(Color.BLACK);
		lblServicio1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio1.setBackground(Color.LIGHT_GRAY);
		panelAux2.add(lblServicio1);

		JLabel lblDocumento = new JLabel("DOCUMENTO:");
		lblDocumento.setBounds(42, 49, 119, 30);
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setForeground(Color.BLACK);
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDocumento.setBackground(Color.LIGHT_GRAY);
		panelAux2.add(lblDocumento);

		textDocumento = new JTextField();
		textDocumento.setBounds(170, 52, 159, 30);
		textDocumento.setColumns(10);
		panelAux2.add(textDocumento);

		cbxServicio1 = new JComboBox<String>();
		cbxServicio1.setBounds(171, 96, 159, 24);
		panelAux2.add(cbxServicio1);

		List<Servicio> items;
		cbxServicio1.addItem(" ");
		cbxServicio2.addItem(" ");
		cbxServicio3.addItem(" ");
		items = controlador.listarServicios();
		for (int i = 0; i < items.size(); i++) {
			cbxServicio1.addItem(items.get(i).getServ());
			cbxServicio2.addItem(items.get(i).getServ());
			cbxServicio3.addItem(items.get(i).getServ());
		}

		resultado = new JLabel("Mensaje");
		resultado.setBounds(52, 251, 384, 14);
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEnabled(false);
		resultado.setVisible(false);
		panelAux2.add(resultado);

		JLabel lblServicio2 = new JLabel("SERVICIO 2:");
		lblServicio2.setBounds(52, 123, 99, 30);
		lblServicio2.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicio2.setForeground(Color.BLACK);
		lblServicio2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio2.setBackground(Color.LIGHT_GRAY);
		panelAux2.add(lblServicio2);

		JLabel lblServicio3 = new JLabel("SERVICIO 3:");
		lblServicio3.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicio3.setForeground(Color.BLACK);
		lblServicio3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio3.setBackground(Color.LIGHT_GRAY);
		lblServicio3.setBounds(51, 162, 99, 30);
		panelAux2.add(lblServicio3);

		cbxServicio2.setBounds(170, 129, 159, 24);
		panelAux2.add(cbxServicio2);

		cbxServicio3.setBounds(170, 168, 159, 24);
		panelAux2.add(cbxServicio3);

		chckbxEstado.setBackground(Color.LIGHT_GRAY);
		chckbxEstado.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxEstado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxEstado.setBounds(170, 199, 159, 30);
		panelAux2.add(chckbxEstado);

		JPanel panelAux3 = new JPanel();
		panelAux3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux3.setBackground(Color.BLACK);
		panelAux3.setBounds(2, 335, 465, 63);
		panelPrincipal.add(panelAux3);
		panelAux3.setLayout(null);

		btnIngresarDatos = new JButton("Ingresar Datos");
		btnIngresarDatos.setBounds(159, 11, 168, 36);
		panelAux3.add(btnIngresarDatos);
		getContentPane().add(panelPrincipal);

		btnIngresarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				asesor.setId(Integer.parseInt(textDocumento.getText()));
				asesor.setNombre(textNombre.getText());
				asesor.setEstado(chckbxEstado.isSelected());

				
				Servicio servicio1 = new Servicio();
				Servicio servicio2 = new Servicio();
				Servicio servicio3 = new Servicio();

				asesor.setServicio(new ArrayList<Servicio>());

				servicio1 = controlador.consultarServicioNombre((String) cbxServicio1.getSelectedItem());
				servicio2 = controlador.consultarServicioNombre((String) cbxServicio2.getSelectedItem());
				servicio3 = controlador.consultarServicioNombre((String) cbxServicio3.getSelectedItem());

				asesor.getServicio().add(controlador.consultarServicio(servicio1.getId()));
				asesor.getServicio().add(controlador.consultarServicio(servicio2.getId()));
				asesor.getServicio().add(controlador.consultarServicio(servicio3.getId()));

				controlador.guardarAsesor(asesor);

				resultado.setVisible(true);
				resultado.setEnabled(true);
				resultado.setText("El asesor fue ingresado correctamente");

				textNombre.setText(null);
				textDocumento.setText(null);

			}

		});
	}

	public void setControlador(Controller controlCliente) {
		// TODO Auto-generated method stub
		// btnIngresarDatos.addActionListener(controlCliente);
		this.controlador = controlCliente;
	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		this.setBounds(500, 200, 490, 437);
		this.setLocation(580, 200);
		setVisible(true);// visualiza la ventana
	}

	public String getNombre() {
		try {
			return (textNombre.getText());
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public String getDocumento() {
		try {
			return (textDocumento.getText());
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public String getServicio() {
		try {
			String servicio = (String) cbxServicio1.getSelectedItem();
			return (servicio);
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public void escribeCambio(String s) {
		resultado.setText(s);
	}
}