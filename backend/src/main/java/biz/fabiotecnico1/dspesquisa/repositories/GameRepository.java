package biz.fabiotecnico1.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import biz.fabiotecnico1.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
