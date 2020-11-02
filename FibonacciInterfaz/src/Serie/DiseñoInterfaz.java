package Serie;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class DiseñoInterfaz extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField txtDato;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiseñoInterfaz frame = new DiseñoInterfaz();
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
	public DiseñoInterfaz() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalcular = new JButton("Calcular Serie");
		btnCalcular.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			Scanner teclado  = new Scanner(System.in);
						
			int A = 0;
			int B = 1;
			int C = 0;
			int Tope = Integer.parseInt(txtDato.getText());
			int i = 0;
						
						
			System.out.print("Ingrese hasta que termino desea calcular la sucesion de fibonacci: ");
			Tope = teclado.nextInt();
						
			for(i=0; i < Tope; i++)
			{
				System.out.println(A);
							
				C = A + B;
				A = B; 
				B = C;
			}
			
			txtResultado.setText(Integer.toString(C));
			
			}
			
			
		});
		
		
		
		btnCalcular.setBounds(147, 85, 113, 45);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("Ingrese hasta que numero calculara la serie de Fibonacci: ");
		lblNewLabel.setBounds(54, 25, 303, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Resultados:");
		lblNewLabel_1.setBounds(54, 134, 106, 14);
		contentPane.add(lblNewLabel_1);
		
		txtDato = new JTextField();
		txtDato.setBounds(54, 50, 270, 24);
		contentPane.add(txtDato);
		txtDato.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(54, 159, 270, 70);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
}
