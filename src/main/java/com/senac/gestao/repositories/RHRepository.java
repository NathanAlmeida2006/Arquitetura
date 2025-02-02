package com.senac.gestao.repositories;

import com.senac.gestao.models.RH;

import java.util.List;
import java.util.Optional;

public interface RHRepository {
    RH save(RH rh);

    Optional<RH> findById(int id);

    List<RH> findAll();

    RH update(RH rh);

    void delete(int id);
}
