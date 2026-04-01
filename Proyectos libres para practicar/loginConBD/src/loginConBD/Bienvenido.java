package loginConBD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Bienvenido extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_msgBienvenida;

	/**
	 * Launch the application.
	 */
	public static void pantallaBienvenida() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenido frame = new Bienvenido();
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
	public Bienvenido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txt_msgBienvenida = new JTextField();
		txt_msgBienvenida.setEditable(false);
		txt_msgBienvenida.setBackground(new Color(230, 230, 250));
		txt_msgBienvenida.setForeground(new Color(75, 0, 130));
		txt_msgBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		txt_msgBienvenida.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 40));
		txt_msgBienvenida.setText("BIENVENIDEEEEE");
		txt_msgBienvenida.setBounds(23, 39, 388, 189);
		contentPane.add(txt_msgBienvenida);
		txt_msgBienvenida.setColumns(10);
		txt_msgBienvenida.setBorder(null);

	}
}
