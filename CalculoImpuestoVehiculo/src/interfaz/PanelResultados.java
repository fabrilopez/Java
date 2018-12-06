package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelResultados extends JPanel {
	private JTextField tfTotalAPagar;

	/**
	 * Create the panel.
	 */
	public PanelResultados() {
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(2, 3, 5, 5));
		
		JLabel label = new JLabel("");
		add(label);
		
		JLabel label_1 = new JLabel("");
		add(label_1);
		
		JButton btnLimpiar = new JButton("Limpiar");
		add(btnLimpiar);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar");
		lblTotalAPagar.setFont(new Font("Tahoma", Font.BOLD, 11));
		add(lblTotalAPagar);
		
		tfTotalAPagar = new JTextField();
		tfTotalAPagar.setForeground(Color.BLUE);
		tfTotalAPagar.setEditable(false);
		add(tfTotalAPagar);
		tfTotalAPagar.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		add(btnCalcular);

	}
	
	public void RefrescarPago(double pago) {
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		df.applyPattern("$ ###.###,##");
		String strPago = df.format(pago);
		tfTotalAPagar.setText(strPago);
	}
	
	public void Limpiar() {
		tfTotalAPagar.setText("");
		
	}
	

}





