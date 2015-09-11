/**  Brett Ratner 
 
 CSC220-02
 
 Project 01  */

/**
 This program will start you off at a menu screen that gives you 
 directions on how the game is played and the objective of the 
 game. Then when the enter/return key is pressed the game will start, 
 the objective of the game is to use the arrow keys to move and last as 
 long as possible without getting hit by the random moving circles and 
 loosing all of your lives. But when you loose all of your lifes the 
 game over screen appears that says game over and diplays your score. 
 The score is equal to the amount of frames you were alive for. 
 */

Player me; // calls the player class me 
Enemy[] enemies = new Enemy[0]; // tells you how many enemies there will be on screen
boolean menu= true; // the menu scene variable
int life = 3;   // life variable
PFont myFont;  // a font variable 
long score = 0;  // a variable for the score
long onSreanScore = 0; // a variable to display the score on the screen during game play
boolean gameover = false; //variable that sees if you still have lifes

void setup()
{

  println("Directions: Use the arrow keys to run away from all the blue alein heads for as" +
    "long as possible. The Black square in the middle of the screen is something that you can" +
    "not go through but the aleins are not affected by it. If you get hit by an alein head form " +
    "the spawn point it is an instant game over. Good Luck!!! Click Enter/Return to start the game");

  size(600, 600); // size of the canvas
  smooth();  //smoothes out the game play


  me = new Player(); // making the players character 

    for (int i = 0; i < enemies.length; i++) // making the enemy character
  {
    enemies[i] = new Enemy();
  }
}


void draw() {

  if (menu == true) { // starts the game off with a menu screen and when the enter key if pressed the menu screen goes away
    background(0); //  makes the background black
    String start = "Directions: Use the arrow keys to run away from all the blue alein heads for as" +
      "long as possible. The Black square in the middle of the screen is something that you can not go"+
      "through but the aleins are not affected by it. If you get hit by an alein head form the spawn" +
      "point it is an instant game over. Good Luck!!! Click Enter/Return to start the game.";
    fill(255, 0, 0); // make the color of the directions red
    textSize(24); // changes the size of the text
    text(start, 100, 100, 400, 500);  //displays the text on the menu screen
    if (key == ENTER || key == RETURN)  //maks it so when the enter key is pressed the game starts and he menu screen goes away.
    {
      menu = false;
    }
  }
  else
  {
    background(32, 82, 12);
    me.display(); //displaying the player on screen
    onSreanScore =frameCount; //having the score increment based on frame count
    textSize(18);
    text("Life: " + life, 10, 10, 300, 100);  // displays how mnay liefes you have in the top left of screen
    text("Score: " + onSreanScore, 480, 10, 300, 100); // displays the score in the top right of the screen

    if ( me.xPos <= 20 ) { // stops the player from going out of bounds on the left side
      me.xPos = 10 ;
    }
    if ( me.xPos >= 600 ) { // stops the player from going out of bounds on the right side
      me.xPos = 590 ;
    }
    if ( me.yPos <= 0 ) { // stops the player from going out of bounds from the top
      me.yPos = 10 ;
    }
    if ( me.yPos >= 600 ) { // stops the player from going out of bounds from the bottom
      me.yPos = 590 ;
    }
    fill(0);
    rect(275, 275, 50, 50);

    if ((me.xPos > 262) && (me.xPos < 300) && (me.yPos > 275) && (me.yPos < 330)) // left wall of square in the middle
    {
      me.xPos = 260;
    }
    if ((me.xPos > 300) && (me.xPos < 335) && (me.yPos > 275) && (me.yPos < 335)) //right wall of square in the middle
    {
      me.xPos = 338;
    }
    if ((me.xPos > 260) && (me.xPos < 337) && (me.yPos > 275) && (me.yPos < 300)) // top wall of the square in the middle
    {

      me.yPos = 262;
    }
    if ((me.xPos > 260) && (me.xPos < 335) && (me.yPos > 300) && (me.yPos < 333))  //bottom wall of the square in the middle
    {
      me.yPos = 338;
    }

    for (int i = 0; i < enemies.length; i++) // Display and move the enemy
    {
      enemies[i].move(); // calls the move function from the enemys class wchich allows the enemys to move
      enemies[i]. display(); //calls the display function from the enemys class which allows the enemies to be displayed on screen 
      // Are we colliding the enemy
      float distance = dist(me.xPos, me.yPos, enemies[i].xPos, enemies[i].yPos);
      if (distance <= 20) //a collision occurs if the distance between the two objects is less than 20.
      {
        me.xPos = 300; // after being hit this resets the players x=coordinate
        me.yPos = 585; // after being hit this resets the players y-coordinate
        life = life-1; // after being hit this decreases how many lives you have by one
      }

      if (life <= 0 ) //checks to see if the life variable is less than or equal to 0, and if it is it will diplay the game over screen.
      { 
        if (gameover == false) { //this is where is stops the frame count once all the lives have been lost
          score = frameCount;
          gameover = true;
        }

        background  (0);  //changes the background to black
        fill(255, 0, 0); // makes the font white
        String gameOver ="GAME OVER"; // sets the string to the words "game over"
        String  yourScore ="Your score is: " + score;  //sets the string to the words "your score" and than the players final score
        textSize(45);
        text(yourScore, 100, 400, 600, 100); // displays the yourscore string
        text(gameOver, 170, 275, 600, 100); //displays the gameover sting
        println("GAME OVER");
        println(" Your score is: " + score);
        noLoop();
      }
    }
  }
}


void keyPressed()
{
  // Checks to see if the key is coeded
  if (key == CODED)
  {
    if (keyCode == UP) // Up key
    {  
      me.yPos = me.yPos - me.ySpeed;
    }
    if (keyCode == DOWN) // Down key
    {
      me.yPos  = me.yPos + me.ySpeed;
    }
    if (keyCode == LEFT) //Left key
    {
      me.xPos = me.xPos - me.xSpeed;
    }
    if (keyCode == RIGHT) //Right key
    {
      me.xPos = me.xPos + me.xSpeed;
    }
  }
}


