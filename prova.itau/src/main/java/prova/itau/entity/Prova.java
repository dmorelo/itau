package prova.itau.entity;

import java.util.List;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * Classe Prova.
 *
 * @author Dennis Morelo
 *
 */
@Getter
@Setter
public class Prova extends PanacheMongoEntity {
   
    /**
     * Variável id Prova.
     */
    public Integer id;
    
    /**
     * Variável nome Prova.
     */
    public String nome;
    
	/**
	 * Variável idade Prova.
	 */
	public int idade;
	
	/**
	 * Método listarProva.
	 *
	 * @return List<Prova>
	 */
	public List<Prova> listarProva() {
		return listAll();
	}

}