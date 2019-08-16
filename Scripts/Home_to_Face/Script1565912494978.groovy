import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bda.co.th/')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_BIG DATA AGENCY/i_adminbdacoth_fab fa-facebook fa-2x'))

WebUI.switchToWindowTitle('Big Data Agency - หน้าหลัก | Facebook')

WebUI.click(findTestObject('Object Repository/Page_Big Data Agency -   Facebook/a_'))

WebUI.setText(findTestObject('Object Repository/Page_ Facebook  Facebook/input__email'), '123456789')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_ Facebook  Facebook/input__pass'), 'f+cPJZ0yCmnUZnCPiak6wQ==')

