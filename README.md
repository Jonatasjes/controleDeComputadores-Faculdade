# Trabalho para o desenvolvimento de Aplicação para controle de Computadores de uma loja.
### Disciplina: PROGRMAÇÃO ORIENTADA A OBJETOS II
### Tecnologia: JAVA

## Desenvolvimento de projeto com a aplicação dos conceitos de Particionamento, Agregação e Herança. 

  Um projeto de desenvolvimento de sistemas solicita a criação de uma aplicação para uma empresa de venda de computadores. A aplicação deverá gerenciar as quantidades e os preços de três diferentes tipos de computadores, sendo eles: Desktop, Notebook e Servidor. Cada objeto deve ser instanciado a partir do modelo do computador, por isso, este dado não faz parte dos atributos. Você deve analisar as classes e determinar os Particionamento e a Agregações necessárias, além de 
  analisar se será necessário a aplicação de Herança. Após a análise das classes e determinação da Hierarquia para a criação das classes, você deverá codificar as 
  classes e uma aplicação que utilize pelo menos três objetos de cada tipo (Desktop, Notebook e Servidor) com entrada de dados solicitadas ao usuário. Deverão ser realizados testes práticos e captura das telas para apresentação junto com a documentação a ser entregue.


## Introtução

  A aplicação foi desenvolvida com o foco na utilização dos conceitos de abstração, encapsulamento, agregação de classes e herança, onde foram criadas seis classes sendo elas ControleDeComputadores, Computador, Servidor, Monitor, Notebook e Desktop. Todos os atributos são do tipo privado, sendo necessário a ultilização dos metodos getters e setters para acessá-los, também foram criados métodos para imprimir, entrada de dados, entrada de dados individuais, e metodos construtores. Observando os atributos sugeridos para as classes Servidor, Notebook e Desktop, pode-se notar similaridades entre a maioria deles, então foi criada a classe abstrata Computador para que fosse herdada. Para utilizar o conceito de agregação de classes foi criada a classe Monitor para gerar o objeto monitor a ser agregados nas classes Notebook e Desktop.
