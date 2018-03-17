package Final.BD2.repositories.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import Final.BD2.repositories.bi.GenericRepositoryBI;
import org.hibernate.Session;

public class HibernateGenericRepository extends HibernateDaoSupport implements GenericRepositoryBI {

	public Session getSession() {
		return this.getSessionFactory().getCurrentSession();
	}

}
