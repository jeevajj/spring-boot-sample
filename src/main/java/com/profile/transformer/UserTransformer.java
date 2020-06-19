package com.profile.transformer;

import java.util.ArrayList;
import java.util.List;

import com.profile.model.Contact;
import com.profile.model.Education;
import com.profile.model.User;
import com.profile.model.WorkExperience;
import com.profile.rs.model.ContactDTO;
import com.profile.rs.model.EducationDTO;
import com.profile.rs.model.UserDTO;
import com.profile.rs.model.WorkExperienceDTO;

public class UserTransformer {

	public static UserDTO transformUserToUserDTO(User user) {
		
		List<ContactDTO> contacts = new ArrayList<>();
		for(Contact contact : user.getContacts()) {
			contacts.add(UserTransformer.transformContactToContactDTO(contact));
		}
		
		List<EducationDTO> educations = new ArrayList<>();
		for(Education education : user.getEducation()) {
			educations.add(UserTransformer.transformEducationToEducationDTO(education));
		}
		
		List<WorkExperienceDTO> workExperiences = new ArrayList<>();
		for(WorkExperience experience : user.getExperience()) {
			workExperiences.add(UserTransformer.transformWorkExperienceToWorkExperienceDTO(experience));
		}
		
		
		UserDTO userDto = new UserDTO();
		userDto.setId(user.getId())
			   .setName(user.getName())
			   .setEmail(user.getEmail())
			   .setDateOfBirth(user.getDateOfBirth())
			   .setContacts(contacts)
			   .setEducation(educations)
			   .setExperience(workExperiences);

	    return userDto;
	}
	
	public static ContactDTO transformContactToContactDTO(Contact contact) {	
		ContactDTO contactDto = new ContactDTO();		
		contactDto.setAddressLine1(contact.getAddressLine1())
		 		  .setAddressLine2(contact.getAddressLine2())
		 		  .setCity(contact.getCity())
		 		  .setCountry(contact.getCountry())
		 		  .setPincode(contact.getPincode())
		 		  .setPincode(contact.getContactNumber());
		return contactDto;
	}
	
	public static EducationDTO transformEducationToEducationDTO(Education education) {
		EducationDTO educationDto = new EducationDTO();		
		educationDto.setInstitutionName(education.getInstitutionName())
					.setDegree(education.getDegree())
					.setPercentage(education.getPercentage())
					.setLocation(education.getLocation())
					.setStartYear(education.getStartYear())
					.setEndYear(education.getEndYear());
		return educationDto;
		
	}
	
	public static WorkExperienceDTO transformWorkExperienceToWorkExperienceDTO(WorkExperience experience) {
		WorkExperienceDTO workExperienceDto = new WorkExperienceDTO();
		workExperienceDto.setCompanyName(experience.getCompanyName())
						 .setDesignation(experience.getDesignation())
						 .setLocation(experience.getLocation())
						 .setStartDate(experience.getStartDate())
						 .setEndDate(experience.getEndDate());
		return workExperienceDto;
	}
}
