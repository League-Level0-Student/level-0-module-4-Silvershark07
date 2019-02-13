PImage face;
void setup(){
  
 face = loadImage("trumpface.jpg"); 
  size(1280,720);
  face.resize(1280,720);
  background(face);

  
  
}
 
 int lefteyeX = 445;
 int lefteyeY = 358;
 int eyesize = 46;
 void draw (){
  background(face);
   int puplilX = mouseX;
 int puplilY = mouseY;
   fill(#FFFCFC);
   ellipse(lefteyeX,lefteyeY,46,46);
  println(+mouseX+" "+" "+mouseY);
  ellipse(lefteyeX + 138,lefteyeY - 20,46,46);
if(puplilX<428){
  puplilX=428;
}
  if(puplilX>461){
  puplilX=461;
  }
  if(puplilY<338){
  puplilY=338;
  }
   if(puplilY>367){
    puplilY = 367;
   }  
    
    
    
  fill(#050404);
  ellipse(puplilX,puplilY,23,23);
ellipse(puplilX + 138,puplilY - 20,23,23);

}