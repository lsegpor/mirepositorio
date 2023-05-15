package examenColecciones2017_18;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class DialogoNuevaArea extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Vista vista;
	private JTextField campoNombreArea;
	private JTextField campoExtensi�n;

	public DialogoNuevaArea(Vista vista) {
		setResizable(false);
		this.vista = vista;
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/iconos/leon.jpg")));
		setTitle("A\u00F1adir Nueva \u00C1rea");
		this.vista = vista;
		setBounds(100, 100, 450, 161);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblNombreDelrea = new JLabel("Nombre del \u00E1rea: ");
		campoNombreArea = new JTextField();
		campoNombreArea.setColumns(10);
		JLabel lblExtensin = new JLabel("Extensi\u00F3n:");
		campoExtensi�n = new JTextField();
		campoExtensi�n.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(lblNombreDelrea, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(campoNombreArea, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(lblExtensin, GroupLayout.PREFERRED_SIZE, 100,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(campoExtensi�n, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
						.addContainerGap()));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblNombreDelrea)
								.addComponent(campoNombreArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE).addComponent(lblExtensin)
								.addComponent(campoExtensi�n, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addContainerGap(40, Short.MAX_VALUE)));
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton botonA�adir = new JButton("A\u00F1adir");
				botonA�adir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						botonA�adirPulsado();
					}
				});
				botonA�adir.setActionCommand("OK");
				buttonPane.add(botonA�adir);
				getRootPane().setDefaultButton(botonA�adir);
			}
			{
				JButton botonCancelar = new JButton("Cancelar");
				botonCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						botonCancelarPulsado();
					}
				});

				buttonPane.add(botonCancelar);
			}
		}
	}

	protected void botonA�adirPulsado() {
		if (this.campoNombreArea.getText().isEmpty())
			this.vista.error(this, "Debe escribir un nombre de �rea");
		else {
			try {
				float extensi�n = Float.parseFloat(this.campoExtensi�n.getText());
				if (this.vista.a�ade�rea(this.campoNombreArea.getText(), extensi�n) == false)
					this.vista.error(this, "Ese �rea ya estaba en la reserva");
				else {
					this.vista.msg(this, "�rea almacenada.");
					this.setVisible(false);
				}
			} catch (NumberFormatException e) {
				this.vista.error(this, "Debe escribir un n�mero en la extensi�n");
			}
		}

	}

	protected void botonCancelarPulsado() {
		this.setVisible(false);

	}

	public void mostrar() {
		this.campoNombreArea.setText("");
		this.campoExtensi�n.setText("");
		this.setVisible(true);

	}

}
