package sample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
/*import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;*/

/*import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;*/
class multimail{  
 public static void main(String [] args) throws EmailException{  
  
  EmailAttachment attachment = new EmailAttachment();
  attachment.setPath(System.getProperty("user.dir")+"\\ExtentReports\\Log__2021-Oct-27_06.html");
  attachment.setDisposition(EmailAttachment.ATTACHMENT);
  attachment.setDescription("Automation Results");
  attachment.setName("Log__2018-Dec-14_03.html_Report.html");
  

  // Create the email message
  MultiPartEmail email = new HtmlEmail();
  email.setHostName("smtp.gmail.com");
  
  
  email.setSmtpPort(465);
	email.setAuthenticator(new DefaultAuthenticator("accutestingsample@gmail.com", "Sample@123"));
	email.setSSLOnConnect(true);
	email.setFrom("accutestingsample@gmail.com");
	email.setSubject("TestMail");
	email.setMsg("<html> Hi Team,\n\n Please Find the Attached reports of Dials Automation script."+ " \n\n Thanks & Regards \n\n AccuConnect Team"+ "</html>");           
	email.addTo("varun.thota@tecra.com");
	email.addTo("varunthota365@gmail.com");
	email.attach(attachment);
	email.send();
	System.out.println("sent");
 }  
} 
