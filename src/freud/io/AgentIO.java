package freud.io;

import java.io.File;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

import freud.agent.Psychotherapist;
import freud.agent.Visitor;

public class AgentIO {
	
	final String dataPath="data";
	final String visitorPath="data/visitor/";
	final String therapistPath="data/therapist/";
	
	public AgentIO()
	{
		File visitorDir=new File(visitorPath);
		try{
			if (!visitorDir.exists())
			{
				visitorDir.mkdirs();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		File therapistDir=new File(therapistPath);
		
		try{
			if (!therapistDir.exists())
			{
				therapistDir.mkdirs();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	/** Load agent list **/
	public LinkedList<String> loadAgentList(String agentListFile)
	{
		Scanner agentListIn=null;
		
		try
		{
			agentListIn=new Scanner(new File(agentListFile));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		LinkedList<String> agentList=new LinkedList<String>();
		
		while (agentListIn.hasNextLine())
		{
			agentList.add(agentListIn.nextLine());
		}
		
		agentListIn.close();
		
		return agentList;
	}
	
	public LinkedList<String> loadPsychotherapistList(String therapistListFile)
	{
		return loadAgentList(therapistListFile);
	}
	
	public LinkedList<String> loadVisitorList(String visitorListFile)
	{
		return loadAgentList(visitorListFile);
	}
	
	
	/** Load agent **/
	
	public LinkedList<Visitor> loadVisitor(LinkedList<String> visitorList)
	{
		LinkedList<Visitor> visitors=new LinkedList<Visitor>();
		
		for (int i=0;i<visitorList.size();i++)
		{
			
			Scanner readVisitor=null;
			try
			{
				readVisitor=new Scanner(new File(visitorList.get(i)+".sf"));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			Visitor tempVisitor=new Visitor();
			
			tempVisitor.setVisitorId(readVisitor.nextLine());
			tempVisitor.setVisitorLastName(readVisitor.nextLine());
			tempVisitor.setVisitorFirstName(readVisitor.nextLine());
			tempVisitor.setVisitorAge(Byte.parseByte(readVisitor.nextLine()));
			tempVisitor.setVisitorGender(Byte.parseByte(readVisitor.nextLine()));
			
			visitors.add(tempVisitor);
		}
			
		return visitors;
	}
	
	public LinkedList<Psychotherapist> loadPsychotherapist(LinkedList<String> psychotherapistList)
	{
		LinkedList<Psychotherapist> therapists=new LinkedList<Psychotherapist>();
		
		for (int i=0;i<psychotherapistList.size();i++)
		{
			
			Scanner readVisitor=null;
			try
			{
				readVisitor=new Scanner(new File(psychotherapistList.get(i)+".sf"));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			Psychotherapist tempPsychotherapist=new Psychotherapist();
			
			tempPsychotherapist.setTherapistId(readVisitor.nextLine());
			tempPsychotherapist.setTherapistLastName(readVisitor.nextLine());
			tempPsychotherapist.setTherapistFirstName(readVisitor.nextLine());
			tempPsychotherapist.setTherapistAge(Byte.parseByte(readVisitor.nextLine()));
			tempPsychotherapist.setTherapistGender(Byte.parseByte(readVisitor.nextLine()));
			
			therapists.add(tempPsychotherapist);
		}
			
		return therapists;
	}
	
	/** Write agent to file **/
	
	private PrintWriter agentWriter(String agentFilePath)
	{
		PrintWriter printVisitor=null;
		
		try
		{
			printVisitor=new PrintWriter(new File(agentFilePath));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return printVisitor;
	}
	
	public void saveVisitor(Visitor visitor)
	{
		String visitorFilePath=visitorPath+visitor.getVisitorId()+".sf";
		
		PrintWriter printVisitor=agentWriter(visitorFilePath);
		
		printVisitor.print(visitor.formatVisitorTextMode());
		
		printVisitor.close();
	}
	
	public void savePsychotherapist(Psychotherapist therapist)
	{
		String therapistFilePath=visitorPath+therapist.getTherapistId()+".sf";
		
		PrintWriter printVisitor=agentWriter(therapistFilePath);
		
		printVisitor.print(therapist.formatTherapistTextMode());
		
		printVisitor.close();
	}
	
	
}
