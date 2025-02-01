package calculadoraMohamed;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel suma;
	private JTextField text1;
	private JTextField text2;
	private JTextField textResultado;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		suma = new JPanel();
		suma.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(suma);
		
		JButton Multiplicado = new JButton("*");
		Multiplicado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entrada1 = Integer.parseInt(text1.getText());
				int entrada2 = Integer.parseInt(text2.getText());
				int resultado= entrada1*entrada2;
				textResultado.setText(String.valueOf(resultado));
			}
		});
		
		JButton sumaNumero = new JButton("+");
		sumaNumero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entrada1 = Integer.parseInt(text1.getText());
				int entrada2 = Integer.parseInt(text2.getText());
				int resultado= entrada1+entrada2;
				textResultado.setText(String.valueOf(resultado));
			}
		});
		
		JButton Menos = new JButton("-");
		Menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entrada1 = Integer.parseInt(text1.getText());
				int entrada2 = Integer.parseInt(text2.getText());
				int resultado= entrada1-entrada2;
				textResultado.setText(String.valueOf(resultado));
			}
		});
		
		JButton Dividido = new JButton("/");
		Dividido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int entrada1 = Integer.parseInt(text1.getText());
				int entrada2 = Integer.parseInt(text2.getText());
				int resultado= entrada1/entrada2;
				textResultado.setText(String.valueOf(resultado));


			}
		});
		
		text1 = new JTextField();
		text1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		
		text2 = new JTextField();
		text2.setColumns(10);
		
		textResultado = new JTextField();
		textResultado.setColumns(10);
		
		JButton Limbiar = new JButton("Limbar");
		Limbiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText(""); 
		        text2.setText(""); 
		        textResultado.setText("");
			}
		});
		GroupLayout gl_suma = new GroupLayout(suma);
		gl_suma.setHorizontalGroup(
			gl_suma.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_suma.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_suma.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Limbiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_suma.createSequentialGroup()
							.addComponent(sumaNumero, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Multiplicado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_suma.createSequentialGroup()
							.addComponent(Menos, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(Dividido, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
					.addGroup(gl_suma.createParallelGroup(Alignment.LEADING)
						.addComponent(textResultado, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(separator, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(text1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
						.addComponent(text2, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		gl_suma.setVerticalGroup(
			gl_suma.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_suma.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_suma.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_suma.createSequentialGroup()
							.addGroup(gl_suma.createParallelGroup(Alignment.BASELINE)
								.addComponent(Multiplicado, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addComponent(sumaNumero, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_suma.createParallelGroup(Alignment.BASELINE)
								.addComponent(Menos, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(Dividido, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_suma.createSequentialGroup()
							.addComponent(text1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(text2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_suma.createParallelGroup(Alignment.LEADING, false)
						.addComponent(Limbiar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(textResultado, GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
					.addContainerGap(131, Short.MAX_VALUE))
		);
		suma.setLayout(gl_suma);
	}
}
