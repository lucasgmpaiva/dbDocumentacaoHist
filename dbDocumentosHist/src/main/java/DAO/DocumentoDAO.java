package DAO;


import javax.persistence.EntityManager;

import Entidade.Documento;
import DAO.JPAUtil;

public class DocumentoDAO<T> {

	// Metódo de adição de novos documentos
	public void addDocumento(Documento documento) {
		// Iniciando Gerenciador de Entidades
		EntityManager em = JPAUtil.getEntityManager();
		
		
		// Iniciando transação, persistindo novo documento e encerrando operação
		em.getTransaction().begin();
		em.persist(documento);
		em.getTransaction().commit();

		em.close();
	}
	
	// Método de exclusão de documento 
	public void excluirDocumento(Documento documento) {
		// Iniciando Gerenciador de Entidades
		EntityManager em = JPAUtil.getEntityManager();
		
		// Iniciando transação, excluindo documento e encerrando operação
		em.getTransaction().begin();
		em.remove(documento);
		em.getTransaction().commit();
		
		em.close();
	}
	
}