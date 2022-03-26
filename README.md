# CaesarCipherJava

- Deciphers/Ciphers Text by shifting the alphabet
- Written in Java

- [X] Encrypt
- [X] Decrypt
- [X] BruteForce
- [X] Console
- [X] GUI








# Console Programme

## Encrypt

- let's write a message that is encrypted so no one can see it!

```java
 CaesarCipher cipher = new CaesarCipher(); // Create an Object of the class
 
 /**
 * param text Text that you want to encrypt
 * param shift Amount of alphabet shift
 */
 cipher.encrypt("I don't want to see you!", 1); 
 ```
 
 Output: J!epo(u!xbou!up!tff!zpv"
 
 
 
 
 ## Decrypt
 
 - Now lets try to decrypt this 'J!epo(u!xbou!up!tff!zpv"' with our tool!
 - 
 ```java
  CaesarCipher cipher = new CaesarCipher(); // Create an Object of the class
  
 /**
 * param text Text that you want to decrypt
 * param shift Amount of alphabet shift
 */
 cipher.encrypt("J!epo(u!xbou!up!tff!zpv\"", 1);  // added \ so it doesn't break the format/programme
 ```
 
 Output: I don't want to see you!
 
 Pretty cool right?
 
 
## Bruteforce

- We can take the lazy route and bruteforce it, we will take the same example from the decrypt

 ```java
  CaesarCipher cipher = new CaesarCipher(); // Create an Object of the class
  
 /**
 * param text Text that you want to decrypt
 * param shift Amount of alphabet shift
 */
 cipher.bruteforce("J!epo(u!xbou!up!tff!zpv\"");  // added \ so it doesn't break the format/programme
 ```
 
 Output: 
"I don't want to see you!
 and a bunch of other jumbeled text
"



  
