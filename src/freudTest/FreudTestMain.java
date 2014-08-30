package freudTest;

import java.net.SocketException;

import freud.agent.*;
import freud.io.AgentIO;
import freud.metrics.*;
import freud.analysis.*;

public class FreudTestMain {
	public static void main(String[] args)
	{
		Visitor v1=new Visitor();
		System.out.println(v1.getVisitorName());
		
		
		int[] value={1,2};
		String[] option={"A", "B"};
		Question q=new Question("q1", option, value);
		
		System.out.println("hello");
		
		IdFormatter formatter=new IdFormatter();
		
		System.out.print(formatter.getVisitorId(123, 123));
		
		AgentIO agentIO=new AgentIO();
		
		agentIO.saveVisitor(v1);
		
	}
}
