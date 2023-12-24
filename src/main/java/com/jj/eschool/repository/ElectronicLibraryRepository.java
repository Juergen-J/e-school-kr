package com.jj.eschool.repository;

import com.jj.eschool.entity.ElectronicLibrary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicLibraryRepository extends CrudRepository<ElectronicLibrary, Long> {
}
