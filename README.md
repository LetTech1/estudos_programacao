<div align="center">
<img src="https://user-images.githubusercontent.com/71408314/199377590-19e8230e-8db6-4dcc-9a38-017e8ae74e84.png"/>
</div>
<br/>
<br/>
<div align="center">
<a href="https://instagram.com/let.tech" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
<a href="https://www.linkedin.com/in/leticiabapfelix/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
</div>

# Estudos Java
O intuito desse repositório é registrar minha evolução diária sobre assuntos relacionados a programação, mais específico em Java.

## Técnicas e tecnologias utilizadas

- ``Java 13``
- ``IntelliJ IDEA``
- ``Estrutura de dados``
- ``Paradigma de orientação a objetos``

## Revisão sobre estrutura de dados

1. Listas (Vetor)
* Um vetor (ou array) é a estrutura de dados mais simples que existe. Um vetor armazena uma sequência de valores onde todos são do mesmo tipo.
* Como declarar um vetor: String[] elementos = new String[10];
* Como podemos ver, temos um vetor do tipo String com capacidade de armazenar 10 elementos.

<div align="center">
<img src="https://user-images.githubusercontent.com/71408314/200052492-1c67a96d-816c-43d1-8e9b-eb757dd35203.png" height="250" width="500"/>
</div>

2. Pilha
* São estruturas de dados do tipo LIFO (last-in first-out), onde o último elemento a ser inserido, será o primeiro a ser retirado. Assim, uma pilha permite acesso a apenas um item de dados, o último inserido. Para processar o penúltimo item inserido, deve-se remover o último.

<div align="center">
<img src="https://user-images.githubusercontent.com/71408314/200052240-a056f701-153c-4b14-8b3d-f166bf23a094.png" height="400" width="500"/>
</div>

3. Fila
* Uma fila é uma estrutura de dados dinâmica que admite remoção de elementos e inserção de novos objetos. Mais especificamente, uma fila (queue) é uma estrutura sujeita à seguinte regra de operação: sempre que houver uma remoção, o elemento removido é o que está na estrutura há mais tempo(FIFO).

<div align="center">
<img src="https://user-images.githubusercontent.com/71408314/202917911-60be5a3d-ab39-463b-8bd4-9a7ea7f222ec.png" height="400" width="500"/>
</div>

## Equals e Hashcode

1. Entendendo Equals e Hashcode
* <p>Equals: equals é um metódo utilizado para comparar dois objetos, sendo assim, ele só retornará true se os dois objetos apontarem para o mesmo endereço de memória. Exemplo: <br /><br />
      Produto p1 = new Produto();<br />
      p1.nome = "Caneta";<br /><br />
      Produto p2 = new Produto();<br />
      p2.nome = "Caneta";<br />
  
      p1.equals(p2); (A RESPOSTA É FALSE, POIS SÃO DOIS OBJETOS E ELES APONTAM PARA ENDEREÇOS DE MEMÓRIA DIFERENTES)
  Sendo assim, para que o equals funcione como esperamos, devemos sobrescrever o método na classe Produto.<br />
  Para comparações entre dois objetos, o equals já é o suficiente.
  
2. Existem alguns princípios definidos pelo próprio Java sobre a implementação do equals:

* Consistente: para quaisquer objetos x e y, o valor de x.equals(y) só poderá ser diferente se as propriedade em equals() mudem.
* Transitivo: para quaisquer objetos x, y e , se x.equals(y) retorna true e y.equals(z) retorna true, então x.equals(z) deve retornar true.
* Simétrico: dados dois objetos x e y, x.equals(y) deve retornar true se e somente se y.equals(x) retorna true.
* Reflexivo: um objeto x deve ser igual a ele mesmo, ou seja, retornar true no x.equals(x).
  
3. Hashcode
* Já um hashcode(código hash) é um valor inteiro associado com todos os objetos em Java. Então, para obter esse hashcode precisamos utilizar o método hashCode(), esse método retornará um inteiro para o objeto passado. Sendo assim, se dois objetos possuem o mesmo código hash, provavelmente são iguais ou no mínimo parecidos(a depender da implementação).<br /><br />
  Podemos passar como código hash o tamanho de uma palavra por exemplo, então se tivermos 1000 elementos, ao invés de utilizar direto o método equals, que nesse caso seria necessário comparar um por um, com o hashcode nós vamos separar somente os elementos que possuem o código hash igual e dai usar o equals somente nesses elementos. Tornando o processo mais rápido.<br />
  O Hashcode é mais utilizado quando estamos trabalhando com Collections.
      
https://blog.cod3r.com.br/desmistificando-hashcode-e-equals-em-java/
      
## Revisão sobre Collections
      
Collection é um conjunto bem definido de interfaces e classes para representar e tratar grupos de dados como uma única unidade, que pode ser chamada coleção, ou collection.<br />
Collection é composta por alguns tipos de coleções:
* Set: Não é ordenado por padrão, porém temos a possibilidade de ordenar, não é indexado e não aceita repetição.
* List: Indexada e aceita repetição.
* Map: Chave/valor, a chave não pode ser repetida e o valor é possível repetir.
* Queue: Implementa fila, First In First Out (FIFO).
* Stack: Implementa pilha, Last In First Out (LIFO).
      
      
</p>
