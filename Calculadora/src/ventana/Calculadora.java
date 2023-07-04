package ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textPantalla;
	private List<Double> numeros = new ArrayList<>();
    private String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 406);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		textPantalla = new JTextField();
		textPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		textPantalla.setFont(new Font("Arial", Font.BOLD, 18));
		textPantalla.setBounds(10, 10, 266, 42);
		contentPane.add(textPantalla);
		textPantalla.setColumns(10);
			
		
		
		JButton btnLimpiar = new JButton("C");
		btnLimpiar.setForeground(new Color(255, 0, 0));
		btnLimpiar.setBackground(new Color(255, 255, 255));
		btnLimpiar.setFont(new Font("Arial", Font.BOLD, 15));
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textPantalla.setText("");
			}
		});
		btnLimpiar.setBounds(200, 62, 76, 42);
		contentPane.add(btnLimpiar);
		
		JButton btnSuma = new JButton("+");
		btnSuma.setForeground(new Color(255, 0, 0));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(textPantalla.getText());
                numeros.add(numero);
                operacion = "+";
                textPantalla.setText("");
			}
		});
		btnSuma.setFont(new Font("Arial", Font.BOLD, 15));
		btnSuma.setBounds(223, 127, 53, 42);
		contentPane.add(btnSuma);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn3.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn3.setFont(new Font("Arial", Font.BOLD, 15));
		btn3.setBounds(160, 127, 53, 42);
		contentPane.add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn2.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn2.setFont(new Font("Arial", Font.BOLD, 15));
		btn2.setBounds(97, 127, 53, 42);
		contentPane.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn1.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn1.setFont(new Font("Arial", Font.BOLD, 15));
		btn1.setBounds(34, 127, 53, 42);
		contentPane.add(btn1);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(textPantalla.getText());
                numeros.add(numero);
                operacion = "-";
                textPantalla.setText("");
			}
		});
		btnResta.setForeground(new Color(255, 0, 0));
		btnResta.setFont(new Font("Arial", Font.BOLD, 15));
		btnResta.setBounds(223, 179, 53, 42);
		contentPane.add(btnResta);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn6.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn6.setFont(new Font("Arial", Font.BOLD, 15));
		btn6.setBounds(160, 179, 53, 42);
		contentPane.add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn5.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn5.setFont(new Font("Arial", Font.BOLD, 15));
		btn5.setBounds(97, 179, 53, 42);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn4.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn4.setFont(new Font("Arial", Font.BOLD, 15));
		btn4.setBounds(34, 179, 53, 42);
		contentPane.add(btn4);
		
		JButton btnMultiplicacion = new JButton("x");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(textPantalla.getText());
                numeros.add(numero);
                operacion = "*";
                textPantalla.setText("");
			}
		});
		btnMultiplicacion.setForeground(new Color(255, 0, 0));
		btnMultiplicacion.setFont(new Font("Arial", Font.BOLD, 15));
		btnMultiplicacion.setBounds(223, 231, 53, 42);
		contentPane.add(btnMultiplicacion);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn9.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn9.setFont(new Font("Arial", Font.BOLD, 15));
		btn9.setBounds(160, 231, 53, 42);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn8.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn8.setFont(new Font("Arial", Font.BOLD, 15));
		btn8.setBounds(97, 231, 53, 42);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btn7.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btn7.setFont(new Font("Arial", Font.BOLD, 15));
		btn7.setBounds(34, 231, 53, 42);
		contentPane.add(btn7);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double numero = Double.parseDouble(textPantalla.getText());
                numeros.add(numero);
                operacion = "/";
                textPantalla.setText("");
			}
		});
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Arial", Font.BOLD, 15));
		btnDiv.setBounds(223, 283, 53, 42);
		contentPane.add(btnDiv);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double numero = Double.parseDouble(textPantalla.getText());
                numeros.add(numero);

                double resultado = realizarOperaciones();
                textPantalla.setText(String.valueOf(resultado));

                numeros.clear();
            }

			private double realizarOperaciones() {
				double resultado = numeros.get(0);

		        for (int i = 1; i < numeros.size(); i++) {
		            double numero = numeros.get(i);

		            switch (operacion) {
		                case "+":
		                    resultado += numero;
		                    break;
		                case "-":
		                    resultado -= numero;
		                    break;
		                case "*":
		                    resultado *= numero;
		                    break;
		                case "/":
		                    resultado /= numero;
		                    break;
		            }
				
		        }
		        return resultado;
			}

					});
		btnIgual.setForeground(new Color(0, 100, 0));
		btnIgual.setFont(new Font("Arial", Font.BOLD, 15));
		btnIgual.setBounds(160, 283, 53, 42);
		contentPane.add(btnIgual);
	
	
		
		
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btnCero.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btnCero.setFont(new Font("Arial", Font.BOLD, 15));
		btnCero.setBounds(97, 283, 53, 42);
		contentPane.add(btnCero);
		
		JButton btnPunto = new JButton(".");
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingreseNumero = textPantalla.getText() + btnPunto.getText();
				textPantalla.setText(ingreseNumero);
			}
		});
		btnPunto.setFont(new Font("Arial", Font.BOLD, 23));
		btnPunto.setBounds(34, 283, 53, 42);
		contentPane.add(btnPunto);
	}
}
