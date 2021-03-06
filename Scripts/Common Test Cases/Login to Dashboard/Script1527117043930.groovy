import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Test to Open Browser'
WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.refresh()

'Adding URL adddress'
WebUI.navigateToUrl(GlobalVariable.url_staging)

WebUiBuiltInKeywords.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Login using Smart parking email'
WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with emailEmail'))

'Adding Email Address'
WebUI.setText(findTestObject('SignIn_OR/Page_SmartCloud  Login/input_email'), GlobalVariable.stag_uname_email)

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Next'))

'Adding Passoword'
WebUI.setText(findTestObject('SignIn_OR/Page_SmartCloud  Login/input_password'), GlobalVariable.stag_pass_email)

'Clicking Sign In button'
WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign In'))

