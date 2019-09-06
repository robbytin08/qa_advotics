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

WebUI.openBrowser('')
WebUI.navigateToUrl('https://web.facebook.com')
WebUI.setText(findTestObject('Facebook/Register/NamaDepan'), 'jima')
WebUI.setText(findTestObject('Facebook/Register/NamaBelakang'), 'udin')
WebUI.setText(findTestObject('Facebook/Register/EmailorPhoneSelluler'), 'jimaudin08@gmail.com')
WebUI.setEncryptedText(findTestObject('Facebook/Register/Password'), 'iFGeFYmXIrX+UJDmlj2FnA==')
WebUI.setText(findTestObject('Facebook/Register/verifyEmail'), 'jimaudin08@gmail.com')
WebUI.click(findTestObject('Facebook/Register/day'))
WebUI.delay(5)
WebUI.selectOptionByValue(findTestObject('Facebook/Register/day'), '8', false)
WebUI.click(findTestObject('Facebook/Register/mount'))
WebUI.delay(5)
WebUI.selectOptionByValue(findTestObject('Facebook/Register/mount'), '1', false)
WebUI.click(findTestObject('Facebook/Register/year'))
WebUI.delay(5)
WebUI.selectOptionByValue(findTestObject('Facebook/Register/year'), '1996', false)
WebUI.click(findTestObject('Facebook/Register/sex/input_Male'))
WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/Facebook/Register/Register'))

WebUI.delay(10)

WebUI.closeBrowser()

