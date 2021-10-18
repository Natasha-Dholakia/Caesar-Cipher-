import java.util.Scanner;

public class Cipher {
// creating method for text encryption

	public static String encrypt(String plainText, int shift) {
		// creating parameters, making sure the letter are in the range and do not
		// exceed 26 letters
		if (shift > 26) {
			shift = shift % 26;// the string will not be greater than 26

		} else if (shift < 0) {
			shift = (shift % 26) + 26;// the string will not be less than 0
		}

		String cipherText = "";// Write string in this
		int length = plainText.length();
		for (int i = 0; i < length; i++) {// encrypting message in the for loop
		 	char abc = plainText.charAt(i);
			if (Character.isLetter(abc)) {
				if (Character.isLowerCase(abc)) {// lower case letter bounds
					char s = (char) (abc + shift);
					if (s > 'z') {
						cipherText += (char) (abc - (26 - shift));

					} else {
						cipherText += s;
					}
				} else if (Character.isUpperCase(abc)) {// upper case letter bounds
					char s = (char) (abc + shift);
					if (s > 'Z') {
						cipherText += (char) (abc - (26 - shift));

					} else {
						cipherText += s;// with alphabet bounds (no numbers or symbols)
					}
				}
			}

			else {
				cipherText += abc;

			}
		}
		return cipherText;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);// used for user input
		String input;// User input
		System.out.println("Please write your message : ");
		input = keyboard.nextLine();


		String CaesarCipher = encrypt(input, 4);// this will shift the user input by 2
		System.out.println(CaesarCipher); // returning the caesar cipher code


	}

}
