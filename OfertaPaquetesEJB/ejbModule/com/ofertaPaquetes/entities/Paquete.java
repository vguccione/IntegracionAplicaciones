package com.ofertaPaquetes.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Paquetes")
public class Paquete {
	    @Id @GeneratedValue(strategy=GenerationType.AUTO)   
	    private int idPaquete;
	    
	    private String nombre;
	    private Date fechaDesde;
	    private Date fechaHasta;
	    private String descripcion;
	    private Double precio;
	    private String politicasCancelacion;
	    private int cupo; 
	    
	    @ManyToOne(fetch=FetchType.EAGER)
	    @JoinColumn(name="idDestino")
	    private Destino destino;
	    
	    private int cantPersonas;
	    private boolean estado;
	    private boolean nuevaOferta;
	    
	    @ManyToMany
	    @JoinTable(
	            name = "PaquetesMediosDePago", 
	            joinColumns = { @JoinColumn(name = "idPaquete") }, 
	            inverseJoinColumns = { @JoinColumn(name = "idMedioDePago") }
	        )
	    private List<MedioDePago> mediosDePago;
	    
	    
	    @ManyToOne(fetch=FetchType.EAGER)
	    @JoinColumn(name="idAgencia")
	    private Agencia agencia;
	    private String imagen;

    	    
		public Paquete(String nombre, Date fechaDesde, Date fechaHasta, String descripcion, Double precio,
				String politicasCancelacion, int cupo, int cantPersonas,
				boolean estado, boolean nuevaOferta) {
			super();
			this.nombre = nombre;
			this.fechaDesde = fechaDesde;
			this.fechaHasta = fechaHasta;
			this.descripcion = descripcion;
			this.precio = precio;
			this.politicasCancelacion = politicasCancelacion;
			this.cupo = cupo;
			this.cantPersonas = cantPersonas;
			this.estado = estado;
			this.nuevaOferta = nuevaOferta;
		}
		
		
		public Paquete(int idPaquete, String nombre, Date fechaDesde, Date fechaHasta, String descripcion,
				Double precio, String politicasCancelacion, int cupo, Destino destino,
				int cantPersonas, boolean estado, boolean nuevaOferta,
				List<MedioDePago> mediosDePago, Agencia agencia, String imagen) {

			super();
			this.idPaquete = idPaquete;
			this.nombre = nombre;
			this.fechaDesde = fechaDesde;
			this.fechaHasta = fechaHasta;
			this.descripcion = descripcion;
			this.precio = precio;
			this.politicasCancelacion = politicasCancelacion;
			this.cupo = cupo;
			this.destino = destino;
			this.cantPersonas = cantPersonas;
			this.estado = estado;
			this.nuevaOferta = nuevaOferta;
			this.mediosDePago = mediosDePago;
			this.agencia = agencia;

			this.imagen = imagen;

		}



		public int getIdPaquete() {
			return idPaquete;
		}
		public void setIdPaquete(int idPaquete) {
			this.idPaquete = idPaquete;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public Date getFechaDesde() {
			return fechaDesde;
		}
		public void setFechaDesde(Date fechaDesde) {
			this.fechaDesde = fechaDesde;
		}
		public Date getFechaHasta() {
			return fechaHasta;
		}
		public void setFechaHasta(Date fechaHasta) {
			this.fechaHasta = fechaHasta;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		public String getPoliticasCancelacion() {
			return politicasCancelacion;
		}
		public void setPoliticasCancelacion(String politicasCancelacion) {
			this.politicasCancelacion = politicasCancelacion;
		}
		public int getCupo() {
			return cupo;
		}
		public void setCupo(int cupo) {
			this.cupo = cupo;
		}
				
		public Destino getDestino() {
			return destino;
		}
		public void setDestino(Destino destino) {
			this.destino = destino;
		}
		public int getCantPersonas() {
			return cantPersonas;
		}
		public void setCantPersonas(int cantPersonas) {
			this.cantPersonas = cantPersonas;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
		public boolean isNuevaOferta() {
			return nuevaOferta;
		}
		public void setNuevaOferta(boolean nuevaOferta) {
			this.nuevaOferta = nuevaOferta;
		}

		public String getImagen() {
			return imagen;
		}

		/*public List<Imagen> getImagenes() {
			return imagenes;
		}
		public void setImagenes(List<Imagen> imagenes) {
			this.imagenes = imagenes;
		}
		*/
					
		public Agencia getAgencia() {
			return agencia;
		}
		
		public List<MedioDePago> getMediosDePago() {
			return mediosDePago;
		}
		public void setMediosDePago(List<MedioDePago> mediosDePago) {
			this.mediosDePago = mediosDePago;
		}

		public void setAgencia(Agencia agencia) {
			this.agencia = agencia;
		}
			
		
		public void setImagen(String imagen) {
			this.imagen = imagen;
		}


		@Override
		public String toString() {
			return "Paquete [idPaquete=" + idPaquete + ", nombre=" + nombre + ", fechaDesde=" + fechaDesde
					+ ", fechaHasta=" + fechaHasta + ", descripcion=" + descripcion + ", precio=" + precio
					+ ", politicasCancelacion=" + politicasCancelacion + ", cupo=" + cupo 
					+ ", cantPersonas=" + cantPersonas + ", estado=" + estado + ", nuevaOferta=" + nuevaOferta
					+ ", agencia=" + agencia.getIdAgencia() + "]";
		}
		public Paquete() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
