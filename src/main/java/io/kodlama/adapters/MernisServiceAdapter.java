package io.kodlama.adapters;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import io.kodlama.business.abstarcts.UserCheckService;
import io.kodlama.entities.concretes.Candidate;
import kps.webservice.KPSPublic;

@Service
@Primary
public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean CheckIfRealPerson(Candidate candidate) {
		KPSPublic client = new KPSPublic();
		return client.getKPSPublicSoap().tcKimlikNoDogrula(Long.parseLong(candidate.getNationalityId()),
				candidate.getFirtsName(), candidate.getLastName(), candidate.getBirthYear());
	}

}
