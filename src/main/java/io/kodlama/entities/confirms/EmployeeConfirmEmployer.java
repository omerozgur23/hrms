package io.kodlama.entities.confirms;

import io.kodlama.entities.concretes.Employer;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_confirm_employers")
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeConfirmEmployer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;

//	@OneToOne(mappedBy = "employeeConfirmEmployer")
//	private EmployeeConfirm employeeConfirm;
}
