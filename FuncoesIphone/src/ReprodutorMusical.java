public class ReprodutorMusical {
    public interface ReprodutorMusical {
        void reproduzir();
        void pausar();
        void parar();
        void selecionarMusica();
    }
    
    public class ReprodutorMusicalImpl implements ReprodutorMusical {
       
        public void tocar() {
            // implementação para reprodução de música
        }
    
    
        public void pausar() {
            // implementação para pausar a reprodução de música
        }
    
                   
        public void selecionarMusica() {
            // implementação para seleçao de música
        }
    }
}
