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

WebUI.navigateToUrl(GlobalVariable.url_staging)

WebUiBuiltInKeywords.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

'Test Sign In With Email Button'
WebUI.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with emailEmail'), 0)

'Test Sign In With Gmail Button'
WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with GoogleGoog'), 
    0)

'Test Login using smart parking email'
WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/span_Sign in with email'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/div_Email'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/h1_Sign in with email'), 0)

WebUI.setText(findTestObject('SignIn_OR/Page_SmartCloud  Login/input_email'), GlobalVariable.stag_uname_email)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Next'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Cancel'), 0)

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Next'))

WebUI.setText(findTestObject('SignIn_OR/Page_SmartCloud  Login/input_password'), GlobalVariable.stag_pass_email)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign In'), 0)

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign In'))

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud/h3_SmartPark Dashboard'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud/div_SmartCloud'), 0)

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud/img'))

WebUI.click(findTestObject('SignIn_OR/Page_SmartCloud/a_Logout'))

WebUI.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with emailEmail'), 0)

WebUiBuiltInKeywords.verifyElementPresent(findTestObject('SignIn_OR/Page_SmartCloud  Login/button_Sign in with GoogleGoog'), 
    0)

WebUI.closeBrowser()

