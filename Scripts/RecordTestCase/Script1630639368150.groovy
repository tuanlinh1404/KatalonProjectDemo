import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

"Open Browser"
WebUI.openBrowser('')

"Navigate to URL"
WebUI.navigateToUrl('https://kiemthutudong.com/blog/')

"Click Create New Account button"
WebUI.click(findTestObject('Object Repository/Page_Automation Blog  Quality is not an act_8c22d4/a_Create New AccountCreate New Account'))

"Input Username"
WebUI.setText(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Username_user_login'), 
    'abc1234troioi')

"Input Email"
WebUI.setText(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Email_user_email'), 
    'abc1234troioi@gmail.com')

"Click Register"
WebUI.click(findTestObject('Object Repository/Page_Registration Form  Automation Blog  WordPress/input_Email_wp-submit'))

"Set delay"
WebUI.delay(10)

"Take screenshot"
WebUI.takeScreenshot()

