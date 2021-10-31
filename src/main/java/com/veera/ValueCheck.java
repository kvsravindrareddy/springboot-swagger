package com.veera;

public class ValueCheck {
	public String response(String value)
	{
		String response = null;
		
		if(null==value)
		{
			throw new NullPointerException("Value is Null");
		}
		return response;
	}

}
