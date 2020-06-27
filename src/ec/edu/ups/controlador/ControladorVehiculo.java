/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;


import ec.edu.ups.dao.ITicketDAO;
import ec.edu.ups.dao.IVehiculoDAO;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;

/**
 *
 * @author nicol
 */
public class ControladorVehiculo {
    //DAO
    private IVehiculoDAO vehiculoDAO;
    private ITicketDAO ticketDAO;
    
    //Modelo
    private Vehiculo vehiculo;
    private Ticket ticket;

    public ControladorVehiculo(VehiculoDAO vehiculoDAO, TicketDAO ticketDAO) {
        this.vehiculoDAO = vehiculoDAO;
        this.ticketDAO = ticketDAO;
    }
    
    public void registrar(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        vehiculoDAO.create(vehiculo);
    }
    
    public void verCliente(){
        
    }
    
    public void actualizar(){
        
    }
    
    public void eliminar(){
        
    }
    
    public void verClientes(){
        
    }
    
    public void agregarTicket(int numero){
        ticket = ticketDAO.read(numero);
        vehiculo.setTicket(ticket);
        vehiculoDAO.update(vehiculo);
    }
}
