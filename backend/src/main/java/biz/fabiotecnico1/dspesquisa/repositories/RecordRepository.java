package biz.fabiotecnico1.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import biz.fabiotecnico1.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
