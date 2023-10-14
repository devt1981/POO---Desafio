public class AparelhoTelefonico {
    public interface AparelhoTelefonico {
        void fazerLigacao(String numero);
        void receberLigacao(String numero);
        void desligar();
    }
    
    public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
       
        public void ligar(String numero) {
            // implementação para fazer uma ligação
        }
    
       
        public void atender(String numero) {
            // implementação para receber uma ligação
        }
    
        
        public void iniciarCorreioVoz() {
            // implementação para desligar o aparelho
        }
    }
}
