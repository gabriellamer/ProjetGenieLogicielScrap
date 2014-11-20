package ca.uqtr.gl.ui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import ca.uqtr.gl.controllers.ControlleurArticles;
import ca.uqtr.gl.controllers.ControlleurClients;
import ca.uqtr.gl.controllers.ControlleurVentes;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalExclusionType;



public class EcranPrincipal {

	//Mauvaise programmation, sera remplac� par un singleton dans l'autre projet.
	public final static ControlleurClients ctlClients = new ControlleurClients();
	public final static ControlleurArticles ctlArticles = new ControlleurArticles();
	public final static ControlleurVentes ctlVentes = new ControlleurVentes();
	
	private JPanel contentPane;
	private JFrame frame;
	

	/**
	 * Create the frame.
	 */
	public EcranPrincipal() {

		
		ctlClients.ajouter("Tremblay", "Carl", null, null, "(450) 222-3333", "carl@gmail.com");
		ctlClients.ajouter("Roy", "Bob", null, null, "(450) 444-5555", "roy@gmail.com");
		
		/*try
		{
			ctlArticles.ajouter("SKI1213", "Ski alpin", 12, 12, 12, 340, 5);
			ctlArticles.ajouter("RAQ3434", "Raquette de tennis", 12, 12, 12, 100, 4);
			ctlArticles.ajouter("BAL1000", "Balle de baseball", 12, 12, 12, 4.99, 15);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		System.out.println(ctlClients.obtenirClient(1).getNoCarteMembre());
		System.out.println(ctlClients.obtenirClient(2).getNoCarteMembre());*/
				
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		
		frame.setTitle("Menu principal");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
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
				
				EcranListeClient window = new EcranListeClient(ctlClients);
				window.frame.setVisible(true);
			}
		});
		
		//Traiter une vente
		btnTraiterUneVente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EcranTraiterUneVente window = new EcranTraiterUneVente();
				window.getFrame().setVisible(true);
			}
		});
		
	}
	
	public JFrame getFrame()
	{
		return frame;
	}
}
