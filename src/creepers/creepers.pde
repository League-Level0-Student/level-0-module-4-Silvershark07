int x =600;
int y =484;
int cx = 20;
int cy = 200;
PImage creeper;
  PImage bush; 
void setup(){
  
  size(600,484);
bush = loadImage("bush-clipart-1.jpg"); //<>//
  bush.resize(600,484);
  
  
  creeper=loadImage("creeper.png");
  creeper.resize(cx,cy);
}
  
 void draw (){ 
background(bush);
   image(creeper,mouseX,mouseY);
if(mousePressed){
x=mouseX;
y=mouseY;

}
fill(#0CF015);
ellipse(x,y,300,242);  
  
  
 
 }


  
   boolean isNear (int mX, int mY) {
if (abs(mX - mY) < 10)
     return true;
else
     return false;
  
  
  
   }