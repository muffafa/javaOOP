import java.awt.*;
import javax.swing.*;

public class StickMan extends JFrame {
	
	
	private JPanel contentPane;
	private MyCanvas canvas;
	
	public static void main(String[] args) {
		
		StickMan frame = new StickMan("Homework", 600, 600);
		frame.setVisible(true);
	}

	public StickMan(String title, int width, int height) {
		setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width,height);
		this.setLocation(0,0);
		this.setTitle(title);
		contentPane = new JPanel();
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		canvas = new MyCanvas(width, height );
		canvas.setSize(width, height);
		canvas.setLocation(0,0); 
		contentPane.add(canvas);
	}
	
	private class MyCanvas extends Canvas {
		
		private int width;
		private int height;
		
		private int divisorHead;
		private int lengthNoseX;
		private int lengthNoseY;
		private int lengthNeck;
		private int lengthBody;
		private int lenghtArmLeftX;
		private int lenghtArmLeftY;
		private int lenghtArmRightX;
		private int lenghtArmRightY;
		private int lenghtHandLeftX;
		private int lenghtHandLeftY;
		private int lenghtHandRightX;
		private int lenghtHandRightY;
		private int lenghtLegLeftX;			
		private int lenghtLegLeftY;	
		private int lenghtLegRightX;	
		private int lenghtLegRightY;	
		
		//head 
		private int headStartX;
		private int headStartY;
		private int headWidth;
		private int headHeight;
		
		//hairs
		private int hairOrginX;
		private int hairOrginY;
		private int hairStartX;
		private int hairStartY;
		private int hairEndX;
		private int hairEndY;
		
		//eyes 
		//left
		private int eyesLeftStartX;
		private int eyesLeftStartY;
		private int eyesLeftWidth;
		private int	eyesLeftHeight;
		private int pupilLeftStartX;
		private int pupilLeftStartY;
		private int pupilLeftWidth;
		private int pupilLeftHeight;
		private int eyeBrowLeftStartX;
		private int eyeBrowLeftStartY;
		private int eyeBrowLeftWidth;
		private int eyeBrowLeftHeight;
		//right
		private int eyesRightStartX;	
		private int eyesRightStartY;	
		private int eyesRightWidth;	
		private int	eyesRightHeight;
		private int pupilRightStartX;	
		private int pupilRightStartY;	
		private int pupilRightWidth;	
		private int pupilRightHeight;	
		private int eyeBrowRightStartX;	
		private int eyeBrowRightStartY;	
		private int eyeBrowRightWidth;	
		private int eyeBrowRightHeight;	
		
		//eye-brows
		//left
		private int browLeftOrginX;
		private int browLeftOrginY;
		private int browLeftStartX; 
		private int browLeftStartY;
		private int browLeftEndX;
		private int browLeftEndY;
		//right
		private int browRightOrginX;		
		private int browRightOrginY;
		private int browRightStartX; 
		private int browRightStartY;
		private int browRightEndX;
		private int browRightEndY;
		
		//nose 
		private int noseStartX;
		private int noseStartY;
		private int noseEndX;
		private int noseEndY;
		
		//ears
		//left
		private int earLeftStartX;
		private int earLeftStartY;
		private int earLeftWidth;
		private int earLeftHeight;
		//right
		private int earRightStartX;
		private int earRightStartY;
		private int earRightWidth;
		private int earRightHeight;
		
		//mouth 
		private int mouthWidth;
		private int mouthHeight;
		private int mouthStartX;
		private int mouthStartY;
		
		//neck
		private int neckStartX;
		private int neckStartY;
		private int neckEndX;
		private int neckEndY;
		
		//arms
		//left
		private int armLeftStartX;
		private int armLeftStartY;
		private int armLeftEndX;
		private int armLeftEndY;
		//right
		private int armRightStartX;
		private int armRightStartY;
		private int armRightEndX;
		private int armRightEndY;
		
		//hands
		//left1
		private int handLeftStartX1;
		private int handLeftStartY1;
		private int handLeftEndX1;
		private int handLeftEndY1;
		//right1
		private int handRightStartX1;
		private int handRightStartY1;
		private int handRightEndX1;
		private int handRightEndY1;
		//left2
		private int handLeftStartX2;
		private int handLeftStartY2;
		private int handLeftEndX2;
		private int handLeftEndY2;
		//right2
		private int handRightStartX2;
		private int handRightStartY2;
		private int handRightEndX2;
		private int handRightEndY2;
		//left3
		private int handLeftStartX3;
		private int handLeftStartY3;
		private int handLeftEndX3;
		private int handLeftEndY3;
		//right3
		private int handRightStartX3;
		private int handRightStartY3;
		private int handRightEndX3;
		private int handRightEndY3;
		//left4
		private int handLeftStartX4;
		private int handLeftStartY4;
		private int handLeftEndX4;
		private int handLeftEndY4;
		//right4
		private int handRightStartX4;
		private int handRightStartY4;
		private int handRightEndX4;
		private int handRightEndY4;

		
		//body
		private int bodyStartX;
		private int bodyStartY;
		private int bodyEndX;
		private int bodyEndY;
		
		//legs	
		//left	
		private int legLeftStartX;	
		private int legLeftStartY;	
		private int legLeftEndX;	
		private int legLeftEndY;	
		//right	
		private int legRightStartX;	
		private int legRightStartY;	
		private int legRightEndX;	
		private int legRightEndY;	
		
		//foots
		//left
		private int footLeftStartX;
		private int footLeftStartY;
		private int footLeftWidth;
		private int footLeftHeight;
		//right
		private int footRightStartX;
		private int footRightStartY;
		private int footRightWidth;
		private int footRightHeight;
		
		public MyCanvas( int width, int height) {
			this.width = width;
			this.height = height;
			
			//Values
			divisorHead = 4;
			lengthNoseX =10;
			lengthNoseY = 15;
			lengthNeck = 40;
			lengthBody = 120;
			lenghtArmLeftX = 50;
			lenghtArmLeftY = 50;
			lenghtArmRightX = 50;
			lenghtArmRightY = 50;
			lenghtHandLeftX = 10;
			lenghtHandLeftY = 10;
			lenghtHandRightX = 10;
			lenghtHandRightY = 10;
			lenghtLegLeftX = 50;
			lenghtLegLeftY = 50;
			lenghtLegRightX = 50;
			lenghtLegRightY = 50;

			
			//head 
			headStartX = (width-width/divisorHead)/2;
			headStartY = 50;
			headWidth = width/divisorHead;
			headHeight = height/divisorHead;
			
			//hairs
			hairOrginX = headStartX + headWidth/2;
			hairOrginY = headStartY + headHeight/2;
			//hairStartX = (int) (hairOrginX + headWidth/2* Math.cos(Math.toRadians(45))); 
			//hairStartY = (int) (hairOrginY - headHeight/2* Math.sin(Math.toRadians(45)));
			//System.out.println(hairStartX);
			//System.out.println(hairStartY);
			//hairEndX = (int) (hairStartX + headWidth/6* Math.cos(Math.toRadians(45)));
			//System.out.println(hairEndX);
			//hairEndY = (int) (hairStartY - headHeight/6* Math.sin(Math.toRadians(45)) );
			//System.out.println(hairEndY);
			
			//eyes
			//left		
			eyesLeftWidth = 3*headWidth/16;	
			eyesLeftHeight = 3* headHeight/16;
			eyesLeftStartX = headStartX + 3*headWidth/8 - eyesLeftWidth/2 ;	
			eyesLeftStartY = headStartY + headHeight/4;
			pupilLeftWidth = 3*eyesLeftWidth/8;	
			pupilLeftHeight = 3*eyesLeftHeight/8;	
			pupilLeftStartX = eyesLeftStartX + eyesLeftWidth/2 - pupilLeftWidth/2;	
			pupilLeftStartY = eyesLeftStartY + eyesLeftHeight/2 - pupilLeftHeight/2;	
			eyeBrowLeftWidth = eyesLeftWidth;	
			eyeBrowLeftHeight = eyesLeftHeight;
			eyeBrowLeftStartX = eyesLeftStartX;	
			eyeBrowLeftStartY = eyesLeftStartY - 10;		
			//right	
			eyesRightWidth = 3*headWidth/16;	
			eyesRightHeight = 3*headHeight/16;
			eyesRightStartX =  headStartX + 5* headWidth/8 - eyesLeftWidth/2 ;	
			eyesRightStartY = headStartY + headHeight/4;	
			pupilRightWidth = 3*eyesRightWidth/8;	
			pupilRightHeight = 3*eyesRightHeight/8;
			pupilRightStartX = eyesRightStartX + eyesRightWidth/2 - pupilRightWidth/2;	
			pupilRightStartY = eyesRightStartY + eyesRightHeight/2 - pupilRightHeight/2;	
			eyeBrowRightWidth = eyesRightWidth;	
			eyeBrowRightHeight = eyesRightHeight;	
			eyeBrowRightStartX = eyesRightStartX;	
			eyeBrowRightStartY = eyesRightStartY - 10;	
			
			//eye-brows
			//left
			browLeftOrginX = eyeBrowLeftStartX + eyeBrowLeftWidth/2;
			browLeftOrginY = eyeBrowLeftStartY + eyeBrowLeftHeight/2;
			//browLeftStartX = (int) (browLeftOrginX + eyeBrowLeftWidth/2* Math.cos(Math.toRadians(45))); 
			//browLeftStartY = (int) (browLeftOrginY - eyeBrowLeftHeight/2* Math.sin(Math.toRadians(45)));
			//browLeftEndX = (int) (browLeftStartX + eyeBrowLeftWidth/6* Math.cos(Math.toRadians(45)));
			//browLeftEndY = (int) (browLeftStartY - eyeBrowLeftHeight/6* Math.sin(Math.toRadians(45)));
			//right
			browRightOrginX = eyeBrowRightStartX + eyeBrowRightWidth/2;
			browRightOrginY = eyeBrowRightStartY + eyeBrowRightHeight/2;
			//browRightStartX = (int) (browRightOrginX + eyeBrowRightWidth/2* Math.cos(Math.toRadians(45))); 
			//browRightStartY = (int) (browRightOrginY - eyeBrowRightHeight/2* Math.sin(Math.toRadians(45)));
			//browRightEndX = (int) (browRightStartX + eyeBrowRightWidth/6* Math.cos(Math.toRadians(45)));
			//browRightEndY = (int) (browRightStartY - eyeBrowRightHeight/6* Math.sin(Math.toRadians(45)));
			
			//nose
			noseStartX = headStartX + headWidth/2;
			noseStartY = headStartY + headHeight/2;
			noseEndX = noseStartX - lengthNoseX;
			noseEndY = noseStartY + lengthNoseY;
			
			//ears
			//left
			earLeftWidth= 20;
			earLeftHeight = 20;
			earLeftStartX = headStartX - earLeftWidth;
			earLeftStartY = headStartY + headHeight/2;
			//right
			earRightWidth = 20;
			earRightHeight = 20;
			earRightStartX = headStartX + headWidth;
			earRightStartY = headStartY + headHeight/2;
			
			//mouth
			mouthWidth = headWidth/4;
			mouthHeight = headHeight/4;
			mouthStartX = headStartX + mouthWidth + mouthWidth/2;
			mouthStartY = headStartY + headHeight - mouthHeight;
			
			//neck 
			neckStartX = headStartX+headWidth/2;
			neckStartY = headStartY+headHeight;
			neckEndX = neckStartX;
			neckEndY = neckStartY+lengthNeck;
			
			//arms
			//left
			armLeftStartX = neckEndX;
			armLeftStartY = neckEndY;
			armLeftEndX = armLeftStartX - lenghtArmLeftX;
			armLeftEndY = armLeftStartY + lenghtArmLeftY;
			//right
			armRightStartX = neckEndX;
			armRightStartY = neckEndY;
			armRightEndX = armRightStartX + lenghtArmRightX ;
			armRightEndY =  armRightStartY + lenghtArmRightY;
			
			//hands 
			//left1
			handLeftStartX1 = armLeftEndX;
			handLeftStartY1 = armLeftEndY;
			handLeftEndX1 = handLeftStartX1 - lenghtHandLeftX-10;
			handLeftEndY1 = handLeftStartY1 + lenghtHandLeftY-10;
			//right1
			handRightStartX1 = armRightEndX;
			handRightStartY1 = armRightEndY;
			handRightEndX1 = handRightStartX1 + lenghtHandRightX+10;
			handRightEndY1 = handRightStartY1 + lenghtHandRightY-10;
			//left2
			handLeftStartX2 = armLeftEndX;
			handLeftStartY2 = armLeftEndY;
			handLeftEndX2 = handLeftStartX2 - lenghtHandLeftX-5;
			handLeftEndY2 = handLeftStartY2 + lenghtHandLeftY-5;
			//right2
			handRightStartX2 = armRightEndX;
			handRightStartY2 = armRightEndY;
			handRightEndX2 = handRightStartX2 + lenghtHandRightX+5;
			handRightEndY2 = handRightStartY2 + lenghtHandRightY-5;
			//left3
			handLeftStartX3 = armLeftEndX;
			handLeftStartY3 = armLeftEndY;
			handLeftEndX3 = handLeftStartX3 - lenghtHandLeftX;
			handLeftEndY3 = handLeftStartY3 + lenghtHandLeftY;
			//right3
			handRightStartX3 = armRightEndX;
			handRightStartY3 = armRightEndY;
			handRightEndX3 = handRightStartX3 + lenghtHandRightX;
			handRightEndY3 = handRightStartY3 + lenghtHandRightY;
			//left4
			handLeftStartX4 = armLeftEndX;
			handLeftStartY4 = armLeftEndY;
			handLeftEndX4 = handLeftStartX4 - lenghtHandLeftX+5;
			handLeftEndY4 = handLeftStartY4 + lenghtHandLeftY+5;
			//right4
			handRightStartX4 = armRightEndX;
			handRightStartY4 = armRightEndY;
			handRightEndX4 = handRightStartX4 + lenghtHandRightX-5;
			handRightEndY4 = handRightStartY3 + lenghtHandRightY+5;

			
			//body
			bodyStartX = neckEndX;
			bodyStartY = neckEndY;
			bodyEndX = bodyStartX;
			bodyEndY = bodyStartY+lengthBody;
			
			//legs
			//left
			legLeftStartX = bodyEndX;
			legLeftStartY = bodyEndY;
			legLeftEndX = legLeftStartX - lenghtLegLeftX;
			legLeftEndY = legLeftStartY + lenghtLegLeftY;
			//right
			legRightStartX = bodyEndX;
			legRightStartY = bodyEndY;
			legRightEndX = legRightStartX + lenghtLegRightX ;
			legRightEndY =  legRightStartY + lenghtLegRightY;
			
			//foots
			//left
			footLeftWidth= 20;
			footLeftHeight = 15;
			footLeftStartX = legLeftEndX - footLeftWidth ;
			footLeftStartY = legLeftEndY;
			//right
			footRightWidth = 20;
			footRightHeight = 15;
			footRightStartX = legRightEndX;
			footRightStartY = legRightEndY;

		}
		//hair
		public int hairStartX(int i) {
			hairStartX = (int) (hairOrginX + headWidth/2* Math.cos(Math.toRadians(i))); 
			return hairStartX;
		}
		public int hairStartY(int i) { 
			hairStartY = (int) (hairOrginY - headHeight/2* Math.sin(Math.toRadians(i)));
			return hairStartY;
		}
		public int hairEndX(int i) {
			hairEndX = (int) (hairStartX + headWidth/6* Math.cos(Math.toRadians(i)));
			return hairEndX;
		}
		public int hairEndY(int i) {
			hairEndY = (int) (hairStartY - headHeight/6* Math.sin(Math.toRadians(i)));
			return hairEndY;
		}
		
		//eye-brows
		//left
		public int browLeftStartX(int i) {
			browLeftStartX = (int) (browLeftOrginX + eyeBrowLeftWidth/2* Math.cos(Math.toRadians(i))); 
			return browLeftStartX;
		}
		public int browLeftStartY(int i) { 
			browLeftStartY = (int) (browLeftOrginY - eyeBrowLeftHeight/2* Math.sin(Math.toRadians(i)));
			return browLeftStartY;
		}
		public int browLeftEndX(int i) {
			browLeftEndX = (int) (browLeftStartX + eyeBrowLeftWidth/6* Math.cos(Math.toRadians(70)));
			return browLeftEndX;
		}
		public int browLeftEndY(int i) {
			browLeftEndY = (int) (browLeftStartY - eyeBrowLeftHeight/6* Math.sin(Math.toRadians(70)));
			return browLeftEndY;
		}
		//right
		public int browRightStartX(int i) {			
			browRightStartX = (int) (browRightOrginX + eyeBrowRightWidth/2* Math.cos(Math.toRadians(i))); 
			return browRightStartX;
		}	
		public int browRightStartY(int i) { 	
			browRightStartY = (int) (browRightOrginY - eyeBrowRightHeight/2* Math.sin(Math.toRadians(i)));
			return browRightStartY;
		}	
		public int browRightEndX(int i) {	
			browRightEndX = (int) (browRightStartX + eyeBrowRightWidth/6* Math.cos(Math.toRadians(70)));
			return browRightEndX;
		}	
		public int browRightEndY(int i) {	
			browRightEndY = (int) (browRightStartY - eyeBrowRightHeight/6* Math.sin(Math.toRadians(70)));
			return browRightEndY;
		}	

		
		@Override
		public void paint(Graphics g) {
			//head 
			g.drawOval(headStartX, headStartY, headWidth, headHeight); // x, y, width, height
			
			//hairs
			for(int i=40; i<=130; i += 10) {
				g.drawLine( hairStartX(i), hairStartY(i), hairEndX(i), hairEndY(i));
			}
			//System.out.printf("%d %d",(int)((headStartX + headWidth/2)*Math.sin(Math.toRadians(90))),(int)((headStartX + headWidth/2)*Math.cos(Math.toRadians(90))));
			
			//eyes
			//left
			g.drawOval(eyesLeftStartX, eyesLeftStartY, eyesLeftWidth, eyesLeftHeight);
			g.fillRect(pupilLeftStartX, pupilLeftStartY, pupilLeftWidth, pupilLeftHeight);
			g.drawArc(eyeBrowLeftStartX , eyeBrowLeftStartY , eyeBrowLeftWidth , eyeBrowLeftHeight , -180, -180); //x,  y,  width,  height,  startAngle,  arcAngle
			//right
			g.drawOval(eyesRightStartX, eyesRightStartY, eyesRightWidth, eyesRightHeight);
			g.fillRect(pupilRightStartX, pupilRightStartY, pupilRightWidth, pupilRightHeight);
			g.drawArc(eyeBrowRightStartX , eyeBrowRightStartY , eyeBrowRightWidth , eyeBrowRightHeight , -180, -180); //x,  y,  width,  height,  startAngle,  arcAngle
			
			//eye-brows
			//left
			for(int i=0; i<=180; i+= 20){
				g.drawLine(browLeftStartX(i), browLeftStartY(i), browLeftEndX(i), browLeftEndY(i));
			}
			//right
			for(int i=0; i<=180; i+=20){
				g.drawLine(browRightStartX(i), browRightStartY(i), browRightEndX(i), browRightEndY(i));
			}

			//nose
			g.drawLine(noseStartX, noseStartY, noseEndX, noseEndY);
			g.drawLine(noseEndX, noseEndY, noseStartX, noseEndY);
			
			//ears
			//left
			g.fillOval(earLeftStartX, earLeftStartY, earLeftWidth, earLeftHeight);
			//right
			g.fillOval(earRightStartX, earRightStartY, earRightWidth, earRightHeight);
			
			//mouth 
			g.drawArc(mouthStartX , mouthStartY , mouthWidth , mouthHeight , -180, -180); //x,  y,  width,  height,  startAngle,  arcAngle
			
			//neck
			g.drawLine(neckStartX, neckStartY ,neckEndX ,neckEndY ); // x1, y1, x2, y2
			
			//arms
			//left
			g.drawLine(armLeftStartX, armLeftStartY ,armLeftEndX ,armLeftEndY ); // x1, y1, x2, y2
			//right
			g.drawLine(armRightStartX, armRightStartY ,armRightEndX ,armRightEndY ); // x1, y1, x2, y2
			
			//hands
			//left1
			g.drawLine(handLeftStartX1, handLeftStartY1 ,handLeftEndX1 ,handLeftEndY1 );
			//right1
			g.drawLine(handRightStartX1, handRightStartY1 ,handRightEndX1 ,handRightEndY1 );
			//left2
			g.drawLine(handLeftStartX2, handLeftStartY2 ,handLeftEndX2 ,handLeftEndY2 );
			//right2
			g.drawLine(handRightStartX2, handRightStartY2 ,handRightEndX2 ,handRightEndY2 );
			//left3
			g.drawLine(handLeftStartX3, handLeftStartY3 ,handLeftEndX3 ,handLeftEndY3 );
			//right3
			g.drawLine(handRightStartX3, handRightStartY3 ,handRightEndX3 ,handRightEndY3 );
			//left4
			g.drawLine(handLeftStartX4, handLeftStartY4 ,handLeftEndX4 ,handLeftEndY4 );
			//right4
			g.drawLine(handRightStartX4, handRightStartY4 ,handRightEndX4 ,handRightEndY4 );

			
			//body
			g.drawLine(bodyStartX, bodyStartY , bodyEndX , bodyEndY); // x1, y1, x2, y2
		
			//legs			
			//left
			g.drawLine(legLeftStartX, legLeftStartY ,legLeftEndX ,legLeftEndY ); // x1, y1, x2, y2
			//right
			g.drawLine(legRightStartX, legRightStartY ,legRightEndX ,legRightEndY ); // x1, y1, x2, y2
			
			//foot
			//left
			g.fillRect(footLeftStartX, footLeftStartY, footLeftWidth, footLeftHeight);
			//right
			g.fillRect(footRightStartX, footRightStartY, footRightWidth, footRightHeight);
		
		}
	}
}
