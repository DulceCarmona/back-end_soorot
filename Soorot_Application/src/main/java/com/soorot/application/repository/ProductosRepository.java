package com.soorot.application.repository;

import java.util.Optional;
import com.soorot.application.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductosRepository extends JpaRepository<Producto, Long>{
	Optional<Producto> findByNombre(String nombre);
}
