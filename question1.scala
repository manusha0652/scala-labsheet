object CaesarCipher {
  def shiftChar(char: Char, shift: Int, base: Char): Char = {
    ((char - base + shift) % 26 + base).toChar
  }

  def encrypt(plainText: String, shift: Int): String = {
    plainText.map {
      case c if c.isUpper => shiftChar(c, shift, 'A')
      case c if c.isLower => shiftChar(c, shift, 'a')
      case c => c
    }
  }

  def decrypt(cipherText: String, shift: Int): String = {
    encrypt(cipherText, 26 - shift)
  }

  def cipher(data: String, shift: Int, func: (String, Int) => String): String = {
    func(data, shift)
  }

  def main(args: Array[String]): Unit = {
    print("Enter the message: ")
    val message = scala.io.StdIn.readLine()

    print("Enter the shift value: ")
    val shift = scala.io.StdIn.readInt()

    val encrypted = cipher(message, shift, encrypt)
    val decrypted = cipher(encrypted, shift, decrypt)
    
    println(s"Original: $message")
    println(s"Encrypted: $encrypted")
    println(s"Decrypted: $decrypted")
  }
}
