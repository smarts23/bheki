import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
 
/**
* Basic demonstration of creating menus and catching events
* from selected menu items.
*/
public class MenuDemo extends JFrame implements ActionListener {
    JLabel resultsLabel;
    JTextField namField , surnamField,gradeField;
    JButton submiButton;
 
    public MenuDemo() {
        super( "CTU Training Solution Menu" );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize( 800, 800 );
 
        resultsLabel = new JLabel("Click a menu item!" );
        add(resultsLabel);
 
        // Now let's create a couple menus and populate them
        JMenu fileMenu = new JMenu("File");
        JMenuItem saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);
        fileMenu.add(saveItem);
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(this);
        fileMenu.add(quitItem);
 
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        cutItem.addActionListener(this);
        editMenu.add(cutItem);
        JMenuItem copyItem = new JMenuItem("Copy");
        copyItem.addActionListener(this);
        editMenu.add(copyItem);
        JMenuItem pasteItem = new JMenuItem("Paste");
        pasteItem.addActionListener(this);
        editMenu.add(pasteItem);
 
        // And finally build a JMenuBar for the application
        JMenuBar mainBar = new JMenuBar();
        mainBar.add(fileMenu);
        mainBar.add(editMenu);
        setJMenuBar(mainBar);
    }

    public void actionPerformed(ActionEvent event) {
        resultsLabel.setText("Menu selected: " + event.getActionCommand());
    }

    public static void main(String args[]) {
        MenuDemo demo = new MenuDemo();
        demo.setVisible(true);
    }
}