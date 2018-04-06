package jdbctest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class view extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField id;
	private JTextField nom;
	private JTextField prenom;
	private JTextField age;
	private JTextField ville;
	private DefaultTableModel model;
    private model modelObj = new model();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
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
	public view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 193, 414, 143);
		contentPane.add(scrollPane);
		
		table = new JTable();
		model = new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"id", "nom", "prenom", "age", "ville"
				}
			);
		table.setModel(model);
		scrollPane.setViewportView(table);
		scrollPane.setColumnHeaderView(table.getTableHeader());
		JButton btnInsert = new JButton("insert");
		btnInsert.setBounds(335, 11, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnUpdate = new JButton("update");
		btnUpdate.setBounds(335, 45, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnSearch = new JButton("search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				model.addRow(modelObj.getData());
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSearch.setBounds(335, 79, 89, 23);
		contentPane.add(btnSearch);
		
		JButton btnDelete = new JButton("delete");
		btnDelete.setBounds(335, 113, 89, 23);
		contentPane.add(btnDelete);
		
		id = new JTextField();
		id.setBounds(163, 12, 86, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		nom = new JTextField();
		nom.setBounds(163, 46, 86, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setBounds(163, 80, 86, 20);
		contentPane.add(prenom);
		prenom.setColumns(10);
		
		age = new JTextField();
		age.setBounds(163, 114, 86, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		ville = new JTextField();
		ville.setBounds(163, 145, 86, 20);
		contentPane.add(ville);
		ville.setColumns(10);
	}

}
