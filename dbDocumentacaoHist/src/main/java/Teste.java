import DAO.DocumentoDAO;
import Entidade.Documento;

public class Teste {
	public static void main(String[] args) {
		
		Documento doc1 = new Documento();
		doc1.setTipoDoc(1);
		doc1.setGovernoCap("Rio Grande");
		doc1.setAutoridade("General Mourão");
		doc1.setProvido("Geraldo Azevedo");
		doc1.setCargo("Torturado");
		doc1.setCondicoes("Permanecer vivo!");
		doc1.setObservacoes(" ");
		doc1.setFonte("Arial 12");
		doc1.setDia(31);
		doc1.setMes(02);
		doc1.setAno(1964);
		
		
		DocumentoDAO dao = new DocumentoDAO();
		
		dao.addDocumento(doc1);
	}
}
