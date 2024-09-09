package exercicios.exe8;

public class Porta {
    private boolean isOpen;
    private static int numAberturas;
    
    public Porta(boolean isOpen){
        this.isOpen = isOpen;
    }

    public void abrir(){
        if (!isOpen){
            isOpen = true;
            numAberturas++;
        }
    }

    public void fechar(){
        if (isOpen) {
            isOpen = false;
        }
        
    }

    public int mostrar(){
        if(isOpen == true){System.out.println("A porta está aberta.");}
        else{System.out.println("A porta está fechada.");}
        return numAberturas;
    }
}
