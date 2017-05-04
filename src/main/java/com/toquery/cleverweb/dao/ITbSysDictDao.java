package com.toquery.cleverweb.dao;

import com.toquery.cleverweb.entity.po.TbSysDict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author toquery
 * @version 1
 */
@RepositoryRestResource(collectionResourceRel = "dict", path = "dict")
public interface ITbSysDictDao extends JpaRepository<TbSysDict, String> {

}
