package io.kodlama;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
//		System.out.println(new KPSPublic().getKPSPublicSoap().tcKimlikNoDogrula(30850860202L, "Ömer", "Özgür", 1998));
	}

}
