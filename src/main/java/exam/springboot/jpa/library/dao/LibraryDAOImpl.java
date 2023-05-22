package exam.springboot.jpa.library.dao;

import exam.springboot.jpa.library.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("lbdao")
public class LibraryDAOImpl implements LibraryDAO{
    @Autowired
    LibraryRepository libraryRepository;

    @Override
    public List selectLibrary(int cpg) {
        Pageable paging = PageRequest.of(cpg, 25, Sort.Direction.DESC, "lbno");
        return libraryRepository.findAll(paging).getContent();
    }
}
