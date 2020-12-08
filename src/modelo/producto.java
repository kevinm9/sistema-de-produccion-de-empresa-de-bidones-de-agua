
package modelo;


public class producto {
    
    int ID_PRODUCTO;
    String CODIGO_PRODUCTO;
    String NOMBRE_PRODUCTO;
    String COSTO_PRODUCTO;;
    String PRECIO_PRODUCTO;
    String MATERIAL_PRODUCTO;
    String PRESENTACION_PRODUCTO;
    String PESO_PRODUCTO;
    String CAPACIDAD_PRODUCTO;
    String DESCRIPCION_PRODUCTO;

    public producto() {
    }

    public int getID_PRODUCTO() {
        return ID_PRODUCTO;
    }

    public void setID_PRODUCTO(int ID_PRODUCTO) {
        this.ID_PRODUCTO = ID_PRODUCTO;
    }

    public String getCODIGO_PRODUCTO() {
        return CODIGO_PRODUCTO;
    }

    public void setCODIGO_PRODUCTO(String CODIGO_PRODUCTO) {
        this.CODIGO_PRODUCTO = CODIGO_PRODUCTO;
    }

    public String getNOMBRE_PRODUCTO() {
        return NOMBRE_PRODUCTO;
    }

    public void setNOMBRE_PRODUCTO(String NOMBRE_PRODUCTO) {
        this.NOMBRE_PRODUCTO = NOMBRE_PRODUCTO;
    }

   

    public String getMATERIAL_PRODUCTO() {
        return MATERIAL_PRODUCTO;
    }

    public void setMATERIAL_PRODUCTO(String MATERIAL_PRODUCTO) {
        this.MATERIAL_PRODUCTO = MATERIAL_PRODUCTO;
    }

    public String getPRESENTACION_PRODUCTO() {
        return PRESENTACION_PRODUCTO;
    }

    public void setPRESENTACION_PRODUCTO(String PRESENTACION_PRODUCTO) {
        this.PRESENTACION_PRODUCTO = PRESENTACION_PRODUCTO;
    }

    public String getCOSTO_PRODUCTO() {
        return COSTO_PRODUCTO;
    }

    public void setCOSTO_PRODUCTO(String COSTO_PRODUCTO) {
        this.COSTO_PRODUCTO = COSTO_PRODUCTO;
    }

    public String getPRECIO_PRODUCTO() {
        return PRECIO_PRODUCTO;
    }

    public void setPRECIO_PRODUCTO(String PRECIO_PRODUCTO) {
        this.PRECIO_PRODUCTO = PRECIO_PRODUCTO;
    }

    public String getPESO_PRODUCTO() {
        return PESO_PRODUCTO;
    }

    public void setPESO_PRODUCTO(String PESO_PRODUCTO) {
        this.PESO_PRODUCTO = PESO_PRODUCTO;
    }



  

    public String getCAPACIDAD_PRODUCTO() {
        return CAPACIDAD_PRODUCTO;
    }

    public void setCAPACIDAD_PRODUCTO(String CAPACIDAD_PRODUCTO) {
        this.CAPACIDAD_PRODUCTO = CAPACIDAD_PRODUCTO;
    }

    public String getDESCRIPCION_PRODUCTO() {
        return DESCRIPCION_PRODUCTO;
    }

    public void setDESCRIPCION_PRODUCTO(String DESCRIPCION_PRODUCTO) {
        this.DESCRIPCION_PRODUCTO = DESCRIPCION_PRODUCTO;
    }

    @Override
    public String toString() {
        return "" + CODIGO_PRODUCTO + " - " + NOMBRE_PRODUCTO;
    }

  

    
    
    
    
    
}

