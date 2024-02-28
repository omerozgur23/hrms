package io.kodlama.entities.concretes;

import java.util.List;

import io.kodlama.entities.abstracts.User;
import io.kodlama.entities.confirms.EmployeeConfirm;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
@Table(name = "employees")
public class Employee extends User {

	@NotNull
	@NotBlank
	@Column(name = "first_name")
	private String firtsName;

	@NotNull
	@NotBlank
	@Column(name = "last_name")
	private String lastName;

	@OneToMany(mappedBy = "employee")
	private List<EmployeeConfirm> confirms;
}
