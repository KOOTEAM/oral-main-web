package oops.oral.dao.impl;

import oops.oral.dao.EntityDao;
import oops.oral.model.BaseEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("entityDao")
public class EntityDaoImpl extends AbstractGenericDaoImpl<BaseEntity, Long> implements EntityDao {
	
	/**
	 * 设置hibernate会话工厂
	 * 
	 * @param sessionFactory
	 */
	@Resource(name = "sessionFactory")
	@Required
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
}
