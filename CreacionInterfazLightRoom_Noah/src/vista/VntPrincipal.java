package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;

public class VntPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VntPrincipal() {
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(VntPrincipal.class.getResource("/modelo/Screenshot from 2026-04-02 20-14-29.png")));
		setTitle("Lightroom 4 Catalog - Adobe Photoshop Lightroom - Develop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlSuperior = new JPanel();
		contentPane.add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JMenuBar menuBar = new JMenuBar();
		pnlSuperior.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_10);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_11);
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_12);
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_15);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_17);
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu.add(separator_4);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_18);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_20);
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu_1.add(separator_5);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_21);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_22);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_23);
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu_1.add(separator_6);
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_24);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_25);
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu_1.add(separator_7);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_26);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_27);
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu_1.add(separator_8);
		
		JMenuItem mntmNewMenuItem_28 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_28);
		
		JPanel pnlCentral = new JPanel();
		contentPane.add(pnlCentral, BorderLayout.CENTER);
		
		JPanel pnlIzquierdo = new JPanel();
		contentPane.add(pnlIzquierdo, BorderLayout.WEST);
		
		JPanel pnlDerecho = new JPanel();
		contentPane.add(pnlDerecho, BorderLayout.EAST);
		
		JPanel pnlInferior = new JPanel();
		contentPane.add(pnlInferior, BorderLayout.SOUTH);

	}

}
