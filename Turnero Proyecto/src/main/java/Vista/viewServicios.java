package Vista;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controlador.ControlServicios;
import Controlador.Controller;

import Modelo.Servicio;

public class viewServicios extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField textServ;
	private JButton btnIngresarServ;
	public Controller controlador = new Controller();
	public Servicio servicio = new Servicio();

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { viewServicios frame = new
	 * viewServicios(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */
	/**
	 * Create the frame.
	 */
	public viewServicios() {
		super("Ventana Servicios");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout(640, 480));
		// panelPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0,
		// 0)));

		panelPrincipal.setLayout(null);
		JLabel lblTitulo = new JLabel("INGRESAR SERVICIOS");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTitulo.setBackground(Color.WHITE);

		JPanel panelAux = new JPanel();
		panelAux.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux.setBackground(Color.DARK_GRAY);
		panelAux.setBounds(2, 2, 430, 44);
		panelAux.add(lblTitulo);
		panelPrincipal.add(panelAux);

		JPanel panelAux2 = new JPanel();
		panelAux2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux2.setBackground(Color.LIGHT_GRAY);
		panelAux2.setBounds(2, 42, 430, 160);
		panelPrincipal.add(panelAux2);
		panelAux2.setLayout(null);

		JLabel lblServicio = new JLabel("SERVICIO");
		lblServicio.setBackground(Color.LIGHT_GRAY);
		lblServicio.setBounds(93, 39, 98, 30);
		lblServicio.setForeground(Color.BLACK);
		lblServicio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio.setHorizontalAlignment(SwingConstants.CENTER);
		panelAux2.add(lblServicio);

		textServ = new JTextField();
		textServ.setBounds(201, 39, 159, 30);
		panelAux2.add(textServ);
		textServ.setColumns(10);

		resultado = new JLabel("Mensaje");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setEnabled(false);
		resultado.setVisible(false);
		resultado.setBounds(31, 103, 368, 14);
		panelAux2.add(resultado);

		JPanel panelAux3 = new JPanel();
		panelAux3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux3.setBackground(Color.BLACK);
		panelAux3.setBounds(0, 203, 434, 58);
		panelPrincipal.add(panelAux3);
		panelAux3.setLayout(null);

		btnIngresarServ = new JButton("Ingresar Servicio");

		btnIngresarServ.setBounds(146, 11, 168, 36);
		panelAux3.add(btnIngresarServ);
		getContentPane().add(panelPrincipal);

		btnIngresarServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * resultado.setText(controlador.guardarServicio(textServ.getText()));
				 * resultado.setVisible(true); resultado.setEnabled(true);
				 */

				String serv;
				serv = textServ.getText().toUpperCase();

				if (serv.length() == 0) {
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("Por favor ingrese un Servicio");

				} else if (controlador.consultarServicioNombre(serv).getServ().toUpperCase().equals(serv)) {
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("El servicio " + " ' " + serv + " ' " + " YA FUE INGRESADO");

				} else {
					servicio.setServ(serv);
					controlador.crearServicio(servicio);
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText(
							"El servicio" + " ' " + servicio.getServ() + " ' " + " fue ingresado CORRECTAMENTE");
					textServ.setText(null);

				}
			}

		});
	}

	public void setControlador(ControlServicios controlServ) {
		// TODO Auto-generated method stub
		btnIngresarServ.addActionListener(controlServ);

	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		this.setBounds(500, 200, 490, 370);
		this.setLocation(580, 200);
		setVisible(true);// visualiza la ventana
	}

	public String getServicio() {
		try {
			return (textServ.getText());
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public void escribeCambio(String s) {
		resultado.setVisible(true);
		resultado.setEnabled(true);
		resultado.setText(s);
	}

}
