/* A two-dimensional bar chart application
   Anderson, Franceschi
*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
 
public class FamilyBarChartApplication extends Application 
{
  final int LEFT_MARGIN = 80;         // starting x coordinate
  final int BASE_Y_BAR  = 100;        // bottom of the bars
  final int BASE_Y_VALUE = 125;       // bottom of the values
  final int BAR_WIDTH = 30;           // width of each bar
  final int SPACE_BETWEEN_BARS = 10;  // pixels between bars
  final int ROW_HEIGHT = 110;         // pixels between rows

  double [ ][ ] familyCellBills = { {45.24, 54.67, 32.55, 25.61},
                                    {65.29, 49.75, 32.08, 26.11},
                                    {75.24, 54.53, 34.55, 28.16} }; 
                                  
  String [ ] months = { "July", "August", "September" };
  Color [ ] colors = { Color.RED, Color.NAVY, Color.MAGENTA };

  @Override
  public void start( Stage stage ) 
  {
    // set up window title and size
    GraphicsContext gc = JIGraphicsUtility.setUpGraphics( 
                  stage, "Family Bar Chart", 275, 375 );
     
    int xStart = LEFT_MARGIN;   // x value for 1st column (bars)
    int yStart = BASE_Y_VALUE;  // y value for 1st row (data)
    int yStartBar = BASE_Y_BAR; // y value for 1st row (bars)   
        
    for ( int i = 0; i < familyCellBills.length; i++ )
    {
      gc.setFill( colors[i] ); // set color for current row
      gc.fillText( months[i], xStart - LEFT_MARGIN + 10,
                              yStart - .3 * ROW_HEIGHT );
      
      for( int j = 0; j < familyCellBills[i].length; j++ )
      {
        gc.fillRect( xStart, yStartBar - familyCellBills[i][j],
                     BAR_WIDTH, familyCellBills[i][j] );

        gc.fillText( Double.toString( familyCellBills[i][j] ),
                   xStart, yStart );

        // move to starting x value for next bar
        xStart += BAR_WIDTH + SPACE_BETWEEN_BARS;
      }
      
      // new row: increase yStart and yStartBar
      yStart += ROW_HEIGHT;
      yStartBar += ROW_HEIGHT;
      xStart = LEFT_MARGIN;
    }               
  }    
    
  public static void main( String [ ] args ) 
  {
    launch( args );
  }    
}