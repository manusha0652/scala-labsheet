object question1{
case class Product(id: Int, name: String, quantity: Int, price: Double)
def main(args: Array[String]): Unit={



val inventory1: Map[Int, Product] = Map(
  101 -> Product(101, "Books", 10, 15.5),
  102 -> Product(102, "pencils", 5, 25.0)
)

val inventory2: Map[Int, Product] = Map(
  102 -> Product(102, "pencils", 3, 30.0),
  103 -> Product(103, "pens", 7, 20.0)
)


val productNames: Iterable[String] = inventory1.values.map(_.name)
println("Product Names in Inventory1: " + productNames.mkString(", "))


val totalValue: Double = inventory1.values.map(p => p.quantity * p.price).sum
println("Total Value of Inventory1: Rs." + totalValue)


val isEmpty: Boolean = inventory1.isEmpty
println("Is Inventory1 empty? " + isEmpty)


val mergedInventory: Map[Int, Product] = (inventory1.keys ++ inventory2.keys).map { id =>
  val p1 = inventory1.getOrElse(id, Product(id, "", 0, 0.0))
  val p2 = inventory2.getOrElse(id, Product(id, "", 0, 0.0))
  val name = if (p1.name.nonEmpty) p1.name else p2.name
  val quantity = p1.quantity + p2.quantity
  val price = math.max(p1.price, p2.price)
  id -> Product(id, name, quantity, price)
}.toMap

println("Merged Inventory: ")
mergedInventory.foreach { case (id, product) =>
  println(s"ID: ${product.id}, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
}


 println("Enter the Product ID to check:")
    val specificId = scala.io.StdIn.readInt()
inventory1.get(specificId) match {
  case Some(product) =>
    println(s"Product with ID $specificId found: ID: ${product.id}, Name: ${product.name}, Quantity: ${product.quantity}, Price: ${product.price}")
  case None =>
    println(s"Product with ID $specificId not found in Inventory1")
}

}
}