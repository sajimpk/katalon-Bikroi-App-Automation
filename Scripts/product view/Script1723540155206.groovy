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

Mobile.tap(findTestObject('bikroi product view/X'), 0)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.ImageButton'), 0)

WebUI.delay(2)

Mobile.sendKeys(findTestObject('Object Repository/bikroi product view/android.widget.EditText -'), 'laptop')

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.ImageView'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView -'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (1)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (2)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (3)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (4)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (5)'), 0)

Mobile.takeScreenshot('Screnshots\\screenshot.png')

WebUI.delay(3)

Mobile.takeScreenshot('Screnshots\\screenshotP.png')

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.ImageView (1)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (6)'), 0)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/bikroi product view/android.widget.TextView - (7)'), 0)

WebUI.delay(5)

