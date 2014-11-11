package ca.uqtr.gl.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import ca.uqtr.gl.controllers.ControlleurClients;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EcranPrincipal extends JFrame {

	final ControlleurClients ctlClients = new ControlleurClients();
	
	private JPanel contentPane;
	
	

	/**
	 * Create the frame.
	 */
	public EcranPrincipal() {
		setTitle("Menu principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGererClients = new JButton("G\u00E9rer clients");
		
		btnGererClients.setBounds(10, 35, 167, 37);
		contentPane.add(btnGererClients);
		
		JButton btnGererArticles = new JButton("G\u00E9rer articles");
		btnGererArticles.setBounds(10, 83, 167, 37);
		contentPane.add(btnGererArticles);
		
		JButton btnTraiterUneVente = new JButton("Traiter une vente");
		
		btnTraiterUneVente.setBounds(10, 131, 167, 37);
		contentPane.add(btnTraiterUneVente);
		
		//Gestion des clients
		btnGererClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EcranGestionClient window = new EcranGestionClient(ctlClients);
				window.frmGestionClient.setVisible(true);
			}
		});
		
		//Traiter une vente
		btnTraiterUneVente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EcranTraiterVente window = new EcranTraiterVente();
				window.setVisible(true);
				//window.frmGestionClient.setVisible(true);
			}
		});
		
	}
}
