package Nodo;

public class nodosimple {

        // Variable en la cual se va a guardar el valor.
        private int valor;
        // Variable para enlazar los nodos.
        private nodosimple siguiente;
        /**
         * Constructor que inicializamos el valor de las variables.
         */
        public void nodosimple(){
            this.valor = 0;
            this.siguiente = null;
        }

        // Métodos get y set para los atributos.

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public nodosimple getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(nodosimple siguiente) {
            this.siguiente = siguiente;
        }
    }

