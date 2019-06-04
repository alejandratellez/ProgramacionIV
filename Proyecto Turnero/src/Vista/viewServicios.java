package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.SystemColor;
import javax.swing.border.TitledBorder;

import Controlador.ControlServicios;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class viewServicios extends JFrame implements IntViewServicios {

	private JLabel resultado;
	private JTextField textServicio;
	private JTextField textServ;
	private JButton btnIngresarServ;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewServicios frame = new viewServicios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public viewServicios() {
		super("Ventana Servicios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout(10, 10));
		//panelPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		
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
		lblServicio.setBounds(94, 64, 98, 30);
		lblServicio.setForeground(Color.BLACK);
		lblServicio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblServicio.setHorizontalAlignment(SwingConstants.CENTER);
		panelAux2.add(lblServicio);

		textServ = new JTextField();
		textServ.setBounds(202, 64, 159, 30);
		panelAux2.add(textServ);
		textServ.setColumns(10);

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
	}

	
	public void setControlador(ControlServicios controlServ) {
		// TODO Auto-generated method stub
		btnIngresarServ.addActionListener(controlServ);
	}

	
	public void arranca() {
		pack();// coloca los componentes
		setLocationRelativeTo(null);// centra la ventana en la pantalla
		setVisible(true);// visualiza la ventana
	}

	@Override
	public String getServicio() {
		try {
			return  (textServ.getText());
		} catch (NumberFormatException e) {
			return null;
		}
		
	}
}
