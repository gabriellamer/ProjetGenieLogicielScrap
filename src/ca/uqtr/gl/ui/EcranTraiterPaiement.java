package ca.uqtr.gl.ui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JSeparator;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

import ca.uqtr.gl.entities.Article;
import ca.uqtr.gl.entities.Vente;
import ca.uqtr.gl.ui.components.VenteTableDataModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class EcranTraiterPaiement {

	private JFrame frmTraiterUnPaiement;
	private JPanel contentPane;
	
	private EcranTraiterUneVente ecranTraiterUneVente;
	

	public EcranTraiterPaiement(EcranTraiterUneVente ecranPrecedent) {
		this.ecranTraiterUneVente = ecranPrecedent;
		
		frmTraiterUnPaiement = new JFrame();
		frmTraiterUnPaiement.setTitle("Traiter un paiement");
		frmTraiterUnPaiement.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmTraiterUnPaiement.setBounds(100, 100, 450, 300);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmTraiterUnPaiement.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		initListeners();
	}
	
	public JFrame getFrame()
	{
		return frmTraiterUnPaiement;
	}
	private void initListeners()
	{
	}
}
