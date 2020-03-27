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
	public static void sample() throws IOException {
		System.out.println("automation");
		property = ReaderLocation.readLocation(FilePath.locator_path);
		//CommonHelpers.clickAction(driver, property.getProperty("loc_product"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_women"));
		CommonHelpers.clickAction(driver, property.getProperty("loc_product"));

	}
}
