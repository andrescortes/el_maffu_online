package co.edu.utp.maffuonline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import co.edu.utp.maffuonline.dto.Pay;

@Repository
public interface PayRepository extends CrudRepository<Pay, Long>{

}
