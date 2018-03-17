package Final.BD2.repositories.impl;

import Final.BD2.model.Application;
import Final.BD2.repositories.bi.ApplicationRepositoryBI;
//import org.hibernate.Session;

public class HibernateApplicationRepository extends HibernateGenericRepository implements ApplicationRepositoryBI {

	public Application getApplication() {
		return (Application) this.getSession().createQuery("FROM Applicarion").list().get(0);

	}
}
