package com.jj.eschool.repository;

import com.jj.eschool.entity.PersonalData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDataRepository extends CrudRepository<PersonalData, Long> {
}
