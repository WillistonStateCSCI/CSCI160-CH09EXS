/* BookSearchEngine class
   Anderson, Franceschi
*/

import java.util.*;

public class BookSearchEngine
{
 public static void main( String [] args )
 {
  BookStore bs = new BookStore( );
  
  System.out.println( "Our book collection is:" );
  System.out.println( bs.toString( ) );
  Scanner scan = new Scanner( System.in );
  System.out.print( "Enter a keyword > " );
  String keyword = scan.next( );

  ArrayList<Book> results = bs.searchForTitle( keyword );

  System.out.println( "The search results for " + keyword
                      + " are:" );
  for ( Book tempBook : results )
        System.out.println( tempBook.toString( ) );
 }
}
