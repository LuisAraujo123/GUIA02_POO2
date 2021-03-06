/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.Pers;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardo
 */
public class PersCtrl {
    public boolean guar(Pers obje){
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("INSERT INTO PERS VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");
            cmd.setString(1, obje.getNombPers());
            cmd.setString(2, obje.getApelPers());
            cmd.setBytes(3, obje.getFotoPers());
            cmd.setInt(4, obje.getCodiTipoPers());
            cmd.setString(5, obje.getGenePers());
            cmd.setDate(6, obje.getFechNaciPers());
            cmd.setString(7, obje.getDuiPers());
            cmd.setString(8, obje.getNitPers());
            cmd.setString(9, obje.getTipoSangPers());
            cmd.setInt(10, obje.getCodiUbicGeog());
            cmd.setDate(11, obje.getFechAlta());
            cmd.setDate(12, obje.getFechBaja());
            cmd.setInt(13, obje.getEsta());
            cmd.executeUpdate();
            resp = true;
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        finally 
        {
            try 
            {
                if (cn!=null)
                {
                    if (!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            } 
            catch (Exception e) 
            {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return resp;
    }
    
    public boolean upda(Pers obje){
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("update Pers set nomb_pers = ?, apel_pers = ?, foto_pers = ?, codi_tipo_pers = ?, gene_pers = ?, fech_naci_pers = ?, dui_pers = ?, nit_pers = ?, tipo_sang_pers = ?, codi_ubic_geog = ?, fech_alta = ?, fech_baja = ?, esta = ? where codi_pers = ?");
            cmd.setString(1, obje.getNombPers());
            cmd.setString(2, obje.getApelPers());
            cmd.setBytes(3, obje.getFotoPers());
            cmd.setInt(4, obje.getCodiTipoPers());
            cmd.setString(5, obje.getGenePers());
            cmd.setDate(6, obje.getFechNaciPers());
            cmd.setString(7, obje.getDuiPers());
            cmd.setString(8, obje.getNitPers());
            cmd.setString(9, obje.getTipoSangPers());
            cmd.setInt(10, obje.getCodiUbicGeog());
            cmd.setDate(11, obje.getFechAlta());
            cmd.setDate(12, obje.getFechBaja());
            cmd.setInt(13, obje.getEsta());
            cmd.setInt(14, obje.getCodiPers());
            cmd.executeUpdate();
            resp = true;
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        finally 
        {
            try 
            {
                if (cn!=null)
                {
                    if (!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            } 
            catch (Exception e) 
            {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return resp;
    }
    
    public boolean dele(Pers obje){
        boolean resp = false;
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("delete from Pers where codi_pers = ?");
            cmd.setInt(1, obje.getCodiPers());
            cmd.executeUpdate();
            resp = true;
            
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        finally 
        {
            try 
            {
                if (cn!=null)
                {
                    if (!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            } 
            catch (Exception e) 
            {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return resp;
    }
    
    public List<Pers> consTodo(){
        List<Pers> resp = new ArrayList<>();
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("Select * from Pers");
            ResultSet rs = cmd.executeQuery();
            while (rs.next())
            {
                resp.add(new Pers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getInt(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getDate(12), rs.getDate(13), rs.getInt(14)));
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        finally 
        {
            try 
            {
                if (cn!=null)
                {
                    if (!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            } 
            catch (Exception e) 
            {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return resp;
    }
    
    public Pers consUno(int id){
        Pers resp = null;
        Connection cn = new Conexion().getConn();
        try {
            PreparedStatement cmd = cn.prepareStatement("Select * from Pers where codi_pers = ?");
            cmd.setInt(1, id);
            ResultSet rs = cmd.executeQuery();
            if (rs.next())
            {
                resp = (new Pers(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getInt(5), rs.getString(6), rs.getDate(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getInt(11), rs.getDate(12), rs.getDate(13), rs.getInt(14)));
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
        finally 
        {
            try 
            {
                if (cn!=null)
                {
                    if (!cn.isClosed())
                    {
                        cn.close();
                    }
                }
            } 
            catch (Exception e) 
            {
                System.err.println("Error: " + e.getMessage());
            }
        }
        return resp;
    }
}
