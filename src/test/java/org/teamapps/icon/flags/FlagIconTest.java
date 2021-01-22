package org.teamapps.icon.flags;

import junit.framework.TestCase;
import org.junit.Assert;

public class FlagIconTest extends TestCase {

	public void testGetByCountryCode() {
		Assert.assertEquals(FlagIcon.GB_ENG, FlagIcon.getByCountryCode("gb-eng"));
	}
}