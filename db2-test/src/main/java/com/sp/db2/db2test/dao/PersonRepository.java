package com.sp.db2.db2test.dao;

import com.sp.db2.db2test.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, Long>{

}
