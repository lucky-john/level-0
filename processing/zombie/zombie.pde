PImage face; 
void setup()
{
  face = loadImage("ugly zombie.jpg");
  size(700, 450);
}
void draw ()
{
  image(face, 0, 0);
  println(mouseX);
  fill(mouseY, mouseX, 0);
  ellipse(325, 180, 40, 40);
  ellipse(425, 180, 40, 40);
  fill(0, 0, 0);
  int leftPupilX = mouseX;
  if (mouseX<315 ) {
    leftPupilX=315;
  }
  if (mouseX>335) {
    leftPupilX=335;
  }


  ellipse(leftPupilX, 180, 20, 20);


  ellipse(425, 180, 20, 20);
}

