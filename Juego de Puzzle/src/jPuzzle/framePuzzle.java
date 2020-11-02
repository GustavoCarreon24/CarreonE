package jPuzzle;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePuzzle extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumMov;
	private JTextField txtTiempoJugado;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public FramePuzzle() 
	{
		setLocationRelativeTo(null);
		setTitle("Juego Puzzle");
		
	    
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 54);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Juego puzzle");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel.setBounds(59, 11, 277, 32);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 52, 300, 209);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnUno = new JButton("1");
		panel_1.add(btnUno);
		
		JButton btnDos = new JButton("2");
		panel_1.add(btnDos);
		
		JButton btnTres = new JButton("3");
		panel_1.add(btnTres);
		
		JButton btnCuatro = new JButton("4");
		panel_1.add(btnCuatro);
		
		JButton btnCinco = new JButton("5");
		panel_1.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if(btnNine.isVisible()==false)
				{
					btnNine.setText(btnSeis.getText());
					btnNine.setIcon(btnSeis.getIcon());
					btnSeis.setVisible(false);
					btnNine.setVisible(true);
				}
				
				if(btnTres.isVisible()==false)
				{
					btnTres.setText(btnSeis.getText());
					btnTres.setIcon(btnSeis.getIcon());
					btnSeis.setVisible(false);
					btnTres.setVisible(true);
				}
				
				if(btnCinco.isVisible()==false)
				{
					btnCinco.setText(btnSeis.getText());
					btnCinco.setIcon(btnSeis.getIcon());
					btnSeis.setVisible(false);
					btnCinco.setVisible(true);
				}
				
			}
		});
		panel_1.add(btnSeis);
		
		JButton btnSiete = new JButton("7");
		panel_1.add(btnSiete);
		
		JButton btnOcho = new JButton("8");
		panel_1.add(btnOcho);
		
		JButton btnNine = new JButton("9");
		panel_1.add(btnNine);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(299, 52, 135, 209);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de Movimientos");
		lblNewLabel_1.setBounds(10, 33, 115, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("tiempo Jugado:");
		lblNewLabel_2.setBounds(25, 144, 100, 14);
		panel_2.add(lblNewLabel_2);
		
		txtNumMov = new JTextField();
		txtNumMov.setBounds(24, 58, 86, 20);
		panel_2.add(txtNumMov);
		txtNumMov.setColumns(10);
		
		txtTiempoJugado = new JTextField();
		txtTiempoJugado.setBounds(24, 169, 86, 20);
		panel_2.add(txtTiempoJugado);
		txtTiempoJugado.setColumns(10);
	}
}
