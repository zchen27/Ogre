
import java.awt.Color;
import java.awt.Graphics;
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
	
	private double radius;
	private double width;
	private double side;
	private double height;
	private Location mouseover;
	
	private class TestPanel extends JPanel
	{
		@Override
		public void paintComponents(Graphics g)
		{
			super.paintComponents(g);
			int[] xpoints = new int[6];
			int[] ypoints = new int[6];
			
			for(int c = 0; c < 15; c++)
			{
				for(int r = 0; r < 21; r++)
				{
					int dx = c * (int) width;
					int dy = r * (int) height;
					
					if(new Location(c, r).equals(mouseover))
					{
						g.setColor(Color.blue);
					}
					
					if(c % 2 != 0)
					{
						dy += height / 2;
					}
					
					for(int i = 0; i < 6; i++)
					{
						xpoints[i] = (int) ((int) 10 * Math.cos(i * 2 * Math.PI / 6) + dx);
						ypoints[i] = (int) ((int) 10 * Math.sin(i * 2 * Math.PI / 6) + dy);
					}
					
					Polygon hex = new Polygon (xpoints, ypoints, 6);
					g.drawPolygon(hex);
				}
			}
		}
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
		
	}
}
