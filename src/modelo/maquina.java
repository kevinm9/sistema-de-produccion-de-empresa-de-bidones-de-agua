/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class maquina {
    
    int ID_MAQUINARIA;
    String CODIGO_MAQUINARIA;
    String NOMBRE_MAQUINARIA;
    String CAPACIDAD_MAQUINARIA;
    String PESO_MAQUINARIA;
    String ENERGIA_MAQUINARIA;
    String DESCRIPCION_MAQUINARIA;

    public maquina() {
    }

    public int getID_MAQUINARIA() {
        return ID_MAQUINARIA;
    }

    public void setID_MAQUINARIA(int ID_MAQUINARIA) {
        this.ID_MAQUINARIA = ID_MAQUINARIA;
    }

    public String getCODIGO_MAQUINARIA() {
        return CODIGO_MAQUINARIA;
    }

    public void setCODIGO_MAQUINARIA(String CODIGO_MAQUINARIA) {
        this.CODIGO_MAQUINARIA = CODIGO_MAQUINARIA;
    }

    public String getNOMBRE_MAQUINARIA() {
        return NOMBRE_MAQUINARIA;
    }

    public void setNOMBRE_MAQUINARIA(String NOMBRE_MAQUINARIA) {
        this.NOMBRE_MAQUINARIA = NOMBRE_MAQUINARIA;
    }

    public String getCAPACIDAD_MAQUINARIA() {
        return CAPACIDAD_MAQUINARIA;
    }

    public void setCAPACIDAD_MAQUINARIA(String CAPACIDAD_MAQUINARIA) {
        this.CAPACIDAD_MAQUINARIA = CAPACIDAD_MAQUINARIA;
    }

    public String getPESO_MAQUINARIA() {
        return PESO_MAQUINARIA;
    }

    public void setPESO_MAQUINARIA(String PESO_MAQUINARIA) {
        this.PESO_MAQUINARIA = PESO_MAQUINARIA;
    }

 

    public String getENERGIA_MAQUINARIA() {
        return ENERGIA_MAQUINARIA;
    }

    public void setENERGIA_MAQUINARIA(String ENERGIA_MAQUINARIA) {
        this.ENERGIA_MAQUINARIA = ENERGIA_MAQUINARIA;
    }

    public String getDESCRIPCION_MAQUINARIA() {
        return DESCRIPCION_MAQUINARIA;
    }

    public void setDESCRIPCION_MAQUINARIA(String DESCRIPCION_MAQUINARIA) {
        this.DESCRIPCION_MAQUINARIA = DESCRIPCION_MAQUINARIA;
    }

    @Override
    public String toString() {
        return "" + CODIGO_MAQUINARIA + " - " + NOMBRE_MAQUINARIA;
    }

    
    
}
