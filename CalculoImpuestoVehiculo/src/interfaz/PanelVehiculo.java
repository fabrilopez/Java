package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class PanelVehiculo extends JPanel {
	private JTextField tfMarca;
	private JTextField tfLinea;
	private JTextField tfModelo;
	private JTextField tfValor;

	/**
	 * Create the panel.
	 */
	public PanelVehiculo() {
		setBorder(new TitledBorder(null, "Datos del Vehiculo", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(5, 2, 5, 5));
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblMarca);
		
		tfMarca = new JTextField();
		add(tfMarca);
		tfMarca.setColumns(10);
		
		JLabel lblLinea = new JLabel("Linea");
		lblLinea.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblLinea);
		
		tfLinea = new JTextField();
		add(tfLinea);
		tfLinea.setColumns(10);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblModelo);
		
		tfModelo = new JTextField();
		add(tfModelo);
		tfModelo.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblValor);
		
		tfValor = new JTextField();
		tfValor.setForeground(Color.BLUE);
		tfValor.setEditable(false);
		add(tfValor);
		tfValor.setColumns(10);
		
		JLabel label = new JLabel("");
		add(label);
		
		JButton btnBuscar = new JButton("Buscar");
		add(btnBuscar);

	}
	
	public String darMarca() {
		return tfMarca.getText();
	}
	
	public String darLinea() {
		return tfLinea.getText();
	}
	
	public String darModelo() {
		return tfModelo.getText();
	}

	public void refrescarPrecio(double precio) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###.###,##");
		String strPrecio = df.format(precio);
		tfValor.setText(strPrecio);
	}
	
	public void Limpiar() {
		tfMarca.setText("");
		tfLinea.setText("");
		tfModelo.setText("");
		tfValor.setText("");
	}
	
}








