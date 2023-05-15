package examenColecciones2017_18;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Set;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnPrueba;
	private JMenuItem menuNuevoAnimal;
	private JToolBar barraElementos;
	private JButton btnNuevoAnimal;
	private JButton btnNuevaArea;
	private JToolBar toolBar_1;
	private JToolBar barraListados;
	private JButton btnComprobar;
	private JPanel panel;
	private JToolBar barraSalir;
	private JButton btnSalir;
	private JButton btnListar;
	private JSplitPane splitPane;
	private JPanel panel_1;
	private JScrollPane scrollPane;
	private JTextArea areaListados;
	private JMenuItem menuNuevaArea;
	private JSeparator separator;
	private JMenuItem menuSalir;
	private JMenu mnHerramientas;
	private JMenuItem mntmComprobarSeguridad;
	private JMenuItem mntmListarTodo;
	private JLabel lblrea;
	private JComboBox<Area> comboAreas;
	private JScrollPane scrollPane_1;
	private JTextArea areaTextoArea;
	private Vista vista;

	public Ventana(Vista vista) {
		this.vista = vista;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/iconos/leon.jpg")));
		setTitle("Reserva Zool\u00F3gica, S.A.");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 380);

		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		mnPrueba = new JMenu("Nuevo");
		menuBar.add(mnPrueba);

		menuNuevoAnimal = new JMenuItem("Animal");
		menuNuevoAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevoAnimalPulsado();
			}
		});

		mnPrueba.add(menuNuevoAnimal);

		menuNuevaArea = new JMenuItem("\u00C1rea");
		menuNuevaArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevaAreaPulsado();
			}
		});
		mnPrueba.add(menuNuevaArea);

		separator = new JSeparator();
		mnPrueba.add(separator);

		menuSalir = new JMenuItem("Salir");
		menuSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		mnPrueba.add(menuSalir);

		mnHerramientas = new JMenu("Herramientas");
		menuBar.add(mnHerramientas);

		mntmComprobarSeguridad = new JMenuItem("Comprobar Seguridad");
		mntmComprobarSeguridad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonSeguridadPulsado();
			}
		});
		mnHerramientas.add(mntmComprobarSeguridad);

		mntmListarTodo = new JMenuItem("Listar Todo");
		mntmListarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarPulsado();
			}
		});
		mnHerramientas.add(mntmListarTodo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

		barraElementos = new JToolBar();
		barraElementos.setName("A\u00F1adir");
		barraElementos.setToolTipText("barra 1");
		panel.add(barraElementos);

		btnNuevoAnimal = new JButton();
		btnNuevoAnimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevoAnimalPulsado();
			}
		});
		btnNuevoAnimal.setToolTipText("Nuevo Animal");
		btnNuevoAnimal.setIcon(new ImageIcon(Ventana.class.getResource("iconos/animal.png")));
		barraElementos.add(btnNuevoAnimal);

		btnNuevaArea = new JButton();
		btnNuevaArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				nuevaAreaPulsado();
			}
		});
		btnNuevaArea.setToolTipText("Nueva \u00C1rea");
		btnNuevaArea.setIcon(new ImageIcon(Ventana.class.getResource("iconos/area.png")));
		barraElementos.add(btnNuevaArea);

		barraListados = new JToolBar();
		barraListados.setName("Herramientas");
		panel.add(barraListados);

		btnComprobar = new JButton("");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonSeguridadPulsado();
			}
		});
		btnComprobar.setToolTipText("Comprobar Seguridad");
		btnComprobar.setIcon(new ImageIcon(Ventana.class.getResource("iconos/atencion.png")));
		barraListados.add(btnComprobar);

		btnListar = new JButton("");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarPulsado();
			}
		});
		btnListar.setToolTipText("Listar Todo");
		btnListar.setIcon(new ImageIcon(Ventana.class.getResource("iconos/listar.png")));
		barraListados.add(btnListar);

		barraSalir = new JToolBar();
		barraSalir.setName("Salir");
		panel.add(barraSalir);

		btnSalir = new JButton("");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				salir();
			}
		});
		btnSalir.setToolTipText("Salir");
		btnSalir.setIcon(new ImageIcon(Ventana.class.getResource("iconos/salir.png")));
		barraSalir.add(btnSalir);

		splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel_1.setMinimumSize(new Dimension(150, 10));
		panel_1.setPreferredSize(new Dimension(200, 10));
		panel_1.setSize(new Dimension(200, 0));
		splitPane.setLeftComponent(panel_1);

		lblrea = new JLabel("\u00C1rea");

		comboAreas = new JComboBox<Area>();
		comboAreas.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				comboCambiado();
			}
		});

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
										.addComponent(comboAreas, GroupLayout.PREFERRED_SIZE, 130,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblrea))
								.addContainerGap(60, Short.MAX_VALUE))
						.addComponent(scrollPane_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 200,
								Short.MAX_VALUE));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(lblrea)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(comboAreas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)));

		areaTextoArea = new JTextArea();
		scrollPane_1.setViewportView(areaTextoArea);
		panel_1.setLayout(gl_panel_1);

		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		splitPane.setRightComponent(scrollPane);

		areaListados = new JTextArea();
		scrollPane.setViewportView(areaListados);

	}

	protected void botonSeguridadPulsado() {
		this.areaListados.setText(this.vista.getListadoProblemas());
	}

	protected void listarPulsado() {
		this.areaListados.setText(this.vista.getListadoTotal());
	}

	protected void salir() {
		System.exit(0);

	}

	protected void comboCambiado() {
		if (this.comboAreas.getSelectedIndex() > -1) {
			Area area = (Area) this.comboAreas.getSelectedItem();
			String listadoArea = this.vista.getListadoArea(area);
			this.areaTextoArea.setText(listadoArea);
		}
	}

	protected void nuevaAreaPulsado() {
		this.vista.nuevaAreaPulsado();

	}

	protected void nuevoAnimalPulsado() {
		this.vista.nuevoAnimalPulsado();

	}

	public void actualizaComboAreas() {
		Set<Area> lista = this.vista.getListaAreas();
		this.comboAreas.removeAllItems();
		for (Area a : lista)
			this.comboAreas.addItem(a);
	}
}
