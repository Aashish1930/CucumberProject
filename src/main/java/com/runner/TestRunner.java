package com.runner;
import java.io.File;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import com.util.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "C:\\New folder (2)\\Selenium Project\\CucumberWithPOM\\src\\main\\java\\com\\feature",
		// the path of the feature files
		glue = {"com\\stepdefination" }, // the path of the step definition files
		//format = { "pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" },
		// to generate different types of reporting
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		monochrome = true, // display the console output in a proper readable
							// format

		 strict = true, //it will check if any step is not defined in step
		// definition file

		dryRun =false
				// tags = {"~@SmokeTest" , "~@RegressionTest"}
// to check the mapping is proper between feature file and step def file
// tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)

public class TestRunner {
	
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
