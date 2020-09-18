package biz.fabiotecnico1.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import biz.fabiotecnico1.dspesquisa.dto.GameDTO;
import biz.fabiotecnico1.dspesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
			List<GameDTO> list = service.findAll();
			return ResponseEntity.ok().body(list);
		}
	}