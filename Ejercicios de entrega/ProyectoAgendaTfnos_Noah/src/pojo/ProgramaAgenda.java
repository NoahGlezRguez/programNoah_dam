package pojo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.MatteBorder;

public class ProgramaAgenda extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel pnlPrincipal;
	private JTextField txtBusNombre;
	private JTextField txtNombreNuevo;
	private JTextField txtEmail;
	private JTextField txtTfnoNuevo;
	private JTextField txtTfno;
	private JButton btnPBuscar;
	private JButton btnPMostrar;
	private JButton btnPAgregar;
	private JButton btnPEliminar;
	private JButton btnBuscar;
	private JButton btnMostrar;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JPanel pnlBuscar = new JPanel();
	private JPanel pnlMostrar = new JPanel();
	private JPanel pnlAgregar = new JPanel();
	private JPanel pnlEliminar = new JPanel();
	private JPanel paneles[]= {pnlBuscar, pnlMostrar, pnlAgregar, pnlEliminar};

	public ProgramaAgenda(CListaTfnos agenda) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 985, 786);
		pnlPrincipal = new JPanel();
		pnlPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlPrincipal);
		pnlPrincipal.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlSup = new JPanel();
		pnlSup.setBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(47, 79, 79)));
		pnlPrincipal.add(pnlSup, BorderLayout.NORTH);
		pnlSup.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlCabecera = new JPanel();
		pnlCabecera.setForeground(new Color(255, 255, 255));
		pnlCabecera.setBackground(new Color(0, 0, 128));
		FlowLayout fl_pnlCabecera = (FlowLayout) pnlCabecera.getLayout();
		fl_pnlCabecera.setAlignOnBaseline(true);
		fl_pnlCabecera.setVgap(10);
		fl_pnlCabecera.setHgap(10);
		pnlSup.add(pnlCabecera, BorderLayout.NORTH);
		
		JLabel lblTitulo = new JLabel("MI AGENDA DE CONTACTOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(250, 250, 210));
		lblTitulo.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 30));
		pnlCabecera.add(lblTitulo);
		
		JPanel pnlBotones = new JPanel();
		pnlBotones.setBackground(new Color(253, 245, 230));
		pnlSup.add(pnlBotones, BorderLayout.SOUTH);
		
		btnPBuscar = new JButton("Buscar");
		btnPBuscar.setIgnoreRepaint(true);
		btnPBuscar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPBuscar.setForeground(new Color(0, 0, 128));
		btnPBuscar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnPBuscar.setBounds(new Rectangle(4, 4, 4, 4));
		btnPBuscar.setBorderPainted(false);
		btnPBuscar.setBackground(new Color(253, 245, 230));
		btnPBuscar.addActionListener(this);
		pnlBotones.add(btnPBuscar);
		
		btnPMostrar = new JButton("Mostrar Contactos");
		btnPMostrar.setIgnoreRepaint(true);
		btnPMostrar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPMostrar.setForeground(new Color(0, 0, 128));
		btnPMostrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnPMostrar.setBounds(new Rectangle(4, 4, 4, 4));
		btnPMostrar.setBorderPainted(false);
		btnPMostrar.setBackground(new Color(253, 245, 230));
		btnPMostrar.addActionListener(this);
		pnlBotones.add(btnPMostrar);
		
		btnPAgregar = new JButton("Agregar Contacto");
		btnPAgregar.setIgnoreRepaint(true);
		btnPAgregar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPAgregar.setForeground(new Color(0, 0, 128));
		btnPAgregar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnPAgregar.setBounds(new Rectangle(4, 4, 4, 4));
		btnPAgregar.setBorderPainted(false);
		btnPAgregar.setBackground(new Color(253, 245, 230));
		btnPAgregar.addActionListener(this);
		pnlBotones.add(btnPAgregar);
		
		btnPEliminar = new JButton("Eliminar Contacto");
		btnPEliminar.setIgnoreRepaint(true);
		btnPEliminar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnPEliminar.setForeground(new Color(0, 0, 128));
		btnPEliminar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnPEliminar.setBounds(new Rectangle(4, 4, 4, 4));
		btnPEliminar.setBorderPainted(false);
		btnPEliminar.setBackground(new Color(253, 245, 230));
		btnPEliminar.addActionListener(this);
		pnlBotones.add(btnPEliminar);
		
		JPanel pnlInf = new JPanel();
		pnlInf.setBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(47, 79, 79)));
		pnlInf.setBackground(new Color(0, 0, 128));
		pnlInf.setPreferredSize(new Dimension(10, 180));
		pnlPrincipal.add(pnlInf, BorderLayout.SOUTH);
		pnlInf.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitularData = new JLabel("Información");
		lblTitularData.setBorder(new EmptyBorder(5, 5, 5, 5));
		lblTitularData.setOpaque(true);
		lblTitularData.setBackground(new Color(192, 192, 192));
		lblTitularData.setFont(new Font("Nirmala UI Semilight", Font.BOLD, 16));
		lblTitularData.setPreferredSize(new Dimension(57, 30));
		lblTitularData.setMaximumSize(new Dimension(12, 50));
		lblTitularData.setSize(new Dimension(0, 50));
		lblTitularData.setHorizontalAlignment(SwingConstants.CENTER);
		pnlInf.add(lblTitularData, BorderLayout.NORTH);
		
		JLabel lblData = new JLabel("---");
		lblData.setOpaque(true);
		lblData.setBackground(new Color(220, 220, 220));
		lblData.setPreferredSize(new Dimension(12, 150));
		lblData.setMinimumSize(new Dimension(12, 50));
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		pnlInf.add(lblData, BorderLayout.SOUTH);
		
		JPanel pnlCen = new JPanel();
		pnlCen.setBorder(new MatteBorder(1, 2, 1, 2, (Color) new Color(47, 79, 79)));
		pnlPrincipal.add(pnlCen, BorderLayout.CENTER);
		pnlCen.setLayout(new CardLayout(0, 0));
		
		pnlBuscar.setVisible(false);
		pnlBuscar.setBackground(new Color(230, 230, 250));
		pnlCen.add(pnlBuscar, "name_200791984941300");
		GridBagLayout gbl_pnlBuscar = new GridBagLayout();
		gbl_pnlBuscar.columnWidths = new int[]{385, 130, 308, 166, 0};
		gbl_pnlBuscar.rowHeights = new int[]{197, 72, 50, 65, 114, 0};
		gbl_pnlBuscar.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlBuscar.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pnlBuscar.setLayout(gbl_pnlBuscar);
		
		JLabel lblMsgBuscar_1 = new JLabel("Ingresa el nombre de tu contacto:");
		lblMsgBuscar_1.setPreferredSize(new Dimension(350, 60));
		lblMsgBuscar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsgBuscar_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblMsgBuscar_1 = new GridBagConstraints();
		gbc_lblMsgBuscar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMsgBuscar_1.gridx = 0;
		gbc_lblMsgBuscar_1.gridy = 1;
		pnlBuscar.add(lblMsgBuscar_1, gbc_lblMsgBuscar_1);
		
		txtBusNombre = new JTextField();
		txtBusNombre.setPreferredSize(new Dimension(200, 35));
		txtBusNombre.setHorizontalAlignment(SwingConstants.CENTER);
		txtBusNombre.setColumns(10);
		GridBagConstraints gbc_txtBusNombre = new GridBagConstraints();
		gbc_txtBusNombre.gridwidth = 2;
		gbc_txtBusNombre.fill = GridBagConstraints.BOTH;
		gbc_txtBusNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtBusNombre.gridx = 1;
		gbc_txtBusNombre.gridy = 1;
		pnlBuscar.add(txtBusNombre, gbc_txtBusNombre);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(0, 0, 128));
		btnBuscar.setBackground(new Color(240, 248, 255));
		btnBuscar.setBounds(new Rectangle(5, 5, 5, 5));
		btnBuscar.setBorder(new LineBorder(new Color(47, 79, 79)));
		btnBuscar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnBuscar.addActionListener(this);
		GridBagConstraints gbc_btnBuscar = new GridBagConstraints();
		gbc_btnBuscar.fill = GridBagConstraints.BOTH;
		gbc_btnBuscar.insets = new Insets(0, 0, 5, 5);
		gbc_btnBuscar.gridx = 1;
		gbc_btnBuscar.gridy = 3;
		pnlBuscar.add(btnBuscar, gbc_btnBuscar);
		
		pnlMostrar.setBackground(new Color(230, 230, 250));
		pnlCen.add(pnlMostrar, "name_200791993474400");
		GridBagLayout gbl_pnlMostrar = new GridBagLayout();
		gbl_pnlMostrar.columnWidths = new int[]{105, 778, 103, 0};
		gbl_pnlMostrar.rowHeights = new int[]{0, 43, 0, 0, 0};
		gbl_pnlMostrar.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pnlMostrar.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlMostrar.setLayout(gbl_pnlMostrar);
		
		JLabel lblMostrarAgenda = new JLabel("Mostrar agenda:");
		lblMostrarAgenda.setPreferredSize(new Dimension(350, 60));
		lblMostrarAgenda.setHorizontalAlignment(SwingConstants.CENTER);
		lblMostrarAgenda.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblMostrarAgenda = new GridBagConstraints();
		gbc_lblMostrarAgenda.insets = new Insets(0, 0, 5, 5);
		gbc_lblMostrarAgenda.gridx = 1;
		gbc_lblMostrarAgenda.gridy = 0;
		pnlMostrar.add(lblMostrarAgenda, gbc_lblMostrarAgenda);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setForeground(new Color(0, 0, 128));
		btnMostrar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnMostrar.setBounds(new Rectangle(5, 5, 5, 5));
		btnMostrar.setBorder(new LineBorder(new Color(47, 79, 79)));
		btnMostrar.setBackground(new Color(240, 248, 255));
		btnMostrar.addActionListener(this);
		GridBagConstraints gbc_btnMostrar = new GridBagConstraints();
		gbc_btnMostrar.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrar.gridx = 1;
		gbc_btnMostrar.gridy = 1;
		pnlMostrar.add(btnMostrar, gbc_btnMostrar);
		
		JTextArea txaMostrarAgen = new JTextArea();
		GridBagConstraints gbc_txaMostrarAgen = new GridBagConstraints();
		gbc_txaMostrarAgen.insets = new Insets(0, 0, 5, 5);
		gbc_txaMostrarAgen.fill = GridBagConstraints.BOTH;
		gbc_txaMostrarAgen.gridx = 1;
		gbc_txaMostrarAgen.gridy = 2;
		pnlMostrar.add(txaMostrarAgen, gbc_txaMostrarAgen);
		
		pnlAgregar.setVisible(false);
		pnlAgregar.setBackground(new Color(230, 230, 250));
		pnlCen.add(pnlAgregar, "name_200792001170300");
		GridBagLayout gbl_pnlAgregar = new GridBagLayout();
		gbl_pnlAgregar.columnWidths = new int[]{164, 300, 125, 277, 112, 0};
		gbl_pnlAgregar.rowHeights = new int[]{90, 44, 67, 0, 60, 0, 57, 0, 0};
		gbl_pnlAgregar.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlAgregar.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlAgregar.setLayout(gbl_pnlAgregar);
		
		JLabel lblAgregar_1 = new JLabel("Agregar contacto:");
		lblAgregar_1.setPreferredSize(new Dimension(350, 60));
		lblAgregar_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblAgregar_1 = new GridBagConstraints();
		gbc_lblAgregar_1.gridwidth = 3;
		gbc_lblAgregar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregar_1.gridx = 1;
		gbc_lblAgregar_1.gridy = 0;
		pnlAgregar.add(lblAgregar_1, gbc_lblAgregar_1);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setPreferredSize(new Dimension(350, 60));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 2;
		pnlAgregar.add(lblNombre, gbc_lblNombre);
		
		txtNombreNuevo = new JTextField();
		txtNombreNuevo.setColumns(10);
		GridBagConstraints gbc_txtNombreNuevo = new GridBagConstraints();
		gbc_txtNombreNuevo.gridwidth = 2;
		gbc_txtNombreNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombreNuevo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombreNuevo.gridx = 2;
		gbc_txtNombreNuevo.gridy = 2;
		pnlAgregar.add(txtNombreNuevo, gbc_txtNombreNuevo);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setPreferredSize(new Dimension(350, 60));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 1;
		gbc_lblEmail.gridy = 3;
		pnlAgregar.add(lblEmail, gbc_lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 2;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 2;
		gbc_txtEmail.gridy = 3;
		pnlAgregar.add(txtEmail, gbc_txtEmail);
		
		JLabel lblTfno = new JLabel("Teléfono:");
		lblTfno.setPreferredSize(new Dimension(350, 60));
		lblTfno.setHorizontalAlignment(SwingConstants.CENTER);
		lblTfno.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblTfno = new GridBagConstraints();
		gbc_lblTfno.insets = new Insets(0, 0, 5, 5);
		gbc_lblTfno.gridx = 1;
		gbc_lblTfno.gridy = 4;
		pnlAgregar.add(lblTfno, gbc_lblTfno);
		
		txtTfnoNuevo = new JTextField();
		txtTfnoNuevo.setColumns(10);
		GridBagConstraints gbc_txtTfnoNuevo = new GridBagConstraints();
		gbc_txtTfnoNuevo.gridwidth = 2;
		gbc_txtTfnoNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_txtTfnoNuevo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTfnoNuevo.gridx = 2;
		gbc_txtTfnoNuevo.gridy = 4;
		pnlAgregar.add(txtTfnoNuevo, gbc_txtTfnoNuevo);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setForeground(new Color(0, 0, 128));
		btnAgregar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnAgregar.setBounds(new Rectangle(5, 5, 5, 5));
		btnAgregar.setBorder(new LineBorder(new Color(47, 79, 79)));
		btnAgregar.setBackground(new Color(240, 248, 255));
		btnAgregar.addActionListener(this);
		GridBagConstraints gbc_btnAgregar = new GridBagConstraints();
		gbc_btnAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAgregar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAgregar.gridx = 2;
		gbc_btnAgregar.gridy = 6;
		pnlAgregar.add(btnAgregar, gbc_btnAgregar);
		
		pnlEliminar.setVisible(false);
		pnlEliminar.setBackground(new Color(230, 230, 250));
		pnlCen.add(pnlEliminar, "name_200792008735700");
		GridBagLayout gbl_pnlEliminar = new GridBagLayout();
		gbl_pnlEliminar.columnWidths = new int[]{70, 229, 124, 293, 0, 0};
		gbl_pnlEliminar.rowHeights = new int[]{0, 0, 0, 53, 0, 57, 0, 0};
		gbl_pnlEliminar.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlEliminar.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pnlEliminar.setLayout(gbl_pnlEliminar);
		
		JLabel lblAgregar_1_1 = new JLabel("Eliminar contacto:");
		lblAgregar_1_1.setPreferredSize(new Dimension(350, 60));
		lblAgregar_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_1_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
		GridBagConstraints gbc_lblAgregar_1_1 = new GridBagConstraints();
		gbc_lblAgregar_1_1.gridwidth = 3;
		gbc_lblAgregar_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregar_1_1.gridx = 1;
		gbc_lblAgregar_1_1.gridy = 1;
		pnlEliminar.add(lblAgregar_1_1, gbc_lblAgregar_1_1);
		
		JLabel lblAgregar_1_1_1 = new JLabel("Indicar contacto:");
		lblAgregar_1_1_1.setPreferredSize(new Dimension(350, 60));
		lblAgregar_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAgregar_1_1_1.setFont(new Font("Segoe UI Historic", Font.BOLD, 15));
		GridBagConstraints gbc_lblAgregar_1_1_1 = new GridBagConstraints();
		gbc_lblAgregar_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregar_1_1_1.gridx = 1;
		gbc_lblAgregar_1_1_1.gridy = 3;
		pnlEliminar.add(lblAgregar_1_1_1, gbc_lblAgregar_1_1_1);
		
		txtTfno = new JTextField();
		GridBagConstraints gbc_txtTfno = new GridBagConstraints();
		gbc_txtTfno.gridwidth = 2;
		gbc_txtTfno.insets = new Insets(0, 0, 5, 5);
		gbc_txtTfno.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTfno.gridx = 2;
		gbc_txtTfno.gridy = 3;
		pnlEliminar.add(txtTfno, gbc_txtTfno);
		txtTfno.setColumns(10);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(0, 0, 128));
		btnEliminar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnEliminar.setBounds(new Rectangle(5, 5, 5, 5));
		btnEliminar.setBorder(new LineBorder(new Color(47, 79, 79)));
		btnEliminar.setBackground(new Color(240, 248, 255));
		btnEliminar.addActionListener(this);
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.fill = GridBagConstraints.BOTH;
		gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEliminar.gridx = 2;
		gbc_btnEliminar.gridy = 5;
		pnlEliminar.add(btnEliminar, gbc_btnEliminar);

	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == btnPBuscar) {
			activarPanel(pnlBuscar);
		}else if (evento.getSource() == btnPMostrar) {
			activarPanel(pnlMostrar);
		}else if (evento.getSource() == btnPAgregar) {
			activarPanel(pnlAgregar);
		}else if (evento.getSource() == btnPEliminar) {
			activarPanel(pnlEliminar);
		}else if (evento.getSource() == btnBuscar) {
			realizarBusqueda();
		}else if (evento.getSource() == btnMostrar) {
			mostrarContactos();
		}else if (evento.getSource() == btnAgregar) {
			agregarContacto();
		}else if (evento.getSource() == btnEliminar) {
			eliminarContacto();
		}
	}

	private void activarPanel(JPanel panelVisible) {
		for (int i = 0; i < paneles.length; i++) {
			if (paneles[i].equals(panelVisible)) {
				paneles[i].setVisible(true);
			}
			else {
				paneles[i].setVisible(false);
			}
		}
	}
	
	private void realizarBusqueda() {
		
	}
	
	private void mostrarContactos() {
		
	}
	
	private void agregarContacto() {
		
	}
	
	private void eliminarContacto() {
		
	}
}
