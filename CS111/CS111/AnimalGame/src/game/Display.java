package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Display extends JFrame implements ActionListener{
	//---- panel ---------------------------------------------
	private Game game;
	private Welcome welcome;
	private HowToPlay htp;
	//---- for creating a animal at the beginning of the game
	private String character;
	//---- menus ---------------------------------------------
	private JMenuBar mb;
	private JMenuItem home, start, exit, howToPlay, aboutGame;
	private JMenu menu, help;
	//---- frame icon ----------------------------------------
	private ImageIcon ico;
	
	public Display() {
		ico = new ImageIcon("image\\icon.png");
		character = "";
		createMenu();
		welcome = new Welcome(this);
		htp = new HowToPlay(this);
		startGame();
		this.setTitle("Animal Survival");
		this.setIconImage(ico.getImage());
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.getContentPane().setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
	}
	public void removeContent() {
		this.getContentPane().removeAll();
		this.getContentPane().repaint();
	}
	public void startGame() {
		this.getContentPane().add(welcome);
	}
	public void howToPlayGame() {
		removeContent();
		this.getContentPane().add(htp);
	}
	public void endGame(int score) {
		removeContent();
		this.getContentPane().add(new GameOver(score, this));
	}
	// Create menus and add to frame
	public void createMenu() {
		mb = new JMenuBar();
		this.setJMenuBar(mb);
		menu = new JMenu("Menu");
		home = new JMenuItem("Home");
		home.addActionListener(this);
		start = new JMenuItem("Start");
		start.addActionListener(this);
		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		menu.add(home);
		menu.addSeparator();
		menu.add(start);
		menu.addSeparator();
		menu.add(exit);
		mb.add(menu);
		help = new JMenu("Help");
		howToPlay = new JMenuItem("How to play");
		howToPlay.addActionListener(this);
		aboutGame = new JMenuItem("About Game");
		aboutGame.addActionListener(this);
		help.add(howToPlay);
		help.addSeparator();
		help.add(aboutGame);
		mb.add(help);
	}
	// Event Handling of menus, Welcome, HowToPlay, Game Over
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equalsIgnoreCase("Restart") || e.getActionCommand().equalsIgnoreCase("Start")
			|| e.getActionCommand().equalsIgnoreCase("Home")) {
			removeContent();
			if(e.getActionCommand().equalsIgnoreCase("Start")) {
				if(character == "") {
					welcome.setChoose();
					character = welcome.getChoose();
					this.getContentPane().add(game = new Game(character));
					game.addKeyListener(game);
					game.setFocusable(true);
				}else {
					this.getContentPane().add(game = new Game(character));
					game.addKeyListener(game);
					game.setFocusable(true);
				}
			}else {
				welcome.setChoose("");
				character = "";
				startGame();
			}
			if(game != null) {
				game.requestFocus();
			}
		}else if(e.getActionCommand().equalsIgnoreCase("Exit")) {
			System.exit(0);
		}else if(e.getActionCommand().equalsIgnoreCase("Cat")) {
			welcome.setChoose("Cat");
			this.character = "Cat";
			welcome.repaint();
		}else if(e.getActionCommand().equalsIgnoreCase("Bird")) {
			welcome.setChoose("Bird");
			this.character = "Bird";
			welcome.repaint();
		}else if(e.getActionCommand().equalsIgnoreCase("Rabbit")) {
			welcome.setChoose("Rabbit");
			this.character = "Rabbit";
			welcome.repaint();
		}else if(e.getActionCommand().equalsIgnoreCase("How to play")) {
			howToPlayGame();
		}else if(e.getActionCommand().equalsIgnoreCase("Character: Cat")) {
			htp.setFileName("image\\howToPlayCat.png");
			htp.repaint();
		}else if(e.getActionCommand().equalsIgnoreCase("Character: Bird")) {
			htp.setFileName("image\\howToPlayBird.png");
			htp.repaint();
		}else if(e.getActionCommand().equalsIgnoreCase("Character: Rabbit")) {
			htp.setFileName("image\\howToPlayRabbit.png");
			htp.repaint();
		}else if(e.getActionCommand().equalsIgnoreCase("About Game")) {
			JOptionPane.showMessageDialog(null, "Animal Survival is a project of a CS111 by\n"
					+"\n  • Ms.Kanyanat  Det-in  6409618011"
					+"\n  • Mr.Tanathep  Rochanapaiwong  6409618029"
					+"\n  • Ms.Tunchanok Sayan  6409700041"
					+"\n  • Mr.Pangon    La-or-on  6409700074"
					+"\n  • Ms.Tamonwan  Rounpingwang  6409700124\n\n\n",
					"About Game", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}