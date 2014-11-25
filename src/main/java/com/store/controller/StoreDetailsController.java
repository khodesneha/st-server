/**
 * 
 */
package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.store.entity.StoreDetails;
import com.store.repository.StoreDetailsRepository;

/**
 * @author Prasad Khode
 *
 */
@Controller
@RequestMapping(value = "/storeDetails")
@ResponseBody
public class StoreDetailsController {

	@Autowired
	private StoreDetailsRepository storeDetailsRepository;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public StoreDetails save(@ModelAttribute StoreDetails storeDetails) {
		System.out.println("\n\n storeDetails : " + storeDetails + "\n\n");
		return storeDetailsRepository.save(storeDetails);
	}

	@RequestMapping(value = "/save2", method = RequestMethod.POST)
	public StoreDetails save2(@RequestBody StoreDetails storeDetails) {
		System.out.println("\n\n storeDetails : " + storeDetails + "\n\n");
		return storeDetailsRepository.save(storeDetails);
	}

	@RequestMapping(value = "/getById/{id}")
	public StoreDetails getById(@PathVariable Long id) {
		return storeDetailsRepository.findOne(id);
	}

	@RequestMapping(value = "/all")
	public List<StoreDetails> getAll() {
		return storeDetailsRepository.findAll();
	}
}
