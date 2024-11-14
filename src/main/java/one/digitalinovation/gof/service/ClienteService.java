/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package one.digitalinovation.gof.service;

import one.digitalinovation.gof.model.Cliente;


public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    
    Cliente buscarPorId(Long id);
    
    void inserir(Cliente cliete);
    
    void atualizar(Long id, Cliente cliente);
    
    void deletar(Long id);
    
}
