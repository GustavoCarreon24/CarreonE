package jPuzzle;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class framePuzzle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					framePuzzle frame = new framePuzzle();
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
	public framePuzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 509, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 493, 89);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Juego Puzzle");
		lblNombre.setBounds(55, 21, 183, 33);
		lblNombre.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		panel.add(lblNombre);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(366, 88, 127, 244);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNumMovimientos = new JLabel("Numero de Movimientos");
		lblNumMovimientos.setBounds(0, 54, 114, 13);
		lblNumMovimientos.setFont(new Font("Arial", Font.PLAIN, 11));
		panel_1.add(lblNumMovimientos);
		
		textField = new JTextField();
		textField.setBounds(10, 78, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 162, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTiempo = new JLabel("Tiempo jugado:");
		lblTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiempo.setBounds(10, 131, 46, 14);
		panel_1.add(lblTiempo);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 88, 364, 244);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnUno = new JButton("1");
		panel_2.add(btnUno);
		
		JButton btnDos = new JButton("2");
		panel_2.add(btnDos);
		
		JButton btnTres = new JButton("3");
		panel_2.add(btnTres);
		
		JButton btnCuatro = new JButton("4");
		panel_2.add(btnCuatro);
		
		JButton btnCinco = new JButton("5");
		panel_2.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		panel_2.add(btnSeis);
		
		JButton btnSiete = new JButton("7");
		panel_2.add(btnSiete);
		
		JButton btnOcho = new JButton("8");
		panel_2.add(btnOcho);
		
		JButton btnNueve = new JButton("9");
		panel_2.add(btnNueve);
	}
}
