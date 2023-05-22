package exam.springboot.jpa.library.dao;

import exam.springboot.jpa.library.model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface LibraryDAO {
    List<Library> selectLibrary(int cpg);

    int countLibrary();
}
