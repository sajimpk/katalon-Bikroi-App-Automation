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

Mobile.startApplication(GlobalVariable.APP, true)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.ImageView'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.ImageButton'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView -'), 0)

WebUI.delay(1)

Mobile.sendKeys(findTestObject('Object Repository/LOGIN/android.widget.EditText -'), 'fuzzyaidan@fthcapital.com')

WebUI.delay(1)

Mobile.sendKeys(findTestObject('Object Repository/LOGIN/android.widget.EditText - (2)'), 'fuzzyaidan@')

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView - (1)'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView - English'), 0)

WebUI.delay(1)

Mobile.pressBack()

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView - My Profile'), 0)

WebUI.delay(1)

Mobile.takeScreenshot('Screnshots\\profile.png')

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView - (2)'), 0)

WebUI.delay(1)

Mobile.tap(findTestObject('Object Repository/LOGIN/android.widget.TextView (1)'), 0)

WebUI.delay(1)

WebUI.delay(1)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

WebUI.delay(3)

Mobile.closeApplication()

