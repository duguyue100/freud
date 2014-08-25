package freud.metrics;

public class Question {
	private String content;
	private String[] option;
	private int[] value;
	
	public Question(String questionContent, String[] questionOption, int[] questionValue)
	{
		if (this.checkMatch(questionOption, questionValue))
		{
			this.content=questionContent;
			this.option=questionOption;
			this.value=questionValue;
		}
		else
		{
			System.err.println("Number of options and values are not matched, please change the settings of the question.");
			System.exit(1);
		}
	}
	
	/** Setter and Getter **/
	
	// content
	public void setQuestionContent(String questionContent)
	{
		this.content=questionContent;
	}
	
	public String getQuestionContent()
	{
		return this.content;
	}
	
	// option
	public void setQuestionOption(String[] questionOption)
	{
		this.option=questionOption;
	}
	
	public String[] getQuestionOption()
	{
		return this.option;
	}
	
	// value
	public void setQuestionValue(int[] questionValue)
	{
		this.value=questionValue;
	}
	
	public int[] getQuestionValue()
	{
		return this.value;
	}
	
	// supporting functions
	
	boolean checkMatch(String[] questionOption, int[] questionValue)
	{
		if (questionOption.length==questionValue.length)
			return true;
		else return false;
	}
}
