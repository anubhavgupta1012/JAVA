
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MenuTest
    implements ActionListener
{

    MenuTest()
    {
        c = new CardLayout();
        fr = new JFrame();
        fr.setLayout(new FlowLayout());
        p = new JPanel();
        p.setLayout(c);
        p.add((new ListTest()).fr1, "first");
        p.add((new GridLayoutTest()).fr, "second");
        p.add((new TableTest()).fr1, "third");
        bar = new JMenuBar();
        m = new JMenu("Option");
        mi1 = new JMenuItem("List");
        mi2 = new JMenuItem("GridLayout");
        mi3 = new JMenuItem("Table");
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        m.add(mi1);
        m.add(mi2);
        m.add(mi3);
        bar.add(m);
        fr.setJMenuBar(bar);
        m.setMnemonic(67);
        mi1.setAccelerator(KeyStroke.getKeyStroke(82, 1));
        p.setPreferredSize(new Dimension(300, 300));
        fr.add(p);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }

    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getSource() == mi1)
            c.show(p, "first");
        if(actionevent.getSource() == mi2)
            c.show(p, "second");
        if(actionevent.getSource() == mi3)
            c.show(p, "third");
    }

    public static void main(String args[])
    {
        new MenuTest();
    }

    JFrame fr;
    JMenuBar bar;
    JMenu m;
    JMenuItem mi1;
    JMenuItem mi2;
    JMenuItem mi3;
    CardLayout c;
    JPanel p;
}
