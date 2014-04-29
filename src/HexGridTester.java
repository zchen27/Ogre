
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
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
	private double radius;
	private double width;
	private double side;
	private double height;
	private Point currentPoint;
	private Location mouseover;
	private Game game;
	
	private class TestPanel extends JPanel
	{
		@Override
		public void paintComponent(Graphics g)
		{
			System.out.println("CALLED");
			super.paintComponent(g);
			int[] xpoints = new int[6];
			int[] ypoints = new int[6];
			
			for(int c = 0; c < game.getGrid().getNumCols(); c++)
			{
				for(int r = 0; r < game.getGrid().getNumRows(); r++)
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

					}
					else
					{
						g.setColor(Color.black);
						g.drawPolygon(hex);
					}
					
					g.setColor(Color.black);
					g.drawString(new Location(r, c).toString(), (int) (dx - (side / 2)), (int) dy);
					
					mouseover = new Location(c, r);
					
					
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
	
	/*private Location convert(double x, double y)
	{		
		double xt;
		double yt;
		
		double r;
		double c;
		
		double rt;
		double ct;
		
		double dr;
		
		ct = x / width;
		
		if(ct % 2 == 0)
		{
			rt = y / height;
		}
		else
		{
			rt =  (y - (height) / 2) / (height);
		}
		
		xt = x - ct * width;
		yt = y - rt * height;
		
		if(yt > (height / 2))
		{
			dr = 1;
		}
		else
		{
			dr = 0;
		}
		
		if(xt > (radius * Math.abs(.5 - yt/height)))
		{
			c = ct;
			r = rt;
		}
		else
		{
			c = ct - 1;
			r = rt - c%2 + dr;
		}
		return new Location((int) c, (int) r);
	}*/
	
	private static void runTestWindow()
	{
		HexGridTester tester = new HexGridTester(25);
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
