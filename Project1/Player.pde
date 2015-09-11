class Player // Player class
{
  float xPos; //this is the variable for the x posistion of the player
  float yPos; // this is the variable for the y posistion of the player
  float diameter; //this is the variable for the diameter of the player
  float xSpeed; // this is the variable for the speed in the x coordinate direction of the player
  float ySpeed; // this is the variable for the speed in the y coordinate direction of the player

  //constructor
  Player()
  {
    xPos = 300;  // the srtating x position of the player
    yPos = 585;  // the starting y position of the player
    diameter = 25; // diameter of the circle
    xSpeed = 20; //the x speed of the player
    ySpeed = 20; // the y speed of the player
    ;
  }
  // a function that when called will display the player
  //makes the circles of the player

  void display()
  {

    ellipseMode(CENTER);
    fill(229, 25, 25); // makes the circle red
    ellipse(xPos, yPos, diameter, diameter); //makes the circle

    fill(0);
    ellipse(xPos-5, yPos-5, diameter/3, diameter/4); //makes the left eye
    ellipse(xPos+5, yPos-5, diameter/3, diameter/4); // makes the right eye
    ellipse(xPos, yPos+5, diameter/2, diameter/5); // makes the mouth
  }
}

