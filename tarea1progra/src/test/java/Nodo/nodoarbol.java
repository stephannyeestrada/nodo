package Nodo;

public class nodoarbol {
    private nodoarbol izquierda;
    private nodoarbol derecha;
    private int valor;

    public void insetarHijo(nodoarbol hijo){
        if(hijo.getValor()<valor){
            if(izquierda!=null){
                izquierda.insetarHijo(hijo);
            }
            else{
                izquierda = hijo;
            }
        }else{
            if(hijo.getValor()!=valor){
                if(derecha!=null){
                    derecha.insetarHijo(hijo);
                }
                else{
                    derecha = hijo;
                }
            }
        }
    }

    public void inOrden(){
        //imprime los numeros ordenados de menor a mayor
        if(izquierda != null){
            izquierda.inOrden();
        }
        System.out.println(valor);
        if(derecha != null){
            derecha.inOrden();
        }
    }

    public void preOrden(){
        //imprime primero los padres y luego los hijos
        System.out.println(valor);
        if(izquierda != null){
            izquierda.preOrden();
        }
        if(derecha != null){
            derecha.preOrden();
        }

    }

    public void postOrden(){
        //imprime primero los hijos y luego los padres
        if(izquierda != null){
            izquierda.postOrden();
        }
        if(derecha != null){
            derecha.postOrden();
        }
        System.out.println(valor);

    }


    /**
     * @return the izquierda
     */
    public nodoarbol getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquieda the izquierda to set
     */
    public void setIzquieda(nodoarbol izquieda) {
        this.izquierda = izquieda;
    }

    /**
     * @return the derecha
     */
    public nodoarbol getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(nodoarbol derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }




}



