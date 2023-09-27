package utilitiesforce;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterForce {
	
	public static ExtentReports extentReport;

	public static  ExtentReports getExtentReport() {
		
	
		if(extentReport == null) {
		File ectentReportFile = new File(System.getProperty("user.dir") + "\\reports\\extentreport.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(ectentReportFile);
		extentReport = new ExtentReports();
		
		sparkreporter.config().setTheme(Theme.STANDARD);
		sparkreporter.config().setReportName("Monitoring Report");
		sparkreporter.config().setDocumentTitle("Ascent");
		
		extentReport.attachReporter(sparkreporter);
		
		Properties configProp = new Properties();
		File configPropFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\resourseforce\\DataForce.properties");
		try {
		FileInputStream fisConfigProp = new FileInputStream(configPropFile);
		configProp.load(fisConfigProp);	
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		
		extentReport.setSystemInfo("Browser Name", configProp.getProperty("browser"));
		extentReport.setSystemInfo("Operating System", "Windows 10");
		extentReport.setSystemInfo("Tested By", "Yasin");
		}
		
		return extentReport;


	}

}
