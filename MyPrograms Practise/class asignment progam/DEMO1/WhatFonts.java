import  java.awt.Toolkit;
class  WhatFonts {
   public  static  void  main( String  args[] )
      {
      Toolkit  platformInfo = Toolkit.getDefaultToolkit();
      String[] availbleFonts = platformInfo.getFontList();
      for ( int index = 0; index < availbleFonts.length; index++ )
         System.out.println( availbleFonts[ index ]  );
      }
   }

