package com.diego.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.models.entity.Empleado;

public interface IEmpleadoDao extends JpaRepository<Empleado, Long>{

}
