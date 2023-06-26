package com.pwc.valuestore;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pwc.valuestore.ConfigurationsReader;
import com.pwc.valuestore.Driver;
import com.pwc.valuestore.HelperFunctions;
import com.pwc.valuestore.ReadXLSdata;
import com.pwc.valuestore.screenshotUtil;

import Pages.AuthoringPage;
import Pages.ContentPage;
import Pages.GhostedPage;
import Pages.HomePage;
import Pages.LoginPageObjects;
import Pages.TopicLandingPage;




public class RegressionTestCases extends HelperFunctions {
	
	ExtentHtmlReporter htmlReporter;
	static ExtentReports extent;
	public static ConfigurationsReader read;
	String platform = null;
	LoginPageObjects lpo=new LoginPageObjects();
	HomePage hp=new HomePage();
	ContentPage cp=new ContentPage();
	GhostedPage gp=new GhostedPage();
	AuthoringPage ap=new AuthoringPage();
	TopicLandingPage tlp=new TopicLandingPage();
	screenshotUtil ssu=new screenshotUtil();
	private ExtentTest test;
	
	
	
	Logger logger=Logger.getLogger("SanityTestCases");
	
	ReadXLSdata read1=new ReadXLSdata();
	
	


	
	@BeforeSuite
	public void setUp() {
		 PropertyConfigurator.configure(".\\log4j.properties");
		 read = new ConfigurationsReader();
		 platform = read.getPlatform();
		 read.platformName();
		 htmlReporter = new ExtentHtmlReporter("Sanity Automation Report for Value Store.html");
	     extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);
	    
	     
	}
		
	@BeforeMethod
	public void initTest() throws Exception {
	    Driver.getDriver();
	    read1.setExcelFile("./testdata.xlsx", "QA");
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().deleteAllCookies();
		HelperFunctions.setWaitTime();
		
		
	}
	
	
	/*******************************************************Regression Test Case********************************************************/
	
	
	
	@Test(enabled=false)
	public void WEB_60() throws Exception{
		  String testName = "To verify that Global header should contain User icon."+
	"To verify that Global header should contain PWC logo.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setUserIconandLogo(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_61() throws Exception{
		  String testName = "To verify that after clicking on external link share model appears and it should  display X icon."+
	"To verify that after clicking on external link share model appears and it should display Email button.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setExternalLinkShare(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_62() throws Exception{
		  String testName = "To verify that user can click on a shareable link under the helpful assets to open page in new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setExternalLinkShare(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_63() throws Exception{
		  String testName = "To verify that clicking on the share icon opens the share dialogue."+
	"To verify that when user clicks on the Copy link button it becomes \"Link copied!\".";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setExternalLinkShare(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_64() throws Exception{
		  String testName = "To verify that author can add multiple lines of text that handles typical styling/formatting like bold, paragraph alignment etc.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setAddingText(test);
		        test.pass("Test passed");
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_65() throws Exception{
		  String testName = "To verify that orange large text is available for stats and author can manually configure it.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3)); 
		        lpo.setLogin();
		        cp.setMarketDemandOrange(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_66() throws Exception{
		  String testName = "To verify that \"Clear filters\" button should also be displayed  & clicking the button will clear all filters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setClearFilters(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_67() throws Exception{
		  String testName = "To verify that user should see the no result message when the system cannot find matching search content. ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setNoSearchResult(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_68() throws Exception{
		  String testName = "Verify that, as user types or pastes keyword in the search bar, system should start presenting suggested terms after 3rd character.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSearchResultsBasedonKeywordChar(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_69() throws Exception{
		  String testName = "Verify that, selecting a term will fill the keyword/phrases in the search bar, trigger the search and bring to the search results page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSearchResultsBasedonKeyword(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_70() throws Exception{
		  String testName = "Verify that, Clicking anywhere outside the search overlay should close the overlay."+
	"Verify that, on click, search overlay is displayed with a search bar and close button.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setClickingOutsideSearchOverlay(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_71() throws Exception{
		  String testName = "Verify that, clicking the “X” button will close the search overlay and leave the search keyword in the search bar";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setLeaveKeySuggestion(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_72() throws Exception{
		  String testName = "Verify that, on hover, the search icon turns pink and clickable.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSearchIconColor(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_73() throws Exception{
		  String testName = "To verify that the regular tile - Description (.vs-card_figure-description) character count increases to 185 characters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setCardDescriptionChar(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_74() throws Exception{
		  String testName = "To verify that the regular tile - Title (.vs-card_figure-heading) character count increases to 105 characters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setCardHeadingChar(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_75() throws Exception{
		  String testName = "To verify that trending & recent search terms should be presented without having to click into the search bar.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setTrendingandRecentSearches(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_76() throws Exception{
		  String testName = "To verify that after users click on the 'Did you mean' suggested keyword and trigger the search, display a message \"Showing results for suggested keyword\"."
				  +"To verify that clicking the 'Did you mean' suggested term will trigger the search.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setDidYouMean(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_77() throws Exception{
		  String testName = "Verify that, users can click on a number to navigate to that specific results page  ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSearchPagination(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_78() throws Exception{
		  String testName = "Verify that, users can click on “>” to navigate to the next page of results. ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setNextPage(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_79() throws Exception{
		  String testName = "Verify that, system should display 10 results per page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setTotalSearchItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_80() throws Exception{
		  String testName = "Verify that, clicking the content title of search results should open the page in the current window";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSearchResultsTopicTitleIcon(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_81() throws Exception{
		  String testName = "Verify that, results count should display number of results for the search as \"Showing <result number> of <result count> results\""
				  +"Verify that, clicking the “X” button should clear the keywords";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setResultCount(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_82() throws Exception{
		  String testName = "To verify that when a user opens the URL of the search result page that will directly load with pre-populated results that contain the keyword, Filter facets & Pagination.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSharetheURLwithSearchResults(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_83() throws Exception{
		  String testName = "To verify that filter menu should be expanded by clicking filters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setExpandedFilterItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_84() throws Exception{
		  String testName = "To verify that \"Off time\" is changed to a mandatory field on the page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setOffTimeMandatory(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_85() throws Exception{
		  String testName = "To verify that Inline links within text in Did you know component should stay black and underlined.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setDidYouKnowInline(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_86() throws Exception{
		  String testName = "To verify that underline hover state is added for all 'helpful assets' links.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setHelpfulAssetsLinkUnderlined(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_87() throws Exception{
		  String testName = "To verify that share icon has been removed from the content page title area.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setNotContainsShareIcon(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_88() throws Exception{
		  String testName = "To verify that Key asset must have a minimum of 1 link in the component";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setKeyAssetUrlAuth(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_89() throws Exception{
		  String testName = "To verify that a limit of 82 characters is allowed for description."
				  +"To verify that a Limit of maximum of 75 characters is allowed for the Link title.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setKeyAssetTitleandDescriptionLength(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_90() throws Exception{
		  String testName = "To verify that author can define up to 4 assets that are linked to the target asset."
				  +"To verify that author can select 3-column or 4-column layout depending on the number of topics.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setKeyAssetBar4articles(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_91() throws Exception{
		  String testName = "To verify that the Topic header is populated from the page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setTopicHeader(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_92() throws Exception{
		  String testName = "To verify that on clicking on the Topic title or topic icon, page should open in the current window.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setMoretoExploreItemCurrentTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_93() throws Exception{
		  String testName = "To verify that 'The Top 10' heading should hide when filters are applied.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setTop10Visibility(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_94() throws Exception{
		  String testName = "To verify that the tag label keeps as the Rose label for the article page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setRoseTagLabel(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_95() throws Exception{
		  String testName = "To verify that when user clicks on VS Home button, It should reload the homepage.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setVSHomepage(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_96() throws Exception{
		  String testName = "To verify that the top 10 article section contains two highlighted content in a larger size than the rest of the content.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setFirst2Article(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_97() throws Exception{
		  String testName = "To verify that the favicon should display as a visual reminder of the website identity in the address bar or in tabs.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setFavicon(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_98() throws Exception{
		  String testName = "To verify that the same hover effect exists on the article title."
				  +"To verify that on mouse hover over article title of In case you missed it component display rose hyperlink(#D93954).";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setMightAlsoLikeHoverEffect(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_99() throws Exception{
		  String testName = "To verify that the article page opens in the same window."
				  +"To verify that the user can click on the article title to open the content page."
				  +"To verify that when the user clicks on the browser back button, it should bring a user back to the homepage and retain the filter results if any.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setMightLikeItemCurrentTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	@Test(enabled=false)
	public void WEB_101() throws Exception{
		  String testName = "To verify that the filter results screen shows 3 rows of articles by default."
				  +"To verify that the user allows clicking the 'Load more' button to show additional 3 rows of the article at a time until all results are displayed.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setLoadMore3rows(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_102() throws Exception{
		  String testName = "To verify that  for content page template \"Alliances\" text should translated to \"Alianzas\"  for Spanish translation."
				  
				  +"To verify that  for content page template \"Enablers\" text should translated to \"Habilitadores\"  for Spanish translation.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setMexicoSideTitles(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_103() throws Exception{
		  String testName = "To verify that author can configure shareable via Dynamic Signal for each link item."
				  +"To verify that 'Share via Dynamic Signal' is optional."
				  +"To verify that this Helpful asset section should contain groups of links and it can configure manually.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setConfigureDynamicSignal(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_104() throws Exception{
		  String testName = "To verify that clicking the 'Share via Dynamic Signal' button takes user to the post and opens a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setDynamicSignalOpenNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_105() throws Exception{
		  String testName = "To verify that user can click on hyperlink and it should open in new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setCampaignMaterialsOpenNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_106() throws Exception{
		  String testName = "To verify that this section is manually configure to add text and URL. ";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setConfigureCampaignMaterials(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_107() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setConfigureClientExamples(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_108() throws Exception{
		  String testName = "To verify that a user can see client examples.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setClientExampleVisibility(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_109() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting."
				  +"To verify that author can manually configure this section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setConfigureMarketDemand(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_110() throws Exception{
		  String testName = "To verify that all alliances hyperlinks should open in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setAlliancesLinkOpenNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_111() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting in alliances section."
				  +"To verify that author can add hyperlink in alliances section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setConfigureAlliances(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_112() throws Exception{
		  String testName = "To verify that user is able to click a hyperlink and this link should open in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setCampaignStructureLinkOpenNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_113() throws Exception{
		  String testName = "To verify that author can add multiple lines of text with basic styling/formatting in did you know section."
				  +"To verify that user can see key opportunity information related to the content in this section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setConfigureDidYouKnow(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_114() throws Exception{
		  String testName = "To verify that in this section for each group, there should be  a Group label, item label and  item URL.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setHelpfulAssetsItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_115() throws Exception{
		  String testName = "To verify that clicking on the quick links icon, the mega menu is displayed with the underline on the quick links icon.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setQuickLinksIconOpensItems(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_116() throws Exception{
		  String testName = "To verify that the first tag is mandatory."+
	"To verify that 2nd, 3rd and 4th tags are optional on topic landing page";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setPageTags(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_117() throws Exception{
		  String testName = "To verify that this area should split into two or more section e.g. who’s impacted and often asked questions.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setSplit2sections(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_118() throws Exception{
		  String testName = "To verify that this section should contain links that point to helpful reference material both internal and external to PwC.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setHelpfulAssetsInternalExternal(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_119() throws Exception{
		  String testName = "To verify that there is three groups of links in enablers section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setEnablersLinks(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_120() throws Exception{
		  String testName = "To verify that author can update these non mandatory field later in page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setUpdateNonMandatoryTag(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_121() throws Exception{
		  String testName = "To verify that ghost page does not have revised date property."
				  +"-To verify that ghost page has published date property which is mandatory."
				  +"-To verify that ghost page has target URL property which is mandatory."
				  +"-To verify that ghost page has description property which is mandatory."
				 + "-To verify that ghost page has title property which is mandatory.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        gp.setMandatoryFields(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_122() throws Exception{
		  String testName = "To verify that \"Read on pwc.com\" button is manually authored.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setPWCButton(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_123() throws Exception{
		  String testName = "To verify that author can configure a picture and a quote for the highlight of the month which is combined with 'In case you missed it'.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setInCaseMissedItEdit(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_124() throws Exception{
		  String testName = "To verify that \"In case you missed it\" items can be Content or Ghost pages."
				  +"To verify that 3 articles display in card format under \"In case you missed it\" section.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setInCaseMissedItCardsNumbers(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_125() throws Exception{
		  String testName = "To verify that the In case you missed it section articles display article title, topic label & favorite icon on the cards.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setIncaseYouMissedIt(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	@Test(enabled=false)
	public void WEB_126() throws Exception{
		  String testName = "To verify that the topic tag and the article titles are pulled from the properties of the content page or ghost page."
				  +"To verify that the Topic tag is not clickable & the existing tag pill behavior has been removed."
				  +"To verify that the tag label applies ellipses when the character limit is exceeded 31 characters.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setIncaseYouMissedItLabels(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_127() throws Exception{
		  String testName = "To verify that spinner will show while loading filter results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSpinner(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_128() throws Exception{
		  String testName = "To verify that only one filter can be expanded at a time."
				  +"To verify that the user clicks on a filter header to expand the filter menu."
				 +"To verify that the filter header presents the Sector, Economic buyer & Topic."
				  +"To verify that the user can select multiple filter options in one category as well as in multiple categories.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setSelectedDropdown(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_129() throws Exception{
		  String testName = "To verify that when the user clicks on the browser back button, It should bring the user back to the Homepage and retain the filter results if any."
				  +"To verify that when user opens the article page, It should open in the same window.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setBrowserBackButton(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_130() throws Exception{
		  String testName = "To verify that each article displays the image, title, description & this data pulled from the properties of the content page or ghost page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setArticleImagesTitleDescription(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_131() throws Exception{
		  String testName = "To verify that the article page should open in a new tab if it is external content(ghost page).";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setNewTabGhostPage(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_132() throws Exception{
		  String testName = "To verify that the height of the cards adapts according to the length and the number of characters in the title and description, rather than a set height.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setCardsSize(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_133() throws Exception{
		  String testName = "To verify that Feed article should open  in the current window if it's internal VS content."
				  +"To verify that article should open in a new tab if it's an external content (ghost page)."
				  +"To verify that clicking the back button brings the user back to the topic page where the user came from.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setFeedTopics(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_134() throws Exception{
		  String testName = "To verify that feed presents all relevant content & there is no limit."
				  +"To verify that feed contents are sorted by the most recent publication date.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setFeedTopicsLimit(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_135() throws Exception{
		  String testName = "To verify that If user navigates to a VS content page from the topic landing page, present a 'Back to topic page' button on the content page which can bring the user back"
				  +"To verify that click on the Hot topic title & description to open an article.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setBacktoTopicandTopicsSize(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_136() throws Exception{
		  String testName = "To verify that author can manually author up to 4 articles by selecting a content page or a ghost page to populate the component.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setHotTopics4articles(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_137() throws Exception{
		  String testName = "To verify that image, title, description are populated from the page properties.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setTopicImageTitleDescription(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_138() throws Exception{
		  String testName = "To verify that the maximum character limit for the quick link title is 54 characters & author is not allowed to enter more than the limit."
				  +"To verify that the maximum character for the quick link description is 75 characters & author is not allowed to enter more than limit.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setEditQuickLinks();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_139() throws Exception{
		  String testName = "To verify that the quick link description for the first 2 items is mandatory.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setEditQuickLinks2();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_140() throws Exception{
		  String testName = "To verify that the column 2-4 link titles are sorted by alphabetical order.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setQuickLinksOrder(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_141() throws Exception{
		  String testName = "To verify quick link item opens in a new tab if it's an external page."
				  +"To verify that the quick link item opens in the current window if it's an internal value store page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setQuickLinksInternalExternal(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_142() throws Exception{
		  String testName = "To verify that the play/pause button, seek bar, video timer, speed, volume adjustment & full screen/exit should appear on the control bar.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setVideoPlayerElements(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_143() throws Exception{
		  String testName = "To verify that author can configure the media player on value store content page template."
				  +"To verify that the video will automatically start to play if the 'auto play' option is selected by the author.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setVideoPlayerEdit(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_144() throws Exception{
		  String testName = "To verify that the top navigation icon is highlighted with a pink outline when rolled hover & clicked it.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setTopNavigationColor(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_145() throws Exception{
		  String testName = "To verify that hover effect on the territory selector.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setTerritoryColor(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_146() throws Exception{
		  String testName = "To verify that when user clicks on the PwC button, It should open in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setPwcButtonNewTab(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_147() throws Exception{
		  String testName = "To verify that all value store users can see the Related articles."
				  +"To verify that click on the Related article title to open the content page.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setRelatedArticle(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_148() throws Exception{
		  String testName = "To verify that the same Content template & components are used for the MX content that currently exists for the US.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setContentTemplateMexico();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_149() throws Exception{
		  String testName = "To verify that the same Ghost template is used for the MX content that currently exists for the US.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setContentTemplateMexico();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_150() throws Exception{
		  String testName = "To verify that given target possible URLs (such as google drive links, VS content, pdf) should open from the topic landing page key asset bar."
				  +"To verify that click on a link that opens the asset in a new tab.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setKeyAssetTargetURL(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_151() throws Exception{
		  String testName = "To verify that feed is system populated.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        tlp.setTopicFeed(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_152() throws Exception{
		  String testName = "To verify that same functionality should available for MX territory footer.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setMXFooter(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_153() throws Exception{
		  String testName = "To verify that an image and quote text is defined by the author.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setMightLikeEdit();
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	} 
	@Test(enabled=false)
	public void WEB_154() throws Exception{
		  String testName = "To verify that content manager should get report of all the VS pages for a given folder path.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setGettingReport();
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_155() throws Exception{
		  String testName = "To verify that backup articles should be set up by the system, not manually maintained by the authorr.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setWhatOthersSystemAuthored(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_156() throws Exception{
		  String testName = "To verify that ghost page will have the same look and feel as other Content pages when it is used as target page for Homepage components e.g.Hero, top 9, In case you missed it and highlight.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        cp.setWhatOthersSystemAuthored(test);
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	@Test(enabled=false)
	public void WEB_157() throws Exception{
		  String testName = "To verify that author can configure up to 4 recommended articles that will display on the page when there are no filter results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        ap.setConfigure4Articles();
		        test.pass("Test passed"); 
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	@Test(enabled=false)
	public void WEB_158() throws Exception{
		  String testName = "To verify that author can configure up to 4 recommended articles that will display on the page when there are no filter results.";
		    ExtentTest test = extent.createTest(testName);

		    try {
		        Driver.getDriver().get(read1.getCellData("VALUE", 3));
		        lpo.setLogin();
		        hp.setArticlesWithNoResult(test);
		        test.pass("Test passed");  
		    } catch (Exception e) {
		        String screenshotPath = takeScreenshot(testName);
		        test.fail("Test failed: " + e.getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		    }
		    if (test.getModel().getStatus().toString().equalsIgnoreCase("fail")) {
		        Assert.fail("Test case failed: " + testName);
		    }
	}
	
	
	
	
	
	/******************************************************************************************************************************/
	
	public String takeScreenshot(String screenshotName) throws IOException {
	    WebDriver driver = Driver.getDriver();
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    String destination = "screenshots/" + screenshotName + ".png";
	    File target = new File(destination);
	    FileUtils.copyFile(source, target);
	    return destination;
	}
	public void captureScreenshotAndAddToReport(String testName) throws IOException {
		 String screenshotPath = takeScreenshot(testName);
		 ExtentTest test = extent.createTest(testName).pass("Screenshot", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	}
	@AfterMethod
    public void closeTabs() {
        String currentWindow = Driver.getDriver().getWindowHandle();
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(currentWindow)) {
            	Driver.getDriver().switchTo().window(window);
            	Driver.getDriver().close();
            }
        }
        Driver.getDriver().switchTo().window(currentWindow);
         }
	public void tearDown(ITestResult result) throws IOException {
	    if (result.getStatus() == ITestResult.FAILURE) {
	        // Take screenshot if test method fails
	        String screenshotPath = takeScreenshot(result.getName() + "_failed");
	        test.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    } else if (result.getStatus() == ITestResult.SUCCESS) {
	        // Take screenshot if test method passes
	        String screenshotPath = takeScreenshot(result.getName() + "_passed");
	        test.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	    }
	    extent.flush();
	}
      @AfterSuite
	public void closingBrowser() {
		extent.flush();
		//Driver.closeDriver();
	}
	
	


	

}