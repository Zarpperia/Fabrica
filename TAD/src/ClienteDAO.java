
package classes;

import Interfaces.CRUD;
import java.util.ArrayList;


public class ClienteDAO implements CRUD{
    
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    
    

    public ClienteDAO() {
        Cliente c1 = new Cliente();
        c1.setId(1);
        c1.setNome("Fulano");
        c1.setEndereco("Rua 1");
        c1.setCpf("123456");
        
        Cliente c2 = new Cliente();
        c2.setId(2);
        c2.setNome("Beltrano");
        c2.setEndereco("Rua 2");
        c2.setCpf("88888");
        
        clientes.add(c1);
        clientes.add(c2);
        
        
                
    }

    @Override
    public boolean inserir(Cliente cli) {
        clientes.add(cli);        
        return true;
    }

    @Override
    public boolean alterar(Cliente cli) {
        boolean retorno=false;
        
        for(Cliente c: clientes){
            
            if (c.getId()==cli.getId()){                
                c.setCpf(cli.getCpf());
                c.setNome(cli.getNome());
                c.setEndereco(cli.getEndereco());  
                retorno =true;
            }
                
        }
        
        return retorno;
    }

    @Override
    public boolean excluir(int id) {        
        boolean retorno = false;
        
        for(Cliente c: clientes){            
            if (c.getId()==id){                
                clientes.remove(c);
                retorno =true;
            }
                
        }
        
        return retorno;
    }

    @Override
    public ArrayList<Cliente> buscarTodos() {
        return clientes;
    }
    
   public void imprimirLista(){
   
            for(Cliente item: clientes){            
            System.out.println(item.getId());
            System.out.println(item.getNome());
            System.out.println(item.getCpf());
            System.out.println(item.getEndereco());
        }
   }

}   

