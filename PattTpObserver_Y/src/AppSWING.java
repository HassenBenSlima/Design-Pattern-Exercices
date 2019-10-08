import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AppSWING extends JFrame {

	private JButton jb1 = new JButton("Sujet 1");
	private JButton jb2 = new JButton("Sujet 2");
	private List liste1 = new List();
	private List liste2 = new List();

	class Ecouteur1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			liste1.add("informer Ecouteur1 " + e.getSource());
		}

	}

	class Ecouteur2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			liste2.add("informer Ecouteur2 " + e.getSource());
		}

	}

	public AppSWING() {
		/*
		 * on peut ajouter directement
		 * 
		 */

		this.setLayout(new FlowLayout());
		this.add(jb1);
		this.add(jb2);
		this.add(liste1);
		this.add(liste2);
		this.setBounds(10, 10, 500, 500);
		this.setVisible(true);
		Ecouteur1 ec1 = new Ecouteur1();
		Ecouteur2 ec2 = new Ecouteur2();
		jb1.addActionListener(ec1);
		jb1.addActionListener(ec2);
		jb2.addActionListener(ec1);

	}

	public static void main(String[] args) {
		new AppSWING();
	}
}
