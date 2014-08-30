package freud.agent;

import java.util.LinkedList;

public class PsychotherapistVisitorGroup {
	private Psychotherapist therapist;
	private LinkedList<Visitor> visitorList;
	private boolean hasTherapist;
	
	public PsychotherapistVisitorGroup()
	{
		hasTherapist=false;
	}
	
	public PsychotherapistVisitorGroup(Psychotherapist therapistNew)
	{
		setTherapist(therapistNew);
		this.hasTherapist=true;
	}
	
	public PsychotherapistVisitorGroup(Psychotherapist therapistNew, LinkedList<Visitor> visitorListNew)
	{
		setTherapist(therapistNew);
		setVisitorList(visitorListNew);
		this.hasTherapist=true;
	}
	
	/** Setter and getter **/
	
	public void setTherapist(Psychotherapist therapistNew)
	{
		if (therapistNew.getTherapistId()!=null && !this.hasTherapist)
		{
			this.therapist=therapistNew;
			this.hasTherapist=true;
		}
	}
	
	public Psychotherapist getTherapist()
	{
		return this.therapist;
	}
	
	public void setVisitorList(LinkedList<Visitor> visitorListNew)
	{
		for (int i=0;i<visitorListNew.size();i++)
			addVisitor(visitorListNew.get(i));
	}
	
	public LinkedList<Visitor> getVisitorList()
	{
		return this.visitorList;
	}
	
	public void addVisitor(Visitor visitor)
	{
		if (checkIntegrity(visitor))
			this.visitorList.add(visitor);
	}
	
	// supporting functions;
	
	private boolean checkIntegrity(Visitor visitor)
	{	
		String[] visitorID=visitor.getAgentId().split("--");
		String[] therapistID=this.therapist.getTherapistId().split("--");
		if (visitorID[visitorID.length-1]!=therapistID[therapistID.length-1])
			return false;
		
		for (int i=0;i<this.visitorList.size();i++)
			if (visitor.getVisitorId().equals(this.visitorList.get(i).getVisitorId()))
				return false;
		
		return true;
	}
}
