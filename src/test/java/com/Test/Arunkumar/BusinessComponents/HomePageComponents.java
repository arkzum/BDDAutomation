package com.Test.Arunkumar.BusinessComponents;
import com.Test.Arunkumar.Framework.FrameworkUtils;
import com.Test.Arunkumar.Framework.Settings;
import com.Test.Arunkumar.PageActions.HomePageActions;
import org.openqa.selenium.By;

import java.util.Properties;

public class HomePageComponents extends FrameworkUtils {
	private static Properties globalProperties = Settings.getInstance();
	HomePageActions login= new HomePageActions();

	/*    Function to launch the application
        @param : application name
	 */

	public void launchApplication(String application){

		String url = null;
		if (application.equalsIgnoreCase("StoreFrontUrl"))
			url = globalProperties.getProperty(application);
		else
			addStepError("Application URL is not defined");
		driver.get(url);
		waitForPageLoad(20);
		addStepLog(" Application Launched : " +url);
	}

	/*    Function to login to the application
        @param : String userName and password
	 */

	public void login(String userName,String password){

		login.navigateToLogin();
		login.enterUser(userName);
		login.enterPassword(password);
		login.clickSubmit();
		waitForPageLoad(20);

	}

}
