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
import Modelo.Cliente;
import Modelo.Prioridad;
import Modelo.Servicio;

public class viewAsesor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField textNombre;
	private JButton btnIngresarDatos;
	private JTextField textDocumento;
	private JComboBox<String> cbxServicio;
	private JComboBox<String> cbxPrioridad;
	public Controller controlador = new Controller();
	public Cliente cliente = new Cliente();

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

		
		List<Servicio> items;
		cbxServicio.addItem(" ");
		items = controlador.listarServicios();
		for (int i = 0; i < items.size(); i++) {
			cbxServicio.addItem(items.get(i).getServ());
		}

		cbxPrioridad = new JComboBox<String>();
		cbxPrioridad.setBounds(171, 137, 158, 24);
		panelAux2.add(cbxPrioridad);

		resultado = new JLabel("Mensaje");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEnabled(false);
		resultado.setVisible(false);
		resultado.setBounds(41, 180, 384, 14);
		panelAux2.add(resultado);
		
		List<Prioridad> itemsPrioridad;
		cbxPrioridad.addItem(" ");
		itemsPrioridad = controlador.listarPrioridad();
		for (int i = 0; i < itemsPrioridad.size(); i++) {
			cbxPrioridad.addItem(itemsPrioridad.get(i).getPrioridad());
		}

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

		btnIngresarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				cliente.setId(Integer.parseInt(textDocumento.getText()));
				cliente.setNombre(textNombre.getText());
				Servicio servicio = new Servicio();
				Prioridad prioridad = new Prioridad();
				cliente.setServicio(new ArrayList<Servicio>());
				cliente.setPrioridad(new ArrayList<Prioridad>());

				servicio = controlador.consultarServicioNombre((String) cbxServicio.getSelectedItem());
				prioridad = controlador.consultarPrioridad((String) cbxPrioridad.getSelectedItem());

				cliente.getServicio().add(controlador.consultarServicio(servicio.getId()));
				cliente.getPrioridad().add(controlador.consultarPrioridad(prioridad.getId()));

				controlador.guardarUsuario(cliente);

				resultado.setVisible(true);
				resultado.setEnabled(true);
				resultado.setText("Su turno es x");

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
		this.setBounds(500, 200, 490, 370);
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

	public String getPrioridad() {
		try {
			String servicio = (String) cbxPrioridad.getSelectedItem();
			return (servicio);
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public String getServicio() {
		try {
			String servicio = (String) cbxServicio.getSelectedItem();
			return (servicio);
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public void escribeCambio(String s) {
		resultado.setText(s);
	}

}