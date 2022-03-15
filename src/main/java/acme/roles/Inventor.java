package acme.roles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.roles.UserRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Inventor extends UserRole{
	
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Column(length=101)
	protected String			company;

	@NotBlank
	//@Column(length=256)
	protected String			statement;
	
	protected String			moreInfo;

	// Derived attributes -----------------------------------------------------
		
	protected boolean			spam;
		
	// Relationships ----------------------------------------------------------
}
