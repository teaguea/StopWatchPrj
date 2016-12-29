/**********************************************************************
Simulation of a StopWatch

@author Aaron Teague
 **********************************************************************/

package package1;

import java.io.*;
import java.util.Scanner;

public class StopWatch {

	/** Boolean value that control if the StopWatch object can change */
	private static boolean mutate = true;

	/** Number of minutes */
	private int minutes;

	/** Number of seconds */
	private int seconds;

	/** Number of milliseconds */
	private int milliseconds;

	/*******************************************************************
	 * Returns the number minutes.
	 * 
	 * @return minutes
	 ******************************************************************/
	public int getMinutes() {
		return this.minutes;
	}

	/*******************************************************************
	 * Sets the number minutes.
	 * 
	 * @param minutes
	 ******************************************************************/
	public void setMinutes(int minutes)throws IllegalArgumentException {
		if (mutate) {
			if (minutes >= 0)
				this.minutes = minutes;
			else
				throw new IllegalArgumentException();
		}
	}

	/*******************************************************************
	 * Returns the number of seconds.
	 * 
	 * @return seconds
	 ******************************************************************/
	public int getSeconds() {
		return this.seconds;
	}

	/*******************************************************************
	 * Sets the number of seconds.
	 * 
	 * @param seconds
	 ******************************************************************/
	public void setSeconds(int seconds)throws IllegalArgumentException {
		if (mutate) {
			if (seconds >= 0 && seconds < 60)
				this.seconds = seconds;
			else
				throw new IllegalArgumentException();
		}
	}

	/*******************************************************************
	 * Returns the number of milliseconds.
	 * 
	 * @returns milliseconds
	 ******************************************************************/
	public int getMilliseconds() {
		return this.milliseconds;
	}

	/*******************************************************************
	 * Sets the number of milliseconds
	 * 
	 * @param milliseconds
	 ******************************************************************/
	public void setMilliseconds(int milliseconds)
			throws IllegalArgumentException {
		if (mutate) {
			if (milliseconds >= 0 && milliseconds < 1000)
				this.milliseconds = milliseconds;
			else
				throw new IllegalArgumentException();
		}
	}

	/*******************************************************************
	 * Default constructor, creates a Stop Watch with 0 minutes, 
	 * 0 seconds, and 0 milliseconds
	 ******************************************************************/
	public StopWatch() {

		this.minutes = 0;
		this.seconds = 0;
		this.milliseconds = 0;

	}

	/*******************************************************************
	 * Constructor, creates a Stop Watch: sets the minutes, the seconds, 
	 * and the milliseconds
	 * 
	 * @param minutes
	 * @param seconds
	 * @param milliseconds
	 ******************************************************************/
	public StopWatch(int minutes, int seconds, int milliseconds)
			throws IllegalArgumentException {

		if (seconds < 60 && milliseconds < 1000) {

			if (minutes >= 0 && seconds >= 0 && milliseconds >= 0) {

				this.minutes = minutes;
				this.seconds = seconds;
				this.milliseconds = milliseconds;
			} else
				throw new IllegalArgumentException();
		} else
			throw new IllegalArgumentException();

	}

	/*******************************************************************
	 * Constructor, creates a Stop Watch: sets the seconds, and 
	 * milliseconds
	 *
	 * @param seconds
	 * @param milliseconds
	 ******************************************************************/
	public StopWatch(int seconds, int milliseconds)
			throws IllegalArgumentException {

		if (seconds < 60 && milliseconds < 1000) {

			if (seconds >= 0 && milliseconds >= 0) {

				this.seconds = seconds;
				this.milliseconds = milliseconds;
			}

			else

				throw new IllegalArgumentException();
		}

		else
			throw new IllegalArgumentException();
	}

	/*******************************************************************
	 * Constructor, creates a Stop Watch: sets the milliseconds
	 * 
	 * @param milliseconds
	 ******************************************************************/
	public StopWatch(int milliseconds) throws IllegalArgumentException {

		if (milliseconds >= 0 && milliseconds < 1000)
			this.milliseconds = milliseconds;

		else
			throw new IllegalArgumentException();
	}

	/*******************************************************************
	 * Constructor, creates a Stop Watch from a string
	 * 
	 * @param startTime, the time in a string
	 ******************************************************************/
	public StopWatch(String startTime) throws IllegalArgumentException {

		String[] parts = startTime.split(":");

		int i = parts.length;

		switch (i) {

		case 3: {

			if (Integer.parseInt(parts[1]) < 60
					&& Integer.parseInt(parts[2]) < 1000) {

				if (Integer.parseInt(parts[0]) >= 0
						&& Integer.parseInt(parts[1]) >= 0
						&& Integer.parseInt(parts[2]) >= 0) {

					this.minutes = Integer.parseInt(parts[0]);
					this.seconds = Integer.parseInt(parts[1]);
					this.milliseconds = Integer.parseInt(parts[2]);
					break;
				}

				else
					throw new IllegalArgumentException();
			}

			else
				throw new IllegalArgumentException();
		}

		case 2: {

			if (Integer.parseInt(parts[0]) < 60
					&& Integer.parseInt(parts[1]) < 1000) {

				if (Integer.parseInt(parts[0]) >= 0
						&& Integer.parseInt(parts[1]) >= 0) {

					this.minutes = 0;
					this.seconds = Integer.parseInt(parts[0]);
					this.milliseconds = Integer.parseInt(parts[1]);
					break;
				}

				else
					throw new IllegalArgumentException();
			}

			else
				throw new IllegalArgumentException();
		}

		case 1: {

			if (Integer.parseInt(startTime) >= 0
					&& Integer.parseInt(startTime) < 1000) {
				this.minutes = 0;
				this.seconds = 0;
				this.milliseconds = Integer.parseInt(startTime);
				break;
			}

			else
				throw new IllegalArgumentException();

			}
		}

	}

