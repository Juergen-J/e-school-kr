package com.jj.eschool.mapper;

import com.jj.eschool.dto.ElectronicLibraryDTO;
import com.jj.eschool.entity.ElectronicLibrary;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ElectronicLibraryMapper {
    List<ElectronicLibraryDTO> mapLibrarys(Iterable<ElectronicLibrary> librarys);

    ElectronicLibraryDTO mapLibrary(ElectronicLibrary electronicLibrary);
}
