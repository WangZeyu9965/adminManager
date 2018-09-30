package net.sppan.base.dao;

import net.sppan.base.dao.support.IBaseDao;
import net.sppan.base.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleDao extends IBaseDao<Role, Integer> {

	Page<Role> findAllByNameContainingOrDescriptionContaining(String searchText1,String searchText2, Pageable pageable);

}
