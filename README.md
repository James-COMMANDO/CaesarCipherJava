# CaesarCipherJava

- Deciphers/Ciphers Text by shifting the alphabet
- Written in Java

- [X] Encrypt
- [X] Decrypt
- [X] BruteForce
- [X] Console
- [X] GUI








# Console Programme

- Encrypt
let's write a message that is encrypted so no one can see it!

```java
 CaesarCipher cipher = new CaesarCipher(); // Create an Object of the class
 
 /**
 * param text Text that you want to encrypt
 * param shift Amount of alphabet shift
 */
 cipher.encrypt("I don't want to see you!", 1); 
 ```
 
 Output: J!epo(u!xbou!up!tff!zpv"
 
 
 
 
 - Decrypt
 Now lets try to decrypt this 'J!epo(u!xbou!up!tff!zpv"' with our tool!
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
 
 
 
 - Bruteforce
We can take the lazy route and bruteforce it, we will take the same example from the decrypt
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
Hcnm&sv`mssnrddxnt 
Gbml%ru_lrrmqccwms
Falk$qt^kqqlpbbvlr
E`kj#ps]jppkoaaukq
D_ji"or\ioojn``tjp
C^ih!nq[hnnim__sio
B]hg mpZgmmhl^^rhn
A\gfloYfllgk]]qgm
@[feknXekkfj\\pfl
?ZedjmWdjjei[[oek
>YdcilVciidhZZndj
=XcbhkUbhhcgYYmci
<WbagjTaggbfXXlbh
;Va`fiS`ffaeWWkag
:U`_ehR_ee`dVVj`f
9T_^dgQ^dd_cUUi_e
8S^]cfP]cc^bTTh^d
7R]\beO\bb]aSSg]c
f\b
5P[Z`cMZ``[_QQe[a
4OZY_bLY__Z^PPdZ`
3
NYX^
aKX^
^Y
]OO
cY_
2	MXW]	`JW]	]X	\NN	bX^

LWV_IV\[MaW]	
0KVU[^HU[[VZLL`V
"



  
