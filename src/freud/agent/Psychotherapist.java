package freud.agent;

public class Psychotherapist extends GeneralAgent {
	/*
	 * TODO:
	 * 1. Collect other fields needed in this class
	 * 2. Define appropriate coding for gender
	 * 
	 */
	
	public Psychotherapist()
	{
		super();
	}
	
	public Psychotherapist(String therapistId, String therapistLastName, String therapistFirstName, byte therapistAge, byte therapistGender)
	{
		super(therapistId, therapistLastName, therapistFirstName, therapistAge, therapistGender);
	}
	
	/** Setter and Getter **/
	
	// Id
	
	public void setTherapistId(String therapistId)
	{
		super.setAgentId(therapistId);
	}
	
	public String getTherapistId()
	{
		return super.getAgentId();
	}
	
	// Name
	
	public void setTherapistLastName(String therapistLastName)
	{
		super.setAgentLastName(therapistLastName);
	}
	
	public String getTherapistLastName()
	{
		return super.getAgentLastName();
	}
	
	public void setTherapistFirstName(String therapistFirstName)
	{
		super.setAgentFirstName(therapistFirstName);
	}
	
	public String getTherapistFirstName()
	{
		return super.getAgentFirstName();
	}
	
	public void setTherapistName()
	{
		super.setAgentName();
	}
	
	public String getTherapistName()
	{
		return super.getAgentName();
	}
	
	// Age
	public void setTherapistAge(byte therapistAge)
	{
		super.setAgentAge(therapistAge);
	}
	
	public byte getTherapistAge()
	{
		return super.getAgentAge();
	}
	
	// Gender
	
	public void setTherapistGender(byte therapistGender)
	{
		super.setAgentGender(therapistGender);
	}
	
	public byte getTherapistGender()
	{
		return super.getAgentGender();
	}
	
	// supporting functions
	
	public String formatTherapistTextMode()
	{
		return super.formatTextMode();
	}
	
	public String formatTherapistXMLMode()
	{
		return super.formatXMLMode();
	}
	
}
