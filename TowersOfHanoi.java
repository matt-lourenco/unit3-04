/****************************************************************************
 *
 * Created by: Matthew lourenco
 * Created on: Apr 2018
 * This program solves the "Towers of Hanoi" puzzle given the number of disks
 * 
 * Source:
 * Code was adapted from this source
 * http://interactivepython.org/runestone/static/pythonds/Recursion/TowerofHanoi.html
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TowersOfHanoi {
	
	public void solve(int height) {
		//Run the moveTower procedure
		moveTower(height, "A", "B", "C");
	}
	
	private void moveTower(int height, String fromPole,
							String toPole, String sparePole) {
		if(height >= 1) {
			moveTower(height-1, fromPole, sparePole, toPole);
			moveDisk(fromPole,toPole);
			moveTower(height-1, sparePole, toPole, fromPole);
		}
		
	}
	
	private void moveDisk(String fp, String tp) {
		System.out.println("moving disk from " + fp + " to " + tp);
	}
	
	public static void main(String[] args) throws Exception {
		//Get user input
		
		BufferedReader reader = new BufferedReader(new InputStreamReader
				(System.in));
		System.out.println("Enter the number of disks");
		String input = reader.readLine();
		int height = Integer.parseInt(input);
		
		TowersOfHanoi towers = new TowersOfHanoi();
		towers.solve(height);
	}
}