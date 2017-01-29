package a7;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PixelInspectWidget extends JPanel implements MouseListener {
	
	private JLabel xLabel, yLabel, redInfo,greInfo, bluInfo, brightness;
	private PictureView picture_view;
	private Picture pic;
	
	public PixelInspectWidget(Picture p){
		pic=p;
		xLabel= new JLabel("X: ");
		yLabel= new JLabel("Y: ");
		redInfo=new JLabel("Red: ");
		greInfo=new JLabel("Green: ");
		bluInfo= new JLabel("Blue: ");
		brightness= new JLabel("Brightness: ");
		
		setLayout(new BorderLayout());
		
		picture_view=new PictureView(p.createObservable());
		picture_view.addMouseListener(this);
		add(picture_view, BorderLayout.CENTER);
		//Dimension d= new Dimension(100, p.getHeight());
		
		JPanel label= new JPanel();
		label.setLayout(new GridLayout (6,1));
		
		 label.add(xLabel);
		 label.add(yLabel);
		 label.add(redInfo);
		 label.add(greInfo);
		 label.add(bluInfo);
		 label.add(brightness);
		 
		 add(label, BorderLayout.WEST);
	}
	private static DecimalFormat df = new DecimalFormat(".###");
	
	public void setInfo(int x, int y, Pixel p){
		xLabel.setText("X: "+x);
		yLabel.setText("Y: "+y);
		redInfo.setText("Red: "+df.format(p.getRed()));
		greInfo.setText("Green: "+df.format(p.getGreen()));
		bluInfo.setText("Blue: "+df.format(p.getBlue()));
		brightness.setText("Brightness: "+df.format(p.getIntensity()));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		setInfo(e.getX(), e.getY(),pic.getPixel(e.getX(),e.getY()));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
