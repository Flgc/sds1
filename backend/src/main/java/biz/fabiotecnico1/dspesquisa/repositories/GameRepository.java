package biz.fabiotecnico1.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biz.fabiotecnico1.dspesquisa.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
