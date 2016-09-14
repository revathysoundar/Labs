package baseball;
//import java.util.ArrayList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;

public class BatterTest {
	
	@Test
	public void whenAtBats0_1(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(0,1));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("0.500",average);
		Assert.assertEquals("0.500",percent);
	}
	
	@Test
    public void whenAtBats0_0(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(0,0));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("0.000",percent);
		Assert.assertEquals("0.000",average);
	}
	
	@Test
    public void whenAtBats0_4_4(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(4,4,4));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("4.000",percent);
		Assert.assertEquals("1.000",average);
	}
	
	@Test
    public void whenAtBats0_1_2(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(0,1,2));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("1.000",percent);
		Assert.assertEquals("0.667",average);
	}
	
	@Test
    public void whenAtBats0_0_3_0(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(0,0,3,0));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("0.750",percent);
		Assert.assertEquals("0.250",average);
	}
	
	@Test
    public void whenAtBats2_2_1_4(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(2,2,1,4));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("2.250",percent);
		Assert.assertEquals("1.000",average);
	}
	
	@Test
    public void whenAtBats0_1_4_0_2_1_3_0_0(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(0,1,4,0,2,1,3,0,0));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("1.222",percent);
		Assert.assertEquals("0.556",average);
	}
	
	@Test
    public void whenAtBats0(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(0));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("0.000",percent);
		Assert.assertEquals("0.000",average);
	}
	
	@Test
    public void whenAtBats3(){
		
		BatterClass batter = new BatterClass("Test");
		ArrayList<Integer> listOfAtBats = new ArrayList<> (Arrays.asList(3));
		batter.setListOfAtBats(listOfAtBats);
		String average=batter.getFormattedAverage();
		String percent=batter.getFormattedSlugPercent();
		Assert.assertEquals("3.000",percent);
		Assert.assertEquals("1.000",average);
	}
	
	
	
	

}
