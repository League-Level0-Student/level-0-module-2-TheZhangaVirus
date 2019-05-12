// create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    import java.util.Random;
    
    int x = 250;
    int y = 250;
    int z = 70;
    int distance = getDistance(mouseX, mouseY, 250 , 250);
    
    
    
    void setup() {
      //set the size of your sketch
      size(500, 500);
    
    }
    
    void draw() {
      background(255, 255, 255);
      //set the background color of your sketch
      ellipse(x, y, z, z);
      //draw an ellipse. Make sure it fits in the window.
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     System.out.println(distance);
      //print the distance variable
    Random randomGenerator = new Random();
      
      int randomNumber = randomGenerator.nextInt(250);
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      
        //8b.  set the x and y of the ellipse to a random location on the window
       if(distance <= 140) {
         x+=randomNumber;
         y+=randomNumber;
       } else {
         x-=randomNumber;
         y-=randomNumber;
       }
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
