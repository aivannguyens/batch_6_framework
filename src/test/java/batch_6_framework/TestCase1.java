package batch_6_framework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import projectData.BoraTech_TestData;
import utilityLibrary.BasePage;

public class TestCase1 extends BasePage {

	public static void main(String[] args) {
 System.out.println();
		startTest();

		home.clickOnLoginButton();

		// enter userName / Password
//		login.login(BoraTech_TestData.userName_testAccount, BoraTech_TestData.password_testAccount);

		// Add Experience
		dashboard.clickAddExpirenceButton();

		// Experience Page
		expirence.addExpirence();

		dashboard.clickAddEducation();

		// add Education Page
		edu.addEducation();

		endTest();
	}

	@Test
	public void firstTest() {

		home.clickOnLoginButton();

		// enter userName / Password
		login.login(BoraTech_TestData.userName_testAccount, BoraTech_TestData.password_testAccount);

		// Add Experience
		dashboard.clickAddExpirenceButton();

		// Experience Page
		expirence.addExpirence();

		dashboard.clickAddEducation();

		// add Education Page
		edu.addEducation();

	}

}
