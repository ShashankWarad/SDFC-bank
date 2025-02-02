package com.web.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.model.SdfcBank;
@Repository
public interface SdfcBankRepo extends CrudRepository<SdfcBank, Integer> 
{

}
