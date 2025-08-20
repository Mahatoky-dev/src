package vue;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import vue.component.menuBar.MenuBar;
import vue.component.StatView;
import vue.component.TestView;

public class MainFrame extends JFrame {

    private TestView testView;
    private MenuBar menuBar;
    private StatView statView;

    public MainFrame(TestView testView) {
        this.setSize(new Dimension(400,500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        //init component
        JPanel maiPanel = new JPanel(new BorderLayout());
        maiPanel.add(testView,BorderLayout.CENTER);

        this.menuBar = new MenuBar();
        maiPanel.add(menuBar,BorderLayout.NORTH);

        //stat
        this.statView = new StatView();
        maiPanel.add(statView,BorderLayout.SOUTH);

        this.add(maiPanel);
        this.setVisible(true);
    }

    //getter
    public TestView getTestView() {
        return testView;
    }

    public MenuBar getMenuBarTest() {
        return menuBar;
    }

    public StatView getStatView() {
        return statView;
    }
}
