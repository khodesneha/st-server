/**
 * 
 */
package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.entity.StoreAssociate;
import com.store.repository.StoreAssociateRepository;

/**
 * @author Prasad Khode
 *
 */
@Controller
@RequestMapping("/storeAssociate")
@ResponseBody
public class StoreAssociateController {

	@Autowired
	private StoreAssociateRepository repository;

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public StoreAssociate save(@ModelAttribute StoreAssociate storeAssociate) {
		return repository.save(storeAssociate);
	}

	@RequestMapping("/getById/{id}")
	public StoreAssociate getById(@PathVariable Long id) {
		return repository.findOne(id);
	}

	@RequestMapping("/all")
	public List<StoreAssociate> getAll() {
		return repository.findAll();
	}

//	@RequestMapping("/validateLogin")
//	public StoreAssociate validateLogin(@RequestParam(value = "emailId") String emailId, @RequestParam(value = "password") String password) {
//		StoreAssociate associate = repository.findByEmailIdContainingAndPasswordContaining(emailId, password);
//		return associate;
//	}
//	
//	@RequestMapping("/findLikeEmailId")
//	public List<StoreAssociate> findLikeEmailId(@RequestParam(value = "emailId") String emailId) {
//		return repository.findLikeEmailId(emailId);
//	}
}
