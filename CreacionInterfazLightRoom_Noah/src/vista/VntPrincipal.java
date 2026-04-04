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
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.ComponentOrientation;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Dimension;
import java.awt.Rectangle;

public class VntPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VntPrincipal() {
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Liberation Sans", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(VntPrincipal.class.getResource("/modelo/Screenshot from 2026-04-02 20-14-29.png")));
		setTitle("Lightroom 4 Catalog - Adobe Photoshop Lightroom - Develop");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1126, 681);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlSuperior = new JPanel();
		contentPane.add(pnlSuperior, BorderLayout.NORTH);
		pnlSuperior.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlMnBar = new JPanel();
		pnlMnBar.setBackground(Color.WHITE);
		pnlSuperior.add(pnlMnBar, BorderLayout.NORTH);
		pnlMnBar.setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar_sup = new JMenuBar();
		pnlMnBar.add(menuBar_sup, BorderLayout.WEST);
		
		JMenu mn1_archi = new JMenu("Archivo");
		mn1_archi.setOpaque(true);
		mn1_archi.setBorderPainted(false);
		mn1_archi.setBackground(Color.WHITE);
		mn1_archi.setBorder(null);
		menuBar_sup.add(mn1_archi);
		
		JMenuItem mnFile1 = new JMenuItem("Nuevo catálogo...");
		mn1_archi.add(mnFile1);
		
		JMenuItem mnFile2 = new JMenuItem("Abrir catálogo...");
		mn1_archi.add(mnFile2);
		
		JMenuItem mnFile3 = new JMenuItem("Optimizar catálogo...");
		mn1_archi.add(mnFile3);
		
		JMenuItem mnFile4 = new JMenuItem("Importar perfiles y ajustes...");
		mn1_archi.add(mnFile4);
		
		JMenuItem mnFile5 = new JMenuItem("Exportar como catálogo...");
		mn1_archi.add(mnFile5);
		
		JMenuItem mnFile6 = new JMenuItem("Actualizar configuración de lentes...");
		mn1_archi.add(mnFile6);
		
		JMenuItem mnFile7 = new JMenuItem("Configuración de catálogo...");
		mn1_archi.add(mnFile7);
		
		JSeparator separator = new JSeparator();
		mn1_archi.add(separator);
		
		JMenuItem mnFile8 = new JMenuItem("Importar fotos y vídeos...");
		mn1_archi.add(mnFile8);
		
		JMenuItem mnFile9 = new JMenuItem("Importar desde otro catálogo...");
		mn1_archi.add(mnFile9);
		
		JMenuItem mnFile10 = new JMenuItem("Exportar con ajuste anterior");
		mn1_archi.add(mnFile10);
		
		JMenuItem mnFile11 = new JMenuItem("Exportar...");
		mn1_archi.add(mnFile11);
		
		JMenuItem mnFile12 = new JMenuItem("Exportar en DNG");
		mn1_archi.add(mnFile12);
		
		JSeparator separator_1 = new JSeparator();
		mn1_archi.add(separator_1);
		
		JMenuItem mnFile13 = new JMenuItem("Enviar por correo electrónico...");
		mn1_archi.add(mnFile13);
		
		JSeparator separator_2 = new JSeparator();
		mn1_archi.add(separator_2);
		
		JMenuItem mnFile14 = new JMenuItem("Mostrar en Finder/Explorador");
		mn1_archi.add(mnFile14);
		
		JMenuItem mnFile15 = new JMenuItem("Abrir en Photoshop...");
		mn1_archi.add(mnFile15);
		
		JMenuItem mnFile16 = new JMenuItem("Abrir en aplicación...");
		mn1_archi.add(mnFile16);
		
		JSeparator separator_3 = new JSeparator();
		mn1_archi.add(separator_3);
		
		JMenuItem mnFile17 = new JMenuItem("Configuración de la impresión...");
		mn1_archi.add(mnFile17);
		
		JMenuItem mnFile18 = new JMenuItem("Imprimir...");
		mn1_archi.add(mnFile18);
		
		JSeparator separator_4 = new JSeparator();
		mn1_archi.add(separator_4);
		
		JMenuItem mnFile19 = new JMenuItem("Salir");
		mn1_archi.add(mnFile19);
		
		JMenu mn2_edit = new JMenu("Edición");
		mn2_edit.setBackground(Color.WHITE);
		mn2_edit.setOpaque(true);
		menuBar_sup.add(mn2_edit);
		
		JMenuItem mnEdit1 = new JMenuItem("Deshacer");
		mn2_edit.add(mnEdit1);
		
		JMenuItem mnEdit2 = new JMenuItem("Rehacer");
		mn2_edit.add(mnEdit2);
		
		JSeparator separator_5 = new JSeparator();
		mn2_edit.add(separator_5);
		
		JMenuItem mnEdit3 = new JMenuItem("Cortar");
		mn2_edit.add(mnEdit3);
		
		JMenuItem mnEdit4 = new JMenuItem("Copiar");
		mn2_edit.add(mnEdit4);
		
		JMenuItem mnEdit5 = new JMenuItem("Pegar");
		mn2_edit.add(mnEdit5);
		
		JSeparator separator_6 = new JSeparator();
		mn2_edit.add(separator_6);
		
		JMenuItem mnEdit6 = new JMenuItem("Eliminar foto de Lightroom...");
		mn2_edit.add(mnEdit6);
		
		JMenuItem mnEdit7 = new JMenuItem("Eliminar foto del disco...");
		mn2_edit.add(mnEdit7);
		
		JSeparator separator_7 = new JSeparator();
		mn2_edit.add(separator_7);
		
		JMenuItem mnEdit8 = new JMenuItem("Seleccionar todo");
		mn2_edit.add(mnEdit8);
		
		JMenuItem mnEdit9 = new JMenuItem("Seleccionar ninguno");
		mn2_edit.add(mnEdit9);
		
		JSeparator separator_8 = new JSeparator();
		mn2_edit.add(separator_8);
		
		JMenuItem mnEdit10 = new JMenuItem("Preferencias...");
		mn2_edit.add(mnEdit10);
		
		JMenu mn3_fotos = new JMenu("Fotos");
		mn3_fotos.setBackground(Color.WHITE);
		mn3_fotos.setOpaque(true);
		menuBar_sup.add(mn3_fotos);
		
		JMenuItem mnFotos1 = new JMenuItem("Abrir en Reference View (Ver de referencia)");
		mn3_fotos.add(mnFotos1);
		
		JSeparator separator_9 = new JSeparator();
		mn3_fotos.add(separator_9);
		
		JMenuItem mnFotos2 = new JMenuItem("Convertir a DNG...");
		mn3_fotos.add(mnFotos2);
		
		JSeparator separator_10 = new JSeparator();
		mn3_fotos.add(separator_10);
		
		JMenuItem mnFotos3 = new JMenuItem("Ajuste automático de tono");
		mn3_fotos.add(mnFotos3);
		
		JMenuItem mnFotos4 = new JMenuItem("Ajuste automático de balance de blancos");
		mn3_fotos.add(mnFotos4);
		
		JSeparator separator_11 = new JSeparator();
		mn3_fotos.add(separator_11);
		
		JMenuItem mnFotos5 = new JMenuItem("Configuración de desarrollo");
		mn3_fotos.add(mnFotos5);
		
		JMenuItem mnFotos6 = new JMenuItem("Copiar configuración de desarrollo...");
		mn3_fotos.add(mnFotos6);
		
		JMenuItem mnFotos7 = new JMenuItem("Pegar configuración de desarrollo");
		mn3_fotos.add(mnFotos7);
		
		JMenuItem mnFotos8 = new JMenuItem("Pegar configuración de la foto anterior");
		mn3_fotos.add(mnFotos8);
		
		JSeparator separator_12 = new JSeparator();
		mn3_fotos.add(separator_12);
		
		JMenuItem mnFotos9 = new JMenuItem("Restablecer");
		mn3_fotos.add(mnFotos9);
		
		JMenuItem mnFotos10 = new JMenuItem("Sincronizar configuración...");
		mn3_fotos.add(mnFotos10);
		
		JMenuItem mnFotos11 = new JMenuItem("Sincronizar configuración automáticamente");
		mn3_fotos.add(mnFotos11);
		
		JSeparator separator_13 = new JSeparator();
		mn3_fotos.add(separator_13);
		
		JMenuItem mnFotos12 = new JMenuItem("Eliminar fotos marcadas con rechazado");
		mn3_fotos.add(mnFotos12);
		
		JSeparator separator_14 = new JSeparator();
		mn3_fotos.add(separator_14);
		
		JMenuItem mnFotos13 = new JMenuItem("Crear copia virtual");
		mn3_fotos.add(mnFotos13);
		
		JSeparator separator_15 = new JSeparator();
		mn3_fotos.add(separator_15);
		
		JMenuItem mnFotos14 = new JMenuItem("Establecer etiqueta de color");
		mn3_fotos.add(mnFotos14);
		
		JMenuItem mnFotos15 = new JMenuItem("Establecer calificación de estrellas");
		mn3_fotos.add(mnFotos15);
		
		JMenuItem mnFotos16 = new JMenuItem("Establecer bandera");
		mn3_fotos.add(mnFotos16);
		
		JSeparator separator_16 = new JSeparator();
		mn3_fotos.add(separator_16);
		
		JMenuItem mnFotos17 = new JMenuItem("Aumentar metadatos");
		mn3_fotos.add(mnFotos17);
		
		JMenuItem mnFotos18 = new JMenuItem("Guardar metadatos en el archivo");
		mn3_fotos.add(mnFotos18);
		
		JMenuItem mnFotos19 = new JMenuItem("Actualizar la ubicación de las fotos");
		mn3_fotos.add(mnFotos19);
		
		JSeparator separator_17 = new JSeparator();
		mn3_fotos.add(separator_17);
		
		JMenuItem mnFotos20 = new JMenuItem("Voltear imagen");
		mn3_fotos.add(mnFotos20);
		
		JMenuItem mnFotos21 = new JMenuItem("Girar a la derecha (sentido horario)");
		mn3_fotos.add(mnFotos21);
		
		JMenuItem mnFotos22 = new JMenuItem("Girar a la izquierda (sentido antihorario)");
		mn3_fotos.add(mnFotos22);
		
		JMenu mn4_config = new JMenu("Ajustes");
		mn4_config.setBackground(Color.WHITE);
		mn4_config.setOpaque(true);
		menuBar_sup.add(mn4_config);
		
		JMenuItem mnAjustes1 = new JMenuItem("Copiar ajustes de revelado...");
		mn4_config.add(mnAjustes1);
		
		JMenuItem mnAjustes2 = new JMenuItem("Pegar ajustes de revelado");
		mn4_config.add(mnAjustes2);
		
		JMenuItem mnAjustes3 = new JMenuItem("Sincronizar ajustes...");
		mn4_config.add(mnAjustes3);
		
		JSeparator separator_18 = new JSeparator();
		mn4_config.add(separator_18);
		
		JMenuItem mnAjustes4 = new JMenuItem("Habilitar Auto Sync");
		mn4_config.add(mnAjustes4);
		
		JSeparator separator_19 = new JSeparator();
		mn4_config.add(separator_19);
		
		JMenuItem mnAjustes5 = new JMenuItem("Igualar exposiciones totales");
		mn4_config.add(mnAjustes5);
		
		JSeparator separator_20 = new JSeparator();
		mn4_config.add(separator_20);
		
		JMenu mnAjustes6_mn1 = new JMenu("Proceso");
		mn4_config.add(mnAjustes6_mn1);
		
		JMenuItem submnAjustes1 = new JMenuItem("Versión 2012 (Actual)");
		mnAjustes6_mn1.add(submnAjustes1);
		
		JMenuItem submnAjustes2 = new JMenuItem("Versión 2010");
		mnAjustes6_mn1.add(submnAjustes2);
		
		JMenuItem submnAjustes3 = new JMenuItem("Versión 2003");
		mnAjustes6_mn1.add(submnAjustes3);
		
		JSeparator separator_21 = new JSeparator();
		mn4_config.add(separator_21);
		
		JMenuItem mnAjustes7 = new JMenuItem("Restablecer ajustes de revelado");
		mn4_config.add(mnAjustes7);
		
		JSeparator separator_22 = new JSeparator();
		mn4_config.add(separator_22);
		
		JMenuItem mnAjustes8 = new JMenuItem("Copiar ajustes de \"Antes\" a \"Después\"");
		mn4_config.add(mnAjustes8);
		
		JMenuItem mnAjustes9 = new JMenuItem("Copiar ajustes de \"Después\" a \"Antes\"");
		mn4_config.add(mnAjustes9);
		
		JMenuItem mnAjustes10 = new JMenuItem("Intercambiar ajustes \"Antes\" y \"Después\"");
		mn4_config.add(mnAjustes10);
		
		JMenu mn5_herram = new JMenu("Herramientas");
		mn5_herram.setBackground(Color.WHITE);
		mn5_herram.setOpaque(true);
		menuBar_sup.add(mn5_herram);
		
		JMenuItem mnHerra1 = new JMenuItem("Recortar y enderezar");
		mn5_herram.add(mnHerra1);
		
		JMenuItem mnHerra2 = new JMenuItem("Eliminar");
		mn5_herram.add(mnHerra2);
		
		JMenuItem mnHerra3 = new JMenuItem("Corrección de ojos rojos");
		mn5_herram.add(mnHerra3);
		
		JMenuItem mnHerra4 = new JMenuItem("Máscara");
		mn5_herram.add(mnHerra4);
		
		JMenuItem mnHerra5 = new JMenuItem("Pincel de ajuste");
		mn5_herram.add(mnHerra5);
		
		JMenuItem mnHerra6 = new JMenuItem("Filtro graduado");
		mn5_herram.add(mnHerra6);
		
		JMenuItem mnHerra7 = new JMenuItem("Filtro radial");
		mn5_herram.add(mnHerra7);
		
		JMenu mn6_Ver = new JMenu("Ver");
		mn6_Ver.setBackground(Color.WHITE);
		mn6_Ver.setOpaque(true);
		menuBar_sup.add(mn6_Ver);
		
		JMenuItem mnVer1 = new JMenuItem("Vista de ampliación");
		mn6_Ver.add(mnVer1);
		
		JMenuItem mnVer2 = new JMenuItem("Vista en cuadrícula");
		mn6_Ver.add(mnVer2);
		
		JSeparator separator_23 = new JSeparator();
		mn6_Ver.add(separator_23);
		
		JMenuItem mnVer3 = new JMenuItem("Antes/Después");
		mn6_Ver.add(mnVer3);
		
		JMenuItem mnVer4 = new JMenuItem("Solo antes");
		mn6_Ver.add(mnVer4);
		
		JMenuItem mnVer5 = new JMenuItem("Antes/Después izquierda/derecha");
		mn6_Ver.add(mnVer5);
		
		JMenuItem mnVer6 = new JMenuItem("Antes/Después izquierda/derecha dividido");
		mn6_Ver.add(mnVer6);
		
		JMenuItem mnVer7 = new JMenuItem("Antes/Después arriba/abajo");
		mn6_Ver.add(mnVer7);
		
		JMenuItem mnVer8 = new JMenuItem("Antes/Después arriba/abajo dividido");
		mn6_Ver.add(mnVer8);
		
		JSeparator separator_24 = new JSeparator();
		mn6_Ver.add(separator_24);
		
		JMenuItem mnVer9 = new JMenuItem("Vista de referencia");
		mn6_Ver.add(mnVer9);
		
		JSeparator separator_25 = new JSeparator();
		mn6_Ver.add(separator_25);
		
		JMenu mnVer_10_submn1 = new JMenu("Opciones de visualización del panel:");
		mn6_Ver.add(mnVer_10_submn1);
		
		JMenuItem mnVersubmn1_1 = new JMenuItem("Mostrar barra de herramientas");
		mnVer_10_submn1.add(mnVersubmn1_1);
		
		JMenuItem mnVersubmn1_2 = new JMenuItem("Mostrar módulos");
		mnVer_10_submn1.add(mnVersubmn1_2);
		
		JMenuItem mnVersubmn1_3 = new JMenuItem("Mostrar tira de fondos");
		mnVer_10_submn1.add(mnVersubmn1_3);
		
		JMenuItem mnVersubmn1_4 = new JMenuItem("Mostrar paneles izquierdos");
		mnVer_10_submn1.add(mnVersubmn1_4);
		
		JMenuItem mnVersubmn1_5 = new JMenuItem("Mostrar paneles derechos");
		mnVer_10_submn1.add(mnVersubmn1_5);
		
		JSeparator separator_26 = new JSeparator();
		mn6_Ver.add(separator_26);
		
		JMenu mnVer_11_submn2 = new JMenu("Zoom:");
		mn6_Ver.add(mnVer_11_submn2);
		
		JMenuItem mnVersubmn2_1 = new JMenuItem("Acercar");
		mnVer_11_submn2.add(mnVersubmn2_1);
		
		JMenuItem mnVersubmn2_2 = new JMenuItem("Alejar");
		mnVer_11_submn2.add(mnVersubmn2_2);
		
		JMenuItem mnVersubmn2_3 = new JMenuItem("Ajustar para llenar");
		mnVer_11_submn2.add(mnVersubmn2_3);
		
		JMenu mnVer_submn3 = new JMenu("Ajustar la imagen al tamaño de la pantalla");
		mnVer_11_submn2.add(mnVer_submn3);
		
		JMenuItem mnVersubmn3_1 = new JMenuItem("1:1");
		mnVer_submn3.add(mnVersubmn3_1);
		
		JMenuItem mnVersubmn3_2 = new JMenuItem("1:2");
		mnVer_submn3.add(mnVersubmn3_2);
		
		JMenuItem mnVersubmn3_3 = new JMenuItem("1:4");
		mnVer_submn3.add(mnVersubmn3_3);
		
		JSeparator separator_27 = new JSeparator();
		mn6_Ver.add(separator_27);
		
		JMenuItem mnVer12 = new JMenuItem("Ciclar modos de oscurecer");
		mn6_Ver.add(mnVer12);
		
		JSeparator separator_28 = new JSeparator();
		mn6_Ver.add(separator_28);
		
		JMenuItem mnVer13 = new JMenuItem("Mostrar recortes");
		mn6_Ver.add(mnVer13);
		
		JMenuItem mnVer14 = new JMenuItem("Mostrar superposición de herramienta de máscara");
		mn6_Ver.add(mnVer14);
		
		JMenuItem mnVer15 = new JMenuItem("Mostrar pines de ajuste local");
		mn6_Ver.add(mnVer15);
		
		JMenuItem mnVer16 = new JMenuItem("Mostrar marcas de borrador");
		mn6_Ver.add(mnVer16);
		
		JSeparator separator_29 = new JSeparator();
		mn6_Ver.add(separator_29);
		
		JMenuItem mnVer17 = new JMenuItem("Mostrar superposición de cuadrícula");
		mn6_Ver.add(mnVer17);
		
		JMenuItem mnVer18 = new JMenuItem("Ciclar estilos de superposición de cuadrícula");
		mn6_Ver.add(mnVer18);
		
		JSeparator separator_30 = new JSeparator();
		mn6_Ver.add(separator_30);
		
		JMenu mnVer_19_submn3 = new JMenu("Evaluar:");
		mn6_Ver.add(mnVer_19_submn3);
		
		JCheckBoxMenuItem mnVer_submn3_ckbox1 = new JCheckBoxMenuItem("Pasar por alto (deshabilitar ajustes)");
		mnVer_19_submn3.add(mnVer_submn3_ckbox1);
		
		JMenu mn7_Ventana = new JMenu("Window");
		mn7_Ventana.setBackground(Color.WHITE);
		mn7_Ventana.setOpaque(true);
		menuBar_sup.add(mn7_Ventana);
		
		JMenuItem mnVentana1 = new JMenuItem("Nueva ventana de fotos");
		mn7_Ventana.add(mnVentana1);
		
		JSeparator separator_31 = new JSeparator();
		mn7_Ventana.add(separator_31);
		
		JMenuItem mnVentana2 = new JMenuItem("Mostrar segunda pantalla");
		mn7_Ventana.add(mnVentana2);
		
		JMenuItem mnVentana3 = new JMenuItem("Cuadrícula");
		mn7_Ventana.add(mnVentana3);
		
		JMenuItem mnVentana4 = new JMenuItem("Ampliación");
		mn7_Ventana.add(mnVentana4);
		
		JMenuItem mnVentana5 = new JMenuItem("Comparar");
		mn7_Ventana.add(mnVentana5);
		
		JMenuItem mnVentana6 = new JMenuItem("Encuesta");
		mn7_Ventana.add(mnVentana6);
		
		JMenuItem mnVentana7 = new JMenuItem("Modo bloqueado");
		mn7_Ventana.add(mnVentana7);
		
		JSeparator separator_32 = new JSeparator();
		mn7_Ventana.add(separator_32);
		
		JMenuItem mnVentana8 = new JMenuItem("Limpiar...");
		mn7_Ventana.add(mnVentana8);
		
		JMenuItem mnVentana9 = new JMenuItem("Abrir en la segunda pantalla");
		mn7_Ventana.add(mnVentana9);
		
		JMenuItem mnVentana10 = new JMenuItem("Resolución de la segunda pantalla...");
		mn7_Ventana.add(mnVentana10);
		
		JSeparator separator_33 = new JSeparator();
		mn7_Ventana.add(separator_33);
		
		JMenu mnVentana11_submn1 = new JMenu("Paneles");
		mn7_Ventana.add(mnVentana11_submn1);
		
		JMenuItem mnVentana_submn1_1 = new JMenuItem("Ir al panel de la izquierda");
		mnVentana11_submn1.add(mnVentana_submn1_1);
		
		JMenuItem mnVentana_submn1_2 = new JMenuItem("Ir al panel de la derecha");
		mnVentana11_submn1.add(mnVentana_submn1_2);
		
		JMenuItem mnVentana_submn1_3 = new JMenuItem("Abrir/cerrar el panel de la izquierda");
		mnVentana11_submn1.add(mnVentana_submn1_3);
		
		JMenuItem mnVentana_submn1_4 = new JMenuItem("Abrir/cerrar el panel de la derecha");
		mnVentana11_submn1.add(mnVentana_submn1_4);
		
		JSeparator separator_34 = new JSeparator();
		mn7_Ventana.add(separator_34);
		
		JMenuItem mnVentana12 = new JMenuItem("Abrir/cerrar todos los paneles");
		mn7_Ventana.add(mnVentana12);
		
		JSeparator separator_35 = new JSeparator();
		mn7_Ventana.add(separator_35);
		
		JMenu mnVentana13_sbmn2 = new JMenu("Tira de fotos");
		mn7_Ventana.add(mnVentana13_sbmn2);
		
		JMenuItem mnVentana_submn2_1 = new JMenuItem("Mostrar tira de fotos");
		mnVentana13_sbmn2.add(mnVentana_submn2_1);
		
		JMenuItem mnVentana_submn2_2 = new JMenuItem("Orientación...");
		mnVentana13_sbmn2.add(mnVentana_submn2_2);
		
		JMenuItem mnVentana_submn2_3 = new JMenuItem("Vista vertical u horizontal...");
		mnVentana13_sbmn2.add(mnVentana_submn2_3);
		
		JMenuItem mnVentana_submn2_4 = new JMenuItem("Opciones de la tira de fotos...");
		mnVentana13_sbmn2.add(mnVentana_submn2_4);
		
		JSeparator separator_36 = new JSeparator();
		mn7_Ventana.add(separator_36);
		
		JMenuItem mnVentana14 = new JMenuItem("Filtro de la barra de herramientas");
		mn7_Ventana.add(mnVentana14);
		
		JSeparator separator_37 = new JSeparator();
		mn7_Ventana.add(separator_37);
		
		JMenuItem mnVentana15 = new JMenuItem("Activar panel de ajustes");
		mn7_Ventana.add(mnVentana15);
		
		JSeparator separator_38 = new JSeparator();
		mn7_Ventana.add(separator_38);
		
		JMenuItem mnVentana16 = new JMenuItem("Seleccionar ventana de aplicación...");
		mn7_Ventana.add(mnVentana16);
		
		JSeparator separator_39 = new JSeparator();
		mn7_Ventana.add(separator_39);
		
		JMenuItem mnVentana17 = new JMenuItem("Personalizar barra de herramientas...");
		mn7_Ventana.add(mnVentana17);
		
		JSeparator separator_40 = new JSeparator();
		mn7_Ventana.add(separator_40);
		
		JMenuItem mnVentana18 = new JMenuItem("Abrir en Lightroom Web");
		mn7_Ventana.add(mnVentana18);
		
		JMenu mn8_Ayuda = new JMenu("Ayuda");
		mn8_Ayuda.setBackground(Color.WHITE);
		mn8_Ayuda.setOpaque(true);
		menuBar_sup.add(mn8_Ayuda);
		
		JMenuItem mnAyuda1 = new JMenuItem("Ayuda de Lightroom Classic");
		mn8_Ayuda.add(mnAyuda1);
		
		JMenuItem mnAyuda2 = new JMenuItem("Ayuda de Lightroom Web");
		mn8_Ayuda.add(mnAyuda2);
		
		JSeparator separator_41 = new JSeparator();
		mn8_Ayuda.add(separator_41);
		
		JMenuItem mnAyuda3 = new JMenuItem("Tutoriales...");
		mn8_Ayuda.add(mnAyuda3);
		
		JSeparator separator_42 = new JSeparator();
		mn8_Ayuda.add(separator_42);
		
		JMenuItem mnAyuda4 = new JMenuItem("Mostrar guías de inicio...");
		mn8_Ayuda.add(mnAyuda4);
		
		JSeparator separator_43 = new JSeparator();
		mn8_Ayuda.add(separator_43);
		
		JMenuItem mnAyuda5 = new JMenuItem("Actualizaciones...");
		mn8_Ayuda.add(mnAyuda5);
		
		JSeparator separator_44 = new JSeparator();
		mn8_Ayuda.add(separator_44);
		
		JMenuItem mnAyuda6 = new JMenuItem("Administrar plugins...");
		mn8_Ayuda.add(mnAyuda6);
		
		JSeparator separator_45 = new JSeparator();
		mn8_Ayuda.add(separator_45);
		
		JMenuItem mnAyuda7 = new JMenuItem("Acerca de Adobe Lightroom Classic");
		mn8_Ayuda.add(mnAyuda7);
		
		JPanel pnlCabecera = new JPanel();
		pnlCabecera.setBackground(Color.BLACK);
		pnlSuperior.add(pnlCabecera, BorderLayout.SOUTH);
		pnlCabecera.setLayout(new BorderLayout(0, 0));
		
		JPanel flechaSup = new JPanel();
		flechaSup.setBackground(Color.BLACK);
		pnlCabecera.add(flechaSup, BorderLayout.NORTH);
		
		JPanel pnlSupTmp = new JPanel();
		pnlSupTmp.setBackground(Color.BLACK);
		pnlCabecera.add(pnlSupTmp, BorderLayout.SOUTH);
		
		JPanel pnlCentral = new JPanel();
		pnlCentral.setBackground(Color.DARK_GRAY);
		contentPane.add(pnlCentral, BorderLayout.CENTER);
		
		JPanel pnlIzquierdo = new JPanel();
		pnlIzquierdo.setBorder(null);
		contentPane.add(pnlIzquierdo, BorderLayout.WEST);
		pnlIzquierdo.setLayout(new BorderLayout(0, 0));
		
		JPanel flechaIzq = new JPanel();
		flechaIzq.setBackground(Color.BLACK);
		pnlIzquierdo.add(flechaIzq, BorderLayout.WEST);
		
		JPanel pnlIzqTmp = new JPanel();
		pnlIzqTmp.setForeground(Color.BLACK);
		pnlIzqTmp.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnlIzqTmp.setBackground(Color.BLACK);
		pnlIzqTmp.setLayout(new BoxLayout(pnlIzqTmp, BoxLayout.Y_AXIS));
		
		JPanel pnlNav = new JPanel();
		pnlNav.setBorder(new EmptyBorder(0, 2, 0, 10));
		pnlNav.setMaximumSize(new Dimension(32767, 50));
		pnlNav.setBackground(Color.DARK_GRAY);
		pnlIzqTmp.add(pnlNav);
		
		JButton btnFleNav = new JButton("▼");
		btnFleNav.setHorizontalTextPosition(SwingConstants.LEADING);
		btnFleNav.setHorizontalAlignment(SwingConstants.LEFT);
		btnFleNav.setBorder(null);
		btnFleNav.setForeground(Color.LIGHT_GRAY);
		btnFleNav.setBackground(Color.DARK_GRAY);
		pnlNav.add(btnFleNav);
		
		JLabel lblNav = new JLabel("     Navigator         ");
		lblNav.setBounds(new Rectangle(0, 0, 10, 0));
		lblNav.setForeground(Color.LIGHT_GRAY);
		pnlNav.add(lblNav);
		
		JLabel lblFit = new JLabel("FIT     ");
		lblFit.setForeground(Color.LIGHT_GRAY);
		pnlNav.add(lblFit);
		
		JLabel lblFill = new JLabel("FILL    ");
		lblFill.setForeground(Color.LIGHT_GRAY);
		pnlNav.add(lblFill);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.DARK_GRAY);
		pnlNav.add(comboBox);
		
		JSpinner spinner = new JSpinner();
		pnlNav.add(spinner);
		
		JPanel imgPeq = new JPanel();
		imgPeq.setBorder(new CompoundBorder(new EmptyBorder(4, 4, 4, 4), new LineBorder(new Color(0, 0, 0))));
		imgPeq.setBackground(Color.DARK_GRAY);
		pnlIzqTmp.add(imgPeq);
		
		JPanel pnlPresets = new JPanel();
		pnlPresets.setMaximumSize(new Dimension(32767, 500));
		pnlPresets.setBackground(Color.DARK_GRAY);
		pnlIzqTmp.add(pnlPresets);
		pnlPresets.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		pnlPresets.add(btnNewButton_3, BorderLayout.WEST);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		pnlPresets.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JButton btnNewButton_4 = new JButton("New button");
		pnlPresets.add(btnNewButton_4, BorderLayout.EAST);
		
		JPanel menuPresets = new JPanel();
		menuPresets.setBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(new Color(0, 0, 0))));
		menuPresets.setBackground(Color.GRAY);
		pnlIzqTmp.add(menuPresets);
		
		JPanel pnlSnapshots = new JPanel();
		pnlSnapshots.setBackground(Color.DARK_GRAY);
		pnlIzqTmp.add(pnlSnapshots);
		
		JPanel pnlBotonesIzq = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlBotonesIzq.getLayout();
		pnlBotonesIzq.setBackground(Color.DARK_GRAY);
		pnlIzqTmp.add(pnlBotonesIzq);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		pnlBotonesIzq.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		pnlBotonesIzq.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane(pnlIzqTmp);
		scrollPane.setBorder(null);
		scrollPane.setForeground(Color.BLACK);
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		pnlIzquierdo.add(scrollPane, BorderLayout.EAST);
		
		JPanel pnlDerecho = new JPanel();
		contentPane.add(pnlDerecho, BorderLayout.EAST);
		pnlDerecho.setLayout(new BorderLayout(0, 0));
		
		JPanel flechaDer = new JPanel();
		flechaDer.setBackground(Color.BLACK);
		pnlDerecho.add(flechaDer, BorderLayout.EAST);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBackground(Color.BLACK);
		scrollBar.setForeground(Color.BLACK);
		pnlDerecho.add(scrollBar, BorderLayout.CENTER);
		
		JPanel pnlDerTmp = new JPanel();
		pnlDerTmp.setBackground(Color.DARK_GRAY);
		pnlDerecho.add(pnlDerTmp, BorderLayout.WEST);
		
		JPanel pnlInferior = new JPanel();
		contentPane.add(pnlInferior, BorderLayout.SOUTH);
		pnlInferior.setLayout(new BorderLayout(0, 0));
		
		JPanel flechaInf = new JPanel();
		flechaInf.setBackground(Color.BLACK);
		pnlInferior.add(flechaInf, BorderLayout.SOUTH);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setForeground(Color.BLACK);
		scrollBar_1.setBackground(Color.BLACK);
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		pnlInferior.add(scrollBar_1, BorderLayout.CENTER);
		
		JPanel pnlInfTmp = new JPanel();
		pnlInfTmp.setBackground(Color.BLACK);
		pnlInferior.add(pnlInfTmp, BorderLayout.NORTH);

	}
}
