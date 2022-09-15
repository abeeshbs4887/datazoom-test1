package com.xminds.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
		public static void generateJVMReports(String jsonFile) {
			File reportDirectory=new File(System.getProperty("user.dir")+"\\target");
			Configuration configur=new Configuration(reportDirectory,"DataZoomApplication");
			
			configur.addClassifications("PlatformName", "Windows");
			configur.addClassifications("PlatformVersion", "10");
			configur.addClassifications("Author", "Abeesh");
			configur.addClassifications("Project", "DataZoom");
			
			List<String>jsonFiles=new LinkedList<String>();
			jsonFiles.add(jsonFile);
			ReportBuilder builder=new ReportBuilder(jsonFiles, configur);
			builder.generateReports();
			
			
		}

}
