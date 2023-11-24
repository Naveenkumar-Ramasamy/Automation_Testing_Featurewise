package com.omrbranch.report;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report extends BaseClass {
	public static void generateJVMReport(String jsonPath) throws FileNotFoundException, IOException {
		File f=new File(getProjectPath()+getPropertyFileValue("JVMPath"));
		Configuration c=new Configuration(f, "CucumberProgram");
		c.addClassifications("browser", "chrome");
		c.addClassifications("os", "windows 7");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonPath);
		ReportBuilder b=new ReportBuilder(jsonFiles, c);
		b.generateReports();
	}
}
