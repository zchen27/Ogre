
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public class HexGridTester implements ActionListener, MouseListener, MouseMotionListener
{
	
	private JFrame frame;
	private TestPanel panel;
	private JPopupMenu popup;
	private JMenuItem item;
	private double radius;
	private double width;
	private double side;
	private double height;
	private Point currentPoint;
	private Location mouseover;
	private Unit selected;
	private ArrayList<Location> highlights;
	private DefaultGrid grid = new DefaultGrid();
	private BufferedImage tank;
	
	
	private class InfoPanel extends JPanel
	{
		JLabel image;
		JLabel name;
		JLabel location;
		JLabel defense;
		JLabel movement;
		JLabel attack;
		JLabel range;
		
		public InfoPanel()
		{
			location = new JLabel(mouseover.toString());
			if(selected instanceof Armor)
			{
				name = new JLabel(selected.getName());
				defense = new JLabel("" + ((Armor) selected).getDefense());
				movement = new JLabel("" + selected.getMovement());
				attack = new JLabel("" + ((Armor) selected).getAttack());
				range = new JLabel(""  + ((Armor) selected).getRange());
			}
			else
			{
				name = new JLabel("");
				defense = new JLabel("");
				movement = new JLabel("");
				attack = new JLabel("");
				range = new JLabel("");
			}
			this.add(location);
			this.add(name);
			this.add(defense);
			this.add(attack);
			this.add(range);
		}
		
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
		}
	}
	
	private class TestPanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			int[] xpoints = new int[6];
			int[] ypoints = new int[6];
			
			for(int c = 0; c < grid.getNumCols(); c++)
			{
				for(int r = 0; r < grid.getNumRows(); r++)
				{
					double dx = ( c * (.75 * width)) + width;
					double dy = r * height + height;
					
					if(c % 2 != 0)
					{
						dy += height / 2;
					}
					
					for(int i = 0; i < 6; i++)
					{
						xpoints[i] = (int) ((int) radius * Math.cos(i * 2 * Math.PI / 6) + dx);
						ypoints[i] = (int) ((int) radius * Math.sin(i * 2 * Math.PI / 6) + dy);
					}
					
					Polygon hex = new Polygon (xpoints, ypoints, 6);
					
					if (hex.contains(currentPoint))
					{
						g.setColor(Color.cyan);
						g.fillPolygon(hex);
						mouseover = new Location(c, r);
						selected = grid.get(mouseover);
					}
					else if (highlights != null && highlights.contains(new Location(c, r)))
					{
						g.setColor(Color.green);
						g.fillPolygon(hex);
					}
					else
					{
						g.setColor(Color.black);
						g.drawPolygon(hex);
					}
					
					g.setColor(Color.black);
					g.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 9));
					g.drawString(new Location(c, r).toString(), (int) (dx - (side / 3)), (int) (dy + height  / 3));
					
					if(grid.get(new Location(c, r)) != null)
					{
						g.drawImage(tank, (int) (dx - radius), (int) (dy - height / 2), null);
					}
				}
			}
		}
	}
	
	public HexGridTester(int r)
	{
		radius = r;
		side = radius * 3/2;
		width = radius * 2;
		height = Math.sqrt(3) * radius;
		grid.put(new Location("1002"), new HeavyTank());
		try 
		{                
			tank = ImageIO.read(new File("src/tank-heavy.png"));
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(0, 1));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panel = new TestPanel();
		panel.setLayout(new GridLayout(0,1));
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		frame.add(panel);
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
		panel.repaint();
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		
	}

	@Override
	public void mouseClicked(MouseEvent me)
	{
		currentPoint = me.getPoint();
		panel.repaint();
		if(grid.get(mouseover) != null)
		{
			selected = grid.get(mouseover);
			highlights = selected.availableMoves(grid);
		}
		
		if(!highlights.contains(mouseover))
		{
			highlights = new ArrayList<Location>();
		}
		panel.repaint();
	}

	@Override
	public void mousePressed(MouseEvent me)
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent me)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent me)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent me)
	{
		
	}

	@Override
	public void mouseDragged(MouseEvent me)
	{
		
	}

	@Override
	public void mouseMoved(MouseEvent me)
	{
		//System.out.println(me.getPoint().x + " " +  me.getPoint().y + " " + mouseover);
		currentPoint = me.getPoint();
		panel.repaint();
	}
	
	private static void runTestWindow()
	{
		HexGridTester tester = new HexGridTester(30);
	}
	
		public static void main(String[] args)
	{
		Runnable run = new Runnable()
		{
			@Override
			public void run()
			{
				runTestWindow();
			}
		};
		
		javax.swing.SwingUtilities.invokeLater(run);
	}
}
