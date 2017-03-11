import  java.awt.*;

class  Drawing  extends  Frame {

   public  Drawing  ( int  WidthInPixels, int heightInPixels ) {
      setTitle( "Drawing" );
      resize( WidthInPixels, heightInPixels );
      setBackground( Color.green);
      show();
   }

   public  void  paint(  Graphics  display  )  {
      System.out.println("Testing..");
	display.setColor( Color.red );

      int x = 50;      int y = 30;
      int width = 40;      int height =  20;
      display.drawOval(  x,  y,  width,  height  );

      x = 100;
      display.drawRect(  x,  y,  width,  height  );

      x = 150;
      display.fillRect(  x,  y,  width,  height  );

      x = 200;
      boolean  raised = true;
      display.draw3DRect(  x,  y,  width,  height,  raised  );
   }

   public  static  void  main( String  args[] ){
      Drawing  mainWindow;
      mainWindow  =  new  Drawing( 300,  200 );
      }
   }
