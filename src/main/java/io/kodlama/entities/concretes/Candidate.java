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
@Table(name = "candidates")
public class Candidate extends User {

	@NotNull(message = "The first name field cannot be null.")
	@NotBlank(message = "The first name field cannot be blank.")
	@Column(name = "first_name")
	private String firtsName;

	@NotNull(message = "The last name field cannot be null.")
	@NotBlank(message = "The last name field cannot be blank.")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "The identity number field cannot be null.")
	@NotBlank(message = "The identity number field cannot be blank.")
	@Column(name = "nationality_id")
	private String nationalityId;

	@NotNull(message = "The birth year field cannot be null.")
	@NotBlank(message = "The birth year field cannot be blank.")
	@Column(name = "birth_year")
	private int birthYear;
}
