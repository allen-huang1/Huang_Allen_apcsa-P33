//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		int x = 0;
		int y = 5;
		int speed = 2;
		for (int i=0; i<size; i++)
		{
			aliens.add(new Alien(x, y, 2));
			x += 65;
			if (x >= 670)
			{
				x = 80;
				speed = -speed;
				y += 80;
			}
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for (Alien a: aliens)
		{
			a.draw(window);
		}
	}

	public void moveEmAll()
	{
		for (Alien a: aliens)
		{
			a.move("DOWN");
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		ArrayList<Alien> remove = new ArrayList<Alien>();
		for (Alien al: aliens) {
	        Rectangle alienBox = new Rectangle(al.getX(), al.getY(), al.getWidth(), al.getHeight());
            for (Ammo shot: shots) {
                Rectangle shotBox = new Rectangle(shot.getX(), shot.getY(), shot.getWidth(), shot.getHeight());
                if (alienBox.intersects(shotBox)) {
                    remove.add(al);
                    break;
                }
            }
		}
		for (Alien rem: remove)
		{
			aliens.remove(rem);
		}
	}

	public String toString()
	{
		return "";
	}
}
