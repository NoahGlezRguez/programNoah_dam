package ejercicio7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana7 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Ventana7() {
		
		setearPaneles();
	}
	
	private void setearPaneles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
