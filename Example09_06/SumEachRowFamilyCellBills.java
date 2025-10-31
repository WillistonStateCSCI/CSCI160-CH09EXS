/* Processing Each Row of a Two-Dimensional Array
   Anderson, Franceschi
*/

import java.text.NumberFormat;

public class SumEachRowFamilyCellBills
{
 public static void main( String [] args )
 {
  // declare and initialize the array
  double [][] familyCellBills = { {45.24, 54.67, 32.55, 25.61},
                                  {65.29, 49.75, 32.08, 26.11},
                                  {75.24, 54.53, 34.55, 28.16} };

  String [] months = { "July", "August", "September" };

  NumberFormat priceFormat = NumberFormat.getCurrencyInstance( );
  double currentMonthTotal;
  for (int i = 0; i < familyCellBills.length; i++ )
  {
   currentMonthTotal = 0.0;  // initialize total for row
   for ( int j = 0; j < familyCellBills[i].length; j++ )
   {
    // add current family member bill to current monthly total
    currentMonthTotal += familyCellBills[i][j];
   }
   // print total for row
   System.out.println( "The total for " + months[i] + " is "
                        + priceFormat.format( currentMonthTotal ) );
  }
 }
}
