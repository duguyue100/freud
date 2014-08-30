package freud.agent;

import java.util.LinkedList;

public class PsychotherapistGroup {
	private LinkedList<PsychotherapistVisitorGroup> therapistGroup;
	
	public PsychotherapistGroup()
	{
		
	}
	
	public PsychotherapistGroup(PsychotherapistVisitorGroup therapistVisitorGroup)
	{
		addTherapistVisitorGroup(therapistVisitorGroup);
	}
	
	public PsychotherapistGroup(LinkedList<PsychotherapistVisitorGroup> therapistGroupNew)
	{
		setTherapistGroup(therapistGroupNew);
	}
	
	/** Setter and getter **/
	
	public void setTherapistGroup(LinkedList<PsychotherapistVisitorGroup> therapistGroupNew)
	{
		for (int i=0; i<therapistGroupNew.size();i++)
		{
			addTherapistVisitorGroup(therapistGroupNew.get(i));
		}
	}
	
	public LinkedList<PsychotherapistVisitorGroup> getTherapistGroup()
	{
		return this.therapistGroup;
	}
	
	public void addTherapistVisitorGroup(PsychotherapistVisitorGroup therapistVisitorGroup)
	{
		if (checkIntegrity(therapistVisitorGroup))
			this.therapistGroup.add(therapistVisitorGroup);
	}
	
	// supporting function
	
	public boolean checkIntegrity(PsychotherapistVisitorGroup therapistVisitorGroup)
	{
		// cannot have same therapist in the list
		for (int i=0;i<this.therapistGroup.size();i++)
			if (therapistVisitorGroup.getTherapist().getTherapistId().equals(this.therapistGroup.get(i).getTherapist().getTherapistId()))
				return false;
		
		return true;
	}
}
