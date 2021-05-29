package org.testrunner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public  static void reportGe(String s1) {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\Cucumnew\\report");
		Configuration c = new Configuration(f, "jvm");
		c.addClassifications("windows", "7");
		c.addClassifications("platform", "chrome");
		List<String> li = new ArrayList();
		 li.add(s1);
		 ReportBuilder r = new ReportBuilder(li, c);
		 r.generateReports();
	}

	
}
