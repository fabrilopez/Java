package interfaz;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JCheckBox;

public class PanelDescuentos extends JPanel {
	private JCheckBox chckbxServicioPublico;
	private JCheckBox chckbxTrasladoDeCuenta;
	private JCheckBox chckbxProntoPago;

	/**
	 * Create the panel.
	 */
	public PanelDescuentos() {
		setBorder(new TitledBorder(null, "Descuentos", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		setLayout(new GridLayout(2, 2, 5, 5));
		
		chckbxProntoPago = new JCheckBox("Pronto Pago");
		add(chckbxProntoPago);
		
		chckbxTrasladoDeCuenta = new JCheckBox("Traslado de Cuenta");
		add(chckbxTrasladoDeCuenta);
		
		chckbxServicioPublico = new JCheckBox("Servicio Publico");
		add(chckbxServicioPublico);

	}

	public boolean hayDescuentoProntoPago() {
		return chckbxProntoPago.isSelected();
	}
	
	public boolean hayDescuentoTrasladoDeCuenta() {
		return chckbxTrasladoDeCuenta.isSelected();
	}
	
	public boolean hayDescuentoServicioPublico() {
		return chckbxServicioPublico.isSelected();
	}
	
	public void Limpiar() {
		chckbxProntoPago.setSelected(false);
		chckbxTrasladoDeCuenta.setSelected(false);
		chckbxServicioPublico.setSelected(false);
	}
}








