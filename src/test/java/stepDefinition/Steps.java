package stepDefinition;

import java.util.List;
import java.util.Map;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.ScenarioImpl;

public class Steps {

	
	
	
	@Given("^Open the Browser and launch the application$")
	public void open_the_Browser_and_launch_the_application()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step for :- Open the Browser and launch the application");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//utils.OpenGooleApplication();
	}
	
	
	
	@Given("^Open the Browser and launch the application and enter details1$")
	public void openAppAndEnterDetails(DataTable dt)  {
		Map<String, String> myMap = dt.asMap(String.class, String.class);
		System.out.println("This is exmaple of asMap");
		
		for(Map.Entry<String, String> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " ===" + entry.getValue());
		}
	}
	
	@Given("^Open the Browser and launch the application and enter details2$")
	public void openAppAndEnterDetails1(DataTable dt)  {
		List<Map<String, String>> lst = dt.asMaps(String.class, String.class);
		
			for(int i=0; i<=lst.size()-1; i++) {
				Map<String, String> myMap = lst.get(i) ;
				System.out.println("-------------" + i);
				System.out.println(myMap.get("id"));
				System.out.println(myMap.get("firstName"));
				System.out.println(myMap.get("lastName"));
				System.out.println(myMap.get("dateOfBirth"));
		}
		
	}
	

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password()  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step for :- Enter the Username and Password");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step for :- Reset the credential");
		Assert.assertTrue("verification of Credential ", true);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^Verify the credential$")
	public void verify_the_credential() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step for :- Reset the credential");
		Assert.assertTrue("verification of Credential ", false);
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@And("^Logout the application$")
	public static void logoutApplication() {
		//utils.logoutApplication();
	}
	
	
}
