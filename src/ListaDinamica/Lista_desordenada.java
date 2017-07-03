

package ListaDinamica;


public class Lista_desordenada {
    Nodo Inicio;
    
    public Lista_desordenada(){
        Inicio=null;
    }
    
    public void Insertar(TDAToken valor){
        Inicio=new Nodo(valor, Inicio);
    }
    
    public void Mostrar(){
        Nodo recorre=Inicio;
        while(recorre!=null){
            System.out.println("Llave: "+recorre.info.llave);
            System.out.println("Categoria: "+recorre.info.categoria);
            System.out.println("Longitud: "+recorre.info.longitud);
            System.out.println("Valor: "+recorre.info.valor);
            recorre=recorre.siguiente;
        }
    }
    
    public void Eliminar(TDAToken valorE){
        Nodo recorre, anterior;
        
        if(Inicio!=null){
            if(Inicio.info.llave.equals(valorE.llave)){
                Inicio=Inicio.siguiente;
            }
            else{
                recorre=Inicio;
                anterior=recorre;
                while((recorre.siguiente!=null)&&(!recorre.info.llave.equals(valorE.llave))){
                    anterior=recorre;
                    recorre=recorre.siguiente;
                }
                if(recorre.info.llave.equals(valorE.llave))
                    anterior.siguiente=recorre.siguiente;
            }
        }
    }
    
    public Nodo buscar(TDAToken valorE){
        Nodo recorre, anterior;
        
        //si no se encuentra el objeto con la llave que coincida, se devuelve un nodo error con categoria 0
        TDAToken errorToken = new TDAToken();
        errorToken.categoria = 0;
        Nodo error = new Nodo(errorToken);
        
        if(Inicio!=null){
            if(Inicio.info.llave.equals(valorE.llave)){
                //Inicio=Inicio.siguiente;
               return Inicio; 
            }
            else{
                recorre=Inicio;
                anterior=recorre;
                while((recorre.siguiente!=null)&&(!recorre.info.llave.equals(valorE.llave))){
                    anterior=recorre;
                    recorre=recorre.siguiente;
                }
                if(recorre.info.llave.equals(valorE.llave)){
                    //anterior.siguiente=recorre.siguiente;
                    return recorre;
                }
                else
                    return error;
            }
        }
        
        return error;
    }
    
}
