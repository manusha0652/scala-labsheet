

class Account(var balance: Double) {

  def deposit(amount: Double): Unit = {
    balance += amount
    println(s"Deposited $amount, new balance: $balance")
  }

  def withdraw(amount: Double): Unit = {
    if (amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount, new balance: $balance")
    } else {
      println("Insufficient balance")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
      println(s"Transferred $amount to another account")
    } else {
      println("Insufficient balance to transfer")
    }
  }

  override def toString: String = s"Account balance: $balance"
}


