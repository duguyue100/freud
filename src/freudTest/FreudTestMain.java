package freudTest;

import freud.agent.*;
import freud.metrics.*;

public class FreudTestMain {
	public static void main(String[] args)
	{
		Visitor v1=new Visitor();
		System.out.println(v1.getVisitorName());
		
		
		int[] value={1,2};
		String[] option={"A", "B"};
		Question q=new Question("q1", option, value);
		
		System.out.println("hello");
	}
}
