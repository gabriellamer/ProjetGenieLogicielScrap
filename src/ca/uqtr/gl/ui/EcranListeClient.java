package ca.uqtr.gl.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;

import ca.uqtr.gl.controllers.ControlleurClients;
import ca.uqtr.gl.ui.components.ListeClientTableDataModel;
import ca.uqtr.gl.ui.components.VenteTableDataModel;

public class EcranListeClient extends JFrame {

	private JPanel contentPane;
	public JFrame frame;
	private JTable table;
	private ListeClientTableDataModel dataModel;

	/**
	 * Create the frame.
	 */
	public EcranListeClient(ControlleurClients controlleur) {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		
		frame.setTitle("Liste des clients");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Titres de colonnes
		String[] columnNames = {
								"Identifiant",
								"Nom",
								"# Carte"
				                };
		
		dataModel = new ListeClientTableDataModel(columnNames);
		
		table = new JTable(dataModel);
		table.setBounds(0, 0, 450, 240);
		
		table.addMouseListener(new java.awt.event.MouseAdapter() {
		    @Override
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		        int row = table.rowAtPoint(evt.getPoint());
		        int col = table.columnAtPoint(evt.getPoint());
		        if (row >= 0 && col >= 0) {
		        	EcranGestionClient window = new EcranGestionClient(EcranPrincipal.ctlClients, dataModel.getClient(row));
					window.frmGestionClient.setVisible(true);
		        }
		    }
		});
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 450, 240);
		contentPane.add(scrollPane);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EcranGestionClient window = new EcranGestionClient(EcranPrincipal.ctlClients);
				window.frmGestionClient.setVisible(true);
			}
		});
		btnAjouter.setBounds(320, 247, 115, 26);
		contentPane.add(btnAjouter);
	}
	
	public JFrame getFrame()
	{
		return frame;
	}
}
