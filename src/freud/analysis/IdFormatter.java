package freud.analysis;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IdFormatter {
	
	private final int QUEUE_LIMIT=5;
	
	
	public String getAgentId(int queue)
	{
		return getMac()+"--"+formAgentSubId(queue);
	}
	
	public String getPsychotherapistId(int queue)
	{
		return getMac()+"--"+formPsychotherapistSubId(queue);
	}
	
	public String getVisitorId(int therapistId, int visitorId)
	{
		return getMac()+"--"+formVisitorSubId(therapistId, visitorId);
	}
	
	// get MAC address
	private String getMac()
	{
		String mac="";
		
		InetAddress ip;
		try{
			ip=InetAddress.getLocalHost();
			NetworkInterface network=NetworkInterface.getByInetAddress(ip);
			byte[] mac_add=network.getHardwareAddress();
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac_add.length; i++) {
				sb.append(String.format("%02X%s", mac_add[i], (i < mac_add.length - 1) ? "-" : ""));		
			}
			
			mac=sb.toString();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return mac;
	}
	
	private String formSubId(int queue)
	{
		String subId=Integer.toString(queue);
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		Date date = new Date();

		
		if (subId.length()>QUEUE_LIMIT)
		{
			System.err.println("Id out of bound");
		}
		else
		{
			subId="00000"+subId;
			subId=subId.substring(subId.length()-QUEUE_LIMIT);
		}
		
		subId=dateFormat.format(date)+"--"+subId;
		
		return subId;
	}
	
	private String formAgentSubId(int queue)
	{
		return "A"+formSubId(queue);
	}
	
	private String formPsychotherapistSubId(int queue)
	{	
		return "PSY"+formSubId(queue);
	}
	
	private String formVisitorSubId(int therapistQueue, int visitorQueue)
	{
		return "V"+formSubId(visitorQueue)+"--"+formPsychotherapistSubId(therapistQueue);
	}
	
}
