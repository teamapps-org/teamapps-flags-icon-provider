package org.teamapps.icon.flags;

import org.junit.Assert;
import org.junit.Test;

public class FlagIconTest {

	@Test
	public void testGetByCountryCode() {
		Assert.assertEquals(FlagIcon.GB_ENG, FlagIcon.getByCountryCode("gb-eng"));
	}

	@Test
	public void getCountryCode() throws Exception {
		Assert.assertEquals("gb-eng", FlagIcon.GB_ENG.getCountryCode());
		Assert.assertEquals("de", FlagIcon.DE_GERMANY.getCountryCode());
	}

	@Test
	public void getConstantName() throws Exception {
		Assert.assertEquals("DE_GERMANY", FlagIcon.DE_GERMANY.getConstantName());
	}


}