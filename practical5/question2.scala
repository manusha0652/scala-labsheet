import scala.io.StdIn.readLine
import scala.collection.mutable
case class Book(title: String, author: String, isbn: String)

object LibraryManagement {

  // Initial set containing at least three different books

  var library: mutable.Set[Book] = mutable.Set(
    Book("Harry Potter", "J.K. Rowling", "2345678901"),
    Book("Madol Duwa", "Dr.Martin Wickramasinghe", "3456789012")
    Book("Faculty of sex", "Chinthana Dharmadasa", "1234567890"),
  )

  // Add a new book to the library

  def addBook(book: Book): Unit = {
    library += book
    println(s"Added: ${book.title} by ${book.author}")
  }

  // Remove a book from the library by its ISBN

  def removeBook(isbn: String): Unit = {
    library.find(_.isbn == isbn) match {
      case Some(book) =>
        library -= book
        println(s"Removed: ${book.title} by ${book.author}")
      case None => println(s"No book found with ISBN: $isbn")
    }
  }

  // Check if a book is already in the library by its ISBN

  def isBookInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  // Display the current library collection

  def displayLibrary(): Unit = {
    println("Library Collection:")
    library.foreach(book => println(s"${book.title} by ${book.author} (ISBN: ${book.isbn})"))
  }

  // Search for a book by its title

  def searchByTitle(title: String): Unit = {
    library.find(_.title.equalsIgnoreCase(title)) match {
      case Some(book) =>
        println(s"Found: ${book.title} by ${book.author} (ISBN: ${book.isbn})")
      case None => println(s"No book found with title: $title")
    }
  }

  // Display all books by a specific author
  
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"${book.title} (ISBN: ${book.isbn})"))
    } else {
      println(s"No books found by author: $author")
    }
  }

  def main(args: Array[String]): Unit = {
    var continue = true
    while (continue) {
      println("\nLibrary Management System")
      println("1. Display Library Collection")
      println("2. Add Book")
      println("3. Remove Book")
      println("4. Check if Book is in Library")
      println("5. Search Book by Title")
      println("6. Display Books by Author")
      println("7. Exit")
      print("Choose an option: ")

      readLine() match {
        case "1" => displayLibrary()
        case "2" =>
          print("Enter title : ")
          val title = readLine()
          print("Enter author: ")
          val author = readLine()
          print("Enter ISBN: ")
          val isbn = readLine()
          addBook(Book(title, author, isbn))
        case "3" =>
          print("Enter ISBN of book to remove: ")
          val isbn = readLine()
          removeBook(isbn)
        case "4" =>
          print("Enter ISBN to check: ")
          val isbn = readLine()
          if (isBookInLibrary(isbn)) println("Book is in the library.")
          else println("Book is not in the library.")
        case "5" =>
          print("Enter title to search: ")
          val title = readLine()
          searchByTitle(title)
        case "6" =>
          print("Enter author to display books: ")
          val author = readLine()
          displayBooksByAuthor(author)
        case "7" =>
          continue = false
          println("Exiting Library Management System.")
        case _ =>
          println("Invalid option. Please try again.")
      }
    }
  }
}
