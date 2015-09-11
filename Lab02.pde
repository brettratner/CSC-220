/** Brett Ratner
    CSC 220-02
    Lab 02 */
    
/*This program draws a block person who
starts off in the center moving on a
diaginal but when a key is pressed
his speed and the direction he moves in
changes and when the mouse is clicked
he randomly changes color*/

float x = 250; //block persons x posistion
float y = 200; // block persons y position
float r = 255; // red color variable
float g = 255; // green color variable
float b = 255; // blue color variable
float xSpeed = 1; // speed of block person horizontally
float ySpeed = 1; // speed of block person vertically 
float  z = 1;     //change in direction variable


void setup(){
  

size( 500,500);
  fill(random(r),random(g),random(b));// generates random color to start off
  smooth();
}


void draw(){
   background(255); //white background
   rectMode(CORNER);
   x = x + xSpeed;  // makes object move on the X plane
   y = y + ySpeed;  // makes object move on the Y palne
  if(( x > width-40) || (x < 40)){
   xSpeed = (xSpeed * -z);
  }
  if(( y > height - 130) || (y<25)){
     ySpeed = (ySpeed * -z);
  }

 

  ellipse( x, y, 50, 50); //Head
  rect( x-15,y+25,30,60); //Body
  
  line( x-15, y+40, x-40, y +30); //Left Arm
  line( x+15, y+40, x+ 40, y+30); // Right Arm
  rect( x-5, y+85, -10, 40);  //Left Leg
  rect( x+15, y+85, -10, 40); //Right Leg 
  ellipse(x-5,y,5,10); //Left Eye
  ellipse(x+5,y,5,10); // Right Eye
  ellipse(x,y+15,10,7); // Mouth
  
  if(keyPressed) {
   
    xSpeed= random(-7,7);  //Changes the speed
    ySpeed= random(-7,7); // changes the speed
  }  
  if(mousePressed){
   fill(random(r),random(g),random(b)); //changes the color
  
   
  } 
 
}
