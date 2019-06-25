/* Z60_Touch_011Test.java

	Purpose:
		
	Description:
		
	History:
		Tue Apr 23 18:20:00 CST 2019, Created by rudyhuang

Copyright (C) 2019 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.zktest.zats.test2;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.touch.TouchActions;

import org.zkoss.zktest.zats.WebDriverTestCase;

/**
 * @author rudyhuang
 */
public class Z60_Touch_011Test extends WebDriverTestCase {
	@Override
	protected ChromeOptions getWebDriverOptions() {
		return super.getWebDriverOptions()
				.setExperimentalOption("mobileEmulation", Collections.singletonMap("deviceName", "iPad"));
	}

	@Test
	public void test() {
		connect();

		TouchActions touchActions = new TouchActions(driver);
		touchActions.scroll(toElement(jq("@listbox")), 0 , 3000).perform();
		waitResponse();
		touchActions.scroll(toElement(jq("@grid")), 0 , 3000).perform();
		waitResponse();
		Assert.assertNotEquals(0, jq("@listbox .z-listbox-body").scrollTop());
		Assert.assertNotEquals(0, jq("@grid .z-grid-body").scrollTop());
	}
}
