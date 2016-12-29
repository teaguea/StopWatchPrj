package package1;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestStopWatch {

/**
 *
 * The following are simple JUnit test cases... After talking with your 
 * instructor, create many, many more that shows that your code 
 * is functioning correctly.
 *
 */	
	///*
	//@Test
	//public void testConstructor() {
		//StopWatch s = new StopWatch (5,10,300);
		//assertEquals(s.toString(),"5:10:300");
		
		//s = new StopWatch("20:10:8");
		//assertEquals(s.toString(),"20:10:008");
		
		//s = new StopWatch("20:8");
		//assertEquals(s.toString(),"0:20:008");
		
		//s = new StopWatch("8");
		//assertEquals(s.toString(),"0:00:008");

	//}

	//Tests three int constructor with three positive ints
	@Test
	public void testThreeIntConstructor() {
		StopWatch s = new StopWatch (5,10,300);
		assertEquals(s.toString(),"5:10:300");
	}
	
	//Tests three int constructor with three 0's
	@Test
	public void testZeroThreeIntConstructor() {
		StopWatch s = new StopWatch (0,0,0);
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Tests three int constructor with a negative int for the minutes
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinThreeIntConstructor(){
		new StopWatch(-1,0,0);
	}
	
	//Tests three int constructor with a negative int for the seconds
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecThreeIntConstructor(){
		new StopWatch(0,-1,0);
	}
	
	//Tests three int constructor with a negative int for the millisec.
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMilThreeIntConstructor(){
		new StopWatch(0,0,-1);
	}
	
	//Tests three int constructor with a negative int for the minutes
	// and seconds
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecMilThreeIntConstructor(){
		new StopWatch(0,-1,-1);
	}
	
	//Tests three int constructor with a negative int for the millisec.
	// and seconds
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinSecThreeIntConstructor(){
		new StopWatch(-1,-1, 0);
	}
	
	//Tests three int constructor with a negative int for the min. and
	//millisec.
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinMilThreeIntConstructor(){
		new StopWatch(-1,0,-1);
	}
	
	//Tests three int constructor with a negative int for the minutes
	// seconds, and millisec.
	@Test (expected = IllegalArgumentException.class)
	public void testNegativMinSecMilThreeIntConstructor(){
		new StopWatch(-1,-1,-1);
	}
	
	//Tests three int constructor with 60 seconds
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSecThreeIntConstructor(){
		new StopWatch(0,60,0);
	}
	
	//Tests three int constructor with 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxMilThreeIntConstructor(){
		new StopWatch(0,0,1000);
	}
	
	//Tests three int constructor with 60 seconds and 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSecAndMilThreeIntConstructor(){
		new StopWatch(0,60,1000);
	}
	
	//Tests three int constructor with 999 millisec
	@Test
	public void testAllowedMilThreeIntConstructor(){
		StopWatch s = new StopWatch (0,0,999);
		assertEquals(s.toString(),"0:00:999");
	}
	
	//Tests three int constructor with 59 sec
	@Test
	public void testAllowedMinThreeIntConstructor(){
		StopWatch s =  new StopWatch (0,59,0);
		assertEquals(s.toString(),"0:59:000");
	}
	
	//Tests three int constructor with 59 sec and millisec
	@Test
	public void testAllowedMinMilThreeIntConstructor(){
		StopWatch s =  new StopWatch (0,59,999);
		assertEquals(s.toString(),"0:59:999");
	}	
	
	//Tests two int constructor with two 0's
	@Test
	public void testZeroTwoIntConstructor(){
		StopWatch s = new StopWatch (0,0);
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Tests two int constructor with two positive ints
	@Test
	public void testTwoIntConstructor(){
		StopWatch s = new StopWatch (30,300);
		assertEquals(s.toString(),"0:30:300");
	}
	
	//Tests two int constructor with negative seconds
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecTwoIntConstructor(){
		new StopWatch(-1,0);
	}
	
	//Tests two int constructor with negative millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMilTwoIntConstructor(){
		new StopWatch(0,-1);
	}
	
	//Tests two int constructor with negative seconds and millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecAndMilTwoIntConstructor(){
		new StopWatch(-1,-1);
	}
	
	//Tests two int constructor with 60 seconds
	@Test (expected = IllegalArgumentException.class)
	public void overMaxSecTwoIntConstructor(){
		new StopWatch(60,0);
	}
	
	//Tests two int constructor with 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void overMaxMilTwoIntConstructor(){
		new StopWatch(0,1000);
	}
	
	//Tests two int constructor with 60 seconds and 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void overMaxSecAndMilTwoIntConstructor(){
		new StopWatch(60,1000);
	}
	
	//Tests one int constructor with 0 millisec
	@Test
	public void testZeroOneIntConstructor(){
		StopWatch s = new StopWatch (0);
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Tests one int constructor with positive millisec
	@Test
	public void testOneIntConstructor(){
		StopWatch s = new StopWatch (300);
		assertEquals(s.toString(),"0:00:300");
	}
	
	//Tests one int constructor with negative millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeOneIntConstructor(){
		new StopWatch(-1);
	}
	
	//Tests one int constructor with 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxOneIntConstructor(){
		new StopWatch(1000);
	}
	
	//Tests one int constructor with 999 millisec
	@Test
	public void testAllowedMaxOneIntConstructor(){
		StopWatch s = new StopWatch (999);
		assertEquals(s.toString(),"0:00:999");
	}
	
	//Test String constructor with 0's
	@Test
	public void testStringZeroThreeValueConstructor(){
		StopWatch s = new StopWatch ("0:00:000");
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Test String constructor with positive values
	@Test
    public void testStringThreeValueConstructor(){
		StopWatch s = new StopWatch ("45:37:520");
		assertEquals(s.toString(),"45:37:520");
	}
	
	//Test String constructor with 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxMilStringThreeValueConstructor(){
		new StopWatch ("0:00:1000");
	}
	
	//Test String constructor with 999 millisec
	@Test
	public void testAllowedMaxMilStringThreeValueConstructor(){
		StopWatch s = new StopWatch ("0:00:999");
		assertEquals(s.toString(),"0:00:999");
	}
	
	//Test String constructor with 60 seconds
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSecStringThreeValueConstructor(){
		new StopWatch ("0:60:000");
	}
	
	//Test String constructor with 60 seconds and 1000 milli
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSecAndMilStringThreeValueConstructor(){
		new StopWatch ("0:60:1000");
	}
	
	//Test String constructor with 59 seconds
	@Test
	public void testAllowedMaxSecStringThreeValueConstructor(){
		StopWatch s = new StopWatch ("0:59:000");
		assertEquals(s.toString(),"0:59:000");
	}
	
	//Test String constructor with negative minutes
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinStringThreeValueConstructor(){
		new StopWatch ("-1:00:000");
		
	}
	
	//Test String constructor with negative seconds
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecStringThreeValueConstructor(){
		new StopWatch ("0:-1:000");
		
	}
	
	//Test String constructor with negative millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMilStringThreeValueConstructor(){
		new StopWatch ("0:00:-1");
		
	}
	
	//Test String constructor with neg. min., neg. sec., neg. millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinSecMilStringThreeValueConstructor(){
		new StopWatch ("-1:-1:-1");
		
	}
	
	//Test String constructor with neg. sec., neg. millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecMilStringThreeValueConstructor(){
		new StopWatch ("0:-1:-1");
		
	}
	
	//Test String constructor with neg. min, neg. sec.
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinSecStringThreeValueConstructor(){
		new StopWatch ("-1:-1:0");
	}
	
	//Test String constructor with neg. min, neg. mil.
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMinMilStringThreeValueConstructor(){
		new StopWatch ("-1:0:-1");
	}
	
	//Test String constructor with 0 min and 0 sec
	@Test
	public void testZeroTwoValueStringConstructor(){
		StopWatch s = new StopWatch ("0:0");
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Test String constructor with positive min and sec
	@Test
	public void testTwoValueStringConstructor(){
		StopWatch s = new StopWatch ("37:150");
		assertEquals(s.toString(),"0:37:150");
		
	}
	
	//Test String constructor with neg min and 0 sec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecStringTwoValueConstructor(){
		new StopWatch ("-1:0");
		
	}
	
	//Test String constructor with 0 min and neg sec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMilStringTwoValueConstructor(){
		new StopWatch ("0:-1");
		
	}
	
	//Test String constructor with neg min and neg sec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSecMilStringTwoValueConstructor(){
		new StopWatch ("-1:-1");
		
	}
	
	//Test String constructor with 60 min and 0 sec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSexStringTwoValueConstructor(){
		new StopWatch ("60:0");
		
	}
	
	//Test String constructor with 0 min and 1000 sec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxMilStringTwoValueConstructor(){
		new StopWatch ("0:1000");
		
	}
	
	//Test String constructor with 60 min and 1000 sec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSecMilStringTwoValueConstructor(){
		new StopWatch ("60:1000");
		
	}
	
	//Test String constructor with 59 min and 0 sec
	@Test
	public void testAllowedMaxSecStringTwoValueConstructor(){
		StopWatch s = new StopWatch ("59:0");
		assertEquals(s.toString(),"0:59:000");
		
	}
	
	//Test String constructor with 0 min and 999 sec
	@Test
	public void testAllowedMaxMilStringTwoValueConstructor(){
		StopWatch s = new StopWatch ("0:999");
		assertEquals(s.toString(),"0:00:999");
		
	}
	
	//Test String constructor with 59 min and 999 sec
	@Test
	public void testAllowedMaxSecMilStringTwoValueConstructor(){
		StopWatch s = new StopWatch ("59:999");
		assertEquals(s.toString(),"0:59:999");
		
	}
	
	//Test String constructor with 0 millisec
	@Test
	public void testMilStringOneValueConstructor(){
		StopWatch s = new StopWatch ("0");
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Test String constructor with positive millisec
	@Test
	public void testMilStringValueConstructor(){
		StopWatch s = new StopWatch ("500");
		assertEquals(s.toString(),"0:00:500");
	}
	
	//Test String constructor with neg millisec
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeMilStringOneValueConstructor(){
		new StopWatch ("-1");
		
	}
	
	//Test String constructor with 1000 millisec
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxMilStringOneValueConstructor(){
		new StopWatch ("1000");
		
	}
	
	//Test String constructor with 999 millisec
	@Test
	public void testAllowedMaxStringOneValueConstructor(){
		StopWatch s = new StopWatch ("999");
		assertEquals(s.toString(),"0:00:999");
	}
	
	@Test
	public void testSetMinutes(){
		StopWatch s = new StopWatch (0,0,0);
		s.setMinutes(10);
		assertEquals(s.toString(),"10:00:000");
		s.setMinutes(0);
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Test setMinutes with negative
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSetMinutes(){
		StopWatch s = new StopWatch (0,0,0);
		s.setMinutes(-1);
	}
	
	@Test
	public void testSetSeconds(){
		StopWatch w = new StopWatch();
		w.setSeconds(20);
		assertEquals(w.toString(),"0:20:000");
		w.setSeconds(0);
		assertEquals(w.toString(),"0:00:000");
	}
	
	//Test setSeconds with negative
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSetSeconds(){
		StopWatch s = new StopWatch();
		s.setSeconds(-1);
	}
	
	//Test setSeconds with 60 Seconds 
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSetSeconds(){
		StopWatch s = new StopWatch();
		s.setSeconds(60);
	}
	
	//Test setSeconds with 59 Seconds
	@Test
	public void testAllowedMaxSetSeconds(){
		StopWatch s = new StopWatch();
		s.setSeconds(59);
		assertEquals(s.toString(),"0:59:000");
	}
	
	@Test
	public void testSetMilliseconds(){
		StopWatch s = new StopWatch();
		s.setMilliseconds(200);
		assertEquals(s.toString(),"0:00:200");
		s.setMilliseconds(0);
		assertEquals(s.toString(),"0:00:000");
	}
	
	//Test setMilliseconds with 1000 Milliseconds
	@Test (expected = IllegalArgumentException.class)
	public void testOverMaxSetMilliseconds(){
		StopWatch c = new StopWatch();
		c.setMilliseconds(1000);
	}
	
	//Test setMilliseconds with 999 Milliseconds
	@Test 
	public void testAllowedMaxSetMilliseconds(){
		StopWatch d = new StopWatch();
		d.setMilliseconds(999);
		assertEquals(d.toString(),"0:00:999");
	}
	
	//Test setMilliseconds with a negative
	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSetMilliseconds(){
		StopWatch e = new StopWatch();
		e.setMilliseconds(-1);
	}
	
	//Adds 1 millisecond to 999 milliseconds
	@Test
	public void testMiltoSecAddMillMethod () {
	StopWatch a = new StopWatch (0,0,999);
	a.add(1);
	assertEquals(a.toString(), "0:01:000");
	}
	
	//Adds 1000 millisecond to 59 seconds
	@Test
	public void testSectoMinAddMillMethod () {
		StopWatch s = new StopWatch (0,59,0);
		s.add(1000);
		assertEquals(s.toString(), "1:00:000");
	}
	
	//Adds 1000 millisecond to 59 seconds
		@Test
		public void AddMillMakeOneMinMethod() {
			StopWatch b = new StopWatch (0,0,0);
			b.add(60000);
			assertEquals(b.toString(), "1:00:000");
		}
		
	@Test
	public void testAddMethod () {
		StopWatch s1 = new StopWatch (5,59,300);
		s1.add(2000);
		assertEquals (s1.toString(),"6:01:300");
		
		s1 = new StopWatch (5,59,300);
		StopWatch s2 = new StopWatch (2,2,300);
		s1.add(s2);
		System.out.println (s1);
		assertEquals (s1.toString(),"8:01:600");
	
		for (int i = 0; i < 15000; i++)
			s1.inc();
			System.out.println (s1);
		assertEquals (s1.toString(),"8:16:600");
	}	
	
	//Adds Object s2(1 millsec) to s1(999 millsec)
	@Test
	public void testAddStopWatchOneSecMethod () {
		StopWatch s1 = new StopWatch(0,0,999);
		StopWatch s2 = new StopWatch(0,0,1);
		s1.add(s2);
		assertEquals(s1.toString(), "0:01:000");
	}
	
	//Increase s2 to Min by adding s1
	@Test
	public void testAddStopWatchIncOneMinMethod () {
		StopWatch s1 = new StopWatch(0,59,0);
		StopWatch s2 = new StopWatch(0,1,0);
		s2.add(s1);
		assertEquals(s2.toString(), "1:00:000");
	}
	
	//Increase s2 to Min by adding s1
	@Test
	public void testAddStopWatchIncAddMinMethod () {
			StopWatch z = new StopWatch(10,0,0);
			StopWatch x = new StopWatch(20,0,0);
			z.add(x);
			assertEquals(z.toString(), "30:00:000");
		}
		
	//Increases s by 999 millisec
	
	@Test
	public void testAddMillIncMethod () {
		StopWatch t  = new StopWatch();
		
		for(int i = 0; i < 999; i++)
		{
			t.inc();
			
		}
		assertEquals(t.toString(), "0:00:999");
	}
	
	//Increases s by 1 sec
	@Test
	public void testAddSecIncMethod () {
		StopWatch s1  = new StopWatch();
			
		for(int i = 0; i < 1000; i++)
		{
			s1.inc();
				
		}
			
		assertEquals(s1.toString(), "0:01:000");
		
	}
	
		
	//Increases s1 to 1 Min
	@Test
	public void testAddMinIncMethod () {
		StopWatch s1  = new StopWatch();
		for(int i = 0; i < 60000; i++)
		{
			s1.inc();
			
		}
		
		assertEquals(s1.toString(), "1:00:000");
	}
	
	@Test
	public void testAddFifyNineSecIncMethod () {
		StopWatch s  = new StopWatch();
		for(int i = 0; i < 59000; i++)
		{
			s.inc();
			
		}
		
		assertEquals(s.toString(), "0:59:000");
	}
	
	
	@Test 
	public void testEqualWithEqualCase () {
		StopWatch s1 = new StopWatch (5,59,300);
		StopWatch s4 = new StopWatch (5,59,300);

		assertTrue (s1.equals(s4));
		assertTrue (s4.equals(s1));

	}
	
	//Test Objects with Different Mins but everything else being equal
	@Test 
	public void testEqualTestMins() {
	StopWatch s5 = new StopWatch (0,0,0);
	StopWatch s6 = new StopWatch (1,0,0);
	assertFalse(s5.equals(s6));
	assertFalse(s6.equals(s5));
	}
	
	//Test Objects with Different Sec everything else being equal
	@Test 
	public void testEqualTestSec() {
		StopWatch s7 = new StopWatch (5,47,300);
		StopWatch s8 = new StopWatch (5,49,300);
		assertFalse(s7.equals(s8));
		assertFalse(s8.equals(s7));
	}
	
	//Test Objects with Different Mill everything else being equal
	@Test 
	public void testEqualTestMil() {
		StopWatch s9 = new StopWatch (5,59,417);
		StopWatch s10 = new StopWatch (5,59,624);
		assertFalse(s9.equals(s10));
		assertFalse(s10.equals(s9));
	}
	
	@Test 
	public void testCompareToEqualCase () {
		StopWatch s1 = new StopWatch (5,59,300);
		StopWatch s4 = new StopWatch (5,59,300);

		assertTrue (s1.compareTo(s4) == 0);
		
	}	
	
	//Test compare different Min everything else being equal
	@Test 
	public void testCompareToMin () {
		StopWatch s11 = new StopWatch (6,0,0);
		StopWatch s12 = new StopWatch (5,0,0);
		assertTrue (s11.compareTo(s12) > 0);
		assertTrue (s12.compareTo(s11) < 0);
	}
	
	//Test compare different Sec everything else being equal
	@Test 
	public void testCompareToSec () {
		StopWatch s11 = new StopWatch (0,59,999);
		StopWatch s12 = new StopWatch (0,58,999);
		assertTrue (s11.compareTo(s12) > 0);
		assertTrue (s12.compareTo(s11) < 0);
	}
		
	
	//Test compare different Min everything else being equal
	@Test 
	public void testObjectEqualMin () {
		Object s13 = new StopWatch (6,0,0);
		StopWatch s14 = new StopWatch (5,0,0);
		assertFalse(s14.equals(s13));
		assertFalse(s13.equals(s14));
		
	}
	
	//Test compare different Sec everything else being equal
	@Test 
	public void testObjectEqualSec () {
		Object s15 = new StopWatch (0,59,999);
		StopWatch s16 = new StopWatch (0,58,999);
		assertFalse(s16.equals(s15));
		assertFalse(s15.equals(s16));
	}
		
	//Test compare different Mil everything else being equal
	@Test 
	public void testObjectEqualMil () {
		Object s17 = new StopWatch (0,59,999);
		StopWatch s18 = new StopWatch (0,59,998);
		assertFalse(s18.equals(s17));
		assertFalse(s17.equals(s18));
	}
		
	//Test equal case
	@Test 
	public void testObjectEqual () {
		Object s19 = new StopWatch (0,59,999);
		StopWatch s20 = new StopWatch (0,59,999);
		assertTrue(s20.equals(s19));
		assertTrue(s19.equals(s20));
		
	}
	

	@Test 
	public void testLoadSave () {
		StopWatch s1 = new StopWatch (5,59,300);
		StopWatch s2 = new StopWatch (5,59,300);

		s1.save("file1");
		s1 = new StopWatch ();  // resets to zero
		s1.load("file1");
		assertTrue (s1.equals(s2));

	}
		
	//Trys to add millisec while mutate is false
	@Test 
	public void testMutateAddMil () {
		StopWatch w = new StopWatch (5,59,300);
		StopWatch v = new StopWatch (5,59,300);
		
		StopWatch.setMutate(false);
		w.add(1000);
		assertTrue (w.equals(v));
		StopWatch.setMutate(true);
		}
	
	//Trys to set min while mutate is false
		@Test 
		public void testMutateSetMin () {
			StopWatch w = new StopWatch (5,59,300);
			StopWatch v = new StopWatch (5,59,300);
			
			StopWatch.setMutate(false);
			w.setMinutes(55);
			assertTrue (w.equals(v));
			StopWatch.setMutate(true);
			}
		
		//Trys to set sec while mutate is false
		@Test 
		public void testMutateSetSec () {
			StopWatch w = new StopWatch (5,59,300);
			StopWatch v = new StopWatch (5,59,300);
			
			StopWatch.setMutate(false);
			w.setSeconds(40);
			assertTrue (w.equals(v));
			StopWatch.setMutate(true);
			}
		
		//Trys to set millisec while mutate is false
		@Test 
		public void testMutateSetMil () {
			StopWatch w = new StopWatch (5,59,300);
			StopWatch v = new StopWatch (5,59,300);
					
			StopWatch.setMutate(false);
			w.setMilliseconds(500);
			assertTrue (w.equals(v));
			StopWatch.setMutate(true);
		}
		
		//Trys to add two StopWatch objects mutate is false
		@Test 
		public void testMutateAddStopWatch () {
			StopWatch w = new StopWatch (5,59,300);
			StopWatch v = new StopWatch (5,59,300);
					
			StopWatch.setMutate(false);
			w.add(v);
			assertTrue (w.equals(v));
			StopWatch.setMutate(true);
		}
		
		//Trys to use Increment method mutate is false
		@Test 
		public void testMutateInc () {
			StopWatch w = new StopWatch (5,59,300);
			StopWatch v = new StopWatch (5,59,300);
					
			StopWatch.setMutate(false);
			w.inc();
			assertTrue (w.equals(v));
			StopWatch.setMutate(true);
		}
}
