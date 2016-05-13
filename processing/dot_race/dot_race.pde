PImage background;
void setup() {
  background=loadImage("football field.jpg");
  size(900, 700);
  background.resize(900, 700);
}
float x1=1.5;
float x2=1.5;
void draw() {
  background(background);

  ellipse(x1, 270, 50, 30);
  ellipse(x2, 430, 50, 30);
  //println(x);
}
void keyPressed()
{

  if (key=='j') {
    if (x2<790) {
      x2=x2+10;
      if (x2>=790) {
        print("player 2 has won");
      }
    }
  }
  if (key == 'a')
  {
    if (x1<790) {
      x1=x1+10;
      if (x1>=790) {
        print("player 1 has won");
      }
    }
  }
}

