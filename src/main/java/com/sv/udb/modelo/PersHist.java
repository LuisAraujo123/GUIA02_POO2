/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.sql.Date;

/**
 *
 * @author bernardo
 */
public class PersHist {
    private int codiPers;
    private String nombPers;
    private String apelPers;
    private byte[] fotoPers;
    private int codiTipoPers;
    private int codiUbicGeog;
    private java.sql.Date fechAlta;
    private java.sql.Date fechBaja;
    private int esta;

    public PersHist() {
    }

    public PersHist(int codiPers, String nombPers, String apelPers, byte[] fotoPers, int codiTipoPers, int codiUbicGeog, Date fechAlta, Date fechBaja, int esta) {
        this.codiPers = codiPers;
        this.nombPers = nombPers;
        this.apelPers = apelPers;
        this.fotoPers = fotoPers;
        this.codiTipoPers = codiTipoPers;
        this.codiUbicGeog = codiUbicGeog;
        this.fechAlta = fechAlta;
        this.fechBaja = fechBaja;
        this.esta = esta;
    }

    public int getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(int codiPers) {
        this.codiPers = codiPers;
    }

    public String getNombPers() {
        return nombPers;
    }

    public void setNombPers(String nombPers) {
        this.nombPers = nombPers;
    }

    public String getApelPers() {
        return apelPers;
    }

    public void setApelPers(String apelPers) {
        this.apelPers = apelPers;
    }

    public byte[] getFotoPers() {
        return fotoPers;
    }

    public void setFotoPers(byte[] fotoPers) {
        this.fotoPers = fotoPers;
    }

    public int getCodiTipoPers() {
        return codiTipoPers;
    }

    public void setCodiTipoPers(int codiTipoPers) {
        this.codiTipoPers = codiTipoPers;
    }

    public int getCodiUbicGeog() {
        return codiUbicGeog;
    }

    public void setCodiUbicGeog(int codiUbicGeog) {
        this.codiUbicGeog = codiUbicGeog;
    }

    public Date getFechAlta() {
        return fechAlta;
    }

    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

    public Date getFechBaja() {
        return fechBaja;
    }

    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }

    public int getEsta() {
        return esta;
    }

    public void setEsta(int esta) {
        this.esta = esta;
    }

    @Override
    public String toString() {
        return this.nombPers;
    }
    
    
    
}
