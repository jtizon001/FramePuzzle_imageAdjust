package a7;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PixelAdjustMain {
	public static void main(String[] args) throws IOException {
		//first p is doge :D
		Picture p = A7Helper.readFromURL("https://s-media-cache-ak0.pinimg.com/736x/88/dd/b2/88ddb2605244e5f64dac363d1a647ada.jpg");//("http://www.cs.unc.edu/~kmp/kmp.jpg");
		//Picture p = A7Helper.readFromURL("http://www.cs.unc.edu/~kmp/kmp.jpg");
		//SimplePictureViewWidget simple_widget = new SimplePictureViewWidget(p, "K to the M to the P");
		//PixelInspectWidget pixWid = new PixelInspectWidget(p);
		PixelAdjusterWidget picAdjust= new PixelAdjusterWidget(p);
		
		JFrame main_frame = new JFrame();
		main_frame.setTitle("Assignment 7 Simple Picture View");
		main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel top_panel = new JPanel();
		top_panel.setLayout(new BorderLayout());
		top_panel.add(picAdjust, BorderLayout.CENTER);
		//top_panel.setPreferredSize(new Dimension(600, 600));
		main_frame.setContentPane(top_panel);

		main_frame.pack();
		main_frame.setVisible(true);
	}

}
