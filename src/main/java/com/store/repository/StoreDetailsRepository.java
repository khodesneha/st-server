/**
 * 
 */
package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.store.entity.StoreDetails;

/**
 * @author Prasad Khode
 *
 */
//@RepositoryRestResource(collectionResourceRel = "storeDetails", path = "storeDetails")
public interface StoreDetailsRepository extends JpaRepository<StoreDetails, Long> {
	List<StoreDetails> findByStoreName(@Param("storeName") String storeName);
}
