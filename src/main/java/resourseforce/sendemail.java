package resourseforce;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;

import org.apache.commons.mail.SimpleEmail;

public class sendemail {
	
	public static void sendmail() throws EmailException {
		
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("mohamed.yasin@cloud-kinetics.com", "rbviwuwltueroeab"));
		email.setSSLOnConnect(true);
		email.setFrom("mohamed.yasin@cloud-kinetics.com");
		email.setSubject("Testing Report");
		email.setMsg("Dear Team, This test auto mail all test are workingfine");
		email.addTo("yasin.yazz@gmail.com");
		
		 EmailAttachment attachment = new EmailAttachment();
		  attachment.setPath("C:\\Users\\YASINMO\\Desktop\\Automation\\morningmonitoring\\test-output\\emailable-report.html");
		  attachment.setDisposition(EmailAttachment.ATTACHMENT);
		  attachment.setDescription("Monitoring Report");
		  attachment.setName("Report");
		  
		  
		email.send();
		
		 
	}

}
