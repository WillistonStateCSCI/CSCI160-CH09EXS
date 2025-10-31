/* Two-dimensional Array of Cell Phone Bills
   Anderson, Franceschi
*/

public class FamilyCellBills
{
 public static void main( String [] args )
 {
  // declare constants for the number of rows and columns
  final int NUMBER_OF_MONTHS = 3;
  final int NUMBER_OF_PERSONS = 4;

  // declare and instantiate the array
  double [][] familyCellBills =
     new double [NUMBER_OF_MONTHS][NUMBER_OF_PERSONS];

  // assign values to array elements
  familyCellBills[0][0] = 45.24;  // row 0
  familyCellBills[0][1] = 54.67;
  familyCellBills[0][2] = 32.55;
  familyCellBills[0][3] = 25.61;

  familyCellBills[1][0] = 65.29;  // row 1
  familyCellBills[1][1] = 49.75;
  familyCellBills[1][2] = 32.08;
  familyCellBills[1][3] = 26.11;

  familyCellBills[2][0] = 75.24;  // row 2
  familyCellBills[2][1] = 54.53;
  familyCellBills[2][2] = 34.55;
  familyCellBills[2][3] = 28.16;

  System.out.println( "The first monthly cell bill for the first "
     + "family member is\n"
     + familyCellBills[0][0] );
  System.out.println( "The last monthly cell bill for the last "
     + "family member is\n"
     + familyCellBills[NUMBER_OF_MONTHS - 1][NUMBER_OF_PERSONS - 1] );

  int numRows = familyCellBills.length;
  System.out.println( "\nThe number of rows is " + numRows );

  for ( int i = 0; i < numRows; i++ )
  {
   System.out.print( "The number of columns in row " + i + " is " );
   System.out.println( familyCellBills[i].length );
  }
 }
}