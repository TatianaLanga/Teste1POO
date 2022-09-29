/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficha01.dal;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author dell
 */
public class Dividas implements Serializable {
    int id;
    String nomeDevedor;
    String apelidoDevedor;
    Date data;
    String estado;

    public Dividas() {
    }

    public Dividas(int id, String nomeDevedor, String apelidoDevedor, Date data, String estado) {
        this.id = id;
        this.nomeDevedor = nomeDevedor;
        this.apelidoDevedor = apelidoDevedor;
        this.data = data;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeDevedor() {
        return nomeDevedor;
    }

    public void setNomeDevedor(String nomeDevedor) {
        this.nomeDevedor = nomeDevedor;
    }

    public String getApelidoDevedor() {
        return apelidoDevedor;
    }

    public void setApelidoDevedor(String apelidoDevedor) {
        this.apelidoDevedor = apelidoDevedor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
