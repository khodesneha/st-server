/**
 * 
 */
package com.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.store.entity.StoreAssociate;

/**
 * @author Prasad Khode
 *
 */
//@RepositoryRestResource(collectionResourceRel = "storeAssociate", path = "storeAssociate")
public interface StoreAssociateRepository extends JpaRepository<StoreAssociate, Long> {

	public StoreAssociate findByEmailIdContainingAndPasswordContaining(@Param("emailId") String emailId, @Param("password") String password);

    @Query("SELECT sa FROM StoreAssociate sa WHERE emailId like :emailId%")
    public List<StoreAssociate> findLikeEmailId(@Param("emailId") String emailId);
}
