public class SimpleGraphics {
    public static void main(String[]args){
        Rectangle field = new Rectangle(0,0,300,300);
        field.draw();
        Ellipse egg = new Ellipse(100,100,100,100);
        egg.setColor(Color.BLUE);
        egg.fill();
        Ellipse guy = new Ellipse(145,145,10,10);
        guy.setColor(Color.RED);
        guy.fill();

        int distance;
        while(){
            int vertical = (int) (Math.random()*21)-10;
            int horizontal = (int) (Math.random()*21)-10;
            guy.translate(vertical, horizontal);
            try { Thread.sleep(100);}
            catch(Exception ex) {};
            distance = guy
        }
    }
}
