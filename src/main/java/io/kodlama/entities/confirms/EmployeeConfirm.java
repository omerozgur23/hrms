package io.kodlama.entities.confirms;

import java.util.Date;

import io.kodlama.entities.concretes.Employee;
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
@Table(name = "employee_confirms")
@Inheritance(strategy = InheritanceType.JOINED)
public class EmployeeConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@Column(name = "is_confirmed")
	private boolean isConfirmed;

	@Column(name = "confirm_date")
	private Date confirmDate;

//	@OneToOne(mappedBy = "employeeConfirm")
//	private EmployeeConfirmEmployer employeeConfirmEmployer;
}
