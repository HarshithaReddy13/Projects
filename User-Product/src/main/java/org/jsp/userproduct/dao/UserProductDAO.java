package org.jsp.userproduct.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.userproduct.dto.Product;
import org.jsp.userproduct.dto.User;

public class UserProductDAO {
	private EntityManager manager;
	public User saveUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		manager.persist(user);
		transaction.begin();
		transaction.commit();
		return user;
	}
	public User updateUser(User user) {
		EntityTransaction transaction=manager.getTransaction();
		User dbUser=manager.find(User.class, user.getId());
		if(dbUser!=null) {
			dbUser.setEmail(user.getEmail());
			dbUser.setName(user.getName());
			dbUser.setPassword(user.getPassword());
			dbUser.setPhone(user.getPhone());
			transaction.begin();
			transaction.commit();
			return dbUser;
		}
		return null;
	}
	public User verifyUser(long phone, String password) {
		Query q = manager.createQuery("select u from userproduct u where u.phone=?1 and u.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		try {
			return (User) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
