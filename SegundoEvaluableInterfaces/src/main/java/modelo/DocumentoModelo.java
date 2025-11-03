

package modelo;

import java.awt.Font;


public class DocumentoModelo {

    private final int DEFAULT_SIZE = 12; 
    
    private boolean negrita; 
    private Font font; 
    private String tipo; 
    private int size;
    private String message; 
    
    
    public DocumentoModelo(Font fuente, String tipo_fuente, int tamano_fuente){
        this.negrita = false; 
        this.message = ""; 
        
        this.font = fuente; 
        this.tipo = tipo_fuente; 
        this.size = tamano_fuente; 
        
    }

    public boolean isNegrita() {
        return negrita;
    }

    public void setNegrita(boolean negrita) {
        this.negrita = negrita;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DocumentoModelo{" + "DEFAULT_SIZE=" + DEFAULT_SIZE + ", negrita=" + negrita + ", font=" + font + ", tipo=" + tipo + ", size=" + size + ", message=" + message + '}';
    }
    
    
    
    
    
}
