package DAO;


import javax.persistence.EntityManager;

import Entidade.Documento;
import DAO.JPAUtil;

public class DocumentoDAO<T> {

	// Met�do de adi��o de novos documentos
	public void addDocumento(Documento documento) {
		// Iniciando Gerenciador de Entidades
		EntityManager em = JPAUtil.getEntityManager();
		
		
		// Iniciando transa��o, persistindo novo documento e encerrando opera��o
		em.getTransaction().begin();
		em.persist(documento);
		em.getTransaction().commit();

		em.close();
	}
	
	// M�todo de exclus�o de documento 
	public void excluirDocumento(Documento documento) {
		// Iniciando Gerenciador de Entidades
		EntityManager em = JPAUtil.getEntityManager();
		
		// Iniciando transa��o, excluindo documento e encerrando opera��o
		em.getTransaction().begin();
		em.remove(documento);
		em.getTransaction().commit();
		
		em.close();
	}
	
}