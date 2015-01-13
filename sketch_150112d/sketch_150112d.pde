boolean button = false;

int x = 50;
int y = 50;
int w = 100;
int h = 75;
PImage img1;  // Load the image into the program 
PImage img2;  // Load the image into the program 

void setup() {
  size(500,300); 
  img1=loadImage("taec1.png"); 
  img2=loadImage("sukitte.jpg");
}

void draw() {
  if (button) {
    background(img1);
  } else {
    background(img2);
  }
  
  fill(175);
  rect(x,y,w,h);
}

// When the mouse is pressed, the state of the button is toggled.   
// Try moving this code to draw() like in the rollover example.  What goes wrong?
void mousePressed() {
  if (mouseX > x && mouseX < x+w && mouseY > y && mouseY < y+h) {
    button = !button;
  }  
}

