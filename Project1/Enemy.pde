class Enemy // Enemy class
{

  float xPos; // this is the variable for the x posistion of the enemies
  float yPos; // this is the variable for the y posistion of the enemies
  float diameter; //this is the variable for the diameter of the enemies
  float speedX; // this is the variable for the speed in the x coordinate direction of the enemies
  float speedY; // this is the variable for the speed in the y coordinate direction of the enemies
  float direction; //this is the variable for the direction of the enemy
  //constructor of the enemy
  Enemy()
  {
    xPos = random(0, width); //starts off in a random x position.
    yPos = random(5, 560);  // starts off in a random y posistion.
    diameter = 20;          // sets the diameter of the enemies
    speedX = random(1, 5);  // gives an enemy a random speed between 1 and 5 for the x coordinate
    speedY = random(1-5);   // gives an enemy a random speed between 1 and 5 for the y coordinate
    direction = 1;          // makes the direction of the enemies change.
  }

  // the function that allows the enemies to move
  void move()
  {
    if ((xPos > width) || (xPos < 0)) //makes it so when the x position of the enemy hits the left wall or right wall it turns around and goes the other way.
    {
      speedX = (speedX * -direction);
    }
    if ((yPos > height) || (yPos < 0)) // makes it so when the y positions of the enem hits the top wall or bottom wall it turns around and goes the other way. 
    {
      speedY = (speedY * -direction);
    }
    xPos =xPos + speedX; 
    yPos =yPos+speedY;
  }

  // a function that when called will display the enemy
  //makes the circles of the enemys
  void display()
  {
    ellipseMode(CENTER);
    fill(0, 0, 255);
    ellipse(xPos, yPos, diameter, diameter); 
    fill(0, 255, 0);
    ellipse(xPos-3, yPos-3, diameter/3, diameter/4); //enamy left eye
    ellipse(xPos+4, yPos-3, diameter/3, diameter/4); // enemy right eye
    ellipse(xPos, yPos+3, diameter/2, diameter/4); // the mouth of the enemy
  }
}






