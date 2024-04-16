
package inheritance;

import java.util.Date;

public class Cliente extends Person {
    private int idCliente;
    private Date fechaRegsitro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(Date fechaRegsitri, boolean vip, String nombre, 
            char genero, int edad, String direccion) {
        
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegsitro = fechaRegsitri;
        this.vip = vip;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "Es VIP: " + this.vip; 
    }
    
    
    
    
    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegsitri() {
        return fechaRegsitro;
    }

    public void setFechaRegsitri(Date fechaRegsitri) {
        this.fechaRegsitro = fechaRegsitri;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegsitro=").append(fechaRegsitro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }

   

 
}