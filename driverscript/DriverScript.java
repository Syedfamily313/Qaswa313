package com.sgtesting.tests.driverscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
	features="src\\test\\resource\\FeatureFile",
	glue="com.sgtesting.tests.stepdifinition",
	tags="@DumBeryani"
		)
public class DriverScript {

	private TestNGCucumberRunner testngCucumberRunner=null;
	
	@BeforeClass
	public void setUpClass()
	{
		testngCucumberRunner=new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature)
	{
		testngCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}
	@DataProvider
	public Object[][] features()
	{
		if(testngCucumberRunner==null)
		{
			testngCucumberRunner=new TestNGCucumberRunner(this.getClass());
		}
		return testngCucumberRunner.provideFeatures();
	}
	@AfterClass
	public void tearDownClass()
	{
		testngCucumberRunner.finish();
	}
}
