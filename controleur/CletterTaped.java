package controleur;

import modele.Test;
import vue.interfaces.ITestView;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CletterTaped implements KeyListener {

    private Test test;
    private ITestView testView;

    public CletterTaped(Test test, ITestView testView) {
        this.test = test;
        this.testView = testView;
        testView.addKeyListenerForTextTaping(this);
    }

    private void checkKeyTyped(KeyEvent e) {
        if (!test.isFinish()) {
            String charTaped = String.valueOf(e.getKeyChar());
            test.addLetterTapped(charTaped);
            int lastIndexTaped = test.getLetterTaped().length() - 1;
            if (test.letterIsValideAt(lastIndexTaped)) {
                testView.changeLetterAtIndexToValide(lastIndexTaped);
            } else {
                testView.changeLetterAtIndexToUnvalide(lastIndexTaped);
            }
            testView.refresh();
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
