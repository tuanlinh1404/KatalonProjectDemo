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

"Open browser and navigate to url"
WebUI.openBrowser(url)

"Maximize window"
WebUI.maximizeWindow()

"Input username"
WebUI.setText(findTestObject('Object Repository/nopCommerce_homepage/txt_username'), username)

"Input password"
WebUI.setEncryptedText(findTestObject('Object Repository/nopCommerce_homepage/txt_password'), password)

"Take screenshot"
WebUI.takeScreenshot()

"Click button Login"
WebUI.click(findTestObject('Object Repository/nopCommerce_homepage/btn_login'))

"Take screenshot"
WebUI.takeScreenshot()

"Set delay"
WebUI.delay(2)

"Close browser"
WebUI.closeBrowser()