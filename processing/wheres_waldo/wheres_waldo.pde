// 1. Find a really hard Where’s Waldo puzzle, save it, and drop it onto this sketch.
PImage waldo;   
PImage ugly;

void setup() {
  ugly = loadImage("ugly.jpg");
  ugly.resize(1000, 800);
    waldo = loadImage("maps_future.jpg"); 
    // 2. Change this to match your file name.
  size(1000, 800);
  waldo.resize(1000, 800);
  image(waldo, 0, 0);
}


void draw() {
  
  // 3. Use this print statement to find out the coordinates of Waldo
  //println("406 " + mouseX + " 508 " + mouseY); 


  // 4. If the mouse is on Waldo, print “Waldo found!”
  if (mousePressed) {
    if (mouseX  >400&& mouseX <413 && mouseY  >500&& mouseY <513  ) {
      println("waldo found");
      playWoohoo();
    } else {
      playDoh();
    }
  }
  if (millis()>30000) {
    image(ugly,0,0);
    println("1 seconds has past");
   
  }
}

void playWoohoo() {
  woohoo.stop();
  woohoo.trigger();
}


void playDoh() {
  doh.stop();
  doh.trigger();
}




import ddf.minim.*;
Minim minim = new Minim(this);   
AudioSample doh = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-doh.wav");
AudioSample woohoo = minim.loadSample("/Users/League/Google Drive/league-sounds/homer-woohoo.wav");




