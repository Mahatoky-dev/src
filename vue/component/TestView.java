package vue.component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import vue.interfaces.ITestView;
public class TestView extends JPanel implements ITestView {

    private ArrayList<Letter> letters;

    private final Color TEXT_VALIDE_COLOR = Color.GREEN,
            TEXT_INVALID_COLOR = Color.RED,
            TEXT_DEFAULD_COLOR = Color.BLACK;

    public TestView(String letterDefaut) {
        this.setSize(new Dimension(400, 400));
        this.setLetters(letterDefaut);
        this.setFocusable(true);
        this.requestFocusInWindow();
    }


    private void changeColorAt(int index, Color color) {
        if (index > letters.size()) {
            System.out.println("The index is more big between number letter");
            return;
        }
        letters.get(index).setColor(color);
    }

    @Override
    public void changeLetterAtIndexToValide(int index) {
        changeColorAt(index, TEXT_VALIDE_COLOR);
    }

    @Override
    public void changeLetterAtIndexToUnvalide(int index) {
        changeColorAt(index, TEXT_INVALID_COLOR);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Point letterPosition = new Point(20, 20);
        for (Letter letter : letters) {
            letter.draw(g, ((int) letterPosition.getX()), ((int) letterPosition.getY()));
            letterPosition.x += 12;

            if (letterPosition.x + 12 >= this.getWidth()) {
                letterPosition.x = 20;
                letterPosition.y += 20;
            }
        }
    }

    // setter
    public void setLetters(ArrayList<Letter> letters) {
        this.letters = letters;
    }

    public void setLetters(String letterDefaut) {
        this.letters = new ArrayList<>();
        char[] charLetterDefaut = letterDefaut.toCharArray();

        // init defaut letters
        for (char c : charLetterDefaut) {
            letters.add(new Letter(String.valueOf(c)));
        }
    }

    @Override
    public void reset() {
        for (Letter letter : letters) {
            letter.setColor(TEXT_DEFAULD_COLOR);
        }
        this.repaint();
    }

    @Override
    public void refresh() {
        this.repaint();
    }

    @Override
    public void addKeyListenerForTextTaping(KeyListener e) {
        this.addKeyListener(e);
    }

}