	/*******************************************************************
	 * Boolean method takes a StopWatch argument. Returns true if the
	 * current StopWatch object is exactly the same as the StopWatch 
	 * passed in
	 * 
	 * @param other, StopWatch object
	 * @return boolean true or false
	 ******************************************************************/
	public boolean equals(StopWatch other) {

		if (this.minutes == other.minutes
				&& this.seconds == other.seconds
				&& this.milliseconds == other.milliseconds)

			return true;

		else

			return false;
	}

	/******************************************************************
	 * Boolean method that is able to accept a Object argument. Returns 
	 * true if the current StopWatch object is exactly the same as the 
	 * object passed in
	 * 
	 * @param other, a Object type object
	 * @return boolean true or false
	 ******************************************************************/
	public boolean equals(Object other) {

		if (this.minutes == ((StopWatch) other).minutes
			&& this.seconds == ((StopWatch) other).seconds
			&& this.milliseconds == ((StopWatch) other).milliseconds)

			return true;

		else

			return false;
	}

	/******************************************************************
	 * Static method of a boolean type and accepts two StopWatch object
	 * arguments. Returns true if the first StopWatch is exactly the 
	 * same as the second StopWatch
	 * 
	 * @param s1, s2: Stopwatch objects
	 * @return boolean true or false
	 ******************************************************************/
	public static boolean equals(StopWatch s1, StopWatch s2) {

		if (s1.minutes == s2.minutes && s1.seconds == s2.seconds
				&& s1.milliseconds == s2.milliseconds)

			return true;

		else

			return false;
	}

	/******************************************************************
	 * Method returns "1" if the current StopWatch is greater than the 
	 * StopWatch passed in; returns "-1" if the current StopWatch is 
	 * less than the StopWatch passed in; returns "0" if the current 
	 * StopWatch is equal to theStopWatch passed in
	 * 
	 * @param other, StopWatch object
	 * @return 0, 1, -1
	 ******************************************************************/
	public int compareTo(StopWatch other) {

		if (this.equals(other))
			return 0;

		if (this.minutes > other.minutes)
			return 1;
		else if (this.seconds > other.seconds)
			return 1;
		else if (this.milliseconds > other.milliseconds)
			return 1;
		else
			return -1;

	}

	/**********************************************************
	 * Method adds milliseconds to the current StopWatch
	 * 
	 * @param milliseconds
	 * @return none
	 **********************************************************/
	public void add(int milliseconds) {
	  if(mutate){
		if (milliseconds >= 0) {
			this.minutes += milliseconds / 60000;
			milliseconds %= 60000;
			this.seconds += milliseconds / 1000;

			if (this.seconds >= 60) {
				this.minutes += this.seconds / 60;
				this.seconds %= 60;
			}

			milliseconds = milliseconds % 1000;

			while (milliseconds > 0) {
				this.inc();
				milliseconds--;

			}
		}
	  }
	}

	/******************************************************************
	 * Method adds StopWatch time passed in to the current StopWatch
	 * 
	 * @param other, StopWatch object
	 * @return none
	 *****************************************************************/
	public void add(StopWatch other) {

		if (mutate) {
			int total = 0;
			total = other.minutes * 60000 + other.seconds * 1000
					+ other.milliseconds;

			this.add(total);
		}

	}

	/******************************************************************
	 * Method increments the milliseconds of the current StopWatch
	 * 
	 * @param none
	 * @return none
	 *****************************************************************/
	public void inc() {

		if (mutate) {
			this.milliseconds++;

			if (this.milliseconds >= 1000) {
				this.seconds += this.milliseconds / 1000;
				this.milliseconds %= 1000;
			}

			if (this.seconds >= 60) {
				this.minutes += this.seconds / 60;
				this.seconds %= 60;
			}
		}

	}

	/******************************************************************
	 * Method returns a formated string of the current StopWatch's time
	 * 
	 * @param none
	 * @return the time in a string
	 *****************************************************************/
	public String toString() {

		String a = String.format("%02d", this.seconds);
		String b = String.format("%03d", this.milliseconds);
		return this.minutes + ":" + a + ":" + b;
	}

	/******************************************************************
	 * Takes information from a file and sets the minutes, seconds, and
	 * milliseconds
	 * 
	 * @param fileName, the file that contains the time
	 * @return none
	 *****************************************************************/
	public void load(String fileName) {

		String time;

		try {
			Scanner fileReader = new Scanner(new File(fileName));

			time = fileReader.next();
			StopWatch other = new StopWatch(time);
			this.minutes = other.minutes;
			this.seconds = other.seconds;
			this.milliseconds = other.milliseconds;

			fileReader.close();
		}

		catch (FileNotFoundException error) {
			System.out.println("File Not Found");
		}

	}

	/************************************************************
	 * Writes the time to a file
	 * 
	 * @param fileName, the file saving to
	 * @return none
	 ************************************************************/
	public void save(String fileName) {

		PrintWriter out = null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(
					fileName)));
		} catch (IOException e) {
			e.printStackTrace();

		}

		out.println(this.toString());
		out.close();

	}

	/******************************************************************
	 * Sets the a boolean value "mutate", which is used to determine if 
	 * an object can be changed.
	 * 
	 * @param mutate, boolean value
	 * @return none
	 ******************************************************************/
	public static void setMutate(boolean mutate) {
		StopWatch.mutate = mutate;
	}

}
