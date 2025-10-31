/** Tally votes: the VoteTally class
*   Anderson, Franceschi
*/

public class VoteTally
{
  public static void main( String [] args )
  {
    // votes are for 4 candidates in 6 districts.
    int [][] votes = { { 150, 253, 125, 345 },
                       { 250, 750, 234, 721 },
                       { 243, 600, 212, 101 },
                       { 234, 243, 143, 276 },
                       { 555, 343, 297, 990 },
                       { 111, 426, 834, 101 } };
    // candidate names
    String [] candidates = { "Smith", "Jones",
                             "Berry", "Chase" };

    // instantiate a Tally object reference
    Tally tally = new Tally( votes );

    // call arrayTalley method to count the votes
    int [][] voteCounts = tally.arrayTally( );

    // print totals for candidates
    System.out.println( "Total votes per candidate" );
    for ( int i = 0; i < candidates.length; i++ )
      System.out.print( candidates[i] + "\t" );
    System.out.println( );
    for ( int j = 0; j < voteCounts[0].length; j++ )
      System.out.print( voteCounts[0][j] + "\t" );
    System.out.println( );

    // print totals for districts
    System.out.println("\nTotal votes per district" );
    for ( int i = 0; i < voteCounts[1].length; i++ )
      System.out.print( ( i + 1 ) + "\t\t" );
    System.out.println( );
    for ( int i = 0; i < voteCounts[1].length; i++ )
      System.out.print( voteCounts[1][i] + "\t" );
    System.out.println( );
  }
}
