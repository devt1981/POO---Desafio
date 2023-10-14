public class NavegadorInternet {
    public interface NavegadorInternet {
        void abrirPagina(String url);
        void fecharPagina();
        void realizarPesquisa(String termo);
    }
    
    public class NavegadorInternetImpl implements NavegadorInternet {
       
        public void exibirPagina(String url) {
            // implementação para abrir uma exibir na internet
        }
    
       
        public void adicionarNovaAba() {
            // implementação para adicionar Nova Aba
        }
    
        
        public void atualizarPagina(String termo) {
            // implementação para realizar atualização da Pagina
        }
    }
}
