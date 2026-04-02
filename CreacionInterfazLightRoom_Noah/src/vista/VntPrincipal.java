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
import javax.swing.JCheckBoxMenuItem;

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
		
		JMenu mn1 = new JMenu("Archivo");
		menuBar.add(mn1);
		
		JMenuItem mnFile1 = new JMenuItem("Nuevo catálogo...");
		mn1.add(mnFile1);
		
		JMenuItem mnFile2 = new JMenuItem("Abrir catálogo...");
		mn1.add(mnFile2);
		
		JMenuItem mnFile3 = new JMenuItem("Optimizar catálogo...");
		mn1.add(mnFile3);
		
		JMenuItem mnFile4 = new JMenuItem("Importar perfiles y ajustes...");
		mn1.add(mnFile4);
		
		JMenuItem mnFile5 = new JMenuItem("Exportar como catálogo...");
		mn1.add(mnFile5);
		
		JMenuItem mnFile6 = new JMenuItem("Actualizar configuración de lentes...");
		mn1.add(mnFile6);
		
		JMenuItem mnFile7 = new JMenuItem("Configuración de catálogo...");
		mn1.add(mnFile7);
		
		JSeparator separator = new JSeparator();
		mn1.add(separator);
		
		JMenuItem mnFile8 = new JMenuItem("Importar fotos y vídeos...");
		mn1.add(mnFile8);
		
		JMenuItem mnFile9 = new JMenuItem("Importar desde otro catálogo...");
		mn1.add(mnFile9);
		
		JMenuItem mnFile10 = new JMenuItem("Exportar con ajuste anterior");
		mn1.add(mnFile10);
		
		JMenuItem mnFile11 = new JMenuItem("Exportar...");
		mn1.add(mnFile11);
		
		JMenuItem mnFile12 = new JMenuItem("Exportar en DNG");
		mn1.add(mnFile12);
		
		JSeparator separator_1 = new JSeparator();
		mn1.add(separator_1);
		
		JMenuItem mnFile13 = new JMenuItem("Enviar por correo electrónico...");
		mn1.add(mnFile13);
		
		JSeparator separator_2 = new JSeparator();
		mn1.add(separator_2);
		
		JMenuItem mnFile14 = new JMenuItem("Mostrar en Finder/Explorador");
		mn1.add(mnFile14);
		
		JMenuItem mnFile15 = new JMenuItem("Abrir en Photoshop...");
		mn1.add(mnFile15);
		
		JMenuItem mnFile16 = new JMenuItem("Abrir en aplicación...");
		mn1.add(mnFile16);
		
		JSeparator separator_3 = new JSeparator();
		mn1.add(separator_3);
		
		JMenuItem mnFile17 = new JMenuItem("Configuración de la impresión...");
		mn1.add(mnFile17);
		
		JMenuItem mnFile18 = new JMenuItem("Imprimir...");
		mn1.add(mnFile18);
		
		JSeparator separator_4 = new JSeparator();
		mn1.add(separator_4);
		
		JMenuItem mnFile19 = new JMenuItem("Salir");
		mn1.add(mnFile19);
		
		JMenu mn2 = new JMenu("Edición");
		menuBar.add(mn2);
		
		JMenuItem mnEdit1 = new JMenuItem("Deshacer");
		mn2.add(mnEdit1);
		
		JMenuItem mnEdit2 = new JMenuItem("Rehacer");
		mn2.add(mnEdit2);
		
		JSeparator separator_5 = new JSeparator();
		mn2.add(separator_5);
		
		JMenuItem mnEdit3 = new JMenuItem("Cortar");
		mn2.add(mnEdit3);
		
		JMenuItem mnEdit4 = new JMenuItem("Copiar");
		mn2.add(mnEdit4);
		
		JMenuItem mnEdit5 = new JMenuItem("Pegar");
		mn2.add(mnEdit5);
		
		JSeparator separator_6 = new JSeparator();
		mn2.add(separator_6);
		
		JMenuItem mnEdit6 = new JMenuItem("Eliminar foto de Lightroom...");
		mn2.add(mnEdit6);
		
		JMenuItem mnEdit7 = new JMenuItem("Eliminar foto del disco...");
		mn2.add(mnEdit7);
		
		JSeparator separator_7 = new JSeparator();
		mn2.add(separator_7);
		
		JMenuItem mnEdit8 = new JMenuItem("Seleccionar todo");
		mn2.add(mnEdit8);
		
		JMenuItem mnEdit9 = new JMenuItem("Seleccionar ninguno");
		mn2.add(mnEdit9);
		
		JSeparator separator_8 = new JSeparator();
		mn2.add(separator_8);
		
		JMenuItem mnEdit10 = new JMenuItem("Preferencias...");
		mn2.add(mnEdit10);
		
		JMenu mn3 = new JMenu("Fotos");
		menuBar.add(mn3);
		
		JMenuItem mnFotos1 = new JMenuItem("Abrir en Reference View (Ver de referencia)");
		mn3.add(mnFotos1);
		
		JSeparator separator_9 = new JSeparator();
		mn3.add(separator_9);
		
		JMenuItem mnFotos2 = new JMenuItem("Convertir a DNG...");
		mn3.add(mnFotos2);
		
		JSeparator separator_10 = new JSeparator();
		mn3.add(separator_10);
		
		JMenuItem mnFotos3 = new JMenuItem("Ajuste automático de tono");
		mn3.add(mnFotos3);
		
		JMenuItem mnFotos4 = new JMenuItem("Ajuste automático de balance de blancos");
		mn3.add(mnFotos4);
		
		JSeparator separator_11 = new JSeparator();
		mn3.add(separator_11);
		
		JMenuItem mnFotos5 = new JMenuItem("Configuración de desarrollo");
		mn3.add(mnFotos5);
		
		JMenuItem mnFotos6 = new JMenuItem("Copiar configuración de desarrollo...");
		mn3.add(mnFotos6);
		
		JMenuItem mnFotos7 = new JMenuItem("Pegar configuración de desarrollo");
		mn3.add(mnFotos7);
		
		JMenuItem mnFotos8 = new JMenuItem("Pegar configuración de la foto anterior");
		mn3.add(mnFotos8);
		
		JSeparator separator_12 = new JSeparator();
		mn3.add(separator_12);
		
		JMenuItem mnFotos9 = new JMenuItem("Restablecer");
		mn3.add(mnFotos9);
		
		JMenuItem mnFotos10 = new JMenuItem("Sincronizar configuración...");
		mn3.add(mnFotos10);
		
		JMenuItem mnFotos11 = new JMenuItem("Sincronizar configuración automáticamente");
		mn3.add(mnFotos11);
		
		JSeparator separator_13 = new JSeparator();
		mn3.add(separator_13);
		
		JMenuItem mnFotos12 = new JMenuItem("Eliminar fotos marcadas con rechazado");
		mn3.add(mnFotos12);
		
		JSeparator separator_14 = new JSeparator();
		mn3.add(separator_14);
		
		JMenuItem mnFotos13 = new JMenuItem("Crear copia virtual");
		mn3.add(mnFotos13);
		
		JSeparator separator_15 = new JSeparator();
		mn3.add(separator_15);
		
		JMenuItem mnFotos14 = new JMenuItem("Establecer etiqueta de color");
		mn3.add(mnFotos14);
		
		JMenuItem mnFotos15 = new JMenuItem("Establecer calificación de estrellas");
		mn3.add(mnFotos15);
		
		JMenuItem mnFotos16 = new JMenuItem("Establecer bandera");
		mn3.add(mnFotos16);
		
		JSeparator separator_16 = new JSeparator();
		mn3.add(separator_16);
		
		JMenuItem mnFotos17 = new JMenuItem("Aumentar metadatos");
		mn3.add(mnFotos17);
		
		JMenuItem mnFotos18 = new JMenuItem("Guardar metadatos en el archivo");
		mn3.add(mnFotos18);
		
		JMenuItem mnFotos19 = new JMenuItem("Actualizar la ubicación de las fotos");
		mn3.add(mnFotos19);
		
		JSeparator separator_17 = new JSeparator();
		mn3.add(separator_17);
		
		JMenuItem mnFotos20 = new JMenuItem("Voltear imagen");
		mn3.add(mnFotos20);
		
		JMenuItem mnFotos21 = new JMenuItem("Girar a la derecha (sentido horario)");
		mn3.add(mnFotos21);
		
		JMenuItem mnFotos22 = new JMenuItem("Girar a la izquierda (sentido antihorario)");
		mn3.add(mnFotos22);
		
		JMenu mnNewMenu_3 = new JMenu("Settings");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_50 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_50);
		
		JMenuItem mntmNewMenuItem_51 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_51);
		
		JMenuItem mntmNewMenuItem_52 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_52);
		
		JSeparator separator_18 = new JSeparator();
		mnNewMenu_3.add(separator_18);
		
		JMenuItem mntmNewMenuItem_53 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_53);
		
		JSeparator separator_19 = new JSeparator();
		mnNewMenu_3.add(separator_19);
		
		JMenuItem mntmNewMenuItem_54 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_54);
		
		JSeparator separator_20 = new JSeparator();
		mnNewMenu_3.add(separator_20);
		
		JMenu mnNewMenu_4 = new JMenu("New menu");
		mnNewMenu_3.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_55 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_55);
		
		JMenuItem mntmNewMenuItem_56 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_56);
		
		JMenuItem mntmNewMenuItem_57 = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem_57);
		
		JSeparator separator_21 = new JSeparator();
		mnNewMenu_3.add(separator_21);
		
		JMenuItem mntmNewMenuItem_58 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_58);
		
		JSeparator separator_22 = new JSeparator();
		mnNewMenu_3.add(separator_22);
		
		JMenuItem mntmNewMenuItem_59 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_59);
		
		JMenuItem mntmNewMenuItem_60 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_60);
		
		JMenuItem mntmNewMenuItem_61 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_61);
		
		JMenu mnNewMenu_5 = new JMenu("Tools");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_62 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_62);
		
		JMenuItem mntmNewMenuItem_63 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_63);
		
		JMenuItem mntmNewMenuItem_64 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_64);
		
		JMenuItem mntmNewMenuItem_65 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_65);
		
		JMenuItem mntmNewMenuItem_66 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_66);
		
		JMenuItem mntmNewMenuItem_67 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_67);
		
		JMenuItem mntmNewMenuItem_68 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_68);
		
		JMenu mnNewMenu_6 = new JMenu("View");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_69 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_69);
		
		JMenuItem mntmNewMenuItem_70 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_70);
		
		JSeparator separator_23 = new JSeparator();
		mnNewMenu_6.add(separator_23);
		
		JMenuItem mntmNewMenuItem_71 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_71);
		
		JMenuItem mntmNewMenuItem_72 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_72);
		
		JMenuItem mntmNewMenuItem_73 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_73);
		
		JMenuItem mntmNewMenuItem_74 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_74);
		
		JMenuItem mntmNewMenuItem_75 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_75);
		
		JMenuItem mntmNewMenuItem_76 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_76);
		
		JSeparator separator_24 = new JSeparator();
		mnNewMenu_6.add(separator_24);
		
		JMenuItem mntmNewMenuItem_77 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_77);
		
		JSeparator separator_25 = new JSeparator();
		mnNewMenu_6.add(separator_25);
		
		JMenu mnNewMenu_7 = new JMenu("New menu");
		mnNewMenu_6.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_78 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_78);
		
		JMenuItem mntmNewMenuItem_79 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_79);
		
		JMenuItem mntmNewMenuItem_80 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_80);
		
		JMenuItem mntmNewMenuItem_81 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_81);
		
		JMenuItem mntmNewMenuItem_82 = new JMenuItem("New menu item");
		mnNewMenu_7.add(mntmNewMenuItem_82);
		
		JSeparator separator_26 = new JSeparator();
		mnNewMenu_6.add(separator_26);
		
		JMenu mnNewMenu_8 = new JMenu("New menu");
		mnNewMenu_6.add(mnNewMenu_8);
		
		JMenuItem mntmNewMenuItem_83 = new JMenuItem("New menu item");
		mnNewMenu_8.add(mntmNewMenuItem_83);
		
		JMenuItem mntmNewMenuItem_84 = new JMenuItem("New menu item");
		mnNewMenu_8.add(mntmNewMenuItem_84);
		
		JMenuItem mntmNewMenuItem_85 = new JMenuItem("New menu item");
		mnNewMenu_8.add(mntmNewMenuItem_85);
		
		JMenu mnNewMenu_9 = new JMenu("New menu");
		mnNewMenu_8.add(mnNewMenu_9);
		
		JMenuItem mntmNewMenuItem_86 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_86);
		
		JMenuItem mntmNewMenuItem_87 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_87);
		
		JMenuItem mntmNewMenuItem_88 = new JMenuItem("New menu item");
		mnNewMenu_9.add(mntmNewMenuItem_88);
		
		JSeparator separator_27 = new JSeparator();
		mnNewMenu_6.add(separator_27);
		
		JMenuItem mntmNewMenuItem_89 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_89);
		
		JSeparator separator_28 = new JSeparator();
		mnNewMenu_6.add(separator_28);
		
		JMenuItem mntmNewMenuItem_90 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_90);
		
		JMenuItem mntmNewMenuItem_91 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_91);
		
		JMenuItem mntmNewMenuItem_92 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_92);
		
		JMenuItem mntmNewMenuItem_93 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_93);
		
		JSeparator separator_29 = new JSeparator();
		mnNewMenu_6.add(separator_29);
		
		JMenuItem mntmNewMenuItem_94 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_94);
		
		JMenuItem mntmNewMenuItem_95 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_95);
		
		JSeparator separator_30 = new JSeparator();
		mnNewMenu_6.add(separator_30);
		
		JMenu mnNewMenu_10 = new JMenu("New menu");
		mnNewMenu_6.add(mnNewMenu_10);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		mnNewMenu_10.add(chckbxmntmNewCheckItem);
		
		JMenu mnNewMenu_11 = new JMenu("Window");
		menuBar.add(mnNewMenu_11);
		
		JMenuItem mntmNewMenuItem_96 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_96);
		
		JSeparator separator_31 = new JSeparator();
		mnNewMenu_11.add(separator_31);
		
		JMenuItem mntmNewMenuItem_97 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_97);
		
		JMenuItem mntmNewMenuItem_98 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_98);
		
		JMenuItem mntmNewMenuItem_99 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_99);
		
		JMenuItem mntmNewMenuItem_100 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_100);
		
		JMenuItem mntmNewMenuItem_101 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_101);
		
		JMenuItem mntmNewMenuItem_102 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_102);
		
		JSeparator separator_32 = new JSeparator();
		mnNewMenu_11.add(separator_32);
		
		JMenuItem mntmNewMenuItem_103 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_103);
		
		JMenuItem mntmNewMenuItem_104 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_104);
		
		JMenuItem mntmNewMenuItem_105 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_105);
		
		JSeparator separator_33 = new JSeparator();
		mnNewMenu_11.add(separator_33);
		
		JMenu mnNewMenu_12 = new JMenu("New menu");
		mnNewMenu_11.add(mnNewMenu_12);
		
		JMenuItem mntmNewMenuItem_106 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_106);
		
		JMenuItem mntmNewMenuItem_107 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_107);
		
		JMenuItem mntmNewMenuItem_108 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_108);
		
		JMenuItem mntmNewMenuItem_109 = new JMenuItem("New menu item");
		mnNewMenu_12.add(mntmNewMenuItem_109);
		
		JSeparator separator_34 = new JSeparator();
		mnNewMenu_11.add(separator_34);
		
		JMenuItem mntmNewMenuItem_110 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_110);
		
		JSeparator separator_35 = new JSeparator();
		mnNewMenu_11.add(separator_35);
		
		JMenu mnNewMenu_13 = new JMenu("New menu");
		mnNewMenu_11.add(mnNewMenu_13);
		
		JMenuItem mntmNewMenuItem_111 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_111);
		
		JMenuItem mntmNewMenuItem_112 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_112);
		
		JMenuItem mntmNewMenuItem_113 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_113);
		
		JMenuItem mntmNewMenuItem_114 = new JMenuItem("New menu item");
		mnNewMenu_13.add(mntmNewMenuItem_114);
		
		JSeparator separator_36 = new JSeparator();
		mnNewMenu_11.add(separator_36);
		
		JMenuItem mntmNewMenuItem_115 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_115);
		
		JSeparator separator_37 = new JSeparator();
		mnNewMenu_11.add(separator_37);
		
		JMenuItem mntmNewMenuItem_116 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_116);
		
		JSeparator separator_38 = new JSeparator();
		mnNewMenu_11.add(separator_38);
		
		JMenuItem mntmNewMenuItem_117 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_117);
		
		JSeparator separator_39 = new JSeparator();
		mnNewMenu_11.add(separator_39);
		
		JMenuItem mntmNewMenuItem_118 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_118);
		
		JSeparator separator_40 = new JSeparator();
		mnNewMenu_11.add(separator_40);
		
		JMenuItem mntmNewMenuItem_119 = new JMenuItem("New menu item");
		mnNewMenu_11.add(mntmNewMenuItem_119);
		
		JMenu mnNewMenu_14 = new JMenu("Help");
		menuBar.add(mnNewMenu_14);
		
		JMenuItem mntmNewMenuItem_120 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_120);
		
		JMenuItem mntmNewMenuItem_121 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_121);
		
		JSeparator separator_41 = new JSeparator();
		mnNewMenu_14.add(separator_41);
		
		JMenuItem mntmNewMenuItem_122 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_122);
		
		JSeparator separator_42 = new JSeparator();
		mnNewMenu_14.add(separator_42);
		
		JMenuItem mntmNewMenuItem_123 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_123);
		
		JSeparator separator_43 = new JSeparator();
		mnNewMenu_14.add(separator_43);
		
		JMenuItem mntmNewMenuItem_124 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_124);
		
		JSeparator separator_44 = new JSeparator();
		mnNewMenu_14.add(separator_44);
		
		JMenuItem mntmNewMenuItem_125 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_125);
		
		JSeparator separator_45 = new JSeparator();
		mnNewMenu_14.add(separator_45);
		
		JMenuItem mntmNewMenuItem_126 = new JMenuItem("New menu item");
		mnNewMenu_14.add(mntmNewMenuItem_126);
		
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
