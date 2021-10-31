package com.veera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValueCheckTest {

	@Test
	public void testStringValue()
	{
		ValueCheck valueCheck = new ValueCheck();
		//valueCheck.response(null);
		Assertions.assertThrows(NullPointerException.class, () -> {
			valueCheck.response(null);
		  });
	}
}
