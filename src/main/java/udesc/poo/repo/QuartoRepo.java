package udesc.poo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import udesc.poo.entity.Quarto;

public interface QuartoRepo extends JpaRepository<Quarto, Long>{

	List<Quarto> findByRua(String rua);
	List<Quarto> findAll();
	List<Quarto> findByDescricao(String descricao);
	Quarto findById(long id);
}
