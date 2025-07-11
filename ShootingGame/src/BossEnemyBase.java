
public class BossEnemyBase extends Enemy{
	public BossEnemyBase(double x,double y,double vx,double vy){
		super(x,y,vx,vy);
		life=30*(int)GameWorld.stage/10;
		score=30;
	}
	public void move() {
		super.move();
		if(x>300) vx=-GameWorld.stage*3;
		if(x<100) vx=GameWorld.stage*3;
		if(Math.random()<0.05){
			GameWorld.enemies.add(new StraightEnemy(x,y,0,1+GameWorld.stage));
		}
		if(Math.random()<0.03) {
			GameWorld.enemies.add(new RandomEnemy(x,y,GameWorld.stage,GameWorld.stage));
		}
		if(Math.random()<0.03) {
			GameWorld.enemies.add(new DropEnemy(x,y,0,GameWorld.stage));
		}
		if(Math.random()<0.03) {
			GameWorld.enemies.add(new CurveEnemy(x,y,0,GameWorld.stage));
		}
		if(Math.random()<0.03) {
			GameWorld.enemies.add(new Laser(x,y,GameWorld.stage,20));
			GameWorld.enemies.add(new Laser(x+10,y,GameWorld.stage,20));
			GameWorld.enemies.add(new Laser(x+10,y,1+GameWorld.stage,20));
			GameWorld.enemies.add(new Laser(x,y,-1-GameWorld.stage,20));
		}
	}
	public void draw(MyFrame f){
		f.setColor(256, 0, 0);
		f.fillOval(x, y, 32, 32);
		f.fillOval(x-40, y, 32, 32);
		f.fillOval(x+40, y, 32, 32);
		f.setColor(200, 200, 200);
		f.fillOval(x-16, y+8, 64, 16);
		f.fillRect(x, y+32, 5, 30);
		f.fillRect(x+27, y+32, 5, 30);
		f.setColor(256, 256, 256);
		f.fillOval(x-50, y, 32, 32);
		f.fillOval(x+50, y, 32, 32);
	}
}
