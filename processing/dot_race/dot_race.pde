PImage background;
void setup() {
  background=loadImage("football field.jpg");
  size(900, 700);
  background.resize(900, 700);
}
float x=1.5;
void draw() {
  background(background);
  if (x<790) {
    x=x+10;
  }
  ellipse(x, 270, 50, 30);
  ellipse(x, 430, 50, 30);
  //println(x);
}
void keyPressed()
{
  print(key);
  if(key=='J'
  x=x+10;
  
}

