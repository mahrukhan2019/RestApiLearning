
package com.mahrukh;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRespository extends JpaRepository<Student, Integer>{

}
