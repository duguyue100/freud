package freud.agent;

public class Visitor extends GeneralAgent {
	
	/*
	 * TODO:
	 * 1. Collect other fields needed in this class
	 * 2. Define appropriate coding for gender
	 * 3. Define coding for agentId 
	 * 
	 */
	
	public Visitor()
	{
		super();
	}
	
	public Visitor(String visitorId, String visitorLastName, String visitorFirstName, byte visitorAge, byte visitorGender)
	{
		super(visitorId, visitorLastName, visitorFirstName, visitorAge, visitorGender);
	}
	
	/** Setter and Getter **/
	
	// Id
	
	public void setVisitorId(String visitorId)
	{
		super.setAgentId(visitorId);
	}
	
	public String getVisitorId()
	{
		return super.getAgentId();
	}
	
	// Name
	
	public void setVisitorLastName(String visitorLastName)
	{
		super.setAgentLastName(visitorLastName);
	}
	
	public String getVisitorLastName()
	{
		return super.getAgentLastName();
	}
	
	public void setVisitorFirstName(String visitorFirstName)
	{
		super.setAgentFirstName(visitorFirstName);
	}
	
	public String getVisitorFirstName()
	{
		return super.getAgentFirstName();
	}
	
	public void setVisitorName()
	{
		super.setAgentName();
	}
	
	public String getVisitorName()
	{
		return super.getAgentName();
	}
	
	// Age
	public void setVisitorAge(byte visitorAge)
	{
		super.setAgentAge(visitorAge);
	}
	
	public byte getVisitorAge()
	{
		return super.getAgentAge();
	}
	
	// Gender
	
	public void setVisitorGender(byte visitorGender)
	{
		super.setAgentGender(visitorGender);
	}
	
	public byte getVisitorGender()
	{
		return super.getAgentGender();
	}
	
	// Supporting functions
	
	public String formatVisitorTextMode()
	{
		return super.formatTextMode();
	}
	
	public String formatVisitorXMLMode()
	{
		return super.formatXMLMode();
	}
}
