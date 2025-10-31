/** Two-Dimensional Arrays as Method Parameters
*   and Return Values: the Tally class
*   Anderson, Franceschi
*/

public class Tally
{
  int [][] voteData;

  /** constructor
  *   @param    voteData   an array of vote counts
  */
  public Tally( int [][] voteData )
  {
    this.voteData = new int[voteData.length][];
    for( int i = 0; i < voteData.length; i++ )
      this.voteData[i] = new int[voteData[i].length];

    for( int i = 0; i < voteData.length; i++ )
    {
      for( int j = 0; j < voteData[i].length; j++ )
      {
        this.voteData[i][j] = voteData[i][j];
      }
    }
  }

  /** arrayTally method
  *   @return    a two-dimensional array of votes
  */
  public int [][] arrayTally( )
  {
    // create array of tallies, all elements are 0
    int [][] returnTally = new int [2][];
    returnTally[0] = new int [voteData[0].length];
    returnTally[1] = new int [voteData.length];

    for ( int i = 0; i < voteData.length; i++ )
    {
      for ( int j = 0; j < voteData[i].length; j++ )
      {
        returnTally[0][j] += voteData[i][j];  // add to column sum
        returnTally[1][i] += voteData[i][j];  // add to row sum
      }
    }
    return returnTally;
  }
}
