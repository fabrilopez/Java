package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfazImpuestoVehiculo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazImpuestoVehiculo frame = new InterfazImpuestoVehiculo();
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
	public InterfazImpuestoVehiculo() {
		setTitle("C\u00E1lculo Impuestos");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		PanelVehiculo panelVehiculo = new PanelVehiculo();
		contentPane.add(panelVehiculo, BorderLayout.NORTH);
		
		PanelDescuentos panelDescuentos = new PanelDescuentos();
		contentPane.add(panelDescuentos, BorderLayout.CENTER);
		
		PanelResultados panelResultados = new PanelResultados();
		contentPane.add(panelResultados, BorderLayout.SOUTH);
	}

}
