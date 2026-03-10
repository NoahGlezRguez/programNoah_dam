package ejercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Ventana7 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	
	private JButton bAgregarContacto;
	
	private JTextField tNombre;
	private JTextField tApellidos;
	private JTextField tDNI;
	private JTextField tTelefono;
	
	private JTable tbAgenda;
	
	private JLabel lAgendaActualizada;
	private JLabel lTbNombre;
	private JLabel lTbApellidos;
	private JLabel lTbDNI;
	private JLabel lTbTelefono;

	private JLabel lNuevoContacto;
	private JLabel lNombre;
	private JLabel lApellidos;
	private JLabel lDNI;
	private JLabel lTelefono;
	
	private JSeparator separadorVertical; 
	
	private final int NOMBRE_SIZE = 140;
	private final int APELLIDOS_SIZE = 200;
	private final int DNI_SIZE = 90;
	private final int TFNO_SIZE = 100;
	
	private final int X_TABLA = 647;
	private final int Y_TABLA = 238;
	private final int ANCHO_TABLA = 712;
	private final int ALTO_TABLA = 250;
	
	public Ventana7() {
		setTitle("Mi agenda de contactos");	
		setearContenidoInicial();
	}
	
	private void setearContenidoInicial() {
		
		Object[][] contenidoVacioTabla = new Object[][] {
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
			{null, null, null, null, null},
		};
		
		//Compone el panel base
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1445, 730);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		//Crea y coloca los label, textfields y el boton de la parte rellenable por el usuario
		crearFormulario();
		
		separadorVertical = new JSeparator();
		separadorVertical.setOrientation(SwingConstants.VERTICAL);
		separadorVertical.setBounds(583, 32, 2, 629);
		panelPrincipal.add(separadorVertical);
		
		//Crea y coloca una tabla vacía con unas label externas
		crearLabelsTabla();
		crearJTablaAgenda(contenidoVacioTabla);
	}

	private void crearFormulario() {

		Font fuenteLabels;
		Font fuenteTextFields;
		
		fuenteLabels = new Font("SimSun-ExtB", Font.BOLD, 18);
		fuenteTextFields = new Font("SimSun-ExtB", Font.PLAIN, 18);
		
		lNuevoContacto = new JLabel("Nuevo Contacto");
		lNombre = new JLabel("Nombre");
		lApellidos = new JLabel("Apellidos");
		lDNI = new JLabel("DNI");
		lTelefono = new JLabel("Telefono");
		
		tNombre = new JTextField();
		tApellidos = new JTextField();
		tDNI = new JTextField();
		tTelefono = new JTextField();
		
		bAgregarContacto = new JButton();
		
		lNuevoContacto.setHorizontalAlignment(SwingConstants.CENTER);
		lNuevoContacto.setFont(new Font("SimSun-ExtB", Font.BOLD, 21));
		lNuevoContacto.setBounds(178, 82, 198, 37);
		
		lNombre.setFont(fuenteLabels);
		lApellidos.setFont(fuenteLabels);
		lDNI.setFont(fuenteLabels);
		lTelefono.setFont(fuenteLabels);

		lNombre.setBounds(44, 183, 92, 37);	
		lApellidos.setBounds(44, 285, 92, 37);
		lDNI.setBounds(44, 387, 92, 37);
		lTelefono.setBounds(44, 496, 92, 37);

		lNombre.setLabelFor(tNombre);
		lApellidos.setLabelFor(tApellidos);
		lDNI.setLabelFor(tDNI);
		lTelefono.setLabelFor(tTelefono);
		
		panelPrincipal.add(lNuevoContacto);
		panelPrincipal.add(lNombre);
		panelPrincipal.add(lApellidos);
		panelPrincipal.add(lDNI);
		panelPrincipal.add(lTelefono);
		
		tNombre.setFont(fuenteTextFields);
		tApellidos.setFont(fuenteTextFields);
		tDNI.setFont(fuenteTextFields);
		tTelefono.setFont(fuenteTextFields);

		tNombre.setBounds(191, 187, 332, 29);
		tApellidos.setBounds(191, 289, 332, 29);
		tDNI.setBounds(191, 391, 332, 29);
		tTelefono.setBounds(191, 493, 332, 29);
		
		tNombre.setColumns(10);
		tApellidos.setColumns(10);
		tDNI.setColumns(10);
		tTelefono.setColumns(10);

		panelPrincipal.add(tNombre);
		panelPrincipal.add(tApellidos);		
		panelPrincipal.add(tDNI);
		panelPrincipal.add(tTelefono);

		bAgregarContacto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bAgregarContacto.setBounds(379, 579, 144, 37);
		bAgregarContacto.setText("Agregar contacto");
		
		panelPrincipal.add(bAgregarContacto);
		
		panelPrincipal.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{tNombre, tApellidos, tDNI, tTelefono, bAgregarContacto}));
	}
	
	private void crearLabelsTabla() {
		
		Font fuenteLabelTabla = new Font("Candara Light", Font.BOLD, 18);
		
		lAgendaActualizada = new JLabel("Mi agenda actualizada");
		lTbNombre = new JLabel("Nombre");
		lTbApellidos = new JLabel("Apellidos");
		lTbDNI = new JLabel("DNI");
		lTbTelefono = new JLabel("Telefono");

		lAgendaActualizada.setHorizontalAlignment(SwingConstants.CENTER);
		
		lAgendaActualizada.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		lTbNombre.setFont(fuenteLabelTabla);
		lTbApellidos.setFont(fuenteLabelTabla);
		lTbDNI.setFont(fuenteLabelTabla);
		lTbTelefono.setFont(fuenteLabelTabla);
		
		lAgendaActualizada.setBounds(871, 82, 265, 37);
		lTbNombre.setBounds(703, 211, 79, 28);
		lTbApellidos.setBounds(916, 211, 79, 28);
		lTbDNI.setBounds(1128, 211, 38, 28);
		lTbTelefono.setBounds(1247, 211, 79, 28);
		
		panelPrincipal.add(lAgendaActualizada);
		panelPrincipal.add(lTbNombre);
		panelPrincipal.add(lTbApellidos);
		panelPrincipal.add(lTbDNI);
		panelPrincipal.add(lTbTelefono);	
	}
	
	private void crearJTablaAgenda(Object[][] contenidoTabla) {

		String columnas[] = {"Nombre", "Apellidos", "DNI", "Telefono"};
		
		tbAgenda = new JTable();
		tbAgenda.setRowSelectionAllowed(false);
		
		tbAgenda.setBounds(X_TABLA, Y_TABLA, ANCHO_TABLA, ALTO_TABLA);
		
		tbAgenda.setFont(new Font("SimSun-ExtB", Font.PLAIN, 18));
		tbAgenda.setBackground(new Color(240, 248, 255));
		tbAgenda.setBorder(new LineBorder(new Color(0, 0, 128), 2, true));
		tbAgenda.setModel(new DefaultTableModel(contenidoTabla, columnas));
		
		tbAgenda.getColumnModel().getColumn(0).setPreferredWidth(NOMBRE_SIZE);
		tbAgenda.getColumnModel().getColumn(1).setPreferredWidth(APELLIDOS_SIZE);
		tbAgenda.getColumnModel().getColumn(2).setPreferredWidth(DNI_SIZE);
		tbAgenda.getColumnModel().getColumn(3).setPreferredWidth(TFNO_SIZE);
		
		tbAgenda.setRowHeight(50);

		tbAgenda.setFocusable(false);
		
		panelPrincipal.add(tbAgenda);
	}
	
//	private String[][] recogerDatos() {
//		Object[][] datosLeidos = new Object[5][5];
//	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == bAgregarContacto) {
			System.out.println();
		}
	}
}
