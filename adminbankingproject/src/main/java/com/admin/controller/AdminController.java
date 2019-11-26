package com.admin.controller;


import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.admin.entity.OpenAccount;
import com.admin.exception.ResourceNotFoundException;
import com.admin.service.AdminService;




@Controller
@RequestMapping("/admin")
public class AdminController {

	
	
		private static final Logger LOG = LoggerFactory.getLogger(AdminController.class);

		@Autowired
		private AdminService adminService;
		

		@RequestMapping("/list")
	    public String listCustomers(Model theModel) {
	        List < OpenAccount > theCustomers = adminService.getOpenAccounts();
	        theModel.addAttribute("customers", theCustomers);
	        return "admin-list";
	    }
		 
		
		 
	    @GetMapping("/deleteform")
	    public String deleteAccountHolder(@RequestParam("accNo") long theId) throws ResourceNotFoundException {
	        adminService.deleteOpenAccount(theId);
	        return "redirect:/admin/list";
	    }

		private static int getRandomNumberInRange(int min, int max) {
			
			Random r = new Random();
			return r.ints(min, (max + 1)).findFirst().getAsInt();

		}
	    
	    @GetMapping("/sendMail")
	    public String showFormForUpdate(@RequestParam("accNo") long theId, @RequestParam("mail") String theMail, @RequestParam("fName") String thefName,
	        Model theModel) throws ResourceNotFoundException {
	    	
	    	String s=thefName;  
	    	String subfName;
	    	subfName=s.substring(1,5);//he 
	    	int randnum=getRandomNumberInRange(1111,9999);
	    	String theUserId=subfName+randnum;
	    	
	    	
	    	  final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	    	  // Get a Properties object
	    	     Properties props = System.getProperties();
	    	     props.setProperty("mail.smtp.host", "smtp.gmail.com");
	    	     props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	    	     props.setProperty("mail.smtp.socketFactory.fallback", "false");
	    	     props.setProperty("mail.smtp.port", "465");
	    	     props.setProperty("mail.smtp.socketFactory.port", "465");
	    	     props.put("mail.smtp.auth", "true");
	    	     props.put("mail.debug", "true");
	    	     props.put("mail.store.protocol", "pop3");
	    	     props.put("mail.transport.protocol", "smtp");
	    	     final String username = "sicurobank@gmail.com";
	    	     final String password = "J2mat@1b";
	    	     
	    	     try{
	    	     Session session = Session.getDefaultInstance(props, 
	    	                          new Authenticator(){
	    	                             protected PasswordAuthentication getPasswordAuthentication() {
	    	                                return new PasswordAuthentication(username, password);
	    	                             }});
	    	     
	    	  
	    	   // -- Create a new message --
	    	     Message msg = new MimeMessage(session);

	    	  // -- Set the FROM and TO fields --
	    	     msg.setFrom(new InternetAddress("sicurobank@gmail.com"));
	    	     msg.setRecipients(Message.RecipientType.TO, 
	    	                      InternetAddress.parse(theMail,false));
	    	     msg.setSubject("Account Created Successfully!!");
	    	     msg.setText("Your Account No is: "+theId+"\nYour User ID for Net Banking is: "+theUserId);
	    	 //    msg.setText("Your User ID for Net Banking is: "+theUserId);
	    	     msg.setSentDate(new Date());
	    	     Transport.send(msg);
	    	     System.out.println("Message sent.");
	    	  }catch (MessagingException e){ System.out.println("Erreur d'envoi, cause: " + e);}
	    	  

	    	
//	        Customer theCustomer = customerService.getCustomer(theId);
//	        theModel.addAttribute("customer", theCustomer);
	        return "admin-list";
	    }
		
		      // Recipient's email ID needs to be mentioned.
	  

	      // Sender's email ID needs to be mentioned
	     

	      // Assuming you are sending email from localhost

	      // Get system properties

	      // Setup mail server


	      // Get the default Session object.

	      	    
	    
	    
		
	}

	

