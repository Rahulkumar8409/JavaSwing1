import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingLearning extends JFrame implements ActionListener {
    JButton button;
  Boolean change=false;

    public swingLearning() {
        setLayout(null);

        button = new JButton("BUTTON");
        button.setSize(100, 100);
        add(button);
        button.setBounds(200,200,100,100);


        setVisible(true);
        setTitle("new project");
        setSize(400, 500);
        setResizable(false);
        getContentPane().setBackground(Color.red);


        button.addActionListener(this);
    }

    public static void main(String[] args) {
        swingLearning obj = new swingLearning();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String st = e.getActionCommand();
        if (st.equals("BUTTON")&&change==false) {
            getContentPane().setBackground(Color.black);
            change=true;
        } else {
            getContentPane().setBackground(Color.RED);
            change=false;
        }
    }
}

