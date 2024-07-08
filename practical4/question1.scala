object InventoryManagement {
    
  var itemNames: Array[String] = Array("Apples", "Bananas", "Oranges")
  var itemQuantities: Array[Int] = Array(10, 5, 8)

  def displayInventory(): Unit = {
    for (i <- itemNames.indices) {
      println(s"Item: ${itemNames(i)} and  the Quantity : ${itemQuantities(i)}")
    }
  }

 
  def restockItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      itemQuantities(index) += quantity
      println(s"Restocked $itemName with $quantity units. New quantity: ${itemQuantities(index)}")
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  
  def sellItem(itemName: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(itemName)
    if (index >= 0) {
      if (itemQuantities(index) >= quantity) {
        itemQuantities(index) -= quantity
        println(s"Sold $quantity units of $itemName. Remaining quantity: ${itemQuantities(index)}")
      } else {
        println(s"Not enough quantity of $itemName to sell.")
      }
    } else {
      println(s"Item $itemName does not exist in the inventory.")
    }
  }

  def main(args: Array[String]): Unit = {
    displayInventory()
    restockItem("Apples", 5)
    sellItem("Bananas", 3)
    displayInventory()
  }
}
