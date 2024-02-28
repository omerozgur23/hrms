package io.kodlama.entities.abstracts;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Email(message = "Please enter a valid e-mail address.")
	@NotNull(message = "The e-mail field cannot be null.")
	@NotBlank(message = "The e-mail field cannot be blank.")
	@Column(name = "email")
	private String email;

	@NotNull(message = "The password field cannot be null.")
	@NotBlank(message = "The password field cannot be blank.")
	@Column(name = "password")
	private String password;

	@Transient
	private String confirmPassword;
}
