package Hw09;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Log {

	public static void main(String[] args) throws Exception {
		int i=8;
		double r=Math.log(i);
		
		System.out.println("log("+i+")은 "+r+"입니다.");
		System.out.format("%+020.10f%n", r);
		System.out.format("%+020.10f%n", r);
		System.out.format("%+017.20f", r);
		BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream("data.bin")));
	}

}
