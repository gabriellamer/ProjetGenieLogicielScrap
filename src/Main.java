import java.awt.EventQueue;

import ca.uqtr.gl.controllers.ControlleurClients;
import ca.uqtr.gl.ui.EcranGestionClient;

public class Main {	
	public static void main(String[] args) {	
		final ControlleurClients ctlClients = new ControlleurClients();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EcranGestionClient window = new EcranGestionClient(ctlClients);
					window.frmGestionClient.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
