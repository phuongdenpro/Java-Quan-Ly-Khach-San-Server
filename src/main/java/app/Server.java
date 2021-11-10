package app;

import java.awt.Dimension;
import java.time.LocalDateTime;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class Server extends JFrame{
	private JTextArea taConsole;
	
	public Server() {
		setExtendedState(MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(800, 600));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Server quản lý khách sạn");
		
		this.getContentPane().add(new JScrollPane(taConsole = new JTextArea()));
		
//		RMI
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy", "rmi/policy.policy");
			securityManager = new SecurityManager();
			System.setSecurityManager(securityManager);
		}
	}
	
}
