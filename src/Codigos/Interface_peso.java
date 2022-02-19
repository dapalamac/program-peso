package Codigos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface_peso extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_peso frame = new Interface_peso();
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
	public Interface_peso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("PESO");
		lblPeso.setBounds(75, 279, 79, 25);
		lblPeso.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblPeso);
		
		textField = new JTextField();
		textField.setBounds(160, 279, 86, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAltura = new JLabel("ALTURA");
		lblAltura.setBounds(33, 328, 121, 25);
		lblAltura.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblAltura);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 328, 86, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblIndice = new JLabel("INDICE");
		lblIndice.setBounds(318, 279, 107, 25);
		lblIndice.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblIndice);
		
		JLabel lblMensaje = new JLabel("MENSAJE");
		lblMensaje.setBounds(132, 25, 144, 25);
		lblMensaje.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblMensaje);
		
		textField_2 = new JTextField();
		textField_2.setBounds(421, 279, 86, 27);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(132, 61, 348, 71);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JButton btnProcesar = new JButton("");
		btnProcesar.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
				
				float peso, inc , altura;
				
				peso = Float.parseFloat(textField.getText()); 
				altura = Float.parseFloat(textField_1.getText());
				
				inc = peso/(altura*altura);
				
				if (inc < 16) {
					
				textField_2.setText(" " +  inc);	
				textField_3.setText("Necesita ingresar a un hospital");	
				
				} 
				
				else if (inc < 17) {
					
				textField_3.setText(" " +  inc);	
			    textField_2.setText("Usted tiene infraPeso");		
					
					
				}
				
				else if (inc < 18) {
					
				textField_3.setText(" " +  inc);	
				textField_2.setText("Usted esta bajo de peso");		
						
						
				}
				
				else if (inc < 25) {
					
				textField_2.setText(" " +  inc);	
				textField_3.setText("Usted tiene peso normal (Saludable)");		
							
							
				}
				
				else if (inc < 30) {
					
				textField_2.setText(" " +  inc);	
				textField_3.setText("Usted tiene sobrepeso (Obesidad grado I)");		
								
								
				}
				
				else if (inc < 35) {
					
				textField_2.setText(" " +  inc);	
				textField_3.setText("Usted tiene sobrepeso (Obesidad grado II)");		
									
									
				}
				
				else if (inc < 40) {
					
				textField_2.setText(" " +  inc);	
				textField_3.setText("Usted tiene sobrepeso (Obesidad grado III)");		
										
										
				}
				
				else if (inc > 40) {
					
				textField_2.setText(" " +  inc);	
				textField_3.setText("Usted tiene sobrepeso (Obesidad mórbida IV)");		
											
											
				}
				
				
				
				
				
			}
		});
		btnProcesar.setIcon(new ImageIcon(Interface_peso.class.getResource("/Iconos/play.png")));
		btnProcesar.setFont(new Font("Arial", Font.BOLD, 14));
		btnProcesar.setBounds(33, 25, 79, 33);
		contentPane.add(btnProcesar);
		
		JButton btnBorrar = new JButton("");
		btnBorrar.setIcon(new ImageIcon(Interface_peso.class.getResource("/Iconos/trash.png")));
		btnBorrar.setFont(new Font("Arial", Font.BOLD, 14));
		btnBorrar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
				
				
				
			}
			
			
			
		});
		btnBorrar.setBounds(33, 85, 79, 41);
		contentPane.add(btnBorrar);
		
		JButton btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				System.exit(0);	
				
				
			}
			
			
			
		});
		btnSalir.setIcon(new ImageIcon(Interface_peso.class.getResource("/Iconos/exit.png")));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 14));
		btnSalir.setBounds(33, 154, 79, 41);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interface_peso.class.getResource("/Iconos/joven-deportista-ocultando-cara-detras-escalas-peso_171337-15875.jpg")));
		lblNewLabel.setBounds(0, 0, 543, 383);
		contentPane.add(lblNewLabel);
	}
}
