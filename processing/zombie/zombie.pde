void setup()
{
  size(700, 450);
  PImage face = loadImage("ugly zombie.jpg");
  image(face, 0, 0);
}
void draw ()
{
println(mouseX);
  fill(mouseY, mouseX, 0);
  ellipse(325, 180, 40, 40);
  ellipse(425, 180, 40, 40);
  fill(0,0,0);
  ellipse(325, 180, 20, 20);
  ellipse(425, 180, 20, 20);
  
}

