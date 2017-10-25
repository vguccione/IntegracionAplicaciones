package com.ofertaPaquetes.sessionBeans;

import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.ofertaPaquetes.entities.Paquete;
/**
 * Session Bean implementation class AdministradorTareas
 */
@Stateless
@LocalBean
public class AdministradorPaquete{

	@PersistenceContext(unitName="MyPU")
	private EntityManager manager;
    
	public AdministradorPaquete() {
        // TODO Auto-generated constructor stub
    }
	
	public void nuevoPaquete(){
		Paquete paquete = new Paquete("Paquete A", new Date(), new Date(), "Descripcion Paquete A", 200D, "", 100, 2, true, true);
		try{
			manager.persist(paquete);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Conectandose a "+ e.getMessage());
		}
	}

}