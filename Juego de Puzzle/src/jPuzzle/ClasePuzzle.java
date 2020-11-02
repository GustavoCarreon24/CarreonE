package jPuzzle;

import java.awt.EventQueue;

public class ClasePuzzle 
{

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePuzzle frame = new FramePuzzle();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
