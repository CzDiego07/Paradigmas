package procedimiento;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;

public class interfazCurso {

	JFrame frmMetodos;
	private JTextField text_id;
	private JTextField text_Curso;
	private JTextField text_Des;
	private JTextField text_Nv;

	conexion cn = new conexion();

	/**
	 * Launch the Deslication.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfazCurso window = new interfazCurso();
					window.frmMetodos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the Deslication.
	 */
	public interfazCurso() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMetodos = new JFrame();
		frmMetodos.setTitle(" Metodos");
		frmMetodos.setBounds(100, 100, 450, 300);
		frmMetodos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMetodos.getContentPane().setLayout(null);

		JLabel lbl_ID = new JLabel("Cod_Curso");
		lbl_ID.setBounds(28, 11, 46, 14);
		frmMetodos.getContentPane().add(lbl_ID);

		JLabel lbl_Salon = new JLabel("Salon");
		lbl_Salon.setBounds(28, 36, 46, 14);
		frmMetodos.getContentPane().add(lbl_Salon);

		JLabel lbl_Des = new JLabel("Descripcion");
		lbl_Des.setBounds(28, 61, 46, 14);
		frmMetodos.getContentPane().add(lbl_Des);

		JLabel lbl_Nv = new JLabel("Nivel");
		lbl_Nv.setBounds(28, 86, 46, 14);
		frmMetodos.getContentPane().add(lbl_Nv);

		text_id = new JTextField();
		text_id.setBounds(96, 8, 86, 20);
		frmMetodos.getContentPane().add(text_id);
		text_id.setColumns(10);

		text_Curso = new JTextField();
		text_Curso.setBounds(96, 33, 86, 20);
		frmMetodos.getContentPane().add(text_Curso);
		text_Curso.setColumns(10);

		text_Des = new JTextField();
		text_Des.setBounds(96, 58, 86, 20);
		frmMetodos.getContentPane().add(text_Des);
		text_Des.setColumns(10);

		text_Nv = new JTextField();
		text_Nv.setBounds(96, 83, 86, 20);
		frmMetodos.getContentPane().add(text_Nv);
		text_Nv.setColumns(10);


		JButton btnInsertar = new JButton("Agregar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cn.id = text_id.getText();
				cn.salon = text_Curso.getText();
				cn.Des = text_Des.getText();
				cn.Nv = text_Nv.getText();
				cn.insertarCurso();
			}
		});
		btnInsertar.addKeyListener(new KeyAdapter() {
		});
		btnInsertar.setBounds(286, 7, 89, 23);
		frmMetodos.getContentPane().add(btnInsertar);

		JButton btn_Seleccionar = new JButton("Seleccionar");
		btn_Seleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cn.id = text_id.getText();
				cn.selecregCurso();
				text_Curso.setText(cn.salon);
				text_Des.setText(cn.Des);
				text_Nv.setText(cn.Nv);

			}
		});
		btn_Seleccionar.setBounds(245, 66, 148, 23);
		frmMetodos.getContentPane().add(btn_Seleccionar);

		JButton btn_Actualizar = new JButton("Actualizar");
		btn_Actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cn.id = text_id.getText();
				cn.salon = text_Curso.getText();
				cn.Des = text_Des.getText();
				cn.Nv = text_Nv.getText();
				cn.actregCurso();
				limpiarcajas();
			}
		});
		btn_Actualizar.setBounds(245, 101, 148, 23);
		frmMetodos.getContentPane().add(btn_Actualizar);

		JButton btn_Limpiar = new JButton("Limpiar");
		btn_Limpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiarcajas();
			}
		});
		btn_Limpiar.setBounds(245, 184, 148, 23);
		frmMetodos.getContentPane().add(btn_Limpiar);

		JButton btn_Eliminar = new JButton("Eliminar");
		btn_Eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cn.id = text_id.getText();
				cn.elimregCurso();
				limpiarcajas();
			}
		});
		btn_Eliminar.setBounds(245, 144, 148, 23);
		frmMetodos.getContentPane().add(btn_Eliminar);
	}

	public void limpiarcajas() {
		text_id.setText("");
		text_Curso.setText("");
		text_Des.setText("");
		text_Nv.setText("");
	}
}
