package controleur.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modele.Test;
import modele.WordManager;

public class BuildTextListener implements ActionListener {
    ;
    private Test test;
    private RestartListener restartListener;
    private WordManager wordManager;
    private final static String LANGAGE_DEFAULD = "fr"; 

    public BuildTextListener(Test test, RestartListener restartListener) {
        this.test = test;
        this.restartListener = restartListener;
        this.wordManager = new WordManager();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String newText = wordManager.buildRandomText(LANGAGE_DEFAULD, 50);
        System.out.println(newText);
        test.setLetterDefaut(newText);
        System.out.println(test.getLetterDefaut());
        this.restartListener.restartAll();
    }
}
