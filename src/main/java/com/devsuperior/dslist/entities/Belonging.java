package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_belonging")
public class Belonging {
	// não podemos ter um ID com mais de uma váriavel 
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK(); //criação de uma classe auxiliar para representar
							//uma chave primária múltipla com mais de um atributo
	
	private Integer position; //
	
	
	public Belonging() {
		
	}


	public Belonging(Game game, GameList list, Integer position) {
		
		id.setGame(game);
		id.setList(list);
		
		this.position = position;
	}


	public BelongingPK getId() {
		return id;
	}


	public void setId(BelongingPK id) {
		this.id = id;
	}


	public Integer getPosition() {
		return position;
	}


	public void setPosition(Integer position) {
		this.position = position;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
