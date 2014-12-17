import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {
    
    private Container pane;
    private JButton b1,b2;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;

    private class Key implements KeyListener{
	public void KeyPressed(KeyEvent e){};
	public void KeyReleased(KeyEvent e){};
	public void KeyTyped(KeyEvent e){};
    }
    
    public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1){
	    System.out.println("You clicked: Click me");
	    System.out.println("In the text box:" +text.getText());
	} else if(e.getSource()==b2){
	    System.out.println("Shutting Down");
	    System.exit(0);
	
	}
    }
    
    public Gui2(){
	
	setTitle("My First Gui");
	setSize(600,600);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = getContentPane();
	//pane.setLayout(new GridLayout(3,3));
	pane.setLayout(new FlowLayout());
	l = new JLabel("The Label:");
	pane.add(l);
	
	b1 = new JButton("Click Me");
	pane.add(b1);
	b1.addActionListener(this);
	b2 = new JButton("exit");
	pane.add(b2);
	text = new JTextArea();
	text.setColumns(40);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text);
	
	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(canvas);
	
    }
    
    public static void main(String[] args) {
	Gui2 f = new Gui2();
	f.setVisible(true);
    }
}
