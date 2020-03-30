package com.atmecs.datalocator;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.filepath.FilePath;
import com.atmecs.readerlocation.ReaderLocation;

public class ValidationDataAllocator {
	
	Properties properties;
	public String pageTitle;
	public String women;
	public String tops;
	public String tshirt;
	public String blouse;
	public String women_casual_dress;
	public String women_evening_dress;
	public String women_summer_dress;
	public String dresses;
	public String casual_dress;
	public String evening_dress;
	public String summer_dress;
	public String tshirt_menu;
	public String SearchText;

	public void getValidationData() throws IOException {
		
		properties = ReaderLocation.readLocation(FilePath.Valid_Path);
		
		pageTitle = properties.getProperty("val_pageTitle");
		
		women = properties.getProperty("val_women");
		tops = properties.getProperty("val_tops");
		tshirt = properties.getProperty("val_tshirt");
		blouse = properties.getProperty("val_blouse");
		women_casual_dress = properties.getProperty("val_casual_women");
		women_evening_dress = properties.getProperty("val_evening_women");
		women_summer_dress = properties.getProperty("val_summer_women");
		
		dresses = properties.getProperty("val_dresses");
		casual_dress = properties.getProperty("val_casual");
		evening_dress = properties.getProperty("val_evening");
		summer_dress = properties.getProperty("val_summer");
		
		tshirt_menu = properties.getProperty("val_tshirt_menu");
		SearchText = properties.getProperty("val_search");
	}

}
