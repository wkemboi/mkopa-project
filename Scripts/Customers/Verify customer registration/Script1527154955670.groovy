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

WebUI.callTestCase(findTestCase('Login/login'), [('Username') : 'pascal.kipkemoi@m-kopa.com', ('Password') : 'Gratuation-12'], 
    FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.delay(2)

WebUI.mouseOver(findTestObject('Customers module/Customers Registration/Link-Customers'))

WebUI.mouseOver(findTestObject('Customers module/Customers Registration/Link-Registration'))

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Link-New Registration'))

WebUI.setText(findTestObject('Customers module/Customers Registration/Personal Information/Input-Surname'), surname)

WebUI.setText(findTestObject('Customers module/Customers Registration/Personal Information/Input-Other names'), otherNames)

WebUiBuiltInKeywords.setText(findTestObject('Customers module/Customers Registration/Personal Information/Input-Citizenship'), 
    citizenship, FailureHandling.CONTINUE_ON_FAILURE)

WebUiBuiltInKeywords.setText(findTestObject('Customers module/Customers Registration/Personal Information/Input-ID Number'), 
    IDnumber)

WebUiBuiltInKeywords.delay(3)

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Personal Information/Dropdown-ID Number Type'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Personal Information/Option-ID Number Type', 
        [('IDtype') : IDtype]))

WebUI.click(findTestObject('Customers module/Customers Registration/Personal Information/Checkbox-ID copy received'))

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Personal Information/Dropdown-Gender'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Personal Information/Option-Gender', 
        [('gender') : gender]))

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Personal Information/Dropdown-Marital status'))

WebUiBuiltInKeywords.delay(2)

WebUiBuiltInKeywords.click(findTestObject('Customers module/Customers Registration/Personal Information/Option-marital status', 
        [('maritalstatus') : maritalStatus]))

WebUI.closeBrowser()

