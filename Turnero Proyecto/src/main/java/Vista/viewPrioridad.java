package Vista;

import java.awt.Color;
import java.awt.EventQueue;
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

import Controlador.Controller;
import Modelo.Prioridad;

public class viewPrioridad extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField textPriori;
	private JButton btnIngresarPriori;
	public Controller controlador = new Controller();
	public viewAdministrador vistaAdministrador = new viewAdministrador();
	public Prioridad prioridad = new Prioridad();

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewPrioridad frame = new viewPrioridad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public viewPrioridad() {
		super("Ventana Prioridad");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(500, 200, 446, 366);
		JPanel panelPrincipal = new JPanel();
		// panelPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0,
		// 0)));

		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(null);
		JLabel lblTitulo = new JLabel("INGRESAR PRIORIDAD");
		lblTitulo.setBounds(128, 11, 194, 23);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTitulo.setBackground(Color.WHITE);

		JPanel panelAux = new JPanel();
		panelAux.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux.setBackground(Color.DARK_GRAY);
		panelAux.setBounds(2, 2, 433, 44);
		panelAux.setLayout(null);
		panelAux.add(lblTitulo);
		panelPrincipal.add(panelAux);

		JPanel panelAux2 = new JPanel();
		panelAux2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux2.setBackground(Color.LIGHT_GRAY);
		panelAux2.setBounds(2, 42, 433, 226);
		panelPrincipal.add(panelAux2);
		panelAux2.setLayout(null);

		JLabel lblPriori = new JLabel("PRIORIDAD");
		lblPriori.setBounds(74, 36, 98, 30);
		lblPriori.setBackground(Color.LIGHT_GRAY);
		lblPriori.setForeground(Color.BLACK);
		lblPriori.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPriori.setHorizontalAlignment(SwingConstants.CENTER);
		panelAux2.add(lblPriori);

		textPriori = new JTextField();
		textPriori.setBounds(198, 39, 159, 30);
		panelAux2.add(textPriori);
		textPriori.setColumns(10);

		resultado = new JLabel("Mensaje");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(33, 135, 390, 14);
		resultado.setEnabled(false);
		resultado.setVisible(false);
		panelAux2.add(resultado);

		JPanel panelAux3 = new JPanel();
		panelAux3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux3.setBackground(Color.BLACK);
		panelAux3.setBounds(0, 269, 435, 58);
		panelPrincipal.add(panelAux3);
		panelAux3.setLayout(null);

		btnIngresarPriori = new JButton("Ingresar Prioridad");

		btnIngresarPriori.setBounds(144, 11, 168, 36);
		panelAux3.add(btnIngresarPriori);
		getContentPane().add(panelPrincipal);

		btnIngresarPriori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*
				 * resultado.setText(controlador.guardarPrioridad(textPriori.getText()));
				 * resultado.setVisible(true); resultado.setEnabled(true);
				 * 
				 * textPriori.setText(null);
				 */
				String priori;
				priori = textPriori.getText().toUpperCase();
				

				if (priori.length() == 0) {
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("Por favor ingrese una Prioridad");

				} else if (controlador.consultarPrioridad(priori).getPrioridad().toUpperCase().equals(priori)) {
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("La prioridad" + " ' " + priori + " ' "+  " YA FUE INGRESADA");

				} else {
					prioridad.setPrioridad(priori);
					controlador.crearPrioridad(prioridad);
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("La prioridad" + " ' " + prioridad.getPrioridad() + " ' "+  " fue ingresada CORRECTAMENTE");
					textPriori.setText(null);
					
					
				}
			}

		});
	}

	public void setControlador(Controller controlServ) {
		// TODO Auto-generated method stub
		// btnIngresarPriori.addActionListener((ActionListener) controlServ);
		this.controlador = controlServ;
	}

	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		this.setBounds(500, 200, 490, 370);
		this.setLocation(580, 200);
		setVisible(true);// visualiza la ventana
	}

	public String getPrioridad() {
		try {
			return (textPriori.getText());
		} catch (NumberFormatException e) {
			return null;
		}

	}

	public void escribeCambio(String s) {
		resultado.setText(s);
		resultado.setVisible(true);
		resultado.setEnabled(true);

	}

	public void setVistaAdministrador(viewAdministrador administrador) {
		this.vistaAdministrador = administrador;
	}

}
