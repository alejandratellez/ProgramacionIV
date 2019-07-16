package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Controlador.Controller;
import Modelo.Asesor;
import Modelo.Prioridad;
import Modelo.PuestosAtencion;
import Modelo.Servicio;

import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class viewPuestosAtencion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel resultado;
	private JTextField textPuesto;
	private JButton btnIngresarPuesto;
	JCheckBox chckbxNewCheckBox = new JCheckBox("Activo");
	private JComboBox<String> comboBoxAsesor = new JComboBox<String>();
	public Controller controlador = new Controller();

	public viewAdministrador vistaAdministrador = new viewAdministrador();
	public PuestosAtencion puestoAtencion = new PuestosAtencion();

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewPuestosAtencion frame = new viewPuestosAtencion();
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
	public viewPuestosAtencion() {
		super("Ventana Puestos Atencion");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(500, 200, 446, 366);
		JPanel panelPrincipal = new JPanel();
		// panelPrincipal.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0,
		// 0)));

		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(null);
		JLabel lblTitulo = new JLabel("INGRESAR PUESTO ATENCION");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(38, 11, 362, 23);
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

		JLabel lblPriori = new JLabel("PUESTO ATENCION:");
		lblPriori.setBounds(38, 30, 172, 30);
		lblPriori.setBackground(Color.LIGHT_GRAY);
		lblPriori.setForeground(Color.BLACK);
		lblPriori.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPriori.setHorizontalAlignment(SwingConstants.CENTER);
		panelAux2.add(lblPriori);

		textPuesto = new JTextField();
		textPuesto.setBounds(220, 30, 159, 30);
		panelAux2.add(textPuesto);
		textPuesto.setColumns(10);

		resultado = new JLabel("Mensaje");
		resultado.setHorizontalAlignment(SwingConstants.CENTER);
		resultado.setBounds(21, 201, 390, 14);
		resultado.setEnabled(false);
		resultado.setVisible(false);
		panelAux2.add(resultado);

		JLabel lblAsesor = new JLabel("ASESOR:");
		lblAsesor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAsesor.setForeground(Color.BLACK);
		lblAsesor.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAsesor.setBackground(Color.LIGHT_GRAY);
		lblAsesor.setBounds(118, 71, 92, 30);
		panelAux2.add(lblAsesor);
		
		

		

		
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNewCheckBox.setBounds(157, 135, 130, 23);
		panelAux2.add(chckbxNewCheckBox);
		
		
		comboBoxAsesor.setBounds(220, 74, 159, 30);
		panelAux2.add(comboBoxAsesor);
		
		
		List<Asesor> itemsPrioridad;
		comboBoxAsesor.addItem(" ");
		itemsPrioridad = controlador.listarAsesor();
		for (int i = 0; i < itemsPrioridad.size(); i++) {
			comboBoxAsesor.addItem(itemsPrioridad.get(i).getNombre());
		}

		JPanel panelAux3 = new JPanel();
		panelAux3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panelAux3.setBackground(Color.BLACK);
		panelAux3.setBounds(0, 269, 435, 58);
		panelPrincipal.add(panelAux3);
		panelAux3.setLayout(null);

		btnIngresarPuesto = new JButton("Ingresar Puesto");

		btnIngresarPuesto.setBounds(144, 11, 168, 36);
		panelAux3.add(btnIngresarPuesto);
		getContentPane().add(panelPrincipal);

		btnIngresarPuesto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String puesto;
				puesto = textPuesto.getText().toUpperCase();

				if (puesto.length() == 0) {
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("Por favor ingrese un nombre para el puesto de atencion");

				} else if (controlador.consultarPuestoNombre(puesto).getNombre().toUpperCase().equals(puesto)) {
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("El puesto de atencion" + " ' " + puesto + " ' " + " YA FUE INGRESADO");

				} else {
					
					puestoAtencion.setAsesor(new ArrayList<Asesor>());
					Asesor asesor =  controlador.consultarAsesorNombre((String) comboBoxAsesor.getSelectedItem());
					puestoAtencion.setNombre(puesto);
					
					
					puestoAtencion.getAsesor().add(controlador.consultarAsesor(asesor.getId()));
					
					puestoAtencion.setEstado(chckbxNewCheckBox.isSelected());				
					controlador.crearPuesto(puestoAtencion);
					resultado.setVisible(true);
					resultado.setEnabled(true);
					resultado.setText("El puesto de Atencion" + " ' " + puestoAtencion.getNombre() + " ' "
							+ " fue ingresado CORRECTAMENTE");
					textPuesto.setText(null);

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
			return (textPuesto.getText());
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
