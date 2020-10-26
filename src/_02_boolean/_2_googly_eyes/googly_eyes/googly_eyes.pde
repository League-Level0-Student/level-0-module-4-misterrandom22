

PImage spongebob;
void setup() {
 spongebob = loadImage("spongebob.jpg");
    size(800,600);
    spongebob.resize(800,500);
}

void draw() {
  print (mouseX+" "+mouseY);
}
