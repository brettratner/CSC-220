/** Brett Ratner
    CSC220-02
    Lab 1       */
void setup(){
  size(800,800);
  smooth();
}

void draw(){
  background(47,125,205); //Sky
  fill(47,205,50);//color of grass
  strokeWeight(0.1);
  rect(0,300,800,500); //Grass
  stroke(0);
  strokeWeight(4);
  fill(255,0,0); //RED
  rect(250,450,300,300); //House
  triangle(250,450,400,275,550,450); //Roof
  rect(550,600,200,150); //garage
  fill(255);
  rect(600,650,100,100); //garage door
  line(645,740,655,740); //gargae handel
  rect(620,670,20,20); // left garage window
  rect(660,670,20,20); // right garage window
  rect(420,655,40,95); //door
  fill(0);
  ellipse(430,710,7,7);//door knob
  fill(255);
  rect(275,620,100,100);//bottom left Window
  rect(275,480,100,100);//top left Window
  rect(425,480,100,100);//top right  Window
  fill(0);
  line(325,620,325,720);//cross for bottom left window
  line(275,670,375,670);//cross for bottom left window
  line(325,480,325,580);//cross for top left window
  line(275,530,375,530);//cross for top left window
  line(475,480,475,580);//cross for top right window
  line(425,530,525,530);//cross for top right window
  fill(255,255,0);
  ellipse(80,80,140,140);//Sun
  

}
