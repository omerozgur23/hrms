package io.kodlama.entities.concretes;

import io.kodlama.entities.abstracts.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "employers")
public class Employer extends User {

	@NotNull
	@NotBlank
	@Column(name = "company_name")
	private String companyName;

	@NotNull
	@NotBlank
	@Column(name = "web_adress")
	private String webAdress;

	@NotNull
	@NotBlank
	@Column(name = "phone_number")
	private String phoneNumber;

//	@OneToMany(mappedBy = "employer")
//	private List<EmployeeConfirmEmployer> confirms;
}
