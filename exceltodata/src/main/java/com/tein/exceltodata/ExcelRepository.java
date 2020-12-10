package com.tein.exceltodata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExcelRepository extends CrudRepository<UnData, Integer> {

}
