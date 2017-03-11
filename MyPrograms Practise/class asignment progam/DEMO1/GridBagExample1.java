import java.awt.*;

class  GridBagExample1  extends Frame  
{
   public GridBagExample1( int  width, int height ) 
   {
      setTitle( "Grid Bag" );
      resize( width, height );
      
      GridBagLayout aLayout = new GridBagLayout();
      GridBagConstraints constraints = new GridBagConstraints();
      
      setLayout( aLayout );
      
      constraints.gridx = 0;      // Start column
      constraints.gridy = 0;      // Start row
      
      constraints.gridwidth = 2;   // Num. of columns wide
      constraints.gridheight = 1;   // Num. of rows high

      constraints.weighty = 100;
      constraints.weightx = 100;
      
      constraints.anchor = GridBagConstraints.CENTER;
      constraints.fill = GridBagConstraints.NONE;
      
      Button none = new Button( "none" );
      aLayout.setConstraints( none, constraints );
      
      constraints.gridy = 1;
      constraints.fill = GridBagConstraints.HORIZONTAL;

      Button horz = new Button( "horz" );
      aLayout.setConstraints( horz, constraints );

      constraints.gridy = 2;
      constraints.fill = GridBagConstraints.BOTH;

      Button both = new Button( "both" );
      aLayout.setConstraints( both, constraints );

      constraints.gridy = 3;
      constraints.fill = GridBagConstraints.VERTICAL;

      Button vert = new Button( "vert" );
      aLayout.setConstraints( vert, constraints );

      add( none );      
      add( both );
      add( horz );      
      add( vert );
      setVisible(true);
   }
}