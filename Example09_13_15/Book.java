/* Book class
   Anderson, Franceschi
*/

public class Book
{
 private String title;
 private String author;
 private double price;

 /** default constructor
 */
 public Book( )
 {
  title = "";
  author = "";
  price  = 0.0;
 }

 /** overloaded constructor
 *  @param title   the value to assign to title
 *  @param author  the value to assign to author
 *  @param price   the value to assign to price
 */
 public Book( String title, String author, double price )
 {
  this.title = title;
  this.author = author;
  this.price = price;
 }

 /** getTitle method
 *   @return the title
 */
 public String getTitle( )
 {
  return title;
 }

 /** getAuthor method
 *   @return the author
 */
 public String getAuthor( )
 {
  return author;
 }

 /** getPrice method
 *   @return the price
 */
 public double getPrice( )
 {
  return price;
 }

 /** toString
 * @return title, author, and price
 */
 @Override
 public String toString( )
 {
  return ( "title: " + title + "\t"
           + "author: " + author + "\t"
           + "price: " + price );
 }
}
