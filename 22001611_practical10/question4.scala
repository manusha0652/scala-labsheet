// Account.scala
class Account(var balance: Double) {

  def deposit(amount: Double): Unit = {
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (amount <= balance) {
      balance -= amount
    } else {
      println("Insufficient balance")
    }
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    if (amount <= balance) {
      this.withdraw(amount)
      toAccount.deposit(amount)
    } else {
      println("Insufficient balance to transfer")
    }
  }

  override def toString: String = s"Account balance: $balance"
}


class Bank(val accounts: List[Account]) {

  def negativeBalances: List[Account] = {
    accounts.filter(_.balance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.balance).sum
  }

  def applyInterest(): Unit = {
    accounts.foreach { account =>
      if (account.balance > 0) {
        account.deposit(account.balance * 0.05)
      } else {
        account.withdraw(account.balance.abs * 0.1)
      }
    }
  }
}


object Main {
  def main(args: Array[String]): Unit = {
    val acc1 = new Account(100)
    val acc2 = new Account(-50)
    val acc3 = new Account(200)

    val bank = new Bank(List(acc1, acc2, acc3))

    println("Accounts with negative balances:")
    bank.negativeBalances.foreach(println)

    println(s"Total balance of all accounts: ${bank.totalBalance}")

    bank.applyInterest()
    println("Balances after applying interest:")
    bank.accounts.foreach(println)

    
    val testAcc1 = new Account(1000)
    val testAcc2 = new Account(500)
    testAcc1.deposit(200)
    testAcc1.withdraw(100)
    testAcc1.transfer(300, testAcc2)
    println(testAcc1)
    println(testAcc2)
  }
}
