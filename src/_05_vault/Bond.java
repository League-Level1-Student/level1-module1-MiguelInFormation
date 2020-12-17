package _05_vault;

public class Bond {
	int findCode (Vault Vault) {
		for (int i = 0; i < 1000000; i++) {
			boolean numguess = Vault.tryCode(i);
			if (numguess == true) {
				return i;
			}
			
			
		}
		return -1;
	}

}
