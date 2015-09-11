/**  Brett Ratner 
 
 CSC220-02
 
 Lab 4  */

/**
 This program will draw a grid of randomly colored squares.
 the size of the grid will also be  random, as well as the
 size of the squares. when you click on a square all the 
 squares in that row and in that column will change to a 
 random color as well as the aquare you clicked on.
 */
int numsquares ; //squares per row or colomn
int widthsquares; //width and height of each square

int r; // a varaible that allows the rows to be drawn in every row on the grid. 
int c; // a variable that allows the columns to be drawn in every column on the grid. 

void setup() {
  numsquares = int(random(10, 30));  //makes a random amount of squares apear for each row and column.
  widthsquares = int(random(10, 30)); // makes the width of each square.
  size(numsquares *widthsquares, numsquares*widthsquares); //makes the size of the grid.
  for (r = 0; r < numsquares; r ++) { //makes the grid out of a bunch of rows.
    drawRow(r);  //calls the funstion drawRow and displays it "r" amount of times
  }
}

void draw() {
  //empty
}

void drawRow(int row) { //this is where i make the suqeres in rows.
  for (int i = 0; i < numsquares; i++) {
    fill(random(255), random(255), random(255)); //makes wach square a random color.
    rect(i*widthsquares, row*widthsquares, widthsquares, widthsquares); // will make all the squares in rows
  }
}

void drawCol( int col) {
  for ( int j = 0; j < numsquares; j++) {
    fill(random(255), random(255), random(255)); //makes wach square a random color.
    rect(col*widthsquares, j*widthsquares, widthsquares, widthsquares); //will make all the squares in columns
  }
}
void mousePressed() {
  /*finds where the mouses xPosition and the mouses yPosition is and knows the
   width of eash square andis able to detect which square you are clicking on 
   to change the color of all the sauares  in the row and colum as long with 
   the square that is clicked. 
   */
  drawRow(mouseY /widthsquares); 
  drawCol(mouseX / widthsquares);
}

