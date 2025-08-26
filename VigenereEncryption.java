class VigenereEncryption {

    char[][] vigenere = new char[26][26];

    VigenereEncryption() {

        for (int i = 0; i < 26; i++) {

            for (int j = 0; j < 26; j++) {

                vigenere[i][j] = (char) ((i + j) % 26 + 'A');
            }

        }

    }



    //  Encryption 

    public String encrypt(String Message, String Key) {

        Message = Message.replaceAll("\\s", "").toUpperCase();
        Key = Key.toUpperCase();

        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < Message.length(); i++) {
            char originalChar = Message.charAt(i);
            char keyChar = Key.charAt(i % Key.length());

            encryptedMessage.append(vigenere[keyChar - 'A'][originalChar - 'A']);

        }

        return encryptedMessage.toString();

    }






    //  Decryption   



    public String   decrypt (String EncryptedMessage ,  String Key  ) {

		Key  =  Key.toUpperCase() ;
		
		        StringBuilder decryptedMessage = new StringBuilder();

		
		for  (int  i = 0 ; i  <  EncryptedMessage.length() ;  i++ ) {
			char   encryptedChar  =  EncryptedMessage.charAt(i) ;
			char   keyChar  =  Key.charAt(i % Key.length()) ;
			
			
			for (int j = 0 ; j < 26 ; j++) {
				
				if (vigenere[keyChar - 'A'][j] == encryptedChar ) {
				
				decryptedMessage.append(vigenere[0][j]) ;
				break ; 
				
			
			}
			
		} 
            
		}
				return decryptedMessage.toString() ;

    }










    public static void main(String[] args) {

        String Message = "I WILL KILL YOU";
        String Key = "FUCK";

        VigenereEncryption secret = new VigenereEncryption();

        String SecretMessage = secret.encrypt(Message, Key);

        System.out.println("Encrypted Message : " + SecretMessage);
		
		
		
		        String Secret = "NQKVQEKVQSQE";

		
		String DecryptedMessage = secret.decrypt(Secret, Key);

        System.out.println("Decrypted Message : " + DecryptedMessage);
		

    }

}