//Make a variable to hold the X co-ordinate of the dot and set it to 

int x = 0;

void setup() {
    size(800, 200);
}

void draw() {
  background(100, 100, 100);
  fill(#6BAFE5);
  noStroke();
  ellipse(x, 50, 10, 10);
  
  if(mousePressed) {
   x+=7; 
  }
  
  if(x>=200) {
    playSound();
  }
    
    //make it a nice color

    //if the mouse is pressed...

    //... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 
        //(you have to figure out what part of your code to change)
    //Use this method to play a ding when your dot crosses the finish line. 
}

//import ddf.minim.*;
//boolean soundPlayed = false;
void playSound() {
    //if (!soundPlayed) {
        //Minim minim = new Minim(this);
        //AudioSample sound = minim.loadSample("ding2.wav");
        //sound.trigger();
        //soundPlayed = true;
    //}
}
