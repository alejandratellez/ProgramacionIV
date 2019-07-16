package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controlador.Controller;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewAdministrador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JButton btnAdmPrioridad = new JButton("Prioridades");
	JButton btnAsesores = new JButton("Asesores");
	JButton btnPuestosDeAtencion = new JButton("Puestos de Atencion");
	JButton btnServ = new JButton("Servicios");
	Controller controlador = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewAdministrador frame = new viewAdministrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public viewAdministrador() {
		super("Ventana Administrador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500, 200, 490, 370);
		getContentPane().setLayout(null);

		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setBounds(0, 0, 474, 331);
		getContentPane().add(panelPrincipal);
		panelPrincipal.setLayout(null);
		btnAdmPrioridad.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnAdmPrioridad.setForeground(Color.WHITE);
		btnAdmPrioridad.setBackground(Color.BLACK);
		btnAdmPrioridad.setBounds(276, 46, 131, 46);
		btnAsesores.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnAsesores.setForeground(Color.WHITE);
		btnAsesores.setBackground(Color.BLACK);
		btnAsesores.setBounds(276, 134, 131, 46);

		JPanel panelCentro = new JPanel();
		panelCentro.setBounds(0, 45, 474, 286);
		panelPrincipal.add(panelCentro);
		btnPuestosDeAtencion.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnPuestosDeAtencion.setForeground(Color.WHITE);
		btnPuestosDeAtencion.setBackground(Color.BLACK);
		btnPuestosDeAtencion.setBounds(55, 134, 150, 46);
		panelCentro.setLayout(null);
		btnServ.setFont(new Font("Tahoma", Font.PLAIN, 13));

		btnServ.setForeground(Color.WHITE);
		btnServ.setBackground(Color.BLACK);
		btnServ.setBounds(55, 46, 150, 46);
		panelCentro.add(btnServ);
		panelCentro.add(btnPuestosDeAtencion);
		panelCentro.add(btnAsesores);
		panelCentro.add(btnAdmPrioridad);

		JPanel panelTitulo = new JPanel();
		panelTitulo.setBounds(0, 0, 474, 45);
		panelPrincipal.add(panelTitulo);
		panelTitulo.setBackground(new Color(0, 0, 0));
		panelTitulo.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));

		JLabel lblNewLabel = new JLabel("ADMINISTRADOR ");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelTitulo.add(lblNewLabel);

		btnAdmPrioridad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				viewPrioridad vistaPrioridad = new viewPrioridad();

				vistaPrioridad.arranca();

			}

		});

		btnAsesores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				viewAsesor vistaAsesor = new viewAsesor();

				vistaAsesor.arranca();

			}

		});
		
		btnPuestosDeAtencion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				viewPuestosAtencion vistaPuestos = new viewPuestosAtencion();

				vistaPuestos.arranca();

			}

		});

		btnServ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				viewServicios vistaServicio = new viewServicios();

				vistaServicio.arranca();

			}

		});

	}

	public void arranca() {
		pack();// coloca los componentes

		this.setBounds(500, 200, 490, 370);
		this.setLocation(100, 200);

		setVisible(true);// visualiza la ventana

	}

	public void setControlador(Controller controlador) {
		this.controlador = controlador;
	}

}
