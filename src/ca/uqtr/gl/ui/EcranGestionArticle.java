package ca.uqtr.gl.ui;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


import ca.uqtr.gl.controllers.ControlleurArticles;
import ca.uqtr.gl.entities.Article;
import ca.uqtr.gl.util.Utils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EcranGestionArticle {

	private ControlleurArticles ctlArticles;
	private Article article;
	private boolean isDirty = false;
	
	public JFrame frmGestionArticles;
	private JTagTextField txtCode;
	private JTagTextField txtDescription;
	private JTagTextField txtLargeur;
	private JTagTextField txtQte;
	private JLabel lblPrix;
	private JTagTextField txtPrix;
	private JLabel lbl;
	private JTagTextField txtCourriel;
	private JTagTextField txtHauteur;
	private JTagTextField txtLongeur;

	public EcranGestionArticle(ControlleurArticles controlleur) {
		this(controlleur, null);
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public EcranGestionArticle(ControlleurArticles controlleur, Article c) {
		initialize();
		this.ctlArticles = controlleur;
		this.article = c;
		this.isDirty = (c == null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionArticles = new JFrame();
		frmGestionArticles.setTitle("Gestion Articles");
		frmGestionArticles.setBounds(100, 100, 607, 395);
		frmGestionArticles.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmGestionArticles.getContentPane().setLayout(null);
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setBounds(10, 11, 46, 14);
		frmGestionArticles.getContentPane().add(lblCode);
		
		txtCode = new JTagTextField();
		txtCode.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				txtCode.selectAll();
			}
		});
		txtCode.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtCode);
			}
		});
		txtCode.setToolTipText("");
		txtCode.setBounds(109, 8, 472, 20);
		frmGestionArticles.getContentPane().add(txtCode);
		txtCode.setColumns(10);
		
		JLabel lblPrnom = new JLabel("Description:");
		lblPrnom.setBounds(10, 42, 69, 14);
		frmGestionArticles.getContentPane().add(lblPrnom);
		
		txtDescription = new JTagTextField();
		txtDescription.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtDescription);
			}
		});
		txtDescription.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtDescription.selectAll();
			}
		});
		txtDescription.setColumns(10);
		txtDescription.setBounds(109, 39, 472, 20);
		frmGestionArticles.getContentPane().add(txtDescription);
		
		JLabel lblLargeur = new JLabel("Largeur:");
		lblLargeur.setBounds(10, 117, 69, 14);
		frmGestionArticles.getContentPane().add(lblLargeur);
		
		txtLargeur = new JTagTextField();
		txtLargeur.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtLargeur);
			}
		});
		txtLargeur.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtLargeur.selectAll();
			}
		});
		txtLargeur.setColumns(10);
		txtLargeur.setBounds(109, 114, 472, 20);
		frmGestionArticles.getContentPane().add(txtLargeur);
		
		JLabel lblQte = new JLabel("Qte en inventaire");
		lblQte.setBounds(10, 201, 100, 14);
		frmGestionArticles.getContentPane().add(lblQte);
		
		txtQte = new JTagTextField();
		txtQte.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtQte);
			}
		});
		txtQte.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtQte.selectAll();
			}
		});
		txtQte.setColumns(10);
		txtQte.setBounds(109, 198, 472, 20);
		frmGestionArticles.getContentPane().add(txtQte);
		
		lblPrix = new JLabel("Prix:");
		lblPrix.setBounds(10, 229, 69, 14);
		frmGestionArticles.getContentPane().add(lblPrix);
		
		txtPrix = new JTagTextField();
		txtPrix.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtPrix);
			}
		});
		txtPrix.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPrix.selectAll();
			}
		});
		txtPrix.setColumns(10);
		txtPrix.setBounds(109, 226, 472, 20);
		frmGestionArticles.getContentPane().add(txtPrix);
		
		lbl = new JLabel("???:");
		lbl.setBounds(10, 257, 69, 14);
		frmGestionArticles.getContentPane().add(lbl);
		
		txtCourriel = new JTagTextField();
		txtCourriel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtCourriel.selectAll();
			}
		});
		txtCourriel.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				setChampsNormal(txtCourriel);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtCourriel);
			}
		});
		txtCourriel.setForeground(new Color(0, 0, 0));
		txtCourriel.setColumns(10);
		txtCourriel.setBounds(109, 254, 472, 20);
		frmGestionArticles.getContentPane().add(txtCourriel);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
		
				try {
					
					if (isDirty && validerChampsRequis()) {
					
						String code = txtCode.getText();
						String description = txtDescription.getText();
						double lougueur = Double.parseDouble(txtLargeur.getText());
						double largeur = Double.parseDouble(txtLongeur.getText());
						double hauteur = Double.parseDouble(txtHauteur.getText());
						double prix = Double.parseDouble(txtPrix.getText());
						double qte = Double.parseDouble(txtQte.getText());

					 
						if (article == null) {
							ctlArticles.ajouter(code, description, lougueur, largeur, hauteur, prix, qte);
							article = ctlArticles.obtenirDernierArticle();
						} else {
						ctlArticles.modifier(article, code, description, lougueur, largeur, hauteur, prix, qte);
						}
					
						isDirty = false;
				}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnEnregistrer.setBounds(216, 323, 115, 23);
		frmGestionArticles.getContentPane().add(btnEnregistrer);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSupprimer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (article != null) {
					ctlArticles.supprimer(article);
					viderChamps();
					article = null;
				}
			}
		});
		btnSupprimer.setBounds(341, 323, 115, 23);
		frmGestionArticles.getContentPane().add(btnSupprimer);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(466, 323, 115, 23);
		frmGestionArticles.getContentPane().add(btnAnnuler);
		
		JLabel lblHauteur = new JLabel("Hauteur:");
		lblHauteur.setBounds(10, 145, 69, 14);
		frmGestionArticles.getContentPane().add(lblHauteur);
		
		txtHauteur = new JTagTextField();
		txtHauteur.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtHauteur);
			}
		});
		txtHauteur.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtHauteur.selectAll();
			}
		});
		txtHauteur.setColumns(10);
		txtHauteur.setBounds(109, 142, 472, 20);
		frmGestionArticles.getContentPane().add(txtHauteur);
		
		txtLongeur = new JTagTextField();
		txtLongeur.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setChampsNormal(txtLongeur);
			}
		});
		txtLongeur.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtLongeur.selectAll();
			}
		});
		txtLongeur.setBounds(109, 83, 472, 20);
		frmGestionArticles.getContentPane().add(txtLongeur);
		txtLongeur.setColumns(10);
		
		JLabel lblDateNais = new JLabel("Longeur:");
		lblDateNais.setBounds(10, 86, 113, 14);
		frmGestionArticles.getContentPane().add(lblDateNais);
	}
	
	private boolean validerChampsRequis() {
		if (txtCode.getText().isEmpty()) {
			setChampsErreur(txtCode, "Veuillez entrer un Code.");
		}
		
		if (txtDescription.getText().isEmpty()) {
			setChampsErreur(txtDescription, "Veuillez entrer une Description.");
		}
		
		if (!Utils.isNumeric(txtLargeur.getText())) {
			setChampsErreur(txtLargeur, "Veuillez entrer un nombre.");
		}
		
		if (!Utils.isNumeric(txtLongeur.getText())) {
			setChampsErreur(txtLongeur, "Veuillez entrer un nombre.");
		}
		
		if (!Utils.isNumeric(txtHauteur.getText())) {
			setChampsErreur(txtHauteur, "Veuillez entrer un nombre.");
		}
		
		if (!Utils.isNumeric(txtQte.getText())) {
			setChampsErreur(txtQte, "Veuillez entrer une quantit�e.");
		}
		
		if (!Utils.isNumeric(txtPrix.getText())) {
			setChampsErreur(txtPrix, "Veuillez entrer un prix.");
		}
		
		
		return !txtCode.isInError() &&
			   !txtDescription.isInError() &&
			   !txtLargeur.isInError() &&
			   !txtQte.isInError() &&
			   !txtPrix.isInError() &&
			   !txtHauteur.isInError() &&
			   !txtLongeur.isInError();
	}
	
	private void viderChamps() {
		txtCode.setText("");
		txtDescription.setText("");
		txtLargeur.setText("");
		txtQte.setText("");
		txtPrix.setText("");
		txtHauteur.setText("");
		txtLongeur.setText("");
		txtCourriel.setText("");
	}
	
	private void setChampsNormal(JTagTextField field) {
		field.setForeground(Color.BLACK);
		field.setInError(false);
		isDirty = true;
	}
	
	private void setChampsErreur(JTagTextField field, String msgErreur) {
		field.setText(msgErreur);
		field.setForeground(Color.RED);
		field.setInError(true);
	}
}
