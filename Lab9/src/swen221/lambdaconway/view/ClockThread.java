// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN221 assignment.
// You may not distribute it in any other way without permission.
package swen221.lambdaconway.view;

/**
 * The Clock Thread is responsible for producing a consistent "pulse" which is
 * used to update the game state, and refresh the display. Setting the pulse
 * rate too high may cause problems, when the point is reached at which the work
 * done to service a given pulse exceeds the time between pulses.
 * 
 * @author djp
 * 
 */
public class ClockThread extends Thread {
	private final int delay; // delay between ticks in us	
	private final BoardFrame display;
	
	public ClockThread(int delay, BoardFrame display) {
		this.delay = delay;		
		this.display = display;
	}
	
	public void run() {
		while(1 == 1) {
			// Loop forever			
			try {
				Thread.sleep(delay);
				display.clockTick();				
			} catch(InterruptedException e) {
				// should never happen
			}			
		}
	}
}
