package com.homeloan.main.enquiry.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.homeloan.main.enquiry.model.UserEnquiry;
import com.homeloan.main.enquiry.repository.UserEnquiryRepository;
import com.homeloan.main.enquiry.service.MailEnquiryService;
@Service
public class MailServiceimpl implements MailEnquiryService {
	
	@Autowired private JavaMailSender jm;
	@Autowired private UserEnquiryRepository enquiryRepository;

	@Override
	public void getmail(int userEnquiryId) {
		SimpleMailMessage sm = new SimpleMailMessage();
	Optional<UserEnquiry> us = enquiryRepository.findById(userEnquiryId);
	 UserEnquiry user =us.get();
		if(us.isPresent() && user.getCibil().getCibilScore()>650)
		{
		sm.setTo(user.getEmail());	
		sm.setSubject("Loan Approval Status");
		sm.setText("Dear "+ user.getEnquiryName()+ "," + "\n\n We hope this email finds you well."
		+ "\n\n Congratulations! Your enquiry has been approved, and we are excited to assist you further with your request. Our team will be in touch shortly to discuss the next steps and provide you with any additional information you may need."
				+ "\n\n We appreciate your interest and thank you for considering [Your Company/Organization]. Should you have any further enquiries or require assistance, please do not hesitate to contact us."
				+ "\nBest regards,");
		jm.send(sm);
		}
		else
		{
			sm.setTo(user.getEmail());	
			sm.setSubject("Loan Approval Status");
			sm.setText("Dear "+ user.getEnquiryName()+ "," + "\n\n We hope this email finds you well."
			+ "\n\n We regret to inform you that your enquiry has been rejected. Please note that this decision was made after thorough review and consideration. If you have any questions or would like further clarification regarding the decision, please feel free to reach out to us."
					+ "\n\n We appreciate your interest and thank you for considering [Your Company/Organization]. Should you have any further enquiries or require assistance, please do not hesitate to contact us."
					+ "\nBest regards,");
			jm.send(sm);
		}
		
	}

}
