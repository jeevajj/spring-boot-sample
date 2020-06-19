package com.profile.services;

import javax.inject.Inject;
import javax.inject.Named;

import com.profile.exception.UserNotFoundException;
import com.profile.model.Contact;
import com.profile.model.Education;
import com.profile.model.User;
import com.profile.model.WorkExperience;
import com.profile.repository.ContactRepository;
import com.profile.repository.EducationRepository;
import com.profile.repository.UserRepository;
import com.profile.repository.WorkExperienceRepository;
import com.profile.rs.model.ContactDTO;
import com.profile.rs.model.EducationDTO;
import com.profile.rs.model.UserDTO;
import com.profile.rs.model.WorkExperienceDTO;
import com.profile.transformer.UserTransformer;

@Named
public class UserService implements IUserService{
    
	@Inject
	private UserRepository userRepository;
	
	@Inject
	private ContactRepository contactRepository;
	
	@Inject
	private EducationRepository educationRepository;
	
	@Inject
	private WorkExperienceRepository workExperienceRepository;
	
	
	@Override
	public void createUser(UserDTO userDto) {
		
		//inserting user's basic information
		User user = new User(userDto.getName(), userDto.getEmail(), userDto.getDateOfBirth(), userDto.getLocation());
		user = userRepository.save(user);
		
		//inserting user's contact details.
		//check if not null case (ie) empty contact list shouldn't go for further iteration.
		for(ContactDTO con : userDto.getContacts()) {
			Contact contact = new Contact(con.getAddressLine1(), con.getAddressLine2(), con.getCity(), con.getCountry(), con.getPincode(), con.getContactNumber(), user.getId());
			contactRepository.save(contact);
		}
		
		//inserting user's educational details.
		//check if not null case (ie) empty education details list shouldn't go for further iteration.
		for(EducationDTO edu : userDto.getEducation()) {
			Education education = new Education(edu.getInstitutionName(), edu.getDegree(), edu.getPercentage(), edu.getStartYear(), edu.getEndYear(), edu.getLocation(), user.getId());
		    educationRepository.save(education);
		}
		
		//inserting user's work experience.
		//check if not null case (ie) empty experience list shouldn't go for further iteration.
		for(WorkExperienceDTO exp : userDto.getExperience()) {
			WorkExperience experience = new WorkExperience(exp.getCompanyName(), exp.getLocation(), exp.getDesignation(), exp.getStartDate(), exp.getEndDate(), user.getId());
		    workExperienceRepository.save(experience);
		}
		
	}

	@Override
	public UserDTO getUser(int id) throws UserNotFoundException {
		
		User user = userRepository.findById(id);
		if(user != null) {
			return UserTransformer.transformUserToUserDTO(user);		
		}
		else {
			throw new UserNotFoundException("User not found");
		}
	}

}
