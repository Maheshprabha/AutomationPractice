package com.atmecs.testscript;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import com.atmecs.baseclass.BaseClass;
import com.atmecs.commonhelpers.CommonHelpers;
import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class TestScript extends BaseClass {
	static Properties property;
    ReaderLocation read = new ReaderLocation();
    @Test
	public void action() throws IOException {
    property = ReaderLocation.readLocation(FilePath.locator_path);
    property = ReaderLocation.readLocation(FilePath.User_path);
    CommonHelpers.clickAction(driver, property.getProperty("loc_women"));	
    //CommonHelpers.mouseMoveOver(driver, property.getProperty("loc_dress"));
    CommonHelpers.mouseMoveOver(driver, property.getProperty("loc_dress"));
    CommonHelpers.clickAction(driver,property.getProperty("loc_cart"));  
	CommonHelpers.clickAction(driver, property.getProperty("loc_checkout"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_finalcheckout"));
	CommonHelpers.SendkeysAction(driver, property.getProperty("loc_name"), property.getProperty("mail"));
	CommonHelpers.SendkeysAction(driver, property.getProperty("loc_password"), property.getProperty("password"));
	CommonHelpers.clickAction(driver, property.getProperty("loc_signbutton"));
	
		
		
		
	}
}
