import  java.awt.*;
class  FancyHello  extends  Frame  {
   public  FancyHello()
      {
      int  pointSize  =  24;
      setFont( new Font( "TimesRoman", Font.BOLD, pointSize ));

      setBackground( Color.black );
      setTitle( "Hi Mom" );

      resize( 150,  150);
      show();
      }

   public  void  paint(  Graphics  display  )
      {
      int x  =  50;
      int y  =  60;
      display.setColor( Color.white );
      display.drawString(  "Hello", x, y );
      display.setFont( new Font("Courier", Font.ITALIC, 12 ));

      x  =  50;
      y  =  100;
      display.drawString(  "World", x, y );
      }

   public  static  void  main( String  args[] )
      {
      new  FancyHello();
      }
   }
