package br.com.ifpe.oxefood.modelo.produto;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
   @Autowired
   private ProdutoRepository repository;

   @Transactional
   public Produto save(Produto produto) {

       produto.setHabilitado(Boolean.TRUE);
       produto.setVersao(1L);
       return repository.save(produto);
   }
   
   public List<Produto> findAll() {
  
    return repository.findAll();
}

public Produto findById(Long id) {

    return repository.findById(id).get();
}


}