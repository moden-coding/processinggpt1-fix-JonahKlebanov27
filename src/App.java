import processing.core.*;

public class App extends PApplet{
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings(){
        size(400,400);

    }
    public void setup(){
        background(0,200,150);

    }
    public void draw(){
        fill(0,0,200);
        stroke(200,0,200);
        strokeWeight(10);
        rect(175,200,50,50);

        
        fill(200,0,0);
        stroke(200,0,200);
        strokeWeight(10);
        ellipse(200,300,100,100);

        stroke(0,0,0);
        strokeWeight(5);
        line(200,0,200,400);
        
    }


    


}
