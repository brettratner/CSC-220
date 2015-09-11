/**  Brett Ratner 
 
 CSC220-02
 
 Midterm */
 
 /**
 This program will make the canvas a random size between 
 300 and 700. than when the mouse is clicked it will 
 randomly put a square on the diaginal line of y=x. 
 the squares will have a random size between 10 and 100
 as well as a random color.
 */
 float xSize;
 int ySize;

 void setup(){
   xSize = random(300,700);/**makes variable x a random number that is between ## and ## */
   ySize = int(xSize);  /**tkes the variable x and turns it from a float into an int and stores it in ySize*/
   size(ySize,ySize);  /** random size of canvas*/
   background(255);
   smooth();
 }
 
 void draw(){

 }
 
 void mousePressed (){
   float xRect;
   int yRect;
   float xPos;
   int yPos;
   xRect = random(10,100);
   yRect = int(xRect);
   xPos = random(0,ySize);
   yPos = int(xPos);
   if(mousePressed){ /**when the mouse is pressed it will 
                        draw a the square*/
     fill(random(0,255), random(0,255), random(0,255));
     rect(xPos,yPos,yRect,yRect);
     
   }
 }
 
 
 

