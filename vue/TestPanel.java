package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPanel extends JPanel {

    private ArrayList<Letter> letters;

    public TestPanel(String letterDefaut) {
        this.setSize(new Dimension(400,400));
        this.setLetters(letterDefaut);
    }

    public TestPanel() {
        this.letters = new ArrayList<>();
    }

    
    public void changeColorAt(int index,Color color) {
        if(index > letters.size()) {
            System.out.println("The index is more big between number letter");
            return;
        }
        letters.get(index).setColor(color);
    }

    public void restart() {
        for(Letter letter : letters) {
            letter.setColor(Color.BLACK);
        }
        this.repaint();
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point letterPosition = new Point(20, 20);
        for(Letter letter : letters) {
            letter.draw(g,((int)letterPosition.getX()), ((int)letterPosition.getY()));
            letterPosition.x += 12;

            if(letterPosition.x + 12 >= this.getWidth()) {
                letterPosition.x = 20;
                letterPosition.y += 20; 
            }
        }
    }

    //setter
    public void setLetters(ArrayList<Letter> letters) {
        this.letters = letters;
    }

    public void setLetters(String letterDefaut) {
        this.letters = new ArrayList<>();
        char[] charLetterDefaut = letterDefaut.toCharArray();

        //init defaut letters
        for (char c : charLetterDefaut) {
            letters.add(new Letter(String.valueOf(c)));
        }
    }
}
