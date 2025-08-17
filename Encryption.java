class Encryptionn {
    public static String encrypt(String inputText, int shift) {

        StringBuilder result = new StringBuilder();

        for (char c : inputText.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                char ch = (char) ((c - 'A' + shift) % 26 + 'A');
                result.append(ch);

            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static String decrypt(String inputText, int shift) {

        StringBuilder result = new StringBuilder();

        for (char c : inputText.toCharArray()) {

            if (c >= 'A' && c <= 'Z') {
                char  ch = (char) ((c - 'A' -shift + 26) % 26 + 'A');
                result.append(ch);

            } else {
                result.append(c);
            }

        }

        return  result.toString();

    }








    public static void main(String[] args) {
        String message = "WHAT-THE-FUCK";

        int shift = 5;

        System.out.println("Original Message: " + message);
        System.out.println("Encrypted Message: " + encrypt(message, shift));
        System.out.println("Decrypted Message: " + decrypt(encrypt(message, shift), shift));
    }

}