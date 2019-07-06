package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controlador.ControlServicios;
import Modelo.Servicio;

import javax.swing.JComboBox;

public class viewCliente extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField textNombre;
	private JButton btnIngresarDatos;
	private JTextField textDocumento;
	private JComboBox<String> cbxServicio;
	private JComboBox<String> cbxPrioridad;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewCliente frame = new viewCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public viewCliente() {
		super("Ventana Servicios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setExtendedState(JFrame.NORMAL);

		this.setBounds(500, 200, 490, 370);
		JPanel panelPrincipal = new JPanel();
		// panelPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0,
		// 0)));

		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(null);
		JLabel lblTitulo = new JLabel("INGRESAR DATOS");
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
		panelAux2.setBounds(2, 42, 465, 205);
		panelPrincipal.add(panelAux2);
		panelAux2.setLayout(null);

		JLabel lblServicio = new JLabel("NOMBRE:");
		lblServicio.setBackground(Color.LIGHT_GRAY);
		lblServicio.setBounds(73, 8, 87, 30);
		lblServicio.setForeground(Color.BLACK);
		lblServicio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio.setHorizontalAlignment(SwingConstants.CENTER);
		panelAux2.add(lblServicio);

		textNombre = new JTextField();
		textNombre.setBounds(170, 11, 267, 30);
		panelAux2.add(textNombre);
		textNombre.setColumns(10);

		JLabel lblServicio_1 = new JLabel("SERVICIO:");
		lblServicio_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblServicio_1.setForeground(Color.BLACK);
		lblServicio_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio_1.setBackground(Color.LIGHT_GRAY);
		lblServicio_1.setBounds(73, 90, 87, 30);
		panelAux2.add(lblServicio_1);

		JLabel lblPrioridad = new JLabel("PRIORIDAD:");
		lblPrioridad.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrioridad.setForeground(Color.BLACK);
		lblPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrioridad.setBackground(Color.LIGHT_GRAY);
		lblPrioridad.setBounds(62, 131, 98, 30);
		panelAux2.add(lblPrioridad);

		JLabel lblDocumento = new JLabel("DOCUMENTO:");
		lblDocumento.setHorizontalAlignment(SwingConstants.CENTER);
		lblDocumento.setForeground(Color.BLACK);
		lblDocumento.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDocumento.setBackground(Color.LIGHT_GRAY);
		lblDocumento.setBounds(41, 52, 119, 30);
		panelAux2.add(lblDocumento);

		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(170, 52, 159, 30);
		panelAux2.add(textDocumento);

		 cbxServicio = new JComboBox<String>();
		cbxServicio.setBounds(171, 96, 159, 24);
		panelAux2.add(cbxServicio);
		ControlServicios servicios = new ControlServicios();
		List<Servicio> items;
		cbxServicio.addItem(" ");
		items = servicios.listarServicios();
		for (int i = 0; i < items.size(); i++) {
			cbxServicio.addItem(items.get(i).getServ());
		}


        cbxPrioridad = new JComboBox<String>();
		cbxPrioridad.setBounds(171, 137, 158, 24);
		panelAux2.add(cbxPrioridad);

		resultado = new JLabel("Mensaje");
		resultado.setEnabled(false);
		resultado.setBounds(103, 180, 287, 14);
		panelAux2.add(resultado);
		cbxPrioridad.addItem(" ");
		cbxPrioridad.addItem("Ninguna");
		cbxPrioridad.addItem("Mujer embarazada");
		cbxPrioridad.addItem("Tercera Edad");
		cbxPrioridad.addItem("Limitaciones");

		JPanel panelAux3 = new JPanel();
		panelAux3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux3.setBackground(Color.BLACK);
		panelAux3.setBounds(2, 245, 465, 77);
		panelPrincipal.add(panelAux3);
		panelAux3.setLayout(null);

		btnIngresarDatos = new JButton("Ingresar Datos");
		btnIngresarDatos.setBounds(171, 11, 168, 36);
		panelAux3.add(btnIngresarDatos);
		getContentPane().add(panelPrincipal);
	}

	public void setControlador(ControlServicios controlServ) {
		// TODO Auto-generated method stub
		btnIngresarDatos.addActionListener(controlServ);

	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		this.setBounds(500, 200, 490, 370);
		setVisible(true);// visualiza la ventana
	}



	public String getNombre() {
		return null;

	}

	public boolean getPrioridad() {
		return rootPaneCheckingEnabled;

	}

	public void escribeCambio(String s) {
		resultado.setText(s);
	}

	public String getServicio() {
		// TODO Auto-generated method stub
		return null;
	}
}
