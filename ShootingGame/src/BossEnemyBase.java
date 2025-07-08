
public class BossEnemyBase extends Enemy{
	public BossEnemyBase(double x,double y,double vx,double vy){
		super(x,y,vx,vy);
		life=5*GameWorld.stage;
		score=50;
	}
	public void move() {
		super.move();
		if(x>300) vx=-GameWorld.stage;
		if(x<100) vx=GameWorld.stage;
		if(Math.random()<0.05){
			GameWorld.enemies.add(new StraightEnemy(x,y,0,1+GameWorld.stage));
		}
		if(Math.random()<0.05) {
			GameWorld.enemies.add(new RandomEnemy(x,y,GameWorld.stage,GameWorld.stage));
		}
		if(Math.random()<0.05) {
			GameWorld.enemies.add(new DropEnemy(x,y,0,GameWorld.stage));
		}
		if(Math.random()<0.05) {
			GameWorld.enemies.add(new CurveEnemy(x,y,GameWorld.stage,GameWorld.stage));
		}
		if(Math.random()<0.05) {
			GameWorld.enemies.add(new Laser(x+10,y,GameWorld.stage,30));
			GameWorld.enemies.add(new Laser(x-10,y,GameWorld.stage,30));
			GameWorld.enemies.add(new Laser(x,y,1+GameWorld.stage,30));
			GameWorld.enemies.add(new Laser(x,y,-1-GameWorld.stage,30));
		}
	}
	public void draw(MyFrame f){
		f.setColor(0, 128, 0);
		f.fillOval(x, y, 32, 32);
		f.fillRect(x-16, y, 16, 32);
		f.fillRect(x+32, y, 16, 32);
		f.setColor(200, 200, 200);
		f.fillOval(x-16, y+8, 64, 16);
	}
}
