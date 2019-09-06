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

Mobile.startApplication('/Users/macbookair/git/qa_advotics/APK/base.apk', false)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ebay/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('Ebay/android.widget.CheckedTextView8 - Categories'), 0)

Mobile.scrollToText('Cell Phones & Accessories', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Ebay/android.widget.TextView6 - Cell Phones  Accessories'), 0)

Mobile.tap(findTestObject('Ebay/android.widget.TextView4 - Smart Watches'), 0)

Mobile.tap(findTestObject('Ebay/android.widget.TextView5 - Samsung Galaxy Watch'), 0)

Mobile.tap(findTestObject('Ebay/android.widget.Button0 - FILTER'), 0)

Mobile.scrollToText('Price', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Ebay/android.view.ViewGroup12 Price'), 0)

Mobile.tap(findTestObject('Ebay/android.view.ViewGroup14 Custom Price'), 0)

Mobile.setText(findTestObject('Ebay/android.widget.Minumum'), '100', 0)

Mobile.setText(findTestObject('Ebay/android.widget.Maximum'), '500', 0)

Mobile.tap(findTestObject('Ebay/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('Ebay/androidx.appcompat.widget.Done'), 0)

Mobile.scrollToText('Results', FailureHandling.STOP_ON_FAILURE)

def price = Mobile.getText(findTestObject('Object Repository/Ebay/android.widget.TextView7 - 189.99 Was 349.00'), 0)

println(price)

string verifyPrice = price.substring(0,8)
println(verifyPrice)

Mobile.closeApplication()

