package freud.agent;

/**
 ** This class provides a general description of 
 ** human agent
 **
 */
public class GeneralAgent {
	private String id;
	private String name;
	private String firstName;
	private String lastName;
	private byte age;
	private byte gender; // 0 = female, 1 = male
	
	/*
	 * TODO:
	 * 1. Collect other fields needed in this class
	 * 2. Define appropriate coding for gender
	 * 
	 */
	
	GeneralAgent()
	{
		this.firstName="John";
		this.lastName="Doe";
		this.setAgentName();
		
		this.age=20;
		this.gender=1;
	}
	
	GeneralAgent(String agentId, String agentLastName, String agentFirstName, byte agentAge, byte agentGender)
	{
		this.id=agentId;
		this.lastName=agentLastName;
		this.firstName=agentFirstName;
		this.setAgentName();
		
		this.age=agentAge;
		this.gender=agentGender;
	}
	
	/** Setter and Getter **/
	
	// Id
	
	void setAgentId(String agentId)
	{
		this.id=agentId;
	}
	
	String getAgentId()
	{
		return this.id;
	}
	
	// Name
	
	void setAgentLastName(String agentLastName)
	{
		this.lastName=agentLastName;
	}
	
	String getAgentLastName()
	{
		return this.lastName;
	}
	
	void setAgentFirstName(String agentFirstName)
	{
		this.firstName=agentFirstName;
	}
	
	String getAgentFirstName()
	{
		return this.firstName;
	}
	
	void setAgentName()
	{
		this.name=this.lastName+", "+this.firstName;
	}
	
	String getAgentName()
	{
		return this.name;
	}
	
	// Age
	void setAgentAge(byte agentAge)
	{
		this.age=agentAge;
	}
	
	byte getAgentAge()
	{
		return this.age;
	}
	
	// Gender
	
	void setAgentGender(byte agentGender)
	{
		this.gender=agentGender;
	}
	
	byte getAgentGender()
	{
		return this.gender;
	}
	
	// supporting functions
	
	String formatTextMode()
	{
		return this.id+"\n"+
			   this.lastName+"\n"+
			   this.firstName+"\n"+
			   Byte.toString(this.age)+"\n"+
			   Byte.toString(this.gender)+"\n";
	}
	
	String formatXMLMode()
	{
		return "empty";
	}

}
