package vista;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import net.sourceforge.jdatepicker.*;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.util.Properties;

public class frmPruebas extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tablaClasificacionLiga;
	private static JProgressBar progressBar;
	private JTextField textField;
	private JDatePickerImpl seleccionaFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPruebas frame = new frmPruebas();
					frame.setVisible(true);
					avanzar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPruebas() {
		setTitle("Pruebas de Controles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 113, 444, 146);
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		contentPane.add(scrollPane);

		tablaClasificacionLiga = new JTable();
		tablaClasificacionLiga.setShowVerticalLines(false);
		scrollPane.setViewportView(tablaClasificacionLiga);
		tablaClasificacionLiga.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		tablaClasificacionLiga.setModel(new DefaultTableModel(
			new Object[][] {
				{"Athletic Club", new Short((short) 5), "5", "0", "0", "15"},
				{"Eibar", new Short((short) 5), "4", "0", "1", "12"},
				{"Osasuna", new Short((short) 5), "2", "2", "1", "8"},
				{"Alaves", new Short((short) 5), "2", "1", "2", "7"},
				{"Aviron Baoina", new Short((short) 5), "0", "2", "3", "2"},
				{"Real Sociedad", new Short((short) 5), "0", "0", "5", "0"},
				{null, null, null, null, null, null},
			},
			new String[] {
				"Equipo", "Partidos", "Ganados", "Empatados", "Perdidos", "Puntos"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Short.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});

		ButtonGroup grupoRadio = new ButtonGroup();
		JRadioButton radAukerak1 = new JRadioButton("Aukera 01");
		radAukerak1.setBounds(95, 61, 75, 23);
		contentPane.add(radAukerak1);

		JRadioButton radAukerak = new JRadioButton("Aukera 02");
		radAukerak.setSelected(true);
		radAukerak.setBounds(177, 61, 109, 23);
		contentPane.add(radAukerak);
		
		JRadioButton radAukera3 = new JRadioButton("Aukera 03");
		radAukera3.setBounds(95, 90, 109, 23);
		contentPane.add(radAukera3);

		// Añado los dos botones
		grupoRadio.add(radAukerak);
		grupoRadio.add(radAukerak1);
		grupoRadio.add(radAukera3);

		JCheckBox chckbxNewCheckBox = new JCheckBox("He leido las condiciones de uso");
		chckbxNewCheckBox.setBounds(199, 372, 240, 23);
		contentPane.add(chckbxNewCheckBox);

		JComboBox cboLurralde = new JComboBox();
		cboLurralde.setMaximumRowCount(4);
		cboLurralde.setModel(new DefaultComboBoxModel(new String[] {"Araba", "Baxe-Nafarroa", "Bizkaia", "Gipuzkoa", "Lapurdi", "Nafarroa", "Zuberoa"}));
		cboLurralde.setBounds(292, 61, 211, 22);
		contentPane.add(cboLurralde);

		JSpinner spinNumeroGoles = new JSpinner();
		spinNumeroGoles.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		spinNumeroGoles.setBounds(189, 270, 43, 20);
		contentPane.add(spinNumeroGoles);

		JLabel lblGoles = new JLabel("Numero de goles:");
		lblGoles.setBounds(95, 273, 99, 14);
		contentPane.add(lblGoles);

		JSeparator separator = new JSeparator();
		separator.setBounds(95, 343, 431, 2);
		contentPane.add(separator);

		JSlider sliderHorizontal = new JSlider();
		sliderHorizontal.setPaintLabels(true);
		sliderHorizontal.setSnapToTicks(true);
		sliderHorizontal.setMinorTickSpacing(5);
		sliderHorizontal.setBounds(95, 313, 431, 26);
		contentPane.add(sliderHorizontal);

		progressBar = new JProgressBar();
		progressBar.setValue(80);
		progressBar.setBounds(95, 412, 431, 14);
		contentPane.add(progressBar);
		
		/* ----------------------------------------------------- 
		   ------------- JDatePicker ---------------------------
		   ----------------------------------------------------- */
		// Creamos un modelo de datos para la información del calendario
		UtilDateModel modeloFechas = new UtilDateModel();
									
		// Ponemos la fecha inicial que se verá en el campo
		modeloFechas.setDate(2026,2,1);   									// Los meses van de 0 a 11.
		
		// Utilizamos un objeto de propiedades para definir las propiedades básicas del calendario
		Properties propiedadesFecha = new Properties();
		propiedadesFecha.put("text.today", "Gaur");
		propiedadesFecha.put("text.month", "Hilabetea");
		propiedadesFecha.put("text.year", "Urtea");
		
		// Creamos un panel que es donde se va a representar el campo
        JDatePanelImpl panFecha = new JDatePanelImpl(modeloFechas);
        		
		seleccionaFecha = new JDatePickerImpl( panFecha, new AbstractFormatter());
		seleccionaFecha.setBounds(399, 270, 127, 32);
		contentPane.add(seleccionaFecha);
		
		JLabel lblSeleccionarFecha = new JLabel("Selecciona Fecha:");
		lblSeleccionarFecha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSeleccionarFecha.setBounds(284, 273, 109, 14);
		contentPane.add(lblSeleccionarFecha);
		
		JSlider sliderVertical = new JSlider();
		sliderVertical.setValue(16);
		sliderVertical.setMaximum(64);
		sliderVertical.setPaintTicks(true);
		sliderVertical.setPaintLabels(true);
		sliderVertical.setOrientation(SwingConstants.VERTICAL);
		sliderVertical.setBounds(10, 11, 46, 410);
		contentPane.add(sliderVertical);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	private static void avanzar() {
		// muevo la barra de progreso
		for (int i = 0; i < 100; i++) {

			try {
				progressBar.setValue(i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				// Espero 2 segundos
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
	}
}
