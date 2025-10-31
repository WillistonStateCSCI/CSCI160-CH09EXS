/* A simple HashMap of ( String, String ) pairs
   Anderson, Franceschi
*/

import java.util.HashMap;
import java.util.Set;

public class HashMapStates
{
  public static void main( String [ ] args )
  {
    HashMap<String,String> states = new HashMap<String,String>( );
    states.put( "CA", "California" );
    // MD should be for Maryland; we correct this later
    states.put( "MD", "Maine" );  
    states.put( "NY", "New York" );
    states.put( "NJ", "New Jersey" );

    // Output all (key, value) pairs
    System.out.println( "states: " + states );

    // Retrieve value whose key is NY
    String nyState = states.get( "NY" );
    System.out.println( "NY is " + nyState );
    
    // Change value whose key is MD to Maryland
    states.replace( "MD", "Maryland" );
    System.out.println( "states: " + states + "\n" );

    // Remove state whose key is MD
    String mdState = states.remove( "MD" );
    System.out.println( mdState + " was removed" );
    System.out.println( "states: " + states + "\n" );
    
    // Loop through all the values using the keys
    Set<String> keys = states.keySet( );
    for ( String abbr: keys )
      System.out.println( abbr + ": " + states.get( abbr ) );
    System.out.println( );
    
    // Loop through all the values directly
    for ( String state: states.values( ) )
      System.out.println( state );
  }    
}