package freud.metrics;

import java.util.LinkedList;


public class Questionnaire {
	private LinkedList<Question> qList;
	
	public Questionnaire()
	{
		qList=new LinkedList<Question>();
	}
	
	public Questionnaire(LinkedList<Question> questionList)
	{
		this.qList=questionList;
	}
	
	/** Setter and Getter **/
	
	// set or get questionnaire
	public void setQuestionnaire(LinkedList<Question> questionList)
	{
		this.qList=questionList;
	}
	
	public LinkedList<Question> getQuestionnaire()
	{
		return this.qList;
	}
	
	
	// add question
	public void setQuestionLast(Question q)
	{
		this.qList.add(q);
	}
	
	public Question getQuestionLast()
	{
		return this.qList.getLast();
	}
	
	public void setQuestionFirst(Question q)
	{
		this.qList.addFirst(q);
	}
	
	public Question getQuestionFirst()
	{
		return this.qList.getFirst();
	}
	
	public void setQuestion(Question q, int index)
	{
		this.qList.add(index, q);
	}
	
	public Question getQuestion(int index)
	{
		return this.qList.get(index);
	}
	
	
}
