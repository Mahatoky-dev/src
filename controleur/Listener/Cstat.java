package controleur.Listener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import modele.StatTest;
import modele.Test;
import vue.interfaces.ITestView;
import vue.interfaces.stat.IstatView;

public class Cstat implements KeyListener {

    private Test test;
    private ITestView testView;
    private IstatView statView;

    public Cstat(Test test, ITestView testView, IstatView statView) {
        this.test = test;
        this.testView = testView;
        this.statView = statView;
        this.testView.addKeyListenerForTextTaping(this);
        this.statView.addActionListnerForBtCheckError(new CheckErrorListener(test, testView, statView));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        StatTest statTest = new StatTest(test);
        if (test.isFinish()) {
            statView.update(statTest.getPrecision(), statTest.getWordParMinute());
        }

        if (test.isFinish() && !statTest.havePerfectPrecision()) {
            statView.displayCheckErrorButton(true);
        } else if (test.isFinish() && statTest.havePerfectPrecision()) {
            statView.displayCheckErrorButton(false);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
