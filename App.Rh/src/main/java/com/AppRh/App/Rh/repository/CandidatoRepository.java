package com.AppRh.App.Rh.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AppRh.App.Rh.models.Candidato;
import com.AppRh.App.Rh.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {
    Iterable<Candidato>findByVaga(Vaga vaga);

    Candidato findByRg(String rg);

    Candidato findById(long id);

    List<Candidato>findByNomeCandidato(String nomeCandidato);
}
