PImage pepperoni;
int pepperoniX;
int pepperoniY;

PImage canadianBacon;
int canadianBaconX;
int canadianBaconY; 
void setup()
{
  pepperoni=loadImage("pepperoni.ppm.gif");
  canadianBacon=loadImage("canadianbacon.ppm.gif");
  size(900, 750);
   fill(194, 114, 56);
  ellipse(447, 300, 400, 400);
  fill(247, 244, 30);
  fill(255, 0, 0);
  ellipse(447, 300, 340, 340);
  fill(247, 244, 30);
  ellipse(447, 300, 320, 320);
}
void draw()
{
 
  image(pepperoni, pepperoniX, pepperoniY);
  image(canadianBacon,canadianBaconX,canadianBaconY);
}

void mousePressed()

{
  pepperoniX=mouseX;
  pepperoniY=mouseY;
  
  canadianBaconX=mouseX+25;
  canadianBaconY=mouseY+25;
}

