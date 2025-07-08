
public class Laser extends Enemy{
	public Laser(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
		life = 1;
		score = 0;
	}
	public void draw(MyFrame f) {
		f.setColor(200,0,0);
		f.fillOval(x,y,10,20);
	}
}
