import controleur.CletterTaped;
import controleur.Listener.Cstat;
import controleur.menuBar.CmenuBar;
import modele.StatTest;
import modele.Test;
import modele.WordManager;
import vue.MainFrame;
import vue.component.TestView;

public class App {

    public static void main(String[] args) {
        // Test test = new Test("Bonjour les amis");
        
        // TestView testView = new TestView(test.getLetterDefaut());
        // MainFrame mainFrame = new MainFrame(testView);
        // new CletterTaped(test, testView);
        // new CmenuBar(mainFrame.getMenuBarTest(), test, testView,mainFrame.getStatView());
        // new Cstat(test, testView, mainFrame.getStatView());

        WordManager wordManager = new WordManager();
        System.out.println(wordManager.buildRandomText("en", 400));
        
}
}