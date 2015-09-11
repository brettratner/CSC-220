/**  Brett Ratner 

      CSC220-02

      Lab 3  */
      
/** This program draws a chessboard that at a random size between the numbers 80 and 600 pixles and is a multiple of 8.
when someone clicks the mouse on the chessboard the black colored squares will change to white and the white 
colored squares will change to black*/



float x; // x value for size of canvas
int y;   // y value for size of canvas
int a; // x position of square
int b; // y position of square
int Wcolor = 255; // White color variable  
int Bcolor = 0;   // Black color variable

void setup(){
  x = random((80/8), (600/8)); //makes variable x a random number that is between 80 and 600 and a multiple of 8
  y = int(x)*8; //makes the variable x and turns it from a float into an int
 
  size(y,y); //random size of canvas
    background(255); // backround color white

  
}


void draw(){
  for(a=0; a<8; a++){ //loops and checks along the x axis
    for( b=0; b<8; b++){ // loops and checks along the y axis
      if( (a + b) % 2 == 0 ){ // sees if the number along the x axis plus the number on the y axis is even
        fill(Bcolor); // if (a+b) is even than there is a black colored square
      }
        else {
          fill(Wcolor); //if (a+b) is a odd number than there is a white colored square
        } 
        
        
       
      rect( (y/8)*b ,(y/8)*a ,y/8,y/8); //Draws the retangles
    }
  }

}

void mousePressed(){
  if (mousePressed) { /*when the mouse is pressed it changes the color of the square from black to white and from white to black*/     
    if((a+b) %2 ==0){
      Bcolor= -1*Bcolor + 255;
      Wcolor= -1*Wcolor + 255;
     
    }
  }
}
