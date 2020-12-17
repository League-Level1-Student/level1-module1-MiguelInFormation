package _05_vault;

public class Vault {
	int secretcode;
	
	Vault(int secretcode) {
		this.secretcode=secretcode;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	boolean tryCode(int guess){
		if (guess==secretcode) {
			return true;
		}
		else {
			return false;

		}
		
		
	}
	
	


}
