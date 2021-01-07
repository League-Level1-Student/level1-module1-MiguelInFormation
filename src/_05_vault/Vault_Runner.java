package _05_vault;

import javax.swing.JOptionPane;

public class Vault_Runner {
	public static void main(String [] args) {
		
		Vault v = new Vault(0);
		Bond j = new Bond();
		
		int z = j.findCode(v);
		JOptionPane.showMessageDialog(null, "The code was " + z);
		
	}

}
