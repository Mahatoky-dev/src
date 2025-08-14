package controleur;

import modele.Test;
import vue.TestPanel;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TextListener implements KeyListener {

    private Test test;
    private TestPanel testPanel;

    public TextListener(Test test, TestPanel testPanel) {
        this.test = test;
        this.testPanel = testPanel;
        testPanel.setFocusable(true);
        this.testPanel.requestFocusInWindow();
        testPanel.addKeyListener(this);
    }

    private void checkKeyTyped(KeyEvent e) {
        if (!test.isFinish()) {
            String charTaped = String.valueOf(e.getKeyChar());
            test.addLetterTapped(charTaped);
            int lastIndexTaped = test.getLetterTaped().length() - 1;
            if (test.letterIsValideAt(lastIndexTaped)) {
                testPanel.changeColorAt(lastIndexTaped, Color.green);
            } else {
                testPanel.changeColorAt(lastIndexTaped, Color.red);
            }
            testPanel.repaint();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        checkKeyTyped(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
