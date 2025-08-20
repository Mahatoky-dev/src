package controleur.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.StatTest;
import modele.Test;
import vue.interfaces.ITestView;
import vue.interfaces.stat.IstatView;

public class CheckErrorListener implements ActionListener {

    private Test test;
    private StatTest statTest;
    private ITestView testView;
    private IstatView statView;

    public CheckErrorListener(Test test, ITestView testView, IstatView statView) {
        this.test = test;
        this.statTest = new StatTest(test);
        this.testView = testView;
        this.statView = statView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String newText = statTest.getTextFromWordArray(statTest.getWordUnvalide(), 2);
        test.setLetterDefaut(newText);
        test.restart();
        testView.setLetters(newText);
        testView.reset();
        testView.refresh();
    }

}
