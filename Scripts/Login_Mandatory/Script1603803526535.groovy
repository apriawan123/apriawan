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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://dev.mile.app/request-demo')

WebUI.verifyElementVisible(findTestObject('Gambar'))

WebUI.verifyElementPresent(findTestObject('Label_Full Name'), 0)

WebUI.setText(findTestObject('Textbox_FullName'), 'a')

WebUI.sendKeys(findTestObject('Textbox_FullName'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyTextPresent('The name field is required', false)

WebUI.verifyElementPresent(findTestObject('Label_Email'), 0)

WebUI.setText(findTestObject('Text_Email'), 'a')

WebUI.sendKeys(findTestObject('Text_Email'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyTextPresent('The email field is required', false)

WebUI.verifyElementPresent(findTestObject('Label_Phone Number'), 0)

WebUI.setText(findTestObject('Text_Phone'), '1')

WebUI.sendKeys(findTestObject('Text_Phone'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyTextPresent('The phone field is required', false)

WebUI.verifyElementPresent(findTestObject('Label_Company Name'), 0)

WebUI.setText(findTestObject('Text_Company'), 'M')

WebUI.sendKeys(findTestObject('Text_Company'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyTextPresent('The organization_name field is required', false)

WebUI.click(findTestObject('Buttton_Login'))

WebUI.delay(3)

WebUI.verifyTextPresent('The organization name field is required.', false)

