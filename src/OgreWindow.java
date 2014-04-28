
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
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
public class OgreWindow implements ActionListener, MouseListener
{
	private JFrame frame;
	private JPanel boardPanel;
	private JPopupMenu popup;
	private Game game;
	private double radius;
	private double width;
	private double side;
	private double height;
	private Location[] sel = new Location[2];
	
	private class OgrePanel extends JPanel
	{
		@Override
		public void paintComponents(Graphics g)
		{
			super.paintComponents(g);
			int[] xpoints = new int[6];
			int[] ypoints = new int[6];
			
			DefaultGrid grid;
			grid = (DefaultGrid) game.getGrid();
			
			for(int c = 0; c < grid.getNumCols(); c++)
			{
				for(int r = 0; r < grid.getNumRows(); r++)
				{
					int dx = c * (int) width;
					int dy = r * (int) height;
					
					if(c % 2 != 0)
					{
						dy += height / 2;
					}
					
					for(int i = 0; i < 6; i++)
					{
						xpoints[i] = (int) ((int) 25 * Math.cos(i * 2 * Math.PI / 6) + dx);
						ypoints[i] = (int) ((int) 25 * Math.sin(i * 2 * Math.PI / 6) + dy);
					}
					
					Polygon hex = new Polygon (xpoints, ypoints, 6);
					g.drawPolygon(hex);
				}
			}
			
		}
	}
	
	public OgreWindow(Game g, double r)
	{
		game = g;
		radius = r;
		side = radius * 3/2;
		height = Math.sqrt(3) * radius;
	}
	
	@Override
	public void actionPerformed(ActionEvent ae)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void mouseClicked(MouseEvent me)
	{
		double x = me.getX();
		double y = me.getY();
		int button = me.getButton();
		
		
		
		Location loc = convert(x, y);
		
	}
	
	private Location convert(double x, double y)
	{
				
		double xt;
		double yt;
		
		double r;
		double c;
		
		double rt;
		double ct;
		
		double dr;
		
		ct = x / side;
		if(ct % 2 == 0)
		{
			rt = y / height;
		}
		else
		{
			rt =  (y - ( height) / 2) / (height);
		}
		
		xt = x - ct * side;
		yt = y - rt * height;
		
		if(yt > (height /2))
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
	
	
}
