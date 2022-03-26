package GitVersion.CaesarCipherJava;

public class CaesarCipher {
  
  /*
  * Written by James
  * Materials: College
  */


    /**
     * Encrypt alphabet characters by shifting
     * @param text The text you want to encrypt
     * @param shift The amount of shift in characters
     */

    public void encrypt(String text, int shift)
    {
        char[] chars = text.toCharArray();

        for (char characters : chars)
        {
            characters += shift;
            System.out.print(characters);
        }
    }



    /**
     * Decrypt already encrypted characters by shifting
     * @param text Encrypted text
     * @param shift The amount of shift in characters
     */

    public void decrypt(String text, int shift)
    {
        char[] chars = text.toCharArray();

        for (char characters : chars)
        {
            characters -= shift;
            System.out.print(characters);
        }
    }



    /**
     * If you want to take the lazy route, you can brute force it
     * @param text Encrypted text
     */

    public void bruteForce(String text)
    {
        int letters = 26;

        for(int i = 1; i <= letters; i++)
        {
            decrypt(text, i);
            System.out.println("");
        }
    }



}
