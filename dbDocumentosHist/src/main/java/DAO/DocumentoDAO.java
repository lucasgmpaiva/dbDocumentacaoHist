package DAO;

import javax.persistence.EntityManager;

import Entidade.Documento;
import DAO.JPAUtil;

public class DocumentoDAO {

	public void addDocumento(Documento documento) {
		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();
		em.persist(documento);
		em.getTransaction().commit();

		em.close();
	}
}