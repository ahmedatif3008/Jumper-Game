import java.awt.*;

public class Wall {
    int x, y, width, height;
    Rectangle hitBox;
    Color color;
    public Wall(int x, int y, int width, int height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        hitBox = new Rectangle(x,y,width,height);
    }
    public void draw(Graphics2D gtd){
        gtd.setColor(Color.BLACK);
        gtd.drawRect(x,y,width,height);
        gtd.setColor(color);
        gtd.fillRect(x+1,y+1,width-2,height-2);
    }
}
