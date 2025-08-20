package vue.component;

import java.awt.Color;
import java.awt.Graphics;

public class Letter {
    private String content;
    private Color color;

    //constructor
    public Letter(String content) {
        this.content = content;
        this.color = Color.BLACK;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g,int x, int y) {
        this.setColor(color);
        g.setColor(color);
        g.drawString(content, x, y);
    }

    @Override 
    public String toString() {
        return content + "  " + this.color.toString();
    }
}
