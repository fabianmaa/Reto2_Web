/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.interfaces.InterfaceChocolates;
import Reto2_Web.modelo.Chocolates;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fabian Mendoza
 */
@Repository
public class ChocolatesRepositorio {
    @Autowired
    private InterfaceChocolates repository;

    public List<Chocolates> getAll() {
        return repository.findAll();
    }

    public Optional<Chocolates> getClothe(String reference) {
        return repository.findById(reference);
    }

    
    public Chocolates create(Chocolates clothe) {
        return repository.save(clothe);
    }

    public void update(Chocolates clothe) {
        repository.save(clothe);
    }
    
    public void delete(Chocolates clothe) {
        repository.delete(clothe);
    }
    
}
