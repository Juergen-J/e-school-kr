package com.jj.eschool.service;

import com.jj.eschool.dto.ElectronicLibraryDTO;
import com.jj.eschool.entity.enums.Type;
import com.jj.eschool.mapper.ElectronicLibraryMapper;
import com.jj.eschool.repository.ElectronicLibraryRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ElectronicLibraryService {

    private final ElectronicLibraryMapper electronicLibraryMapper = Mappers.getMapper(ElectronicLibraryMapper.class);

    private final ElectronicLibraryRepository electronicLibraryRepository;

    public List<ElectronicLibraryDTO> findAll() {
        var librarys = electronicLibraryRepository.findAll();
        var result = electronicLibraryMapper.mapLibrarys(librarys);

//todo
        return mockLibraryDTOs();
    }


    private List<ElectronicLibraryDTO> mockLibraryDTOs() {
        return List.of(
                new ElectronicLibraryDTO("Example Title", Type.BOOK, "http://example-link.html", "This book is about ..."),
                new ElectronicLibraryDTO("Last Book", Type.BOOK, "http://example-link-last-book.html", "This book is about ..."),
                new ElectronicLibraryDTO("Example Video", Type.VIDEO, "http://watch-me.html", "This vidoe is about ..."),
                new ElectronicLibraryDTO("Example Article", Type.ARTICLE, "http://article-link.html", "This article is about ...")
        );
    }
}
